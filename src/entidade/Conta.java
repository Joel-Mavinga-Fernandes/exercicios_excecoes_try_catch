package entidade;

public class Conta {
	
	private int numero;
	private String proprietario;
	private double saldo;
	private double limiteSaque;
	
	public Conta() {
		
	}
	
	public Conta(int numero, String proprietario, double saldo, double limiteSaque) {
		this.numero = numero;
		this.proprietario = proprietario;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getProprietario() {
		return proprietario;
	}
	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getLimiteSaque() {
		return limiteSaque;
	}
	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void deposito(double valor) {
		saldo+=valor;
	}
	
	public void saque(double valor) {
	if(valor>limiteSaque) {
		throw new excecoes.Excecoes("O valor excede o limite de saque"); 
	}
	
	if(valor>saldo){
		throw new excecoes.Excecoes("O seu saldo não é suficiente para efetuar esse levantamento"); 
	}
	saldo-=valor;
	}
	
	public String toString() {
		return "Novo saldo: "
				+ saldo;
	}
}

	