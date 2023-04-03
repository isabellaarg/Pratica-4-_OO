package Q3_ProjetoSocial;

public class DistribuicaoAlimento extends Projeto{
    private String descAlimentos;
    private float qtde;

    public DistribuicaoAlimento(String descAlimentos, float qtde) {
        this.descAlimentos = descAlimentos;
        this.qtde = qtde;
    }

    public DistribuicaoAlimento(String nomeProjeto, String decricao, String endereco, String datainicio, String datafim, String descAlimentos, float qtde) {
        super(nomeProjeto, decricao, endereco, datainicio, datafim);
        this.descAlimentos = descAlimentos;
        this.qtde = qtde;
    }

    public String getDescAlimentos() {
        return descAlimentos;
    }

    public void setDescAlimentos(String descAlimentos) {
        this.descAlimentos = descAlimentos;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public boolean validaProjeto(){
        if(getDatafim() == null)
            return true;
        else
            return false;
    }

    public String imprimeProjeto(){
        return "Nome: "+ getNomeProjeto() +"\nDescrição: " + getDecricao() + "\nData inicio: " + getDatainicio() + "\nData fim: " + getDatafim() + "\nDescrição Alimento: " + getDescAlimentos() + "\nQuantide: " + getQtde();

    }
}
