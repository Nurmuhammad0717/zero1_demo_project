package uz.pdp.zero_1_saralash_2_demo.service;

import uz.pdp.zero_1_saralash_2_demo.payload.RegionCrudDTO;
import uz.pdp.zero_1_saralash_2_demo.payload.RegionDTO;

import java.util.List;

public interface RegionService {

    RegionDTO readAll(Long id);

    List<RegionDTO> readById();

    RegionDTO creat(RegionCrudDTO crudDTO);

    RegionDTO update(Long id,RegionCrudDTO crudDTO);

    void delete(Long id);


}
