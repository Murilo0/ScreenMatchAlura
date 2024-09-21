package ScreenMatchAlura.src.br.com.alura.screenmatch.modelos;

import ScreenMatchAlura.src.br.com.alura.screenmatch.calculos.Classificavel;
import ScreenMatchAlura.src.br.com.alura.screenmatch.modelos.Titulo;

public class Filme extends Titulo implements Classificavel {
    private String diretor;
    private String nome;
    private int anoDeLancamento;
    private int duracaoMin;

    public Filme(String nome , int anoDeLancamento, int duracaoMin){
        super(nome, anoDeLancamento);
        this.setDuracaoEmMinutos(duracaoMin);
    }
    
    public String getDiretor() {
        return diretor;
    } 

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2 ;
    }

    @Override
    public String toString(){
        if (diretor == null){
            return (getNome() +", lançado em " + getAnoDeLancamento() + ", duração: " + getDuracaoEmMinutos() +" minutos");
        }else{
            return (getNome() +", de "+ getDiretor() + ", lançado em " + getAnoDeLancamento() + ", duração: " + getDuracaoEmMinutos() +" minutos");
        }
    }
}