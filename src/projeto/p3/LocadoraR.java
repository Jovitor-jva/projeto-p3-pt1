package projetop3refeito;
import projetop3refeito.CarroR.Modelo;
import projetop3refeito.CarroR.Preco;
import projetop3refeito.PromocaoR.Cupom;
import java.util.Scanner;


/*
A Classe locadora realiza operações exclusivas a locadora,por exemplo a função
de locar os carros ,e a função de realizar o pagamento,são funções designadas 
exclusivamente para a classe locadora
 */
public class LocadoraR extends CadastroClienteR {

    public LocadoraR() {
    }
    private int renovacao = 0;

    public void exibModelo(Modelo[] m) {
        m = Modelo.values();
        int i = 0;
        do {
            System.out.println("" + m[i].getModelo());
            i++;
        } while (i < m.length);
        System.out.println(" ");
    }

    public void exibPreco(Preco[] p) {
        p = Preco.values();
        int i = 0;
        while (i < p.length) {
            System.out.println(" " + p[i].getPreco());

        }
        System.out.println(" ");
    }

    public void exibModPre(Modelo[] m, Preco[] p) {

        m = Modelo.values();
        p = Preco.values();
        for (int i = 0; i < m.length; i++) {

            System.out.println("Modelo do Carro : " + m[i].getModelo() + "\n Preço do Carro: R$ " + p[i].getPreco());
            System.out.println(" ");
        }

    }

    

    public void alugarCarro(Modelo[] m, Preco[] p) {
        Scanner z = new Scanner(System.in);
        String nome, modelo;
        double pr;
        System.out.println("Digite o nome do cliente: ");
        nome = z.nextLine();
        if (this.consultarNome(nome) == true) {
            System.out.println("Nome encontrado, Digite o modelo do carro : ");
            modelo = z.nextLine();
            System.out.println("Digite o valor a ser pago: ");
            double preco = z.nextDouble();
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i].getNome().compareToIgnoreCase(nome) == 0) {
                    for (int j = 0; j < m.length; j++) {
                        if (m[i].getModelo().compareToIgnoreCase(modelo) == 0) {
                            if (preco == 0 && preco !=0) {
                                if (p[i].getPreco() == preco) {
                                    vetor[i].setCarroAlugado(m[i].getModelo());
                                    System.out.println("Veiculo alugado com sucesso!");
                                } else {
                                    System.out.println("Preco digitado errado!!");
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("Cliente não encontrado.");

        }
    }
    public void exibirCliente(){
        int i;
        for(i = 0; i < this.cont; i ++){
            System.out.println("CLIENTE " + (i+1));
            System.out.println(this.vetor[i]);
        }
    }

    //fazer depois 
    /*public boolean consultarPreco(Preco[] p, double preco) {
        boolean validar = false;
        for (int i = 0; i < p.length; i++) {
            if () {

            }
        }
        return validar;
    }
     */
    public boolean consultarCarro(Modelo[] m, String modelo) {
        boolean validar = false;
        int i;
        for (i = 0; i < m.length; i++) {
            if (m[i].getModelo().compareToIgnoreCase(modelo) == 0) {
                validar = true;
                break;
            }
        }return validar;
    }

    public void renovarCar(ClienteR c) {
        Scanner z = new Scanner(System.in);
        String cpf;
        System.out.println("Digite o nome do cliente: ");
        String nome = z.nextLine();
        System.out.println("Digite o cpf do cliente: ");
        do {
            cpf = z.nextLine();
        } while (ValidaCpfR.eCPF(cpf) == true);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getNome().compareToIgnoreCase(nome) == 0) {
                if (vetor[i].getCpf().compareTo(cpf) == 0) {
                    if (vetor[i].getRenovação() >= 3) {
                        System.out.println("O maximo de renovação foi atingida");
                    } else {
                        //System.out.println("A taxa de renovação e equivalente a 15% do valor do carro");
                        renovacao++;
                        vetor[i].setRenovacao(renovacao);
                        //fazer os 15% do valor do carro
                        System.out.println("O carro alugado foi: " + vetor[i].getCarroAlugado());
                        System.out.println("O carro foi renovado.");
                    }
                }

            }
        }
    }

    public boolean consultar(Modelo[] m) {

        for (Modelo m1 : m) {
            if (this.equals(m) == true) {
                System.out.println(this);
                return true;
            } else {
                System.out.println("NÃO EXISTE");
            }
        }
        return false;
    }

    public boolean depositar() {
        return true;
    }

    public void disconto(Modelo[] m, Preco[] p, Cupom cm, LocadoraR loc) {
        Scanner z = new Scanner(System.in);
        String carro, nome;
        System.out.println("Digite o nome do cliente: ");
        nome = z.nextLine();
        if (consultarNome(nome) == true) {
            System.out.println("Digite o cupom: ");
            String cupom = z.next();
            for (Modelo m1 : m) {
                if (cm.getCupom().equalsIgnoreCase(cupom) == true) {
                    loc.exibModPre(m, p);
                    System.out.println("Digite o modelo do carro: ");
                    carro = z.next();
                    loc.darDesc(m, p, carro);
                } else {
                    System.out.println("Cupom inválido! ");
                    break;
                }
            }
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    public void devolverVeiculo() {
        Scanner z = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        String nome = z.nextLine();
        if (consultarNome(nome) == true) {
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i].getNome().compareToIgnoreCase(nome) == 0) {
                    String carroAl = vetor[i].getCarroAlugado();
                    System.out.println("O carro alugado foi: " + carroAl);
                    vetor[i].setCarroAlugado(null);
                    System.out.println("O carro foi devolvido com sucesso!");
                    break;
                } else {
                    System.out.println("Cliente não identificado");
                    break;
                }
            }
        } else {
            System.out.println("Cliente não identificado.");

        }

    }

    public void darDesc(Modelo[] m, Preco[] p, String carro) {
        double precSDisc, precDis;
        int i = 0;
        do {

            if (m[i].getModelo().compareToIgnoreCase(carro) == 0) {
                System.out.println(" O Preço do carro sem desconto: " + p[i].getPreco());
                precSDisc = p[i].getPreco();
                precDis = precSDisc - (precSDisc * 0.10);
                System.out.println("O Preço do carro com disconto: " + precDis);
                i++;
                break;
            } else {
                System.out.println("Carro inválido");
                break;
            }
        } while (i < m.length);
    }
    
}
