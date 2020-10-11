/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.p3;
import java.util.ArrayList;
import java.util.Scanner;
import projeto.p3.Carro.Modelo;
import projeto.p3.Carro.Preco;
import projeto.p3.CadastroCliente;

public class projeto {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    ArrayList<CadastroCliente> clienteList = new ArrayList();
    CadastroCliente C = new CadastroCliente();
    Locadora loc = new Locadora();
    Modelo [] m = Modelo.values();
    Preco[]p = Carro.Preco.values();
    int Menu, idade = 0, opção;
    String nome, cpf, carro;
    double valor, preco;
    Cliente c;
    do {
      System.out.println("OPÇÕES");
      System.out.println(
          "1-CADASTRO PARA NOVOS USUARIOS \n 2-CONSULTAR A LISTA DE VEICULOS E PREÇOS: \n 3-ALUGAR UM VEICULO \n 4-DEVOLVER UM VEÍCULO: \n 5 -Renovar locação \n 6 Apagar cadastro \n 0-Finalizar ");
      Menu = in.nextInt();
      in.nextLine();
      switch (Menu) {
      case 1:
        while(idade < 21){
            System.out.print("Digite sua idade");
            idade = in.nextInt(); in.nextLine();
            C.setIdade(idade);
            System.out.println("Digite seu nome:");
            nome = in.nextLine();
            c = new Cliente(nome);
            System.out.println("Digite seu CPF (Apenas digitos)");
            cpf = in.nextLine();
            C.setCpf(cpf);
            System.out.print("Digite o numero da CNH");
            C.setCnh(in.next());
            System.out.println();
            System.out.println("Cadastro realizado com sucesso!");
            System.out.println("Idade insuficiente para cadastro");
            break;
        }
      case 2:
          System.out.println("Essa é a lista de carros");
          loc.exibModelo(m);
          break;
      case 3: // ALUGAR UM VEICULO
        System.out.println("Tabela de modelos e preços");
        loc.exibModPre(m, p);
        System.out.println("Digite o modelo desejado");
        carro = in.next();
        System.out.println("Digite o valor");
        preco = in.nextDouble();
        loc.alugarCarro(carro, m, p, preco);
        System.out.print("Obrigado carro locado com sucesso! \n Valido por 1 mês! ");
        break;
      case 4: // DEVOLVER UM VEÍCULO
        System.out.println("Por favor digite Seu cadastro");

        break;

      case 5: // Renovar locação
        System.out.print("AVISO: Apenas 3 renovações por cadastro ");

        break;

      case 6: // Remover cadastro

        break;

      default:
        System.out.println("OPERAÇÃO INVALIDA!");
      }
    } while (Menu != 0);
  }
}
