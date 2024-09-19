package ScreenMatchAlura.src.br.com.alura.screenmatch.modelos;

import ScreenMatchAlura.src.br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome , int anoDeLancamento){
        super(nome, anoDeLancamento);
    }
    
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

    @Override
    public String toString(){
        if (diretor == null){
            return (getNome() +", lançado em " + getAnoDeLancamento() + ", duração: " + getDuracaoEmMinutos() +" minutos");
        }else{
            return (getNome() +", de "+ getDiretor() + ", lançado em " + getAnoDeLancamento() + ", duração: " + getDuracaoEmMinutos() +" minutos");
        }
    }
}