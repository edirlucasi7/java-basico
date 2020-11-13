import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{

	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		String s = "";
		s += "ContaPoupança[";
		s += " diaRendimento: " + diaRendimento + " [";
		s += super.toString();
		s += "]]";
		return s;
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento) {
		Calendar diaHoje = Calendar.getInstance();
		if(diaRendimento == diaHoje.get(Calendar.DAY_OF_MONTH)) {
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			System.out.println("Hoje é dia de rendimento");
			
			return true;
		}
		
		System.out.println("Hoje não é dia do rendimento");
		return false;
	}

}
