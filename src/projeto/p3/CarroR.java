/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetop3refeito;

public class CarroR {

    private String cor;
    private Modelo modelo;
    private Preco preco;

    public enum Modelo {

         
        Modelo_HB20("CARRO HB20 - Hyundai"),
        Modelo_CORSA("CARRO Corsa - Chevrolet"),
        Modelo_LOGAN("CARRO Logan - Renault"),
        Modelo_ARGO("CARRO Argo - Fiat "),
        Modelo_ONIX("CARRO Onix - Chevrolet");

        private final String modelo;

        Modelo(String modelo) {
            this.modelo = modelo;
        }

        public String getModelo() {
            return this.modelo;
        }
    }

    public enum Preco {

        PRECO_HB20(1000),
        PRECO_CORSA(300),
        PRECO_LOGAN(1100),
        PRECO_ARGO(1100),
        PREÇO_ONIX(1100);

        private final double preco;

        Preco(double preco) {
            this.preco = preco;
        }

        public double getPreco() {
            return this.preco;
        }
    }
    
    public CarroR(Modelo modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return this.cor;
    }

    public String imprimir() {
        return this.modelo + " " + this.cor + " " + this.preco + " ";
    }
}
    

