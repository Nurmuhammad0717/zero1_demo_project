package uz.pdp.zero_1_saralash_2_demo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link uz.pdp.zero_1_saralash_2_demo.entity.Employee}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeCrudDTO implements Serializable {
    private String firstName;
    private String lastName;
    private String pinfl;
    private Date hireDate;
    private OrganizationDTO organization;
}