package br.unipar.ingressos.models;

public class CamaroteInferior extends Vip{
    
    private String dsLocalizacao;

    public String getDsLocalizacao() {
        return dsLocalizacao;
    }

    public void setDsLocalizacao(String dsLocalizacao) {
        this.dsLocalizacao = dsLocalizacao;
    }
    
    public void imprimeLocalizacao(){
        System.out.println("Localização: " + dsLocalizacao);
    }
    
}
