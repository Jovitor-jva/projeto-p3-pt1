/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetop3refeito;

public class PromocaoR {

    private String cupom;

    public enum Cupom {

        CUPOM1("CUPOM1");
        private final String cupom;

        Cupom(String cupom) {
            this.cupom = cupom;
        }

        public String getCupom() {
            return this.cupom;
        }
    }

    public String getCupom() {
        return this.cupom;
    }
}
