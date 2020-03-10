import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private Scanner ler = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Main app = new Main();
		app.Start();

	}
	
	private final String VALOR_INVALIDO = "VALOR_INVÁLIDO";
	
	private void Start() {
		
        List<String> lista = new ArrayList<String>();
		
		while(lista.size() < 5) {
			
			String valorRecebido = ObterDados();		
			
			if(valorRecebido.isEmpty() || valorRecebido.equals(VALOR_INVALIDO)) {	
				System.out.println("Este valor foi descartado.");
			}
			else {
				lista.add(valorRecebido);
			}	
		}
		
		System.out.println("------");
		
		lista.add("Item adicionado automaticamente 01");
		lista.add("Item adicionado automaticamente 02");
		
		lista.remove(1);
		lista.remove(1);
		
		for(String item: lista) {	
			System.out.println("Item recebido foi: " + item);
		}
		
		
		
	}
	
	private String ObterDados() {
		
		try {
			
			System.out.println("Digite um valor: ");		
			int valor = ler.nextInt();
			return String.valueOf(valor);
			
		} catch (Exception e) {
			ler.next();
			System.out.println("Um valor inválido foi digitado!");
			return VALOR_INVALIDO;
		}
		
	
	}

}
