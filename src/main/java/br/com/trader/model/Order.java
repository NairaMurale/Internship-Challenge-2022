package br.com.trader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

import javax.persistence.Id;

@Entity
@Data
@Table(name = "tb_order")
public class Order {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    
    @Column
    public String ticker;
    
    @ManyToOne
    @JoinColumn(name = "tb_trader")
    private Trader trader;
    
}



