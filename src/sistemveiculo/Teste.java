package sistemveiculo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Edilson do Nascmento
 *
 */
public class Teste {

	private static String opcao = "";
	private static String placa = "";

	public static void main(String[] args) {

		Leitura leitura = new Leitura();
		List<Passeio> carrosPasseio = new ArrayList<Passeio>();
		List<Carga> carrosCarga = new ArrayList<Carga>();
		BDVeiculos bdVeiculos = new BDVeiculos(carrosPasseio, carrosCarga);
		
		mostraMenu();
		operarMenu(leitura, bdVeiculos, carrosCarga, carrosPasseio);
	}

	public static void cadastraVeiculoPasseio(BDVeiculos util, Leitura leitura, List<Passeio> carrosPasseio) {
		boolean continuar = true;

		while (continuar) {
			placa = leitura.entDados("Entre com  a placa do Veículo");
			if (util.veiculoExisteListaPasseio(placa, carrosPasseio)) {
				System.out.println("Veículo já cadastrado...\n");
				break;
			} else {
				String marca = leitura.entDados("Entre com  a marca do Veículo");
				String modelo = leitura.entDados("Entre com  a modelo do Veículo");
				String cor = leitura.entDados("Entre com  a cor do Veículo");
				int qtdRodas = Integer.parseInt(leitura.entDados("Entre com  a quantidade Rodas do Veículo"));
				int velocMax = Integer.parseInt(leitura.entDados("Entre com  a Velocidade Máxima do Veículo"));
				int qtdPistoes = Integer.parseInt(leitura.entDados("Entre com  a quantidade Pistões do Veículo"));
				int potencia = Integer.parseInt(leitura.entDados("Entre com  a potencia do Veículo"));
				int qtdPassageiro = Integer
						.parseInt(leitura.entDados("Entre com  a quantidade Passageiros do Veículo"));
				util.adicionaVeiculo(carrosPasseio, new Passeio(placa, marca, modelo, cor, qtdRodas, velocMax,
						qtdPistoes, potencia, qtdPassageiro));
				String resposta = leitura.entDados("Deseja continuar com a leitura de veículos? [S]im ou [N]ão?");
				continuar = resposta.equals("S");
			}
		}
	}

	public static void cadastrarVeiculoCarga(BDVeiculos util, Leitura leitura, List<Carga> carrosCarga) {
		boolean continuar = true;

		while (continuar) {
			placa = leitura.entDados("Entre com  a placa do Veículo");
			if (util.veiculoExisteListaCarga(placa, carrosCarga)) {
				System.out.println("Veículo já cadastrado...\n");
				break;
			} else {
				String marca = leitura.entDados("Entre com  a marca do Veículo");
				String modelo = leitura.entDados("Entre com  a modelo do Veículo");
				String cor = leitura.entDados("Entre com  a cor do Veículo");
				int qtdRodas = Integer.parseInt(leitura.entDados("Entre com  a quantidade Rodas do Veículo"));
				int velocMax = Integer.parseInt(leitura.entDados("Entre com  a Velocidade Máxima do Veículo"));
				int qtdPistoes = Integer.parseInt(leitura.entDados("Entre com  a quantidade Pistões do Veículo"));
				int potencia = Integer.parseInt(leitura.entDados("Entre com  a potencia do Veículo"));
				int tara = Integer.parseInt(leitura.entDados("Entre com a tara do Veículo:"));
				int cargaMax = Integer.parseInt(leitura.entDados("Entre com Carga Máxima do Véiculo: "));
				util.adicionaVeiculo(carrosCarga,
						new Carga(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes, potencia, tara, cargaMax));
				String resposta = leitura.entDados("Deseja continuar com a leitura de veículos? [S]im ou [N]ão?");
				continuar = resposta.equals("S");
			}
		}
	}
	
	public static void mostraMenu() {

		System.out.println("Sistema de Gestão de Veículos - Menu Inicial\n");
		System.out.println("1) Cadastrar Veículo de Passeio");
		System.out.println("2) Cadastrar Veículo de Carga");
		System.out.println("3) Imprimir Todos os Veículos de Passeio");
		System.out.println("4) Imprimir Todos os Veículos de Carga");
		System.out.println("5) Imprimir Veículo de Passeio pela Placa ");
		System.out.println("6) Imprimir Veículo de Carga pela Placa");
		System.out.println("7) Sair do Sistema");

	}

	public static void operarMenu(Leitura leitura, BDVeiculos util, List<Carga> carrosCarga, List<Passeio> carrosPasseio) {
		while (naoSairDoSistema(opcao)) {

			opcao = (leitura.entDados(""));

			switch (opcao) {
			case "1":
				cadastraVeiculoPasseio(util, leitura, carrosPasseio);
				break;

			case "2":
				cadastrarVeiculoCarga(util, leitura, carrosCarga);
				break;

			case "3":
				util.mostrarTodosVeiculosPasseio(carrosPasseio);
				break;

			case "4":
				util.mostrarTodosVeiculosCarga(carrosCarga);
				break;

			case "5":
				placa = leitura.entDados("Entre com a placa do veículo");
				util.mostraVeiculoPassioPlaca(placa, carrosPasseio);
				break;

			case "6":
				placa = leitura.entDados("Entre com a placa do veículo");
				util.mostraVeiculoCargaPlaca(placa, carrosCarga);
				break;
			}

			if (naoSairDoSistema(opcao)) {
				mostraMenu();
			}
		}

		System.out.println("SISTEMA FINALIZADO...");
		System.exit(0);

	}

	private static boolean naoSairDoSistema(String opcao) {
		return !opcao.equals("7");
	}


}// class
