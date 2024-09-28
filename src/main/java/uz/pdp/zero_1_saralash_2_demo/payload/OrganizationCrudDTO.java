package uz.pdp.zero_1_saralash_2_demo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link uz.pdp.zero_1_saralash_2_demo.entity.Organization}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationCrudDTO implements Serializable {
    private String name;
    private Long regionId;
    private String regionName;
}