package br.com.trader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "tb_trade")
public class Trade {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @Column
    private String TimeStamp;
    
    @Column
    private int Quantity;

    @Column
    private double Price;
    
    @ManyToOne
    @JoinColumn(name = "tb_order")
    private Order order;
    
}
