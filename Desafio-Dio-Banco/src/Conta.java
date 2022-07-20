
public abstract class Conta implements IContas {
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	

	
	

	public Conta(){
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	

	@Override
	public void Sacar(double valor) {
		saldo -= valor;
	}
	
	@Override
	public void Depositar(double valor) {
		saldo += valor;
	}
	
	@Override
	public void Transferir(double valor, Conta contaDestino) {
		
		this.Sacar(valor);
		contaDestino.Depositar(valor);
	}
	

	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	protected void ExtratoComum() {
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}}
