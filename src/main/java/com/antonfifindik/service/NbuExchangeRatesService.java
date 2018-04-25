package com.antonfifindik.service;

import com.antonfifindik.model.ExchangeRate;
import com.antonfifindik.model.ExchangeRateDto;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NbuExchangeRatesService {

    @Autowired
    private NbuApiClient nbuApiClient;

    public List<ExchangeRate> findAll() {
        return nbuApiClient.getAll().stream()
                .map(this::toExchangeRate).collect(Collectors.toList());
    }

    private ExchangeRate toExchangeRate(@NonNull ExchangeRateDto input) {
        return new ExchangeRate(input.getTxt(), input.getRate(), input.getCc(), Integer.parseInt(input.getR030()), input.getExchangedate());
    }
}
