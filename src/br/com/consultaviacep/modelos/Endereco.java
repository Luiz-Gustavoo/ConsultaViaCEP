package br.com.consultaviacep.modelos;

public class Endereco {
    private String cep;
    private String logradouro;

    public Endereco(EnderecoViaCEP enderecoViaCEP) {
        this.cep = enderecoViaCEP.cep();
        this.logradouro = enderecoViaCEP.logradouro();
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    @Override
    public String toString() {
        return "CEP: " + cep +
          "\n" + "Complemento: " + logradouro;
    }
}
