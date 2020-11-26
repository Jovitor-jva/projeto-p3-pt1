package projetop3refeito;
import projetop3refeito.CarroR.Modelo;
import projetop3refeito.CarroR.Preco;
import projetop3refeito.PromocaoR.Cupom;
import java.util.Scanner;
import projetop3refeito.ValidaCpfR;
public class ProjetoP3Refeito {
    public static void exibeMenu(){
        System.out.println("OPÇÕES DO MENU");
        System.out.println("1 - Cadastrar novo usuário");
        System.out.println("2 - Exibir Cadastro ");
        System.out.println("3 - Consultar Lista");
        System.out.println("4 - Devolver");
        System.out.println("5 - Renovar");
        System.out.println("6 - Apagar Cadastro");
        System.out.println("7 - USAR CUPOM");
        System.out.println("8 - EXIBIR CADASTRO");
        System.out.println("0- finalizar");
        System.out.println("INFORME A OPÇÃO DESEJADA");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CadastroClienteR C = new CadastroClienteR();
        ClienteR c ;
        LocadoraR loc = new LocadoraR();
        Modelo[] m = Modelo.values();
        Preco[] p = Preco.values();
        Cupom cm = Cupom.CUPOM1;
        String nome = null, cpf, cnh;
        int opcao, idade;
        do{
            exibeMenu();
            opcao = in.nextInt(); in.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("INFORME O NOME");
                    nome = in.nextLine();
                    c = new ClienteR(nome);
                    System.out.println("INFORME O CPF: ");
                    cpf = in.nextLine();
                    if(ValidaCpfR.eCPF(cpf) == true){
                        c.setCpf(cpf);
                    System.out.println("CPF VÁLIDO");
                }
                else{
                    System.out.printf("CPF INVÁLIDO DIGITE NOVAMENTE: ");
                    cpf = in.nextLine();
                }
                System.out.print("Digite o numero da CNH: ");
                cnh = in.nextLine();
                if(ValidaCnhR.validaCNH(cnh) == true){
                    c.setCnh(cnh);
                    System.out.println("CNH VÁLIDA");
                }else{
                    System.out.printf("CNH INVÁLIDA DIGITE NOVAMENTE");
                    cnh = in.nextLine();
                }
                System.out.println("AGORA DIGITE A SUA IDADE ");
                idade = in.nextInt(); in.nextLine();
                if(idade < 21){
                    System.out.println("VOCÊ NÃO TEM IDADE O SUFICIENTE");
                }
                else{
                c.setIdade(idade);
                }
                C.cadastrar(c);
                System.out.println("CADASTRADO");
                break;
                case 2:
                    C.exibirCliente();
                    break;
                case 3:
                    System.out.println("LISTA DE CARROS");
                    loc.exibModelo(m);
                    break;
                case 4:
                    System.out.println("Tabela de modelos e preços");
                    loc.exibModPre(m, p);
                    System.out.println("");
                    loc.alugarCarro(m, p);
                    break;
            }
        }while(opcao != 0);
        }
}
            
            