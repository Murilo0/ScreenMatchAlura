package ScreenMatchAlura.src;

import java.util.ArrayList;

import ScreenMatchAlura.src.br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import ScreenMatchAlura.src.br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import ScreenMatchAlura.src.br.com.alura.screenmatch.modelos.*;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão" , 1970, 180);
        meuFilme.setDiretor("Quentin Tarantino");
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(9);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de notas: " + meuFilme.getClassificacao());
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Serie lost = new Serie("Lost" , 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar:" + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023 , 200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println("Para assistir todo nosso catálogo de filmes e séries você gastaria: " + calculadora.getTempoTotal() + " minutos");

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        System.out.println("O epísódio " + episodio.getNumero() + " da série " + episodio.getSerie() + " com " + episodio.getTotalVisualizacoes() + " visualizações");
        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Quantos filmes temos catalogados? " + listaDeFilmes.size() + " filmes");
        System.out.println("Primeiro filme catalogado: " + listaDeFilmes.get(0));
        System.out.println("Toda a lista de catalogados: " + listaDeFilmes);
    }
}