package br.com.consultaviacep.modelos;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaHTTP {
    private String busca;
    private String endereco;

    public ConsultaHTTP(String busca) {
        this.busca = busca;
        this.endereco = ("https://viacep.com.br/ws/"+busca+"/json/");
    }

    public EnderecoViaCEP fazerRequisicao() throws IOException, InterruptedException {
        Gson gson = new Gson();
        try {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return gson.fromJson(response.body(), EnderecoViaCEP.class);

        } catch(RuntimeException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());

            return null;
        }
    }
}

