package prueba;
import condicionales.*;

public class main {
	
			
		public static void main(String [] args)
	    {
			
			int suma = calcular_suma(2,5,8);

	        
			System.out.println("el valor de la suma es: " + suma);
			 	
			coche coche1 = new coche();
			
			System.out.println("el numero de puertas del coche es: " + coche1.incrementarpuertas());
			
			condicional_if condicional = new condicional_if();
			
			condicional.condicional();
			
			condwhile condicionalwhile = new condwhile();
			
			condicionalwhile.buclewhile();
			
			conddowhile condicionaldowhile = new conddowhile();
			
			condicionaldowhile.bucledowhile();
			
			condicionalfor condfor = new condicionalfor();
			
			condfor.condicional_for();
			
			condcase condcase = new condcase();
			
			condcase.verificadorEstacion();
	        
	    }
		
		
		
		public static int calcular_suma(int numero1, int numero2, int numero3)
	    {
	        int total = numero1 + numero2 + numero3;
	        return total;
	    }
		
		
		
	}

