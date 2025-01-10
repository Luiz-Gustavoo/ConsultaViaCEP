package br.com.consultaviacep.principal;
import br.com.consultaviacep.modelos.*;
import java.io.IOException;


public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        String busca = "1";
        ResultadoValidaCEP resultadoValidaCEP = LerCEP.lerCEP(busca);
        if (!resultadoValidaCEP.isResultadoValidaCEP()) {
            System.out.println("Não foi possível validar esse CEP");
        } else {

            ConsultaHTTP consultaHTTP = new ConsultaHTTP(busca);
            EnderecoViaCEP enderecoViaCEP = consultaHTTP.fazerRequisicao();

            Endereco endereco = new Endereco(enderecoViaCEP);
            System.out.println(endereco);

        }
    }
    }


