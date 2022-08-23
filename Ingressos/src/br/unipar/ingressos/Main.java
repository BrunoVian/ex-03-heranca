
package br.unipar.ingressos;

import br.unipar.ingressos.models.Ingresso;
import br.unipar.ingressos.models.Vip;

/**
 *
 * @author bruno
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Ingresso: ");
        Ingresso ingresso = new Ingresso();
        ingresso.setValor(50);
        ingresso.imprimeValor();
        System.out.println("------------\nVip: ");
        Vip vip = new Vip();
        vip.setValor(50);
        vip.setVlAdicional(20);
        vip.imprimeValor();
        System.out.println("-------------\nCamarote Inf");
        
    }
    
}
