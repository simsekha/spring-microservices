package com.simsekonline.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	//@Autowired
	//private Environment environment;

    @GetMapping("/currency-exchange-service/from/{from}/to/{to}")
    public ExchangeValue retreiveExchangeValue(@PathVariable String from, @PathVariable String to) {    
        ExchangeValue exchangeValue = new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
        //exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        exchangeValue.setPort(8000);

        return exchangeValue;
    }
}