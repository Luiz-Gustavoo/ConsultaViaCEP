package br.com.consultaviacep.principal;

import br.com.consultaviacep.modelos.ConsultaHTTP;
import java.io.IOException;


public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        ConsultaHTTP consultaHTTP = new ConsultaHTTP("86806632");
        System.out.println(consultaHTTP.fazerRequisicao());


    }
}
