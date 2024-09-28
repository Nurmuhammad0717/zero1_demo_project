package uz.pdp.zero_1_saralash_2_demo.entity;


import jakarta.persistence.Entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.*;
import uz.pdp.zero_1_saralash_2_demo.entity.template.AbsLongEntity;
import uz.pdp.zero_1_saralash_2_demo.enums.CalculationTypeEnum;

import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class CalculationTable extends AbsLongEntity {

    @ManyToOne
    private Employee employee;

    private Double amount;

    private Float rate;

    private Date date;

    @ManyToOne
    private Organization organization;

    @Enumerated(EnumType.STRING)
    private CalculationTypeEnum calculationType;


}
