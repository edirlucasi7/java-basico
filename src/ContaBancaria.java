
public class ContaBancaria {

	private String numCliente;
	private String numConta;
	private double saldo;
	
	public String getNumCLiente() {
		return numCliente;
	}
	public void setNumCliente(String numCliente) {
		this.numCliente = numCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "ContaBancaria [numCliente=" + numCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	public boolean sacar(double valor) {
		if((saldo - valor) >= 0) {
			saldo -= valor;
			
			return true;
			
		}
	
		return false;
		
	}
	
	public void depostiar(double valor) {
		saldo += valor;
	}
	
	
}
