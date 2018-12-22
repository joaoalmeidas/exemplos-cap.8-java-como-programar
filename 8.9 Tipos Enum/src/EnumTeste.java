import java.util.EnumSet;

public class EnumTeste {

	public static void main(String[] args) {
		
		System.out.println("Todos os Livros:");
		
		for(Livro livro : Livro.values()) {
			System.out.printf("%-10s%-45s%s%n", livro, livro.getTitulo(), livro.getAnoPublicacao());
		}
		
		System.out.printf("%nExibe uma parte das constantes enum:%n");
		
		for(Livro livro: EnumSet.range(Livro.JHTP, Livro.CPPTHP)) {
			System.out.printf("%-10s%-45s%s%n", livro, livro.getTitulo(), livro.getAnoPublicacao());
		}
	}

}
