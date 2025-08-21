package ProjetoFinal;

public class Visualizacao {
	private Gafanhoto espectador;
	private Video filme;
	
	
	
	
	
	public Visualizacao(Gafanhoto espectador, Video filme) {
		super();
		this.espectador = espectador;
		this.filme = filme;
		this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1 );
		this.filme.setViews(this.filme.getViews() + 1 );
		
	}

	public void avaliar() {
		this.filme.setAvalicacao(5);
	}
	
	public void avaliar (int nota) {
		this.filme.setAvalicacao(nota);
	}
	
	public void avaliar (float porcentagem) {
		int tot = 0;
		if (porcentagem <= 20) {
			tot = 3;
		}else if (porcentagem <= 50) {
			tot = 5;
		}else if (porcentagem <= 90) {
			tot = 8;
		} else {
			tot = 10;
		}
		this.filme.setAvalicacao(tot);
	}

	public Gafanhoto getEspectador() {
		return espectador;
	}

	public void setEspectador(Gafanhoto espectador) {
		this.espectador = espectador;
	}

	public Video getFilme() {
		return filme;
	}

	public void setFilme(Video filme) {
		this.filme = filme;
	}

	@Override
	public String toString() {
		return "Visualizacao [espectador="  + espectador + ", filme=" + filme + "]";
	}
	
	
	
}
