package br.com.consultaviacep.modelos;

public class ValidaCEP {
    private String mensagemValidacao;

    public String getMensagemValidacao() {
        return mensagemValidacao;
    }

    public boolean validaCEP(String cep) {
        if (cep.length() != 8) {
            mensagemValidacao = "O CEP não possui 8 dígitos";
            return false;
        }

        if (cep.isEmpty()) {
            mensagemValidacao = "O CEP não pode ser vazio";
            return false;
        }
        return true;
    }
}
