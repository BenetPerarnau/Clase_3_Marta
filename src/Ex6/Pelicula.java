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

	protected String getTitulo() {
		return titulo;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	protected String getGenero() {
		return genero;
	}

	protected void setGenero(String genero) {
		this.genero = genero;
	}

	protected String getResumen() {
		return resumen;
	}

	protected void setResumen(String resumen) {
		this.resumen = resumen;
	}

	protected String getDirector() {
		return director;
	}

	protected void setDirector(String director) {
		this.director = director;
	}

	protected int getNum_votos() {
		return num_votos;
	}

	protected void setNum_votos(int num_votos) {
		this.num_votos = num_votos;
	}
	
}
