package ScreenMatchAlura.src;

import ScreenMatchAlura.src.br.com.alura.screenmatch.modelos.Filme;
import ScreenMatchAlura.src.br.com.alura.screenmatch.modelos.Serie;
import ScreenMatchAlura.src.br.com.alura.screenmatch.modelos.Titulo;
import ScreenMatchAlura.src.br.com.alura.screenmatch.calculos.CalculadoraDeTempo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas{
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão" , 1970, 180);
        Serie lost = new Serie("Lost" , 2000);
        Filme outroFilme = new Filme("Avatar", 2023, 200);
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(9);


        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(meuFilme);
        listaTitulos.add(outroFilme);
        listaTitulos.add(lost);
        for(Titulo item: listaTitulos){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
        System.out.println("Lista de títulos ordenados:");
        Collections.sort(listaTitulos);
        System.out.println(listaTitulos);
        listaTitulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Depois de compararar por ano de lançcamento: " + listaTitulos);
    }
}

