package com.antonfifindik.model;

import lombok.Data;

@Data
public class ExchangeRate {
    private final String title;
    private final Double rate;
    private final String code;
    private final Integer digitalCode;
    private final String date;
}
