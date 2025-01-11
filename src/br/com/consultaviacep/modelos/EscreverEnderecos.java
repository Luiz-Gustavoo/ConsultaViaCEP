package br.com.consultaviacep.modelos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscreverEnderecos {
    FileWriter escrita = new FileWriter("D:\\Windows Sistema\\Documentos\\Enderecos.txt");

    public EscreverEnderecos() throws IOException {
    }

    public String escreverEnderecos(List<Endereco> listaEnderecos) throws IOException {
        escrita.write(listaEnderecos.toString());
        escrita.close();
        return "Lista salva no arquivo";
    }
}
