package menu_tipo;
import java.util.Scanner;

public class ejercicio2y3 {

		public static void main (String [ ] args) {
			
			
			//pregunta nombre
			System.out.println("�Cu�l es tu nombre?");
			//lee nombre
			String entradaNombre = "";
			Scanner entradaEscanerNombre = new Scanner (System.in); //Creaci�n de un objeto Scanner
			entradaNombre = entradaEscanerNombre.nextLine (); //Invocamos un m�todo sobre un objeto Scanner
			System.out.println ("Tu nombre es: \"" + entradaNombre +"\"");
			
			System.out.println("Si eres hombre, escriba h, si eres mujer, escriba m");
			//lee g�nero
				String entradaTeclado = "";
				Scanner entradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner
				entradaTeclado = entradaEscaner.nextLine (); //Invocamos un m�todo sobre un objeto Scanner
				System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
					String ingresaMujer ="m";
					String ingresaHombre ="h";
				
					
					
			if (entradaTeclado.equals(ingresaMujer)) {
			System.out.println ("Dir�jase al ba�o de mujeres");
			
				
			
			 	}else if(entradaTeclado.equals(ingresaHombre)){
			 		
			 		System.out.println ("Dir�jase al ba�o de hombres");
			 		
			 	}
			
			System.out.println("Si va al ba�o, escriba b, si va a la ducha, escriba d");
				String entradaTeclado2 = "";
				try (Scanner entradaEscaner2 = new Scanner (System.in)) {
					entradaTeclado2 = entradaEscaner2.nextLine (); //Invocamos un m�todo sobre un objeto Scanner
				}
				System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado2 +"\"");
					String ingresaBanio ="b";
					String ingresaDucha ="d";
				
				if (entradaTeclado2.equals(ingresaBanio)) {
					System.out.println ("El uso del ba�o cuesta $250");
					
					 	}else if(entradaTeclado2.equals(ingresaDucha)){
					 		
					 		System.out.println ("El uso de la ducha cuesta $2.500");
					 		
					 	}
			
			 	}
				
			

	}


