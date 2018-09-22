package com.antonfifindik.controllers;

import com.antonfifindik.model.ExchangeRate;
import com.antonfifindik.service.NbuExchangeRatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/exchange")
public class ExchangeRatesController {

    @Autowired
    NbuExchangeRatesService nbuExchangeRatesService;

    @RequestMapping
    public List<ExchangeRate> getListOfRates() {return nbuExchangeRatesService.findAll();
    }

}
