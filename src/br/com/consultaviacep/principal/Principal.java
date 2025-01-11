package br.com.consultaviacep.principal;
import br.com.consultaviacep.modelos.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        List<Endereco> listaEndereco = new ArrayList<>();
        String busca = "";

        while (!busca.equalsIgnoreCase("sair")) {
            LerCEP lerCEP = new LerCEP();
            busca = lerCEP.lerCEP();
            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            ResultadoValidaCEP resultadoValidaCEP = CEPChecker.lerCEP(busca);
            if (!resultadoValidaCEP.isResultadoValidaCEP()) {
                System.out.println("Não foi possível validar esse CEP");
            } else {

                ConsultaHTTP consultaHTTP = new ConsultaHTTP(busca);
                EnderecoViaCEP enderecoViaCEP = consultaHTTP.fazerRequisicao();

                Endereco endereco = new Endereco(enderecoViaCEP);
                System.out.println(endereco);
                listaEndereco.add(endereco);
            }

        }
        System.out.println("Lista de endereços: ");
        for(Endereco endereco: listaEndereco) {
            System.out.println(endereco);
        }
        System.out.println("Finalizando a aplicação");
    }
}

