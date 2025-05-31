package br.com.challenge.conversordemoedas.modelos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertCurrency {
    private String currencyOrigin;
    private String currencyLast;
    private int amount;

    public ConvertCurrency(String currencyOrigin, String currencyLast) throws IOException, InterruptedException {
        this.currencyOrigin = currencyOrigin;
        this.currencyLast = currencyLast;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/e9078739bd7f23216c6315fd/pair/"+
                        currencyOrigin + "/" + currencyLast + "/" + amount))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
    }
}