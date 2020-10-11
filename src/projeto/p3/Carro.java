package projeto.p3;

public class Carro {

    private String cor;
    private Modelo modelo;
    private Preco preco;

    public enum Modelo {

         
        Modelo_HB20("HB20 - Hyundai"),
        Modelo_CORSA("Corsa - Chevrolet"),
        Modelo_LOGAN("Logan - Renault"),
        Modelo_ARGO("Argo - Fiat "),
        Modelo_ONIX("Onix - Chevrolet");

        private final String modelo;

        Modelo(String modelo) {
            this.modelo = modelo;
        }

        String getModelo() {
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

        double getPreco() {
            return this.preco;
        }
    }
    
    public Carro(Modelo modelo) {
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
    

