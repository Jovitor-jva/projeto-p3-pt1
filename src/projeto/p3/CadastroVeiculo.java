
package projeto.p3;

public class CadastroVeiculo {
  private Carro[] vetor2;
  private int cont;

  public CadastroVeiculo(Carro[] vetor) {
    vetor = new Carro[100000];
    this.cont = 0;
  }

  CadastroVeiculo() {
    throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose Tools
    // | Templates.
  }

  /*private boolean cadastrarNovoVeiculo(String modelo) {
    for (Carro veiculos : vetor2) {
      if (veiculos != null && (veiculos.getModelo() == null ? modelo == null : veiculos.getModelo().equals(modelo))) {
        return false;
      }
    }
    vetor2[cont] = new Carro(Modelo);
    cont++;
    return true;
  }
*/
  public void exibir() {
    for (Carro veiculos : vetor2) {
      System.out.println(veiculos + " ");
    }
    System.out.println();
  }
}
    
