/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unipar.ingressos.models;

/**
 *
 * @author bruno
 */
public class Vip extends Ingresso {
    private double vlAdicional;
    
    @Override
    public void imprimeValor(){
        setValor(getValor()+vlAdicional);
        super.imprimeValor();
    }

    public double getVlAdicional() {
        return vlAdicional;
    }

    public void setVlAdicional(double vlAdicional) {
        this.vlAdicional = vlAdicional;
    }
    
}
