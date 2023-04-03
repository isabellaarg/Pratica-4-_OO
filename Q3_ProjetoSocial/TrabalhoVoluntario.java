package Q3_ProjetoSocial;

public class TrabalhoVoluntario extends Projeto{
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String decricao, String endereco, String datainicio, String datafim, String tipoTrabalho, int duracaoTrabalho) {
        super();
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }
    public boolean validaProjeto(){
        if(getDuracaoTrabalho() > 2)
            return true;
        else
            return false;
    }

    public String imprimeProjeto(){
        return "Nome: "+ getNomeProjeto() +"\nDescrição: " + getDecricao() + "\nData inicio: " + getDatainicio() + "\nData fim: " + getDatafim() + "\nTipo de trabalho: " + getTipoTrabalho() + "\n Duração: " + getDuracaoTrabalho();

    }
}
