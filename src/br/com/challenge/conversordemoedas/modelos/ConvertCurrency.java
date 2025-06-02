package br.com.challenge.conversordemoedas.modelos;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConvertCurrency {

    public void Currency(String base_code, String target_code, double amount)
            throws IOException, InterruptedException {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/e9078739bd7f23216c6315fd/pair/" +
                        base_code + "/" + target_code + "/" + amount))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Gson gson = new Gson();
        CamposMoeda camposMoeda = gson.fromJson(response.body(), CamposMoeda.class);
        System.out.println("\n     *** Resultado da Operação ***");
        System.out.println("     Valor de " + amount + camposMoeda + "\n");
    }
}