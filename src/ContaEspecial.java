
public class ContaEspecial extends ContaBancaria{
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public String toString() {
		String s = "";
		s += "ContaEspecial[";
		s += " Limite: " + limite + " [";
		s += super.toString();
		s += "]]";
		return s;
	}
	
	public boolean sacar(double valor) {
		if((this.getSaldo() + limite) >= valor) {
			this.setSaldo(this.getSaldo() - valor);
			
			return true;
			
		}
	
		return false;
		
	}
}
