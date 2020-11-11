package sistemveiculo;

import java.math.BigDecimal;
/**
 * @author Edilson do Nascmento
 *
 */
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
		return (super.getCor()+super.getMarca()+super.getModelo()+super.getPlaca()).length();
	}
	
	@Override
	public BigDecimal calcVel(double velocMax) {
		return new BigDecimal(velocMax * 1000);
	}

	@Override
	public String toString() {
		return "\nVEÍCULO DE PASSEIO:" +
				super.toString() +
			   "\n       * Detalhes: Quantidade de Passageiros=" + this.getQtdPassageiro() + ", " + 
				                     "Velocidade Máxima=" + this.calcVel(this.getVelocMax()) + " m/h";
		
	}


}
	