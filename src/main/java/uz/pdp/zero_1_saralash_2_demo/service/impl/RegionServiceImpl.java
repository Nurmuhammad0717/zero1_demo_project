package uz.pdp.zero_1_saralash_2_demo.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.zero_1_saralash_2_demo.payload.RegionCrudDTO;
import uz.pdp.zero_1_saralash_2_demo.payload.RegionDTO;
import uz.pdp.zero_1_saralash_2_demo.service.RegionService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegionServiceImpl implements RegionService {
    @Override
    public RegionDTO readAll(Long id) {
        return null;
    }

    @Override
    public List<RegionDTO> readById() {
        return List.of();
    }

    @Override
    public RegionDTO creat(RegionCrudDTO crudDTO) {
        return null;
    }

    @Override
    public RegionDTO update(Long id, RegionCrudDTO crudDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
