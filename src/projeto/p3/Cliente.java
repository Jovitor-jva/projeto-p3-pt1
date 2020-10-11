package projeto.p3;
import java.util.ArrayList;
public class Cliente implements Comparable <Cliente>{

    //public void setCpf(String cpf) {
      //  this.cpf = cpf;
    //}



    /*static void setCliente(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void setCpf(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    /*public Cliente (String nome){
        this.nome = nome;
    }
    private String cliente, cpf;
    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public String getCliente(){
        return this.cliente;
    }
    public static void setCpf(String cpf) {
        this.cpf = cpf;
    }
    private String cpf, nome, cnh, validade;
    private int idade;
    private double deposito, saldo;

    /**
     *
     * @param cpf
     */
    
    private String cpf, nome, cnh, validade;
    private int idade;
    private double deposito, saldo;
    //public Cliente(String cpf) {
      //  this.cpf = cpf;
    //}

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    Cliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setVlidade(String validade) { // Validade da CNH
        this.validade = validade;
    }

    public String getValidade() {
        return this.validade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getDeposito() {
        return this.deposito;
    }
    public void deposita(float valor) { // classe para cadastrar o deposito do cliente que alugou um carro
        saldo += valor;
    }
    @Override
    public int compareTo(Cliente c) { // 1 ERRO AQUI
        return this.cpf.compareToIgnoreCase(c.getCpf());
    }
    //Object Cpf() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//}
    
