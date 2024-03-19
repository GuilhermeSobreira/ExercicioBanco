package exercicio02;

public class CadastrarConta {
	
	Conta [] cont = new Conta[3];
	int numContas = 0;
	
	public void cadastrarConta (String nome, double valor){
		cont[numContas] = new Conta(nome, valor);
		numContas++;
		}
	
	public void listarConta () {
		if (numContas == 0) {
            System.out.println("Nenhuma conta cadastrada!");
		}else {
            System.out.println("Conta cadastrada!");
            for (int i = 0; i < numContas; i++){
                System.out.println("Nome: " + cont[i].getNome() + ", Valor: " + cont[i].getValor());
            }
		}
	}

		public void procurarConta (String nome) {
			boolean procura = false;
	        for (int i = 0; i < numContas; i++) {
	        	if(cont[i].getNome().equalsIgnoreCase(nome)) {
	                System.out.println("Conta encontrada! \nNome: " + cont[i].getNome() + ", Valor: " + cont[i].getValor());
	                procura = true;
	                break;
	        	}
	        }
	        if (!procura) {
	            System.out.println("Conta não encontrada!");
	        }
		}
	}