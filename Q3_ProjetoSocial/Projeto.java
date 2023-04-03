package Q3_ProjetoSocial;

public abstract class Projeto {
    private String nomeProjeto;
    private String decricao;
    private String endereco;
    private String datainicio;
    private String datafim;

    public Projeto() {
        this.nomeProjeto = nomeProjeto;
        this.decricao = decricao;
        this.endereco = endereco;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }

    public Projeto(String nomeProjeto, String decricao, String endereco, String datainicio, String datafim) {
        this.nomeProjeto = nomeProjeto;
        this.decricao = decricao;
        this.endereco = endereco;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public String getDatafim() {
        return datafim;
    }

    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }

    public abstract boolean validaProjeto();
    public abstract String imprimeProjeto();
}
