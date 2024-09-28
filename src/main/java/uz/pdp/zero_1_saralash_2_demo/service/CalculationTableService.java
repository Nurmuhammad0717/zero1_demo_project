package uz.pdp.zero_1_saralash_2_demo.service;

import uz.pdp.zero_1_saralash_2_demo.payload.CalculationTableCrudDTO;
import uz.pdp.zero_1_saralash_2_demo.payload.CalculationTableDTO;

import java.util.List;

public interface CalculationTableService {

    CalculationTableDTO readAll(Long id);

    List<CalculationTableDTO> readById();

    CalculationTableDTO creat(CalculationTableCrudDTO crudDTO);

    CalculationTableDTO update(Long id,CalculationTableCrudDTO crudDTO);

    void delete(Long id);


}
