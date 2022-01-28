package br.com.trader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "tb_trader")
public class Trader {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "Code")
    private Long Code;
    
    @Column(name = "Name")
    private String Name;
    
}
