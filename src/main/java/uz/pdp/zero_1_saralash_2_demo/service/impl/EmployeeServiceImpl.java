package uz.pdp.zero_1_saralash_2_demo.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.zero_1_saralash_2_demo.payload.EmployeeCrudDTO;
import uz.pdp.zero_1_saralash_2_demo.payload.EmployeeDTO;
import uz.pdp.zero_1_saralash_2_demo.service.EmployeeService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public EmployeeDTO readById(Long id) {
        return null;
    }

    @Override
    public List<EmployeeDTO> readAll() {
        return List.of();
    }

    @Override
    public EmployeeDTO creat(EmployeeCrudDTO crudDTO) {
        return null;
    }

    @Override
    public EmployeeDTO update(Long id, EmployeeCrudDTO crudDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
