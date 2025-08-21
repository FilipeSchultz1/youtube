package ProjetoFinal;

public class Gafanhoto extends Pessoa {
	private boolean login;
	private int totAssistido;
	private String nome;
	private int idade;
	
	
	
	public Gafanhoto(String nome, int idade, String sexo, boolean login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
		this.nome = nome;
		this.idade = idade;
		
	}

	public void viuMaisUm() {
		
	}

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido++;
	}

	@Override
	public String toString() {
		return "Gafanhoto [login=" + login + ", totAssistido=" + totAssistido + ", nome=" + nome + ", idade=" + idade
				+ "]";
	}

	
	
	
	

}
