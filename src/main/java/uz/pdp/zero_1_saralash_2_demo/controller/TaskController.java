package uz.pdp.zero_1_saralash_2_demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.zero_1_saralash_2_demo.entity.CalculationTable;
import uz.pdp.zero_1_saralash_2_demo.entity.Employee;
import uz.pdp.zero_1_saralash_2_demo.enums.CalculationTypeEnum;
import uz.pdp.zero_1_saralash_2_demo.repository.CalculationTableRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class TaskController {

    private final CalculationTableRepository calculationTableRepository;

    @GetMapping("/task2")
    public Map<String, Double> getHighEarningEmployees(@RequestParam String month) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date startDate = sdf.parse(month + "-01");
        Date endDate = sdf.parse(month + "-31");

        List<CalculationTable> calculations = calculationTableRepository.findAllByDateIsBetween(startDate, endDate);

        Map<String, Double> result = new HashMap<>();

        for (CalculationTable calculation : calculations) {
            String pinfl = calculation.getEmployee().getPinfl();
            result.put(pinfl, result.getOrDefault(pinfl, 0.0) + calculation.getAmount());
        }

        return result;
    }

    @GetMapping("/task3")
    public List<Map<String, Object>> getEmployeesByRegionAndPinfl(@RequestParam String month) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date startDate = sdf.parse(month + "-01");
        Date endDate = sdf.parse(month + "-31");

        List<CalculationTable> calculations = calculationTableRepository.findAllByDateIsBetween(startDate, endDate);

        Map<String, Map<String, Object>> resultMap = new HashMap<>();

        for (CalculationTable calculation : calculations) {
            String pinfl = calculation.getEmployee().getPinfl();
            String orgName = calculation.getEmployee().getOrganization().getName();

            // Agar pinfl mavjud bo'lmasa, yangi entry yaratamiz
            resultMap.putIfAbsent(pinfl, new HashMap<>() {{
                put("organizationCount", new HashSet<String>());
                put("totalAmount", 0.0);
            }});

            // Tashkilotni qo'shamiz
            ((Set<String>) resultMap.get(pinfl).get("organizationCount")).add(orgName);
            // Umumiy ish haqini hisoblaymiz
            resultMap.get(pinfl).put("totalAmount", (double) resultMap.get(pinfl).get("totalAmount") + calculation.getAmount());
        }

        // Natijani tayyorlash
        List<Map<String, Object>> resultList = new ArrayList<>();
        for (Map.Entry<String, Map<String, Object>> entry : resultMap.entrySet()) {
            Map<String, Object> data = new HashMap<>();
            data.put("pinfl", entry.getKey());
            data.put("organizationCount", ((Set<String>) entry.getValue().get("organizationCount")).size());
            data.put("totalAmount", entry.getValue().get("totalAmount"));
            resultList.add(data);
        }

        return resultList;
    }

    @GetMapping("/task4")
    public Map<String, Object> getAverageSalaryAndEmployees(
            @RequestParam String month,
            @RequestParam Long organizationId) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date startDate = sdf.parse(month + "-01");
        Date endDate = sdf.parse(month + "-31"); // oxirgi kunni hisobga olish

        List<CalculationTable> calculations = calculationTableRepository.findAllByDateIsBetweenAndOrganizationId(startDate, endDate, organizationId);

        List<Employee> employees = new ArrayList<>();
        double totalAmount = 0;
        int count = 0;

        for (CalculationTable calculation : calculations) {
            employees.add(calculation.getEmployee());
            totalAmount += calculation.getAmount();
            count++;
        }

        double averageSalary = count > 0 ? totalAmount / count : 0;

        Map<String, Object> result = new HashMap<>();
        result.put("averageSalary", averageSalary);
        result.put("employees", employees);

        return result;
    }

    @GetMapping("/task5")
    public List<Map<String, Object>> getSalaryAndVacationDetails(
            @RequestParam String month) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        Date startDate = sdf.parse(month + "-01");
        Date endDate = sdf.parse(month + "-31"); // oxirgi kunni hisobga olish

        List<CalculationTypeEnum> types = Arrays.asList(CalculationTypeEnum.SALARY, CalculationTypeEnum.VACATION);
        List<CalculationTable> calculations = calculationTableRepository.findAllByDateIsBetweenAndCalculationTypeIn(startDate, endDate, types);

        List<Map<String, Object>> result = new ArrayList<>();

        for (CalculationTable calculation : calculations) {
            Map<String, Object> data = new HashMap<>();
            data.put("pinfl", calculation.getEmployee().getPinfl());
            data.put("employeeName", calculation.getEmployee().getFirstName() + " " + calculation.getEmployee().getLastName());
            data.put("amount", calculation.getAmount());
            data.put("type", calculation.getCalculationType());

            result.add(data);
        }

        return result;
    }
}
