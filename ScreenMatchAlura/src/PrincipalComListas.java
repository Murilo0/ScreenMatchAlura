package ScreenMatchAlura.src;

import ScreenMatchAlura.src.br.com.alura.screenmatch.modelos.Filme;
import ScreenMatchAlura.src.br.com.alura.screenmatch.modelos.Serie;
import ScreenMatchAlura.src.br.com.alura.screenmatch.modelos.Titulo;
import ScreenMatchAlura.src.br.com.alura.screenmatch.calculos.CalculadoraDeTempo;

import java.util.ArrayList;

public class PrincipalComListas{
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O Poderoso Chefão" , 1970);
        Serie lost = new Serie("Lost" , 2000);
        Filme outroFilme = new Filme("Avatar", 2023);

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(meuFilme);
        listaTitulos.add(outroFilme);
        listaTitulos.add(lost);
        for(Titulo item: listaTitulos){
            System.out.println(item);
        }
    }
}

