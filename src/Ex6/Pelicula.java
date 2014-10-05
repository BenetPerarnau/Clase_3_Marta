package Ex6;

public class Pelicula {
	
	protected String titulo;
	protected String genero;
	protected String resumen;
	protected String director;
	protected int num_votos;
	
	public Pelicula(String titulo, String genero, String resumen, String director, int num_votos){
		
		this.titulo=titulo;
		this.genero=genero;
		this.resumen=resumen;
		this.director=director;
		this.num_votos=num_votos;
	}

}
