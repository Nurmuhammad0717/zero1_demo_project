package uz.pdp.zero_1_saralash_2_demo.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link uz.pdp.zero_1_saralash_2_demo.entity.Region}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegionDTO implements Serializable {
    private Long id;
    private String name;
}