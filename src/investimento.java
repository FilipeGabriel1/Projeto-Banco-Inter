public class investimento {

    private int idinvestimento;
	private double valorinvestimento;
	public String tipodeinvestimento; //renda fixa poupança
	public double  rentabilidade;
	public String datadeaplicacao;
	public String dataderesgate;
	
	public investimento(){
		
	}
	
	public investimento(int idinvestimento , double valorinvestimento, String tipodeinvestimento, double rentabilidade, String datadeaplicacao, String dataderesgate){
		this.idinvestimento = idinvestimento;
		this.valorinvestimento = valorinvestimento;
		this.tipodeinvestimento = tipodeinvestimento;
		this.rentabilidade = rentabilidade;
		this.datadeaplicacao = datadeaplicacao;
		this.dataderesgate = dataderesgate;
	}


	
	public int geidinvestimento() {
		return idinvestimento;
	}
	public void setidinvestimentos(int idinvestimento) {
		this.idinvestimento = idinvestimento;
	}
	
	public double  getvalorinvestimento() {
		return valorinvestimento;
	}
	public void setvalorinvestimento(double valorinvestimento) {
		this.valorinvestimento = valorinvestimento;
	}
	
	public String gettipodeinvestimento() {
		return tipodeinvestimento;
	}
	public void settipodeinvestimento(String tipodeinvestimento) {
		this.tipodeinvestimento = tipodeinvestimento;
	}
	
	public double getrentabilidade() {
		return rentabilidade;
	}
	public void setrentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	public String getdatadeaplicacao() {
		return datadeaplicacao;
	}
	public void setdatadeaplicacao(String datadeaplicacao) {
		this.datadeaplicacao = datadeaplicacao;
	}
	
	public String getdataderesgate() {
		return dataderesgate;
	}
	public void setdataderesgatre(String dataderesgate) {
		this.dataderesgate = dataderesgate;
	}
}


