
public class Tempo1 {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public void defineHora(int hora, int minuto, int segundo) {
		
		if(hora < 0 || hora >= 24 || minuto < 0 || minuto >=60 || segundo < 0 || segundo >= 60) {
			
			throw new IllegalArgumentException("hora, minuto ou segundo fora dos limites.");
			
		}
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		
	}
	
	public String paraFormatoUniversalString() {
		
		return String.format("%02d:%02d:%02d", hora, minuto, segundo);
		
	}
	
	public String toString() {
		
		return String.format("%d:%02d:%02d %s", ((hora == 0 || hora == 12) ? 12 : hora % 12), minuto, segundo, (hora < 12 ? "AM" : "PM"));
		
	}
	
}
