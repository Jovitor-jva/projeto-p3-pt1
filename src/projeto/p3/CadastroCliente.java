
package projeto.p3;
import projeto.p3.Cliente;
class CadastroCliente {
  private final Cliente[] vetor;
  private int cont;
  private int idade;
  private String cnh;
  private String cpf;

  public CadastroCliente() {
    vetor = new Cliente[200];
    cont = 0;
    }
    public boolean cadastrarNovoCliente(String cpf) {
        for(Cliente umCliente:vetor){
            if(umCliente!=null&&umCliente.getCpf()==cpf){
                return false;
                //System.out.println("CADASTRADO!! ");
            }
        }
        vetor[cont] = new Cliente(cpf);
        cont++;
        return true;
    }
    private int buscarBinaria(String nomeProc){ //função privada que será chamada pelo método de remoção
      int inicio = 0, fim = this.cont - 1, meio;
      int pos = -1;
      do{
        meio = (inicio + fim)/2;
        if(nomeProc.equalsIgnoreCase(this.vetor[meio].getNome()) == true){
          pos = meio;
          break;
        }else if(nomeProc.compareToIgnoreCase(this.vetor[meio].getNome()) < 0){
          fim = meio -1;
        }else{
          inicio = meio + 1;
        }
      }while(inicio <= fim);
      return pos;
    }
    public void remover(String nome) {
      int i, pos;
      if(this.cont == 0){
        System.out.println("Cadastro de clientes vázio");
      }else{
        pos = this.buscarBinaria(nome);
        if(pos == -1){
          System.out.println("Cliente não encontrado");
        }
        else{
          for(i = pos; i < this.cont - 1; i++){
            this.vetor[i] = this.vetor[i+1];
            this.vetor[i] = null;
            System.out.println("CLIENTE REMOVIDO DO CADASTRO");
          }
        }
      }
    }
    public void setIdade(int idade) {
      while(idade < 21){
        this.idade = idade;
      }
    }
    public void setCnh(String cnh){
        this.cnh = cnh;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}