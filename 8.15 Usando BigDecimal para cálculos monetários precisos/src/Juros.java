import java.math.BigDecimal;
import java.text.NumberFormat;

public class Juros {

	public static void main(String[] args) {
		
		BigDecimal principal = BigDecimal.valueOf(1000.0);
		BigDecimal taxa = BigDecimal.valueOf(0.05);
		
		System.out.printf("%4s%20s%n", "Ano", "Valor na Conta");
		
		for(int ano = 1; ano <= 10; ano++) {
			
			BigDecimal quantia = principal.multiply(taxa.add(BigDecimal.ONE).pow(ano));
			
			System.out.printf("%4d%20s%n", ano, NumberFormat.getCurrencyInstance().format(quantia));
			
		}

	}

}
