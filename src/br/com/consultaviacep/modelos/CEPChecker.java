package br.com.consultaviacep.modelos;

import br.com.consultaviacep.excecoes.CEPinvalidoExcepton;

public class CEPChecker {

    public static ResultadoValidaCEP lerCEP(String cep) {
        ValidaCEP validaCEP = new ValidaCEP();
        try {
            if(!validaCEP.validaCEP(cep)) {
                throw new CEPinvalidoExcepton(validaCEP.getMensagemValidacao());
            }
        } catch (CEPinvalidoExcepton e) {
            System.out.println("Erro de validação no CEP: " + e.getMensagem());
            return new ResultadoValidaCEP(cep, false);
        }
        return new ResultadoValidaCEP(cep, true);
    }
}
