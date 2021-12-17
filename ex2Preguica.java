package POO_2;

public class ex2Preguica extends ex2AnimalBase{
	
	private boolean subirArvore;
	
	public ex2Preguica(String nome, int idade, boolean subirArvore) {
		
		super(nome, idade);
		this.subirArvore=subirArvore;
		
	}

	public boolean isSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(boolean subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	public void imprimirMovimento() {
		if(isSubirArvore()==true) {
			System.out.println("Gosta de escalar �rvores!");
		}
	}
	
	public void imprimirInfo() {
		System.out.println("\n---Dados da Pregui�a---\nNome: "+getNome()+"\nIdade: "+getIdade());
	}
	
	public String getSom() {
		return ("Som: "+super.getSom());
	}
	
}
