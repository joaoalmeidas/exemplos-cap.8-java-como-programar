
public class Hora2Teste {

	public static void main(String[] args) {
		
		Hora2 h1 = new Hora2();
		Hora2 h2 = new Hora2(2);
		Hora2 h3 = new Hora2(21, 34);
		Hora2 h4 = new Hora2(12, 35, 42);
		Hora2 h5 = new Hora2(h4);
		
		System.out.println("Construido com:");
		
		mostraHora("h1: Todos os argumentos default", h1);
		mostraHora("h2: Hora especificada, minuto e segundo default", h2);
		mostraHora("h3: Hora e minuto especificados, segindo default ", h3);
		mostraHora("h4: Hora, minuto e segundo especificados", h4);
		mostraHora("h5: Objeto Hora2 h4 especificado", h5);
		
		try {
			
			Hora2 h6 = new Hora2(27, 96, 89);
			
		}catch(IllegalArgumentException e) {
			
			System.out.printf("Exception na inicialização do h6: %s%n", e.getMessage());
			
		}
		

	}
	
	private static void mostraHora(String titulo, Hora2 h) {
		
		System.out.printf("%s%n   %s%n   %s%n", titulo, h.paraFormatoUniversalString(), h.toString());
		
	}

}
