package uz.pdp.zero_1_saralash_2_demo.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.zero_1_saralash_2_demo.payload.CalculationTableCrudDTO;
import uz.pdp.zero_1_saralash_2_demo.payload.CalculationTableDTO;
import uz.pdp.zero_1_saralash_2_demo.service.CalculationTableService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CalculationTableServiceImpl implements CalculationTableService {
    @Override
    public CalculationTableDTO readAll(Long id) {
        return null;
    }

    @Override
    public List<CalculationTableDTO> readById() {
        return List.of();
    }

    @Override
    public CalculationTableDTO creat(CalculationTableCrudDTO crudDTO) {
        return null;
    }

    @Override
    public CalculationTableDTO update(Long id, CalculationTableCrudDTO crudDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
