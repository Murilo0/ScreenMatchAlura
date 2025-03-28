package ScreenMatchAlura.src.br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }


    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean getAtiva(){
        return ativa;
    }

    public void setAtiva(boolean ativa){
        this.ativa = ativa;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas*episodiosPorTemporada*minutosPorEpisodio;
    }

    @Override
    public String toString(){
        return "Série "+ this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
