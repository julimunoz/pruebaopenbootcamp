package condicionales;

public class condcase {
	
	String estacion = "rojo";
	
	public void verificadorEstacion () {
		
		
		System.out.println("ejemplo condicional case");
		
		switch (estacion){
			
			case "verano": {
				
				 System.out.println("la estacion es: " + estacion);

	                break;
			}
			case "invierno": {
				
				 System.out.println("la estacion es: " + estacion);

	                break;
			}
			case "otoño": {
				
				 System.out.println("la estacion es: " + estacion);

	                break;
			}
			case "primavera": {
				
				 System.out.println("la estacion es: " + estacion);

	                break;
			}
			
			default: {
				
				System.out.println("no se ha ingresado un nombre de estacion");
			}
				
		}
		
	}

}
