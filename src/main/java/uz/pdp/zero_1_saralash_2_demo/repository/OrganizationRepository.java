package uz.pdp.zero_1_saralash_2_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.zero_1_saralash_2_demo.entity.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
}