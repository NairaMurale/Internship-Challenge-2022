package br.com.trader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.trader.model.Trader;

@Repository
public interface TraderRepository extends JpaRepository<Trader, Long>{}


