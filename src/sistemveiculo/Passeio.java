package sistemveiculo;

public  final class Passeio extends Veiculo implements Calcula {

	private int qtdPassageiro;

	
	public Passeio(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, int qtdPistoes,
			int potencia, int qtdPassageiro) {
		super(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes, potencia);
		this.qtdPassageiro = qtdPassageiro;
	}

	public final int getQtdPassageiro() {
		return qtdPassageiro;
	}

	public  final void setQtdPassageiro(int qtdPassageiro) {
		this.qtdPassageiro = qtdPassageiro;
	}

	@Override
	public  final int calcular() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public  final double calcVeiculo(double velocMax) {
		// TODO Auto-generated method stub
		return 0;
	}

}
	