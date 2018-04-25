package com.antonfifindik.model;

import lombok.Data;

@Data
public class ExchangeRateDto {
    private String r030;
    private String txt;
    private Double rate;
    private String cc;
    private String exchangedate;
}
