package br.com.trader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.trader.model.Order;
import br.com.trader.model.Trader;
import br.com.trader.model.dto.OrderRequest;
import br.com.trader.repository.OrderRepository;
import br.com.trader.repository.TraderRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class OrderController {

    @Autowired
    private OrderRepository OrderRepo;
    
    @Autowired
    private TraderRepository TraderRepo;
    
    @PostMapping(value = "/cadastrarOrder")
    public String CadastrarOrder(@RequestBody OrderRequest model) {
	
	try {
	    Trader trader = TraderRepo.getById(model.traderId);
	    
	    Order order = new Order();
	   
	    order.setTicker(model.ticker);
	    order.setTrader(trader);		
	    
	    OrderRepo.save(order);
	    
	    return "Inserido";
	} catch(Exception e ) {
	    return e.getLocalizedMessage();
	}
	
    }
    
    @GetMapping(value = "/buscarOrderList")
    public List<Order> BuscarOrders() {
	return OrderRepo.findAll();
    }
    
}
