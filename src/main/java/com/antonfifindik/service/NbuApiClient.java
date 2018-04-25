package com.antonfifindik.service;

import com.antonfifindik.model.ExchangeRateDto;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;


@Component
public class NbuApiClient {
    HttpClient httpClient = HttpClientBuilder.create().build();
    ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
    private RestTemplate restTemplate = new RestTemplate(requestFactory);

    public List<ExchangeRateDto> getAll() {
        String url = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json";
        ExchangeRateDto[] respone;
        try {
            respone = restTemplate.getForObject(new URI(url), ExchangeRateDto[].class);
            return Arrays.asList(respone);
        } catch (URISyntaxException e) {
            throw new RuntimeException();
        }
    }
}
