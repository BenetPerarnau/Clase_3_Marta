package Ex1;

public class Mud {
	//(fuerza, destreza, sabiduría, profesión, nivel de lucha...)
	private static String name;
	private static int fuerza;
	private static int destreza;
	private static int sabiduria;
	private static String profesion;
	private static int nivel_lucha;
	
	public Mud(){
		this.name="";
		this.fuerza=0;
		this.destreza=0;
		this.sabiduria=0;
		this.profesion="";
		this.nivel_lucha=0;
	}
	public Mud(String name, int fuerza, int destreza, int sabiduria, String profesion, int nivel_lucha){
		this.name=name;
		this.fuerza=fuerza;
		this.destreza=destreza;
		this.sabiduria=sabiduria;
		this.profesion=profesion;
		this.nivel_lucha=nivel_lucha;
	}
	
	public static void get_info(){
		System.out.println("Info del MUD:");
		System.out.println("Nombre => "+name);
		System.out.println("Profesión => "+profesion);
		System.out.println("Nivel de Lucha => "+nivel_lucha);
		System.out.println("Fuerza => "+fuerza);
		System.out.println("Destreza => "+destreza);
		System.out.println("Sabiduria => "+sabiduria);
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Mud.name = name;
	}
	public static int getFuerza() {
		return fuerza;
	}
	public static void setFuerza(int fuerza) {
		Mud.fuerza = fuerza;
	}
	public static int getDestreza() {
		return destreza;
	}
	public static void setDestreza(int destreza) {
		Mud.destreza = destreza;
	}
	public static int getSabiduria() {
		return sabiduria;
	}
	public static void setSabiduria(int sabiduria) {
		Mud.sabiduria = sabiduria;
	}
	public static String getProfesion() {
		return profesion;
	}
	public static void setProfesion(String profesion) {
		Mud.profesion = profesion;
	}
	public static int getNivel_lucha() {
		return nivel_lucha;
	}
	public static void setNivel_lucha(int nivel_lucha) {
		Mud.nivel_lucha = nivel_lucha;
	}
	

}
