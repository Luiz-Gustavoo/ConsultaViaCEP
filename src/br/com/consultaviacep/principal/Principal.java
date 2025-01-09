package br.com.consultaviacep.principal;

import br.com.consultaviacep.modelos.ConsultaHTTP;
import br.com.consultaviacep.modelos.Endereco;
import br.com.consultaviacep.modelos.EnderecoViaCEP;

import java.io.IOException;


public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        ConsultaHTTP consultaHTTP = new ConsultaHTTP("86806632");
        EnderecoViaCEP enderecoViaCEP = consultaHTTP.fazerRequisicao();

        Endereco endereco = new Endereco(enderecoViaCEP);
        System.out.println(endereco);


    }
}
