package Ex1;

public class PrincipalEx1 {
/*
 * 	Ejercicio M03-UF4.2 -01 (ENTREGABLE).
		El objetivo de esta actividad es aprender a hacer el proceso completo de diseño de una aplicación 
		mediante la orientación a objetos.
		Los MUD (Multi User Dungeon) son juegos en línea, tradicionalmente con una interfaz de usuario en texto. 
		El jugador lleva un personaje que se mueve por diferentes localizaciones, donde tiene que superar ciertas 
		dificultades y luchar contra monstruos. Tanto el personaje del jugador como los enemigos tienen un conjunto 
		de propiedades (fuerza, destreza, sabiduría, profesión, nivel de lucha...) que establece su capacidad para
		tener éxito cuando emprenden cualquier acción.
		Aplicar las fases de diseño para crear un MUD. Si es necesario, para realizar esta tarea busca información 
		sobre qué es un MUD, y así poder entender cuál es el problema concreto a resolver.
		Para cada clase, define los atributos y métodos que consideres necesarios.
 */

	public static void main(String[] args) {
		
		Mud a=new Mud("Benet",10,10,10,"Programador",10);
		a.get_info();
		a.setProfesion("Encofrador");
		a.get_info();
		System.out.println("La fuerza actual del mud es => "+a.getFuerza());
		a.setFuerza(30);
		System.out.println("La fuerza actual del mud es => "+a.getFuerza());
	}

}
