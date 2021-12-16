package POO;

/*
 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
	esta classe, em seguida crie um objeto avi�o, defina as instancias deste
	objeto e apresente as informa��es deste objeto no console.
 */

public class Aviao {
	
	private String nomeAviao;
	private double numeroAviao;
	private String tipoAviao;
	private float numPassageiro;
	private float velocidade;
	private double peso;
	private double valor;

	public Aviao(String nomeAviao,double numeroAviao,String tipoAviao,float numPassageiro,float velocidade,double peso, double valor) {
		this.nomeAviao = nomeAviao;
		this.numeroAviao = numeroAviao;
		this.tipoAviao = tipoAviao;
		this.numPassageiro = numPassageiro;
		this.velocidade = velocidade;
		this.peso = peso;
		this.valor = valor;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nO avi�o � o "+nomeAviao+" com o n�mero "+numeroAviao+" e o seu tipo � "+tipoAviao+
				" que comporta "+numPassageiro+" passageiros. Sua velocidade pode chegar a "+velocidade+
				" e com peso de "+peso+" kilos e o seu valor � de "+valor+" milh�es de reais.");
	}

	public String getNomeAviao() {
		return nomeAviao;
	}

	public void setNomeAviao(String nomeAviao) {
		this.nomeAviao = nomeAviao;
	}

	public double getNumeroAviao() {
		return numeroAviao;
	}

	public void setNumeroAviao(double numeroAviao) {
		this.numeroAviao = numeroAviao;
	}

	public String getTipoAviao() {
		return tipoAviao;
	}

	public void setTipoAviao(String tipoAviao) {
		this.tipoAviao = tipoAviao;
	}

	public float getNumPassageiro() {
		return numPassageiro;
	}

	public void setNumPassageiro(float numPassageiro) {
		this.numPassageiro = numPassageiro;
	}

	public float getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}