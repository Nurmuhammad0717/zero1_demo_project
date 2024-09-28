package uz.pdp.zero_1_saralash_2_demo.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.pdp.zero_1_saralash_2_demo.entity.template.AbsLongEntity;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity

public class Organization extends AbsLongEntity {

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private Region region;

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private List<Employee> employees;

}
