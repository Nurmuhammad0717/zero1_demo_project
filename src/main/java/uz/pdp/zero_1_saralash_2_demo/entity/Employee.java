package uz.pdp.zero_1_saralash_2_demo.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.pdp.zero_1_saralash_2_demo.entity.template.AbsLongEntity;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Employee extends AbsLongEntity {


    @Column( nullable = false)
    private String firstName;

    @Column( nullable = false)
    private String lastName;

    @Column( nullable = false, unique = true)
    private String pinfl;

    @Column(nullable = false)
    private Date hireDate;

    @ManyToOne
    private Organization organization;

    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<CalculationTable> salaries;


}
