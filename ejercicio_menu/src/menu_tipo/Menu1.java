package menu_tipo;

import java.util.*;

public class Menu1 {

	public static void main(String[] args) {
		int opc,n2,m,r;
		System.out.println("elije tu opcion");
		Scanner entrada = new Scanner (System.in) ;
		opc = entrada.nextInt() ;
	
		System.out.println("Menú");			
		System.out.println("1.Promedio");
		System.out.println("2.Baño");
		System.out.println("3.Baño o Ducha");
		System.out.println("4.Número en palabras");
		System.out.println("5.Contador y Promedio");
		System.out.println("6.Gana Juan");
		System.out.println("7.Repetición de nombres");
		System.out.println("8.Lista Talentos Digitales");
		System.out.println("9.Ingreso alumno");	
		System.out.println("Ingrese el número de la opción que requiere:");
	     
		switch (opc) {
		
		case 1: 
			int num1, num2, num3, suma, promedio ;
			 
			System.out.println ("Ingrese nota 1") ;
			num1 = entrada.nextInt() ;
			System.out.println ("Ingrese nota 2") ;
			num2 = entrada.nextInt() ;
			System.out.println ("Ingrese nota 3") ;
			num3 = entrada.nextInt() ;
			suma = (num1 + num2 + num3) ;
			promedio = (suma/3) ;
			if (promedio > 3) {
			System.out.println ("El estudiante aprovo con un promedio de: " +promedio ) ;
			}
			else {
			System.out.println ("El estudiante No aprovo, el promedio es de: " +promedio ) ;
			}
		break;
		
		case 2:
			//pregunta nombre
			System.out.println("¿Cuál es tu nombre?");
			//lee nombre
			String entradaNombre = "";
			//Scanner entradaEscanerNombre = new Scanner (System.in); //Creación de un objeto Scanner
			entradaNombre = entrada.next(); //Invocamos un método sobre un objeto Scanner
			System.out.println ("Tu nombre es: \"" + entradaNombre +"\"");
			
			System.out.println("Si eres hombre, escriba h, si eres mujer, escriba m");
			//lee género
				String entradaTeclado = "";
				//Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
				entradaTeclado = entrada.next (); //Invocamos un método sobre un objeto Scanner
				System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado +"\"");
					String ingresaMujer ="m";
					String ingresaHombre ="h";
		break;
		
		case 3:
			
				
					
					
			/*if (entradaTeclado.equals(ingresaMujer)) {
			System.out.println ("Diríjase al baño de mujeres");
			
				
			
			 	}else if(entradaTeclado.equals(ingresaHombre)){
			 		
			 		System.out.println ("Diríjase al baño de hombres");
			 		
			 	}
			
			System.out.println("Si va al baño, escriba b, si va a la ducha, escriba d");
				String entradaTeclado2 = "";
				try (Scanner entradaEscaner2 = new Scanner (System.in)) {
					entradaTeclado2 = entradaEscaner2.nextLine (); //Invocamos un método sobre un objeto Scanner
				}
				System.out.println ("Entrada recibida por teclado es: \"" + entradaTeclado2 +"\"");
					String ingresaBanio ="b";
					String ingresaDucha ="d";
				
				if (entradaTeclado2.equals(ingresaBanio)) {
					System.out.println ("El uso del baño cuesta $250");
					
					 	}else if(entradaTeclado2.equals(ingresaDucha)){
					 		
					 		System.out.println ("El uso de la ducha cuesta $2.500");
					 		
					 	}
			
			 	}*/
				
			

	
		break;
		
		case 4:
			
			System.out.println("elije tu numero");
			Scanner entrada1 = new Scanner (System.in) ;
			n2 = entrada1.nextInt() ;
			
			switch (n2) {
			case 1:
				System.out.println ("tu numero es el: uno") ;
			break;
			
			case 2:
				System.out.println ("tu numero es el: dos") ;
			break;
			
			case 3:
				System.out.println ("tu numero es el: tres") ;
			break;
			
			case 4:
				System.out.println (" tu numero es el: cuatro") ;
			break;
			
			case 5:
				System.out.println ("tu numero es el: cinco") ;
			break;
			
			case 6:
				System.out.println ("tu numero es el: seis") ;
			break;
			
			case 7:
				System.out.println ("tu numero es el: siete") ;
			break;
			
			case 8:
				System.out.println ("tu numero es el: ocho") ;
			break;
			
			case 9:
				System.out.println ("tu numero es el: nueve") ;
			break;
			
			case 10:
				System.out.println ("tu numero es el: diez") ;
			break;
		
		break;
		
		case 5:
		
		break;
		
		case 6:
		System.out.println("funcion6");
		break;
		
		case 7:
		System.out.println("funcion7");
		break;
		
		case 8:
		System.out.println("funcion8");
		break;
		
		case 9:
		System.out.println("funcion 9");
		break;
		
		case 10:
		System.out.println("usted ha salido del menu");
		break;
		
		
		
		}
		
		
		
		}
		

	


	}


