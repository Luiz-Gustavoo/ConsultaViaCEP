package br.com.consultaviacep.principal;

import br.com.consultaviacep.excecoes.CEPinvalidoExcepton;
import br.com.consultaviacep.modelos.*;

import java.io.IOException;


public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        String busca = "86806632";

        ResultadoValidaCEP resultadoValidaCEP = lerCEP(busca);
        if (!resultadoValidaCEP.isResultadoValidaCEP()) {
            System.out.println("Não foi possível validar esse CEP");
        } else {

            ConsultaHTTP consultaHTTP = new ConsultaHTTP(busca);
            EnderecoViaCEP enderecoViaCEP = consultaHTTP.fazerRequisicao();

            Endereco endereco = new Endereco(enderecoViaCEP);
            System.out.println(endereco);

        }
    }
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


