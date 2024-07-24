package ScreenMatchAlura.src.br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.GetClassificacao()>= 4){
            System.out.println("Está entre os recomendados do momento!");
        } else if (classificavel.GetClassificacao() >= 2) {
            System.out.println("O filme está bem avaliado no momento!");
        } else {
            System.out.println("Pode ser uma boa tentar!");
        }
}}
