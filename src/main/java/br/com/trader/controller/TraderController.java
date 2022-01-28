package br.com.trader.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.trader.model.Trader;
import br.com.trader.repository.TraderRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TraderController {
    
    	@Autowired
    	private final TraderRepository repo;
    
	@GetMapping(value = "/buscarTraders")
	public List<Trader> finalcialBytrader() {
	    List<Trader> traders = repo.findAll();
	 
	    return traders;
	}
	
	@PostMapping(value = "/cadastrarTrader")
	public Trader CadastrarTrader(String nome) {
	    Trader trade = new Trader();
	    trade.setName(nome);	 
	    return repo.save(trade);
	}

}