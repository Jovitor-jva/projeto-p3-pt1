
package projetop3refeito;

import java.util.Scanner;
class CadastroClienteR {

    public final ClienteR[] vetor;
    public int cont;

    public CadastroClienteR() {
        vetor = new ClienteR[1];
        cont = 0;
    }
    public void cadastrar (ClienteR c){
        int i, p, pos=0;
        String s1, s2;
        if(this.cont == 0){
            this.vetor[this.cont] = c;
            this.cont++;
            System.out.println("Cliente cadastrado:");
        }
        else if(this.cont < this.vetor.length){
            s1 = c.getNome();
            s2 = this.vetor[this.cont - 1].getNome();
            if(s1.compareTo(s2) > 0){
                this.vetor[this.cont] = c;
                this.cont++;
                System.out.println("Cadastro efetuado!");
            }else{
                for(i = 0; i < this.cont; i++){
                    s2 = this.vetor[i].getNome();
                    if(s2.compareTo(s1) > 0) {
                        pos = i;
                        break;
                    }
                }
                for(p = this.cont; p > pos; p--){
                    this.vetor[p] = this.vetor[p-1];
                }
                this.vetor[pos] = c;
                this.cont++;
                System.out.println("Cliente cadastrado:");
            }
        }
        else{
            System.out.println("Cadastro não efetuado por falta de espaço! ");
        }
    }
    
    public void cadastroCliente(ClienteR c) {
        Scanner in = new Scanner(System.in);
        int idade, tam;
        String nome, cnh, cpf, conta;
        char digV;
        System.out.println("Digite sua idade: ");
        idade = in.nextInt();
        if (idade >= 21) {
            in.nextLine();
            c.setIdade(idade);
        }else{
            System.out.println("IDADE INVÁLIDA");
        }
        System.out.println("Digite seu nome: ");
        nome = in.nextLine();
        c.setNome(nome);
        System.out.printf("Informe um CPF: ");
        cpf = in.next();
        if (ValidaCpfR.eCPF(cpf) == true){
            c.setCpf(cpf);
            System.out.println("CPF VÁLIDO");
        }else{
            System.out.println("CPF INVÁLIDO");
        }
        System.out.print("Digite o numero da CNH: ");
        cnh = in.next();
        if(ValidaCnhR.validaCNH(cnh) == true){
            c.setCnh(cnh);
            System.out.println("CNH VÁLIDA");
        }else{
            System.out.println("CNH INVÁLIDA");
        }
        System.out.println();
        this.vetor[this.cont] = c;
        this.cont++;
        System.out.println("Cadastro realizado com sucesso!");
    }
    public void exibirCliente(){
        int i;
        for(i = 0; i < this.cont; i ++){
            System.out.println("CLIENTE " + (i+1));
            System.out.println(this.vetor[i]);
        }
    }
    public void remover() {
        Scanner z = new Scanner(System.in);
        int i, pos;
        String nome;
        System.out.println("Digite o nome que deseja remover: ");
        nome = z.nextLine();
        if (this.cont == 0) {
            System.out.println("Cadastro de clientes vázio");
        } else {
            pos = this.buscarBinaria(nome);
            if (pos == -1) {
                System.out.println("Cliente não encontrado");
            } else {
                for (i = pos; i < this.cont - 1; i++) {
                    this.vetor[i] = this.vetor[i + 1];
                    this.vetor[i] = null;
                    System.out.println("CLIENTE REMOVIDO DO CADASTRO");
                }
            }
        }
    }

    public boolean consultarNome(String nomeProc) {
        boolean validar = false;
        for (ClienteR vetor1 : vetor) {
            while (vetor1.getNome().compareTo(nomeProc)==0) {
                validar = true;
                break;
            }
        }return validar;
        
    }

    private int buscarBinaria(String nomeProc) { //função privada que será chamada pelo método de remoção
        int inicio = 0, fim = this.cont - 1, meio;
        int pos = -1;
        do {
            meio = (inicio + fim) / 2;
            if (nomeProc.equalsIgnoreCase(this.vetor[meio].getNome()) == true) {
                pos = meio;
                break;
            } else if (nomeProc.compareToIgnoreCase(this.vetor[meio].getNome()) < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        } while (inicio <= fim);
        return pos;
    }
}
