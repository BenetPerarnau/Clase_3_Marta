package Ex5;
/*
 * Ejercicio M03-UF4.2 -05.
	Crea una clase Calculadora, con los siguientes requisitos:
		 Dos atributos primitivos de tipo double (x, y)
		 Un constructor que recibirá como parámetros dos valores double y que establecerá los valores de x e y.
		 Como métodos de clase:
			
			sumarXconY(double x, double y): método que realiza la operación de suma de los parámetros recibidos, 
			devolviendo el resultado.
			restarXconY (double x, double y): realiza la operación de resta de los parámetros recibidos,
			devolviendo el resultado.
			multiplicarXconY(double x, double y): método que realiza la operación de multiplicación de los parámetros
			recibidos, devolviendo el resultado.
			dividirXconY (double x, double y): método que realiza la operación de división de los parámetros recibidos,
			devolviendo el resultado.
			
		 Como métodos de instancia
			
			suma (): método que realiza la operación de suma utilizando los atributos de la clase,
			devolviendo el resultado.
			resta (): realiza la operación de resta utilizando los atributos de la clase, devolviendo el resultado.
			multiplica(): método que realiza la operación de multiplicación utilizando los atributos de la
			clase, devolviendo el resultado.
			divide (): método que realiza la operación de división utilizando los atributos de la clase,
			devolviendo el resultado.
			
Prueba que la clase Calculadora funciona correctamente haciendo operaciones tanto con métodos de clase 
como con métodos de instancia.
 */
public class Calculadora {

	private static double x;
	private static double y;
	
	public Calculadora(double x, double y){
		this.x=x;
		this.y=y;
	}
	public static double sumarXconY(double x, double y){
		return x+y;
	}
	public static double restaXconY(double x, double y){
		return x-y;
	}
	public static double multiplicarXconY(double x, double y){
		return x*y;
	}
	public static double dividirXconY(double x, double y){
		return x/y;
	}
	public static double suma(){
		return x+y;
	}
	public static double resta(){
		return x-y;
	}
	public static double multiplica(){
		return x*y;
	}
	public static double divide(){
		return x/y;
	}
}
