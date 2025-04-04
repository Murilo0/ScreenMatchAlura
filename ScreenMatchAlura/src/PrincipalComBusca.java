package ScreenMatchAlura.src;
import ScreenMatchAlura.src.br.com.alura.screenmatch.modelos.TItuloOmdb;
import ScreenMatchAlura.src.br.com.alura.screenmatch.modelos.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main (String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var input = leitura.nextLine();
        var busca = input.replaceAll(" ","+");

        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=8a07b8f4";
        try{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TItuloOmdb meuTituloOmdb = gson.fromJson(json, TItuloOmdb.class);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("meuTituloOmdb: " + meuTituloOmdb);
            System.out.println("Titulo convertido:");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        }
        System.out.println("O programa rodou corretamente.");
    }
}
