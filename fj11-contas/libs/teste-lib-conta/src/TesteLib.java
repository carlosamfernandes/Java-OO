import br.com.caelum.regras.Conta;

public class TesteLib {

	public static void main(String[] args) {
		
		Conta conta = new Conta("Teste", 88888, "999-99", "19/10/2020");
		
		conta.deposita(500.00);
		conta.saca(50.00);
		
		
		System.out.println(conta.recuperaDadosParaImpressao());
		
	}

}
