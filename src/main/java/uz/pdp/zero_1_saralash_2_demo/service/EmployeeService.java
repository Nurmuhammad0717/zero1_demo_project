package uz.pdp.zero_1_saralash_2_demo.service;

import uz.pdp.zero_1_saralash_2_demo.payload.EmployeeCrudDTO;
import uz.pdp.zero_1_saralash_2_demo.payload.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    EmployeeDTO readById(Long id);

    List<EmployeeDTO> readAll();

    EmployeeDTO creat(EmployeeCrudDTO crudDTO);

    EmployeeDTO update(Long id,EmployeeCrudDTO crudDTO);

    void delete(Long id);


}
