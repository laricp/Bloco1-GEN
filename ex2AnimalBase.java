package POO_2;

public class ex2AnimalBase {
	
	private String nome;
	private String som;
	private int idade;
	
	public ex2AnimalBase(String nome, int idade) {
		
		this.nome=nome;
		this.idade=idade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}