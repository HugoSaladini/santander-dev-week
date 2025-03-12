package me.dio.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    private String agency;

    @Column(scale = 13, precision = 2)
    private Double balance;

    @Column(scale = 13, precision = 2)
    private Double limit;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNumber() { return number; }

    public void setNumber(String number) {this.number = number; }

    public String getAgency() { return agency; }

    public void setAgency(String agency) { this.agency = agency; }

    public Double getLimit() { return limit; }

    public void setLimit(Double limit) { this.limit = limit; }

    public Double getBalance() { return balance; }

    public void setBalance(Double balance) { this.balance = balance;}
}
