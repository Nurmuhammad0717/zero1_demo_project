package uz.pdp.zero_1_saralash_2_demo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.zero_1_saralash_2_demo.entity.Employee;
import uz.pdp.zero_1_saralash_2_demo.enums.CalculationTypeEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link uz.pdp.zero_1_saralash_2_demo.entity.CalculationTable}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculationTableCrudDTO implements Serializable {
    private Employee employee;
    private Double amount;
    private Float rate;
    private Date date;
    private OrganizationDTO organization;
    private CalculationTypeEnum calculationType;
}