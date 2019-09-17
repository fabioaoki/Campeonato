

public class Jogador extends Pessoa{
	private String jogador;

	public Jogador(String nome, String jogador, String nascimento) {
		this.nome = nome;
		this.jogador = jogador;
		this.dataNascimento = nascimento;
	}

	public String getJogador() {
		return jogador;
	}

	public void setJogador(String jogador) {
		this.jogador = jogador;
	}
}
