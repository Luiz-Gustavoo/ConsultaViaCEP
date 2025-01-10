package br.com.consultaviacep.excecoes;

public class CEPinvalidoExcepton extends RuntimeException {
    private String cep;
    private boolean resultadoValidacao;

  public String getCep() {
    return cep;
  }

  public boolean isResultadoValidacao() {
    return resultadoValidacao;
  }

  public CEPinvalidoExcepton(String cep, boolean resultadoValidacao) {
    this.cep = cep;
    this.resultadoValidacao = resultadoValidacao;
  }
}
