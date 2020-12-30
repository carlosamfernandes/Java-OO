package br.com.caelum.contas.modelo;

/**
 * 
 * @author Carlos Fernandes
 * @version 1.0
 *
 */

//12.11 ate o 3
public abstract class Conta {

	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;
	//private String dataDeAbertura;

	public static int quantidadeDeContas;
	

	//public Conta(String nomeDoTitular, int numero, String agencia, String dataDeAbertura) {
	//public Conta(String titular, int numero, String agencia) {
	public Conta() {
//		this.titular = titular;
//		this.numero = numero;
//		this.agencia = agencia;
		//this.dataDeAbertura = dataDeAbertura;

		quantidadeDeContas++;
	}
	

	// void setSaldo(String nomeDoTitular) {
	// this.nomeDoTitular = nomeDoTitular;
	// }

//	public String getDataDeAbertura() {
//		return this.dataDeAbertura;
//	}

	public abstract String getTipo();
		
	
	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void deposita(double valor) {
		if (valor < 0) {
		throw new IllegalArgumentException("Você tentou depositar um valor negativo");
		} else {
		this.saldo += valor;
		}
	}


	public double calculaRendimento() {
		double rendimento = this.saldo * 0.1;
		return rendimento;
	}

	public String recuperaDadosParaImpressao() {

		String dados = "Titular: " + this.titular;
		dados += "\nNumero: " + this.numero;
		dados += "\nAgencia: " + this.agencia;
		//dados += "\nData de abertura: " + this.dataDeAbertura;
		dados += "\nSaldo atual: " + this.saldo;
		dados += "\nRendimento mensal atual: " + this.calculaRendimento();

		return dados;
	}
	
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
		}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getAgencia() {
		return agencia;
	}


	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
