package ProjetoFinal;

public class ProjetoFinal {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("java");
		v[1] = new Video("python");
		v[2] = new Video ("ia");		
			
		
		Gafanhoto g[] = new Gafanhoto[3];
		g[0] = new Gafanhoto("pedro", 22, "m", true);
		g[1] = new Gafanhoto("joao", 22, "m", true);
		
		
		Visualizacao vis[] = new Visualizacao [3];
		vis[0] = new Visualizacao(g[0], v[0] );
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao (g[0], v[1]);
		vis[0].avaliar(87f);
		System.out.println(vis[1].toString());
		
		
		
		
		
		
		
		
		
		

	}

}

