package br.com.caelum.contas.main;
import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.javafx.api.main.SistemaBancario;

public class TestaContas {

	public static void main(String[] args) {
		
		//TelaDeContas.main(args);
		SistemaBancario.mostraTela(true);
	

		//Conta c1 = new Conta("Carlos", 12345678, "1234-5");
		//Conta c1 = new Conta("Carlos", 12345678, "1234-5", "15/10/2020");

		 ContaCorrente c1 = new ContaCorrente();
		 c1.setTitular("Carlos");
		 c1.setNumero(12345678);
		 c1.setAgencia("1234-5");
		 c1.setSaldo(10000.00);
		// c1.dataDeAbertura = "15/10/2020";

		System.out.println("===== Conta =====");
		System.out.println("Nome do titular: " + c1.getTitular());
		System.out.println("Numero da conta: " + c1.getNumero());
		System.out.println("Agencia: " + c1.getAgencia());
		//System.out.println("Data de abertura: " + c1.getDataDeAbertura());
		System.out.println("Quantidade de contas abertas: " + Conta.quantidadeDeContas);

		System.out.println("saldo 1: " + c1.getSaldo());
		System.out.println("Rendimento mensal: " + c1.calculaRendimento());

		System.out.println("Deposito de 500");
		c1.deposita(500.00);
		System.out.println("saldo 2: " + c1.getSaldo());

		System.out.println("Saque de 1000");
		c1.saca(1000.00);
		System.out.println("saldo 3: " + c1.getSaldo());

		System.out.println("===== Pulando linha =====\n");

		//Conta c2 = new Conta("Maria", 87654321, "5432-1");
		//Conta c2 = new Conta("Maria", 87654321, "5432-1", "14/10/2020");
		//c2.deposita(15000.00);

		// Conta c2 = new Conta();
		// c2.nomeDoTitular = "Maria";
		// c2.numero = 87654321;
		// c2.agencia = "5432-1";
		// c2.saldo = 15000.00;
		// c2.dataDeAbertura = "14/10/2020";

		//System.out.println(c2.recuperaDadosParaImpressao());
		//System.out.println("Quantidade de contas abertas: " + Conta.quantidadeDeContas);

	}

}
