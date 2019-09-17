 
public class Tecnico extends Pessoa{
	private String especialidade;

	public Tecnico(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
}
