package br.com.trader.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.trader.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {}
