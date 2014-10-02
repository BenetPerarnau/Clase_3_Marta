package Ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Finanzas {
	
	private static DecimalFormat df=new DecimalFormat("0.00");
	private static double euro;
	private static double dolar;
	private static double cambio;
	
	public Finanzas(){
		this.cambio=1.36;
	}
	public Finanzas(double cambio){
		this.cambio=cambio;
	}
	public static void dolaresToEuros(){
	  final BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
		try{
			System.out.print("Intoduce el importe en dolares => ");
			dolar=Double.parseDouble(stdin.readLine());
			System.out.println("El valor de cambio es "+cambio+"€ => 1 $");
			System.out.println(dolar +"$ son "+df.format((dolar/cambio))+"€");
		}catch(Exception e){
			System.out.println("Valor fuera de rango");
			
		}finally{//se ejecuta si o si independientemente de si entra en el try y catch
		//	try {
			//	stdin.close();
				
			//} catch (IOException e1) {
				
				//e1.printStackTrace();
			//}
			
		}
	}
	public static void EurosToDolares(){
		final BufferedReader stdin2=new BufferedReader (new InputStreamReader(System.in));

		try{
			System.out.print("Intoduce el importe en euros => ");
			euro=Double.parseDouble(stdin2.readLine());
			System.out.println("El valor de cambio es "+cambio+"€ => 1 $");
			System.out.println(euro +"€ son "+df.format((euro*cambio))+"$");
		}catch(Exception e){
			System.out.println("Valor fuera de rango");
			
		}finally{//se ejecuta si o si independientemente de si entra en el try y catch
			try {
				stdin2.close();
			} catch (IOException e1) {
				
				e1.printStackTrace();
			}
			
		}
	}
	
}
