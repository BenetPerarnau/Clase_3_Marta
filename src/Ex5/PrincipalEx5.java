package Ex5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class PrincipalEx5 {
	private static BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
	public static void main(String[] args) {
		double x=0,y=0;
		boolean entra=false;
		do{
		try{
			System.out.print("Valor x => ");
			x=Double.parseDouble(stdin.readLine());
			System.out.print("Valor y => ");
			y=Double.parseDouble(stdin.readLine());
			entra=false;
		}catch(Exception e){
			System.out.println("Valor fuera de rango");
			entra=true;
		}finally{
			try {
				stdin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		}while(entra==true);
		
		DecimalFormat df=new DecimalFormat("0.00");
	
		//metodos de clase
			
		System.out.println("Suma de "+x+" + "+y+" = "+df.format(Calculadora.sumarXconY(x, y)));
		System.out.println("Resta de "+x+" - "+y+" = "+df.format(Calculadora.restaXconY(x, y)));
		System.out.println("Multiplicación de "+x+" * "+y+" = "+df.format(Calculadora.multiplicarXconY(x, y)));
		System.out.println("División de "+x+" / "+y+" = "+df.format(Calculadora.dividirXconY(x, y)));
		
		//metodos de instancia
		
		Calculadora a=new Calculadora(x,y);
		System.out.println("Suma de "+x+" + "+y+" = "+df.format(Calculadora.suma()));
		System.out.println("Resta de "+x+" - "+y+" = "+df.format(Calculadora.resta()));
		System.out.println("Multiplicación de "+x+" * "+y+" = "+df.format(Calculadora.multiplica()));
		System.out.println("División de "+x+" / "+y+" = "+df.format(Calculadora.divide()));
	}

}
