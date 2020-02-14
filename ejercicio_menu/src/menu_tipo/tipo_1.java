package menu_tipo;

import java.util.Scanner ;
public class tipo_1 {
@SuppressWarnings("resource")
public static void main (String[]args) {
int num1, num2, num3, suma, promedio ;
Scanner entrada = new Scanner (System.in) ;
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
		
		

	}

}
