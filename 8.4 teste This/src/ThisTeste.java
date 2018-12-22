
public class ThisTeste {

	public static void main(String[] args) {
		
		HoraSimples hora = new HoraSimples(15, 30, 19);
		System.out.println(hora.constroeString());
	}

}

class HoraSimples{
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public HoraSimples(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public String constroeString() {
		
		return String.format("%24s: %s%n%24s: %s", "this.paraUniversalString()", this.paraUniversalString(), "paraUniversalString()", paraUniversalString());
		
	}
	
	public String paraUniversalString() {
		
		return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
		
	}
	
	
	
	
	
}
