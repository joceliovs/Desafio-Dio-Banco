
public interface IContas {

		void Depositar(double valor);

		void Sacar(double valor);

		void Transferir(double valor, Conta contaDestino);
		

		void imprimirExtrato();
}