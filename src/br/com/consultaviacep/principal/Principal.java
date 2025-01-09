package br.com.consultaviacep.principal;

import br.com.consultaviacep.modelos.ConsultaHTTP;
import br.com.consultaviacep.modelos.Endereco;
import br.com.consultaviacep.modelos.EnderecoViaCEP;
import br.com.consultaviacep.modelos.ValidaCEP;

import java.io.IOException;


public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        String busca = "1";
        ValidaCEP validaCep = new ValidaCEP();

        if (!validaCep.validaCEP(busca)) {
            System.out.println("CEP inválido");
        } else {
            ConsultaHTTP consultaHTTP = new ConsultaHTTP(busca);
            EnderecoViaCEP enderecoViaCEP = consultaHTTP.fazerRequisicao();

            Endereco endereco = new Endereco(enderecoViaCEP);
            System.out.println(endereco);
        }
    }
}
