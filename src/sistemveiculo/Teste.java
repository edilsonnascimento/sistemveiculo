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
			placa = leitura.entDados("Entre com  a placa do Ve�culo");
			if (util.veiculoExisteListaPasseio(placa, carrosPasseio)) {
				System.out.println("Ve�culo j� cadastrado...\n");
				break;
			} else {
				String marca = leitura.entDados("Entre com  a marca do Ve�culo");
				String modelo = leitura.entDados("Entre com  a modelo do Ve�culo");
				String cor = leitura.entDados("Entre com  a cor do Ve�culo");
				int qtdRodas = Integer.parseInt(leitura.entDados("Entre com  a quantidade Rodas do Ve�culo"));
				int velocMax = Integer.parseInt(leitura.entDados("Entre com  a Velocidade M�xima do Ve�culo"));
				int qtdPistoes = Integer.parseInt(leitura.entDados("Entre com  a quantidade Pist�es do Ve�culo"));
				int potencia = Integer.parseInt(leitura.entDados("Entre com  a potencia do Ve�culo"));
				int qtdPassageiro = Integer
						.parseInt(leitura.entDados("Entre com  a quantidade Passageiros do Ve�culo"));
				util.adicionaVeiculo(carrosPasseio, new Passeio(placa, marca, modelo, cor, qtdRodas, velocMax,
						qtdPistoes, potencia, qtdPassageiro));
				String resposta = leitura.entDados("Deseja continuar com a leitura de ve�culos? [S]im ou [N]�o?");
				continuar = resposta.equals("S");
			}
		}
	}

	public static void cadastrarVeiculoCarga(BDVeiculos util, Leitura leitura, List<Carga> carrosCarga) {
		boolean continuar = true;

		while (continuar) {
			placa = leitura.entDados("Entre com  a placa do Ve�culo");
			if (util.veiculoExisteListaCarga(placa, carrosCarga)) {
				System.out.println("Ve�culo j� cadastrado...\n");
				break;
			} else {
				String marca = leitura.entDados("Entre com  a marca do Ve�culo");
				String modelo = leitura.entDados("Entre com  a modelo do Ve�culo");
				String cor = leitura.entDados("Entre com  a cor do Ve�culo");
				int qtdRodas = Integer.parseInt(leitura.entDados("Entre com  a quantidade Rodas do Ve�culo"));
				int velocMax = Integer.parseInt(leitura.entDados("Entre com  a Velocidade M�xima do Ve�culo"));
				int qtdPistoes = Integer.parseInt(leitura.entDados("Entre com  a quantidade Pist�es do Ve�culo"));
				int potencia = Integer.parseInt(leitura.entDados("Entre com  a potencia do Ve�culo"));
				int tara = Integer.parseInt(leitura.entDados("Entre com a tara do Ve�culo:"));
				int cargaMax = Integer.parseInt(leitura.entDados("Entre com Carga M�xima do V�iculo: "));
				util.adicionaVeiculo(carrosCarga,
						new Carga(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes, potencia, tara, cargaMax));
				String resposta = leitura.entDados("Deseja continuar com a leitura de ve�culos? [S]im ou [N]�o?");
				continuar = resposta.equals("S");
			}
		}
	}
	
	public static void mostraMenu() {

		System.out.println("Sistema de Gest�o de Ve�culos - Menu Inicial\n");
		System.out.println("1) Cadastrar Ve�culo de Passeio");
		System.out.println("2) Cadastrar Ve�culo de Carga");
		System.out.println("3) Imprimir Todos os Ve�culos de Passeio");
		System.out.println("4) Imprimir Todos os Ve�culos de Carga");
		System.out.println("5) Imprimir Ve�culo de Passeio pela Placa ");
		System.out.println("6) Imprimir Ve�culo de Carga pela Placa");
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
				placa = leitura.entDados("Entre com a placa do ve�culo");
				util.mostraVeiculoPassioPlaca(placa, carrosPasseio);
				break;

			case "6":
				placa = leitura.entDados("Entre com a placa do ve�culo");
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
