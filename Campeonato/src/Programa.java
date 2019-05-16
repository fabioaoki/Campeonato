
public class Programa {

	public static void main(String[] args) {

		Jogador j1 = new Jogador("fabio aoki","goleiro","11/09/1993");
	
		Jogador j2 = new Jogador("bruno aoki", "atacante", "11/08/1990");
		
		Jogador j3 = new Jogador("thiago", "zagueiro", "21/02/1987");
		
		Jogador j4 = new Jogador("gilberto", "atacante", "08/06/1963");
		
		Jogador j5 = new Jogador("gemea", "zagueiro", "05/08/1961");
		
		
		Jogador j6 = new Jogador("lais macedo","goleiro","19/05/1991");
		
		Jogador j7 = new Jogador("raul fuzita", "atacante", "24/06/1993");
		
		Jogador j8 = new Jogador("erica fuzita", "zagueiro", "15/10/1995");
		
		Jogador j9 = new Jogador("renan fuzita", "atacante", "01/16/1987");
		
		Jogador j0 = new Jogador("eder fuzita", "zagueiro", "15/02/1990");
		
		Jogador[] jogadoresCasa = escalacaoTimeDaCasa(j1, j2, j3, j4, j5);
		
		Jogador[] jogadoresVisitante = escalacaoTimeVIsitante(j6, j7, j8, j9, j0);
		
//		escalacao(jogadoresVisitante);
//		
//		escalacao(jogadoresCasa);
	
		Equipe eq1 = new Equipe();
		eq1.setNome("osasco");
		
		Equipe eq2 = new Equipe();
		eq2.setNome("barueri");
		
		Partida partida = new Partida();
		
		partida.setData("21/05/2019");
		partida.setEstadio("Mineirao");
		
		jogo(eq1, eq2, partida);

		Tecnico tecnico1 = new Tecnico("contra ataque");
		tecnico1.setNome("felipao");
		
		timeDaCasa(eq1, tecnico1, tecnico1, j1, j1, j1);
		
	}


	private static void escalacao(Jogador[] jogadoresCasa) {
		for (Jogador jogadorCasa : jogadoresCasa) {
			System.out.println("---------------------------------");
			System.out.println(jogadorCasa.getNome());
			System.out.println(jogadorCasa.getJogador());
			System.out.println(jogadorCasa.getDataNascimento());
			break;
		}
	}


	public static Jogador[] escalacaoTimeDaCasa(Jogador j1, Jogador j2, Jogador j3, Jogador j4, Jogador j5) {
		Jogador jogadoresDaCasa [] = new Jogador[10];
		jogadoresDaCasa[0] = j1;
		jogadoresDaCasa[1] = j2;
		jogadoresDaCasa[2] = j3;
		jogadoresDaCasa[3] = j4;
		jogadoresDaCasa[4] = j5;
		return jogadoresDaCasa;
	}
	
	private static Jogador[] escalacaoTimeVIsitante(Jogador j6,
			Jogador j7, Jogador j8, Jogador j9, Jogador j0) {
		Jogador jogadoresVisitante [] = new Jogador[5];
		jogadoresVisitante[0] = j6;
		jogadoresVisitante[1] = j7;
		jogadoresVisitante[2] = j8;
		jogadoresVisitante[3] = j9;
		jogadoresVisitante[4] = j0;
		return jogadoresVisitante;
	}


	public static void timeDaCasa(Equipe nomeTime, Tecnico nomeTecnico, Tecnico especialidade,
				Jogador nomeJogadoDestaque, Jogador posicao, Jogador dataNascimento) {
		System.out.println("*******************************");
		System.out.println("nome do time: " + nomeTime.getNome());
		System.out.println("tecnico: " + nomeTecnico.getNome());
		System.out.println("tecnico: " + especialidade.getEspecialidade());
		System.out.println("destaque do time: " + nomeJogadoDestaque.getNome());
		System.out.println("posicao: " + posicao.getJogador());
		System.out.println("nascimento: " + dataNascimento.getDataNascimento());
		System.out.println("escalacao: " + nomeJogadoDestaque.getNome());
		System.out.println("*******************************");
	}
	

	private static void jogo(Equipe eq1, Equipe eq2, Partida partida) {
		System.out.println("-------------------------------");
		System.out.println("partida: " + eq1.getNome() + " x " + eq2.getNome());
		System.out.println("estadio: " + partida.getEstadio());
		System.out.println("data: " + partida.getData());
		System.out.println("-------------------------------");
	}
	
}

//		for (int i = 0; i < jogadores.length; i++) {
//			System.out.println(jogadores[i]);
//			System.out.println(jogadores[i].getNome());
//			System.out.println(jogadores[i].getJogador());
//			System.out.println(jogadores[i].getDataNascimento());	
//		}