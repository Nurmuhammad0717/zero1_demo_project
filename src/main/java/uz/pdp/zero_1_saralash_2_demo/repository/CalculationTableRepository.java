package uz.pdp.zero_1_saralash_2_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import uz.pdp.zero_1_saralash_2_demo.entity.CalculationTable;
import uz.pdp.zero_1_saralash_2_demo.enums.CalculationTypeEnum;

import java.util.Date;
import java.util.List;

@Repository
public interface CalculationTableRepository extends JpaRepository<CalculationTable, Long> {
    List<CalculationTable> findAllByDateIsBetween(Date startDate, Date endDate);
    List<CalculationTable> findAllByDateIsBetweenAndOrganizationId(Date startDate, Date endDate, Long organizationId);
    List<CalculationTable> findAllByDateIsBetweenAndCalculationTypeIn(Date startDate, Date endDate, List<CalculationTypeEnum> types);

}