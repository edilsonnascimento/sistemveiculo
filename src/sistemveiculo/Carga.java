package sistemveiculo;

public class Carga extends Veiculo implements Calcula {

	private int tara;
	private int cargaMax;

	public int getTara() {
		return tara;
	}

	public void setTara(int tara) {
		this.tara = tara;
	}

	public int getCargaMax() {
		return cargaMax;
	}

	public void setCargaMax(int cargaMax) {
		this.cargaMax = cargaMax;
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
