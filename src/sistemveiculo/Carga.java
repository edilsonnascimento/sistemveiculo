package sistemveiculo;

import java.math.BigDecimal;
/**
 * @author Edilson do Nascmento
 *
 */
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
		return super.getQtdRodas() + super.getQtdRodas() + super.getVelocMax() + this.cargaMax + this.tara;
	}

	// Entrada Km/h saída Cm/h
	@Override
	public  final BigDecimal calcVel(double velocMax) {
		return new BigDecimal((velocMax * 1000) * 100);
	}

	@Override
	public String toString() {
		return "\n VEÍCULO DE CARGA: " +
				super.toString() +
			   "\n       * Detalhes: Máximo de Carga=" + this.getCargaMax() 
				+ ", Velocidade Máxima=" + this.calcVel(this.getVelocMax()) + " cm/h";
		
	}

}
