package exercicio02;

public class CadastroConta {
    Conta[] contas;
    int numContas;

    public CadastroConta() {
        contas = new Conta[3];
        numContas = 0;
    }

    public void adicionarConta(String nome, double valor) {
        if (numContas < contas.length) {
            contas[numContas] = new Conta(nome, valor);
            numContas++;
            System.out.println("Conta adicionada com sucesso!");
        } else {
            System.out.println("Limite de contas atingido.");
        }
    }

    public void listarContas() {
        if (numContas == 0) {
            System.out.println("Nenhuma conta cadastrada!");
        } else {
            System.out.println("Contas cadastradas:");
            for (int i = 0; i < numContas; i++) {
                System.out.println("Nome: " + contas[i].getNome() + ", Valor: " + contas[i].getValor());
            }
        }
    }

    public void procurarConta(String nome) {
        boolean encontrada = false;
        for (int i = 0; i < numContas; i++) {
            if (contas[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println("Conta encontrada! \nNome: " + contas[i].getNome() + ", Valor: " + contas[i].getValor());
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("Conta não encontrada!");
        }
    }
}