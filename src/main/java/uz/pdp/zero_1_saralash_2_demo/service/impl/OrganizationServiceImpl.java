package uz.pdp.zero_1_saralash_2_demo.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.zero_1_saralash_2_demo.payload.OrganizationCrudDTO;
import uz.pdp.zero_1_saralash_2_demo.payload.OrganizationDTO;
import uz.pdp.zero_1_saralash_2_demo.service.OrganizationService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrganizationServiceImpl implements OrganizationService {
    @Override
    public OrganizationDTO readAll(Long id) {
        return null;
    }

    @Override
    public List<OrganizationDTO> readById() {
        return List.of();
    }

    @Override
    public OrganizationDTO creat(OrganizationCrudDTO crudDTO) {
        return null;
    }

    @Override
    public OrganizationDTO update(Long id, OrganizationCrudDTO crudDTO) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
