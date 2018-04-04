package com.antonfifindik.model;

public class ExchangeRate {
    private final String title;
    private final Double rate;
    private final String code;
    private final String date;

    public ExchangeRate(String title, Double rate, String code, String date) {
        this.title = title;
        this.rate = rate;
        this.code = code;
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

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "ExchangeRate{" +
                "title='" + title + '\'' +
                ", rate='" + rate + '\'' +
                ", code='" + code + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
