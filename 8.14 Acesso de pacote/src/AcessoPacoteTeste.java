
public class AcessoPacoteTeste {

	public static void main(String[] args) {
		
		PacoteDeDados pacote = new PacoteDeDados();
		
		System.out.printf("Depois da instanciação: %n%s%n", pacote);
		
		pacote.numero = 1903;
		pacote.string = "Grêmio";
		
		System.out.printf("Depois das mudanças dos valores: %n%s%n", pacote);

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
