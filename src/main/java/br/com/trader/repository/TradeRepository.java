package br.com.trader.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.trader.model.Trade;

public interface TradeRepository extends JpaRepository<Trade, Long> {}
