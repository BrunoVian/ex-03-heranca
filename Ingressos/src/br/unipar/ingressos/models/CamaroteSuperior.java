package br.unipar.ingressos.models;

public class CamaroteSuperior extends Vip {

    private double vlAdicionalCamarote;

    public double getVlAdicionalCamarote() {
        return vlAdicionalCamarote;
    }

    public void setVlAdicionalCamarote(double vlAdicionalCamarote) {
        this.vlAdicionalCamarote = vlAdicionalCamarote;
    }

    @Override
    public void imprimeValor() {
        setValor(super.getValor() + vlAdicionalCamarote);
        super.imprimeValor();
    }

}
