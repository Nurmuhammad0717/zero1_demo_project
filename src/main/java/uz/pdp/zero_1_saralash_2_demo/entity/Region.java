package uz.pdp.zero_1_saralash_2_demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;
import uz.pdp.zero_1_saralash_2_demo.entity.template.AbsLongEntity;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Region extends AbsLongEntity {

    @Column(nullable = false)
    private String name;

}
