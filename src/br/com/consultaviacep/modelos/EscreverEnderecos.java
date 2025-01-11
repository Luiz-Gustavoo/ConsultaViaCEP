package br.com.consultaviacep.modelos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EscreverEnderecos {
    FileWriter escrita = new FileWriter("D:\\Windows Sistema\\Documentos\\Enderecos.txt");
    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public EscreverEnderecos() throws IOException {
    }

    public String escreverEnderecos(List<Endereco> listaEnderecos) throws IOException {
        try {
            escrita.write(gson.toJson(listaEnderecos));
            escrita.close();
            return "Lista salva no arquivo";
        } catch(FileNotFoundException e) {
            System.out.println("Mão foi possível localizar o arquivo. Verifique se nome do mesmo está correto ou se existe");
            return "Não foi possível salvar os dados";
        }
    }
}
