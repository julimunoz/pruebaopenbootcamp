package condicionales;

public class condicional_if {
	
	int numeroif = 0;
	
	public void condicional ( ) {
		
		if(numeroif > 0) {
			
			System.out.println("el numeroIf es positivo");
		}else if(numeroif < 0) {
			
			System.out.println("el numeroIf es negativo");
		} else {
			
			System.out.println("el numeroIf es cero");
			
		}
	}
		
	
}

