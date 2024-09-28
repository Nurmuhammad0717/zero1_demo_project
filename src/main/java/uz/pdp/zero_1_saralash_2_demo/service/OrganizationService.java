package uz.pdp.zero_1_saralash_2_demo.service;

import uz.pdp.zero_1_saralash_2_demo.payload.OrganizationCrudDTO;
import uz.pdp.zero_1_saralash_2_demo.payload.OrganizationDTO;

import java.util.List;

public interface OrganizationService {

    OrganizationDTO readAll(Long id);

    List<OrganizationDTO> readById();

    OrganizationDTO creat(OrganizationCrudDTO crudDTO);

    OrganizationDTO update(Long id,OrganizationCrudDTO crudDTO);

    void delete(Long id);


}
