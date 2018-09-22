package com.antonfifindik.controllers;

import com.antonfifindik.model.ExchangeRate;
import com.antonfifindik.service.NbuExchangeRatesService;
import com.google.common.collect.ImmutableList;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class ExchangeRatesControllerTest {
    @Mock
    NbuExchangeRatesService nbuExchangeRatesService;
    @InjectMocks
    ExchangeRatesController sut;

    @org.junit.Test
    public void getListOfRates() {
        //prepare
        when(nbuExchangeRatesService.findAll()).thenReturn(ImmutableList.of());
        //testing
        List<ExchangeRate> exchangeRateList = sut.getListOfRates();
        //validate
        verify(nbuExchangeRatesService).findAll();
    }
}