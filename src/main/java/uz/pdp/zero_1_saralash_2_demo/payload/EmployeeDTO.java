package uz.pdp.zero_1_saralash_2_demo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.zero_1_saralash_2_demo.entity.Organization;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link uz.pdp.zero_1_saralash_2_demo.entity.Employee}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String pinfl;
    private Date hireDate;
    private Organization organization;
}