package ProjetoFinal;

public class Video implements AcoesVideo {
	private String titulo;
	private float avalicacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avalicacao = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzindo = false;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public float getAvalicacao() {
		return avalicacao;
	}
	public void setAvalicacao(float avaliacao) {
		int nova;
		nova = (int) ((this.avalicacao + avaliacao)/this.views);
		this.avalicacao = nova;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	public boolean isReproduzindo() {
		return reproduzindo;
	}
	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	@Override
	public void play() {
		this.reproduzindo = true;
		
	}
	@Override
	public void pause() {
		this.reproduzindo = false;
		
	}
	@Override
	public void like() {
		this.curtidas++;
		
	}
	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avalicacao=" + avalicacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}
	
	
	
}
