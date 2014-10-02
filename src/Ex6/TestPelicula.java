package Ex6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TestPelicula {

	private static BufferedReader stdin=new BufferedReader (new InputStreamReader(System.in));
	static ArrayList <String[]> bbdd=new ArrayList<String[]>();
	
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
						bbdd.add(linea.split(";"));
					}
					fr.close();
					
				}catch(Exception e){
					System.out.println("Error en cargar la BBDD en el array");
				}
				break;
			case 2: //buscar pelicula por coincidencias ene el titulo
				if(bbdd.size()==0){
					System.out.println("No se ha seleccionado previamente ‘Carga datos inicio’");
				}else{
				String input="";
				boolean coiincidencia=false;
				try{
					System.out.print("Patron a buscar en el campo Titulo => ");
					input=stdin.readLine();
					for(int i=0; i<bbdd.size(); i++){
						if(bbdd.get(i)[0].contains(input)){
							System.out.println(bbdd.get(i)[0]+"\t"+bbdd.get(i)[1]+"\t"+bbdd.get(i)[2]+"\t"+bbdd.get(i)[3]+"\t"+bbdd.get(i)[4]);
							coiincidencia=true;
						}else{
							//no fa res
						}
					}
					if(coiincidencia==false){
						System.out.println("No se han encontrado coiincidencias");
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
				if(bbdd.size()==0){
					System.out.println("No se ha seleccionado previamente ‘Carga datos inicio’");
				}else{
					// ordenar array de mas votos a menos votos

					for(int j=0; j<bbdd.size(); j++){
						for(int i=0; i<(bbdd.size()-1); i++){
						
							if(Integer.parseInt(bbdd.get(i)[4])>Integer.parseInt(bbdd.get(i+1)[4])){

							}
							else{
								String aux0=bbdd.get(i)[0];
								String aux1=bbdd.get(i)[1];
								String aux2=bbdd.get(i)[2];
								String aux3=bbdd.get(i)[3];
								String aux4=bbdd.get(i)[4];
								bbdd.get(i)[0]=bbdd.get(i+1)[0];
								bbdd.get(i)[1]=bbdd.get(i+1)[1];
								bbdd.get(i)[2]=bbdd.get(i+1)[2];
								bbdd.get(i)[3]=bbdd.get(i+1)[3];
								bbdd.get(i)[4]=bbdd.get(i+1)[4];
								bbdd.get(i+1)[0]=aux0;
								bbdd.get(i+1)[1]=aux1;
								bbdd.get(i+1)[2]=aux2;
								bbdd.get(i+1)[3]=aux3;
								bbdd.get(i+1)[4]=aux4;
							}
							
						}
					}
					
					//
					System.out.println("Titulo\t\tNº Votos");
					for(int i=0; i<bbdd.size(); i++){
						System.out.println(bbdd.get(i)[0]+"\t\t"+bbdd.get(i)[4]);
					}
				}
				break;
			case 4://votar pelicula
				if(bbdd.size()==0){
					System.out.println("No se ha seleccionado previamente ‘Carga datos inicio’");
				}else{
					
					for(int i=0; i<bbdd.size(); i++){
						System.out.println(bbdd.get(i)[0]+"\t\t"+bbdd.get(i)[4]);
					}
					try{
						System.out.print("Introduce el Titulo a votar => ");
						String input=stdin.readLine();
						boolean coiincidencia=false;
						for(int i=0; i<bbdd.size(); i++){
							if(bbdd.get(i)[0].equalsIgnoreCase(input)){
								bbdd.get(i)[4]=((Integer.parseInt(bbdd.get(i)[4]))+1)+"";
								System.out.println("Se ha sumado tu voto, Gracias por votar.");
								System.out.println("El numero de votos ahora es de "+bbdd.get(i)[4]);
								coiincidencia=true;
							}
							else{
								//no fa res
							}
						}
						if(coiincidencia==false){
							System.out.println("No se han encontrado coiincidencias en el titulo.\nNo se ha incrementado el voto de ninguna pelicula");
						}else{
							//no fa res
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
