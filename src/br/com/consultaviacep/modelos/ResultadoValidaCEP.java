package br.com.consultaviacep.modelos;

public class ResultadoValidaCEP {
    private String cep;
    private boolean resultadoValidaCEP;

    public String getCep() {
        return cep;
    }

    public boolean isResultadoValidaCEP() {
        return resultadoValidaCEP;
    }

    public ResultadoValidaCEP(String cep, boolean resultadoValidaCEP) {
        this.cep = cep;
        this.resultadoValidaCEP = resultadoValidaCEP;
    }
}
