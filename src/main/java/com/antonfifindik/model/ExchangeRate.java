package com.antonfifindik.model;

public class ExchangeRate {
    private final String title;
    private final Double rate;
    private final String code;
    private final Integer digitalCode;
    private final String date;

    public ExchangeRate(String title, Double rate, String code, Integer digitalCode, String date) {
        this.title = title;
        this.rate = rate;
        this.code = code;
        this.digitalCode = digitalCode;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public Double getRate() {
        return rate;
    }

    public String getCode() {
        return code;
    }

    public Integer getDigitalCode() {
        return digitalCode;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "ExchangeRate{" +
                "title='" + title + '\'' +
                ", rate=" + rate +
                ", code='" + code + '\'' +
                ", digitalCode=" + digitalCode +
                ", date='" + date + '\'' +
                '}';
    }
}
