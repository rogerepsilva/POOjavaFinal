public class Video implements AcoesVideo{
    
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String t){
        this.setTitulo(t);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }

    @Override
    public void play(){
        if (this.getReproduzindo()){
            System.out.println("Vídeo já está reproduzindo.");
        } else {
            this.setReproduzindo(true);
        }
    }
    @Override
    public void pause(){
        if (!this.getReproduzindo()){
            System.out.println("Vídeo já está pausado.");
        } else {
            this.setReproduzindo(false);
        }
    }
    @Override
    public void like(){
        this.setCurtidas(this.getCurtidas() + 1);
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAvaliacao(int avaliacao){
        int nova;
        nova = (int)(this.getAvaliacao() + avaliacao) / this.getViews();
        this.avaliacao = nova;
    }

    public int getAvaliacao(){
        return this.avaliacao;
    }
    public void setViews(int views){
        this.views = views;
    }
    public int getViews(){
        return this.views;
    }
    public void setCurtidas(int curtidas){
        this.curtidas = curtidas;
    }
    public int getCurtidas(){
        return this.curtidas;
    }
    public void setReproduzindo(boolean rep){
        this.reproduzindo = rep;
    }
    public boolean getReproduzindo(){
        return this.reproduzindo;
    }
}
