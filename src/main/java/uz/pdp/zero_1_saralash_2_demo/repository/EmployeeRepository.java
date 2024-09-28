package uz.pdp.zero_1_saralash_2_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.zero_1_saralash_2_demo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}