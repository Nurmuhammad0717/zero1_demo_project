package uz.pdp.zero_1_saralash_2_demo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.zero_1_saralash_2_demo.entity.Region;

import java.io.Serializable;

/**
 * DTO for {@link uz.pdp.zero_1_saralash_2_demo.entity.Organization}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationDTO implements Serializable {
    private Long id;
    private String name;
    private Region region;
}