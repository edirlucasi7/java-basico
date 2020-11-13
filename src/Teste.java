
public class Teste {

	public static void main(String[] args) {
		
		ContaEspecial conta = new ContaEspecial();
		
		conta.setNumCliente("Edir Lucas");
		conta.setNumConta("12345");
		conta.setSaldo(100);
		conta.setLimite(50);
//		conta.setDiaRendimento(12);
		
//		System.out.println(conta);
		
//		conta.depostiar(20);
		
//		System.out.println(conta);
		
//		realizarSaque(conta, 110);
		
//		conta.calcularNovoSaldo(0.5);
		
		verificarSaldoContaEspecial(conta, 140);
		
		verificarSaldoContaEspecial(conta, 10);
		
		System.out.println(conta);
		
		verificarSaldoContaEspecial(conta, 20);
		
		System.out.println(conta);

	}
	
	public static void realizarSaque(ContaBancaria conta, double valor) {
		if(conta.sacar(valor)) {
			System.out.println("Saque realizado com sucesso. Saldo: " + conta.getSaldo());
		} else {
			System.out.println("Não foi possível realizar o saque. Saldo: " + conta.getSaldo());
		}
	}
	
	public static void verificarSaldoContaEspecial(ContaEspecial conta, double valor) {
		if(conta.sacar(valor)) { 
			System.out.println("O seu novo saldo é: " + conta.getSaldo());
		} else {
			System.out.println("Não foi possível realizar a transação. O seu saldo é: " + conta.getSaldo());
		}
	}

}
