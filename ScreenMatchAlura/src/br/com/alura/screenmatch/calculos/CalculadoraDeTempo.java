package ScreenMatchAlura.src.br.com.alura.screenmatch.calculos;
import ScreenMatchAlura.src.br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo{

    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duração em minutos de:" + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();


    }

}