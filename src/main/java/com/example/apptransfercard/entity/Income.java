package com.example.apptransfercard.entity;

import com.example.apptransfercard.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
//import uz.pdp.apptransfercard.entity.template.AbsEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Income extends AbsEntity {
    @ManyToOne
    private Card fromCard;
    @ManyToOne
    private Card toCard;
    @Column(nullable = false)
    private Double amount;
    @Column(nullable = false)
    private Date date;
}
