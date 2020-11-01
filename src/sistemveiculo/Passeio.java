package sistemveiculo;

public class Passeio extends Veiculo implements Calcula {

	private int qtdPassageiro;

	
	public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, int qtdPistoes,
			int potencia, int qtdPassageiro) {
		super(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes, potencia);
		this.qtdPassageiro = qtdPassageiro;
	}

	public int getQtdPassageiro() {
		return qtdPassageiro;
	}

	public void setQtdPassageiro(int qtdPassageiro) {
		this.qtdPassageiro = qtdPassageiro;
	}

	@Override
	public int calcular() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calcVeiculo(double velocMax) {
		// TODO Auto-generated method stub
		return 0;
	}

}
	