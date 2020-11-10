package sistemveiculo;

public abstract class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private String cor;
	private int qtdRodas;
	private int velocMax;
	private Motor motor;

	public Veiculo(String placa, String marca, String modelo, String cor, int qtdRodas, int velocMax, int qtdPistoes,
			int potencia) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.qtdRodas = qtdRodas;
		this.velocMax = velocMax;
		this.motor = new Motor(qtdPistoes, potencia);
	}

	public String getPlaca() {
		return placa;
	}

	public final void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public final void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public final void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public final void setCor(String cor) {
		this.cor = cor;
	}

	public int getQtdRodas() {
		return qtdRodas;
	}

	public final void setQtdRodas(int qtdRodas) {
		this.qtdRodas = qtdRodas;
	}

	public int getVelocMax() {
		return velocMax;
	}

	public final void setVelocMax(int velocMax) {
		this.velocMax = velocMax;
	}

	public Motor getMotor() {
		return motor;
	}

	public final void setMotor(Motor motor) {
		this.motor = motor;
	}

	public abstract double calcVeiculo(double velocMax);

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", cor=" + cor + ", qtdRodas="
				+ qtdRodas + ", velocMax=" + velocMax + ", motor=" + motor + "]";
	}

}
