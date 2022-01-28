package br.com.trader.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.trader.model.Order;
import br.com.trader.model.Trade;
import br.com.trader.model.dto.TradeRequest;
import br.com.trader.repository.OrderRepository;
import br.com.trader.repository.TradeRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TradeController {
    @Autowired
    private TradeRepository TradeRepo;
    
    @Autowired
    private OrderRepository OrderRepo;

    @PostMapping(value = "/cadastrarTrade")
    public String CadastrarTrade(@RequestBody TradeRequest model) {
	try {
	    Order order = OrderRepo.getById(model.idOder);
	    
	    Trade trade = new Trade();
	    LocalDate dataDeInscricao = LocalDate.now();
	    
	    trade.setOrder(order);
	    trade.setPrice(model.price);
	    trade.setQuantity(model.quantity);
	    trade.setTimeStamp(dataDeInscricao.toString());
	   
	    TradeRepo.save(trade);
	    
	    return "Inserido";
	} catch(Exception e ) {
	    return e.getLocalizedMessage();
	}
    }
    
    @GetMapping(value = "/buscarTrades")
    public List<Trade> BuscarTrades(){
	return TradeRepo.findAll();
    }
}
