
public class Tempo1Teste {

	public static void main(String[] args) {
		
		Tempo1 tempo = new Tempo1();
		
		mostraHora("Depois do objeto ser criado.", tempo);
		System.out.println();
		
		tempo.defineHora(13, 27, 6);
		mostraHora("Depois de chamar o método defineHora", tempo);
		System.out.println();
		
		try {
			
			tempo.defineHora(99, 99, 99);
			
		}catch(IllegalArgumentException e) {
			
			System.out.printf("Exception : %s%n%n", e.getMessage());
			
		}
		
		mostraHora("Depois da última chamada do defineHora, mas com valores inválidos", tempo);

	}
	
	private static void mostraHora(String titulo, Tempo1 t) {
		
		System.out.printf("%s%nFormato universal da hora: %s%nFormato AMPM da hora:%s%n", titulo, t.paraFormatoUniversalString(), t.toString());
		
	}

}
