
public class EmpregadoTeste {

	public static void main(String[] args) {
		
		System.out.printf("Empregados antes das instancia��es: %d%n", Empregado.getContador());
		
		Empregado e1 = new Empregado("Jo�o", "Almeida");
		Empregado e2 = new Empregado("Maria", "Paula");
		
		System.out.printf("Empregados depois das instancia��es:%n");
		System.out.printf("via e1.getContador(): %d%n", e1.getContador());
		System.out.printf("via e2.getContador(): %d%n", e2.getContador());
		System.out.printf("via Empregado.getContador() %d%n", Empregado.getContador());
		
		System.out.printf("%nEmpregado 1: %s %s%nEmpregado 2: %s %s%n",
				e1.getPrimeiroNome(), e1.getSegundoNome(), e2.getPrimeiroNome(), e2.getSegundoNome());

	}

}
