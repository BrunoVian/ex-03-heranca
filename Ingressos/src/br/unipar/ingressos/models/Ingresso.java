package br.unipar.ingressos.models;

/**
 *
 * @author bruno
 */
public class Ingresso {

    private double valor;

    public void imprimeValor() {
        System.out.println("Valor Ingresso: " + valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
