public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public void avaliar(){
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int tot = 0;
        if (porc <= 20){
            tot = 3;
        } else if (porc <= 50){
            tot = 5;
        } else if (porc <= 90){
            tot = 0;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Visualizacao (Gafanhoto espectador, Video filme){
        this.setEspectador(espectador);
        this.setFilme(filme);
        this.espectador.viuMaisUm();
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void setEspectador(Gafanhoto v){
        this.espectador = v;
    }
    public Gafanhoto getEspectador(){
        return this.espectador;
    }
    public void setFilme(Video i){
        this.filme = i;
    }
    public Video getFilme(){
        return this.filme;
    }
}
