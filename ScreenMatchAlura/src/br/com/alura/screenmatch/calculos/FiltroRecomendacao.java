package ScreenMatchAlura.src.br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao()>= 4){
            System.out.println("Está entre os recomendados do momento!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("O filme está bem avaliado no momento!");
        } else {
            System.out.println("Pode ser uma boa tentar!");
        }

    }
}
