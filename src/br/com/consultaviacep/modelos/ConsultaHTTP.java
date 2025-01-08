package br.com.consultaviacep.modelos;

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

    public String fazerRequisicao() throws IOException, InterruptedException {
        try {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
        } catch(RuntimeException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
            return "Não foi possível consultar esse CEP";
        }
    }
}

