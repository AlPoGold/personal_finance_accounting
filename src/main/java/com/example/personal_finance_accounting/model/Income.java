package com.example.personal_finance_accounting.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


@Data
@Entity
@Table(name="incomes")
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="amount")
    private BigDecimal amount;
    @Column(name="source")
    private String source;
    @Column(name="date")
    private Date date;
}
