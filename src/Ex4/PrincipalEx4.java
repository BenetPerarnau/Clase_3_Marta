package Ex4;
/*
 * Ejercicio M03-UF4.2 -04.
		Crea una clase Finanzas que convierta dólares a euros y viceversa. 
		Codifica los métodos de instancia dolaresToEuros y eurosToDolares.
		Prueba que la clase Finanzas funciona correctamente haciendo conversiones entre euros y dólares.
		Como requisitos la clase Finanzas tiene que tener:
			 Un constructor sin parámetros Finanzas(), que establecerá el cambio Dólar-Euro en 1.36
			 Un constructor Finanzas (double cambio), que permitirá configurar el cambio dólar- euro
 */
public class PrincipalEx4 {

	public static void main(String[] args) {
		
		Finanzas a=new Finanzas();
		a.dolaresToEuros();
		a.EurosToDolares();
		Finanzas b=new Finanzas(1.99);
		b.dolaresToEuros();
		b.EurosToDolares();

	}

}
