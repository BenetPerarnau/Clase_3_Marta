package Ex3;
/*
 * Ejercicio M03-UF4.2 -03.
	El objetivo de este ejercicio es crear una clase Java (Shirt.java) y usarla desde otra clase (ShirtTest.java).
	Crea la clase Shirt en el paquete com.example.domain, que cumpla con el siguiente modelo:
	
	Class Shirt
		Attributes
			int shirtID
			String description
			char colorCode, 'U'=Unset,'R'=Red,'G'=Green,'B'=Blue 
			double price
			int quantityInStock
		Operations
			public void displayInformation()
	
	Desarrolla la clase ShirtTest que muestre la información de una camiseta (shirt) por consola.
	La camiseta tendrá las siguientes características:
	
	shirtID: 2987 
	description: whatever 
	colorCode: U
	price: 20.0 
	quantityInStock: 10
	
	Usa NetBeans debugger situando un breakpoint en la línea de código de la clase ShirtTest donde creas el
	objeto Shirt. Comprueba el valor de las variables y utiliza los controles Step over (F8), Step into (F7).

 */
	public class Shirt {
	
		private static int shirtID;
		private static String description;
		private static char colorCode;
		private static double price;
		private static int quantityInStock;
	
	public Shirt(int shirtID, String description, char colorCode, double price, int quantityInStock){
		this.shirtID=shirtID;
		this.description=description;
		this.price=price;
		this.quantityInStock=quantityInStock;
		
		if(colorCode=='U' ||colorCode=='R'||colorCode=='G'||colorCode=='B'){
			this.colorCode=colorCode;
		}else{
			this.colorCode='R'; //si el color no es ni U R G B el color por defecto sera R
		}
	}
	public void displayInformation(){
		System.out.println("shirtID: "+shirtID);
		System.out.println("Description : "+shirtID);
		System.out.println("colorCode: "+colorCode);
		System.out.println("price: "+price);
		System.out.println("quantityInStock: "+quantityInStock);
	}
}
