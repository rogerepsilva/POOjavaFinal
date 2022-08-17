public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected float experiencia;
    private int nivel;

    public void ganharExp(){
        if (this.getExperiencia() > 50){
            this.setNivel(this.getNivel() + 1);
            this.setExperiencia(this.getExperiencia() - 50);
        } else {
            this.setExperiencia(this.getExperiencia() + 9.73f);
        }
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setExperiencia(float exp){
        this.experiencia = exp;
    }
    public float getExperiencia(){
        return this.experiencia;
    }
    public int getNivel(){
        return this.nivel;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }

}
