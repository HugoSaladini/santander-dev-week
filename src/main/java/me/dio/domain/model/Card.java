package me.dio.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String number;

    @Column(name = "available_limit", scale = 13, precision = 2)
    private Double limit;

    public Long getId() { return id; }
    public void setId( Long id) { this.id = id; }

    public String getNumber() { return number; }
    public void setNumber( String number ) { this.number = number; }

    public Double getLimit() { return limit; }
    public void setLimit( Double limit ) { this.limit = limit; }

}
