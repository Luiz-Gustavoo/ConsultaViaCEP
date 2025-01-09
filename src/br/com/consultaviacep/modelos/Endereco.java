package br.com.consultaviacep.modelos;

public class Endereco {
    private String Cep;
    private String logradouro;

    public String getCep() {
        return Cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    @Override
    public String toString() {
        return "CEP: " + Cep +
          "\n" + "Complemento: " + logradouro;
    }
}
