package sistemveiculo;

public  final class Carga extends Veiculo implements Calcula {

	private int tara;
	private int cargaMax;

	
	public Carga(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, int qtdPistoes,
			int potencia, int tara, int cargaMax) {
		super(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes, potencia);
		this.tara = tara;
		this.cargaMax = cargaMax;
	}

	public  final int getTara() {
		return tara;
	}

	public  final void setTara(int tara) {
		this.tara = tara;
	}

	public  final int getCargaMax() {
		return cargaMax;
	}

	public  final void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
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
