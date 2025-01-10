package br.com.consultaviacep.excecoes;

public class CEPinvalidoExcepton extends RuntimeException {

    private String mensagem;

  public String getMensagem() {
    return mensagem;
  }

  public CEPinvalidoExcepton(String mensagem) {
    this.mensagem = mensagem;
  }
}
