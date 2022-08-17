public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistido;

    public void viuMaisUm(){
        this.setTotAssistido(this.getTotAssistido() + 1);
    }

    public String getLogin(){
        return this.login;
    }
    public void setLogin(String log){
        this.login = log;
    }
    public int getTotAssistido(){
        return this.totAssistido;
    }
    public void setTotAssistido(int Tot){
        this.totAssistido = Tot;
    }
}