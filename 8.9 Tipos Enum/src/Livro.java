
public enum Livro {
	
	JHTP("Java Como Programar", "2015"),
	CHTP("C Como Programar", "2013"),
	IW3HTP("Internet e World Wide Web Como Programar",  "2012"),
	CPPTHP("C++ Como Programar", "2014"),
	VBHTP("Visual Como Programar", "2014"),
	CSHARPHTP("Visual C# Como Programar","2014");
	
	private final String titulo;
	private final String anoPublicacao;
	
	
	private Livro(String titulo, String anoPublicacao) {
		this.titulo = titulo;
		this.anoPublicacao = anoPublicacao;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getAnoPublicacao() {
		return anoPublicacao;
	}
	
}
