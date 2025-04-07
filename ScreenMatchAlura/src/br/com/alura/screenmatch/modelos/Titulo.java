package ScreenMatchAlura.src.br.com.alura.screenmatch.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento){
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TItuloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();
        if (this.nome == null){
            this.nome = "Filme nao encontrado!";
            this.anoDeLancamento = 0;
            this.duracaoEmMinutos = 0;
            return;
        }
        if(meuTituloOmdb.year().equals("N/A")){
            this.anoDeLancamento = 0;
        }else{
            this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year().substring(0,4).trim());
        }
        if(meuTituloOmdb.runtime().equals("N/A")) {
            this.duracaoEmMinutos = 0;
        }else{
            this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0,3).trim());
        }
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo){
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return  "Nome = '" + nome + '\'' +
                ", Ano de Lancamento = " + anoDeLancamento + ", Duracao = " + duracaoEmMinutos + " minutos";
    }
}