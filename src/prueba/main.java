package prueba;


public class main {
	
			
		public static void main(String [] args)
	    {
			
			int suma = calcular_suma(2,5,8);

	        
			System.out.println("el valor de la suma es: " + suma);
			 	
			coche coche1 = new coche();
			
			System.out.println("el numero de puertas del coche es: " + coche1.incrementarpuertas());
	        
	    }
		
		
		
		public static int calcular_suma(int numero1, int numero2, int numero3)
	    {
	        int total = numero1 + numero2 + numero3;
	        return total;
	    }
		
		
		
	}

