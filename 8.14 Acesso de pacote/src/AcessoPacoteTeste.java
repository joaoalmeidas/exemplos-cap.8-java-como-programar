
public class AcessoPacoteTeste {

	public static void main(String[] args) {
		
		PacoteDeDados pacote = new PacoteDeDados();
		
		System.out.printf("Depois da instancia��o: %n%s%n", pacote);
		
		pacote.numero = 1903;
		pacote.string = "Gr�mio";
		
		System.out.printf("Depois das mudan�as dos valores: %n%s%n", pacote);

	}

}

class PacoteDeDados{
	
	int numero;
	String string;
	
	
	public PacoteDeDados() {
		super();
		this.numero = numero;
		this.string = string;
	}
	
	public String toString() {
		
		return String.format("numero: %d; string : %s", numero, string);
		
	}
	
	
}
