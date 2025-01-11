package br.com.consultaviacep.modelos;

import java.util.Scanner;

public class LerCEP {
    private Scanner leitura = new Scanner(System.in);

    public String lerCEP() {
        System.out.println("Digite o CEP: ");
        String cepDigitado = leitura.nextLine();

        return cepDigitado;
    }
}
