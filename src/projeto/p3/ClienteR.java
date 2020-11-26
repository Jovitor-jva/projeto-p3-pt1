/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetop3refeito;

public class ClienteR implements Comparable<ClienteR> {

    private String cpf, nome, cnh, validade, carroAlugado;
    private int idade, renovacao;
    private double deposito, saldo;
    public ClienteR(String nome){
        this.nome = nome;
    }
    

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCnh() {
        return this.cnh;
    }

    public void setValidade(String validade) { // Validade da CNH
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

    public int getRenovação() {
        return this.renovacao;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public double getDeposito() {
        return this.deposito;
    }

    public void deposita(float valor) { // classe para cadastrar o deposito do cliente que alugou um carro
        this.saldo += valor;
    }

    public void setRenovacao(int renovacao) {
        this.renovacao = renovacao;
    }

    public void setCarroAlugado(String carro) { //armazenar o carro que o cliente alugou
        this.carroAlugado = carro;
    }

    public String getCarroAlugado() {
        return this.carroAlugado;
    }
    public String toString(){
        return this.nome + " " + this.cnh + " " + this.cpf + " " + this.idade;
    }

    @Override
    public int compareTo(ClienteR c) {
        return this.nome.compareToIgnoreCase(c.getNome());
    }
}
    

