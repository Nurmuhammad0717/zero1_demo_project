package uz.pdp.zero_1_saralash_2_demo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.zero_1_saralash_2_demo.entity.Employee;
import uz.pdp.zero_1_saralash_2_demo.entity.Organization;
import uz.pdp.zero_1_saralash_2_demo.enums.CalculationTypeEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link uz.pdp.zero_1_saralash_2_demo.entity.CalculationTable}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculationTableDTO implements Serializable {
    private Long id;
    private Employee employee;
    private Double amount;
    private Float rate;
    private Date date;
    private Organization organization;
    private CalculationTypeEnum calculationType;
}