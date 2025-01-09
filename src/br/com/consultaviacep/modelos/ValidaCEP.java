package br.com.consultaviacep.modelos;

public class ValidaCEP {

    public boolean validaCEP(String cep) {
        if (cep.length() != 8) {
            return false;
        } else {
            return true;
        }
    }
}
