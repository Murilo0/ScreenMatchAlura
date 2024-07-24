package ScreenMatchAlura.src.br.com.alura.screenmatch.modelos;

import ScreenMatchAlura.src.br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;
    
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int GetClassificacao() {
        return (int) pegaMedia() / 2 ;
    }

    

}