
public class Empregado {
	
	private static int contador = 0;
	private String primeiroNome;
	private String segundoNome;
	
	
	public Empregado(String primeiroNome, String segundoNome) {
		super();
		this.primeiroNome = primeiroNome;
		this.segundoNome = segundoNome;
		
		++contador;
		
		System.out.printf("Construtor Empregado: %s %s; contador %d%n", primeiroNome, segundoNome, contador);
	}


	public static int getContador() {
		return contador;
	}


	public static void setContador(int contador) {
		Empregado.contador = contador;
	}


	public String getPrimeiroNome() {
		return primeiroNome;
	}


	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}


	public String getSegundoNome() {
		return segundoNome;
	}


	public void setSegundoNome(String segundoNome) {
		this.segundoNome = segundoNome;
	}
	
	
}
