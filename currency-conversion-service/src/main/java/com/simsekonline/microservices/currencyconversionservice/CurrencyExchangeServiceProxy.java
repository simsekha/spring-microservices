package com.simsekonline.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
public interface CurrencyExchangeServiceProxy {
    @GetMapping("/currency-exchange-service/from/{from}/to/{to}")
    public CurrencyConversionBean retreiveExchangeValue(@PathVariable String from, @PathVariable String to);
}