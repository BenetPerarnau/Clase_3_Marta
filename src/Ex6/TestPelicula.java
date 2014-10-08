package Ex6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class TestPelicula {

	private static BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
	static ArrayList <Pelicula> bbdd2=new ArrayList<Pelicula>();
	public static void main(String[] args) {
		
		byte op=0;
		boolean error=false;
		do{
			System.out.println("1. Cargar datos de inicio");
			System.out.println("2. Buscar película");
			System.out.println("3. Lista películas (ordenadas por no de votos). Los datos a mostrar serán título y no de votos.");
			System.out.println("4. Votar película");
			System.out.println("5. Salir");
			try{
				System.out.print("Operacion => ");
				op=Byte.parseByte(stdin.readLine());
				error=false;
			}catch(Exception e){
				System.out.println("Se espera un valor numerico");
				error=true;
			}
			switch (op){
			case 1: //cargar datos
				File archivo=null;
				FileReader fr=null;
				BufferedReader br=null;
				try{
					archivo=new File("src/Ex6/BBDD_Peliculas.txt");
					fr=new FileReader(archivo);
					br=new BufferedReader(fr);
					String linea="";
					
					while((linea=br.readLine())!=null){
						
						String[] pelicula=linea.split(";");
						bbdd2.add(new Pelicula(pelicula[0],pelicula[1],pelicula[2],pelicula[3],Integer.parseInt(pelicula[4])));
						
					}
					fr.close();
					
				}catch(Exception e){
					System.out.println("Error en cargar la BBDD en el array");
				}
				break;
			case 2: //buscar pelicula por coincidencias ene el titulo
				if(bbdd2.isEmpty()){
					System.out.println("No se ha seleccionado previamente ‘Carga datos inicio’");
				}else{
				String input="";
				boolean coiincidencia=false;
				try{
					System.out.print("Patron a buscar en el campo Titulo => ");
					input=stdin.readLine();
					for(int i=0; i<bbdd2.size(); i++){
						if(bbdd2.get(i).titulo.contains(input)){
							System.out.println("Titulo => "+bbdd2.get(i).titulo);
							System.out.println("Genero => "+bbdd2.get(i).genero);
							System.out.println("Director => "+bbdd2.get(i).director);
							System.out.println("Resumen => "+bbdd2.get(i).resumen);
							System.out.println("Numero de votos => "+bbdd2.get(i).num_votos);
							coiincidencia=true;
						}else{
							//no fa res
						}
					}
					if(coiincidencia==false){
						System.out.println("No se han encontrado coiincidencias en este patron ("+input+").");
					}
					else{
						//no fa res
					}
				}catch(Exception e){
					System.out.println("Valor fuera de rango");
				}
				}
				break;
			case 3://lista peliculas solo titulo i votos ordena por num votos
				
				if(bbdd2.isEmpty()){
					System.out.println("No se ha seleccionado previamente ‘Carga datos inicio’");
				}else{
					// ordenar array de mas votos a menos votos

					for(int j=0; j<bbdd2.size(); j++){
						for(int i=0; i<(bbdd2.size()-1); i++){
						
							if(bbdd2.get(i).num_votos>bbdd2.get(i+1).num_votos){

							}
							else{
								String aux0=bbdd2.get(i).titulo;
								String aux1=bbdd2.get(i).genero;
								String aux2=bbdd2.get(i).resumen;
								String aux3=bbdd2.get(i).director;
								String aux4=bbdd2.get(i).num_votos+"";
								bbdd2.get(i).titulo=bbdd2.get(i+1).titulo;
								bbdd2.get(i).genero=bbdd2.get(i+1).genero;
								bbdd2.get(i).resumen=bbdd2.get(i+1).resumen;
								bbdd2.get(i).director=bbdd2.get(i+1).director;
								bbdd2.get(i).num_votos=bbdd2.get(i+1).num_votos;
								bbdd2.get(i+1).titulo=aux0;
								bbdd2.get(i+1).genero=aux1;
								bbdd2.get(i+1).resumen=aux2;
								bbdd2.get(i+1).director=aux3;
								bbdd2.get(i+1).num_votos=Integer.parseInt(aux4);
							}
							
						}
					}
					
					//
					System.out.println("Titulo\t\tNº Votos");
					for(int i=0; i<bbdd2.size(); i++){
						System.out.println(bbdd2.get(i).titulo+"\t\t"+bbdd2.get(i).num_votos);
					}
				}
				break;
			case 4://votar pelicula
				
				if(bbdd2.isEmpty()){
					System.out.println("No se ha seleccionado previamente ‘Carga datos inicio’");
				}else{
					System.out.println("Titulo\t\tNº Votos");
					for(int i=0; i<bbdd2.size(); i++){
						System.out.println(bbdd2.get(i).titulo+"\t\t"+bbdd2.get(i).num_votos);
					}
					String input="";
					try{
						System.out.print("Introduce el Titulo a votar => ");
						input=stdin.readLine();
						boolean coiincidencia=false;
						for(int i=0; i<bbdd2.size(); i++){
							if(bbdd2.get(i).titulo.equalsIgnoreCase(input)){
								bbdd2.get(i).num_votos=bbdd2.get(i).num_votos+1;
								System.out.println("Se ha sumado tu voto, Gracias por votar.");
								System.out.println("El numero de votos ahora es de "+bbdd2.get(i).num_votos);
								coiincidencia=true;
							}
							else{
								//no fa res
							}
						}
						if(coiincidencia==false){
							System.out.println("No se han encontrado coiincidencias en el titulo.\nNo se ha incrementado el voto de ninguna pelicula");
						}else{ //actualizara la bbdd con el incremento del voto
							
							FileWriter fichero=null;
							PrintWriter pw=null;
							try{
							fichero=new FileWriter("src/Ex6/BBDD_Peliculas.txt");
							pw=new PrintWriter(fichero);
							for(int i=0; i<bbdd2.size(); i++){
								pw.println(bbdd2.get(i).titulo+";"+bbdd2.get(i).genero+";"+bbdd2.get(i).resumen+";"+bbdd2.get(i).director+";"+bbdd2.get(i).num_votos+";");
							}
							pw.close();
							}catch(Exception f){
								System.out.println("Error en sobreescribir la BBDD de peliculas.");
							}
						}
					}catch(Exception e){
						System.out.println("Valor fuera de rango");
					}
				}
				
				break;
			case 5:
				System.out.println("Dew.");
				break;
				default:
					if(error==false){
						System.out.println("El numero introducido no contempla ninguna operación.");
					}
					else{
						// no hace nada pq el catch ya ha mostrado que el valor tiene que ser numerico
					}
					break;
			}
		}while(op!=5);

	}

}
