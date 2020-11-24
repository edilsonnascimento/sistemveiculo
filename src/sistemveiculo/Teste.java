package sistemveiculo;

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
		BDVeiculos bdVeiculos = new BDVeiculos();
		
		mostraMenu();
		operarMenu(leitura, bdVeiculos, bdVeiculos.inicializaListaCarga(), bdVeiculos.inicializaListaPasseio());
	}

	public static void cadastraVeiculoPasseio(BDVeiculos bdVeiculos, Leitura leitura, List<Passeio> carrosPasseio) throws VeicExistExcepetion {
		boolean continuar = true;

		while (continuar) {
			placa = leitura.entDados("Entre com  a placa do Ve�culo");
			if (bdVeiculos.veiculoExisteListaPasseio(placa)) {
				throw new VeicExistExcepetion("Passeio");
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
				bdVeiculos.adicionaVeiculo(new Passeio(placa, marca, modelo, cor, qtdRodas, velocMax,
						qtdPistoes, potencia, qtdPassageiro));
				String resposta = leitura.entDados("Deseja continuar com a leitura de ve�culos? [S]im ou [N]�o?");
				continuar = resposta.equals("S");
			}
		}
	}

	public static void cadastrarVeiculoCarga(BDVeiculos bdVeiculo, Leitura leitura, List<Carga> carrosCarga) throws VeicExistExcepetion {
		boolean continuar = true;

		while (continuar) {
			placa = leitura.entDados("Entre com  a placa do Ve�culo");
			if (bdVeiculo.veiculoExisteListaCarga(placa)) {				
				throw new VeicExistExcepetion("Carga");
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
				bdVeiculo.adicionaVeiculo(new Carga(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes, potencia, tara, cargaMax));
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

	public static void operarMenu(Leitura leitura, BDVeiculos bdVeiculos, List<Carga> carrosCarga, List<Passeio> carrosPasseio) {
		
		while (naoSairDoSistema(opcao)) {

			opcao = (leitura.entDados(""));

			switch (opcao) {
			case "1":
				try {
					cadastraVeiculoPasseio(bdVeiculos, leitura, carrosPasseio);
				} catch (VeicExistExcepetion e) {
					System.out.println(e.getMessage());
				}
				break;

			case "2":
				try {
					cadastrarVeiculoCarga(bdVeiculos, leitura, carrosCarga);
				} catch (VeicExistExcepetion e) {
					System.out.println(e.getMessage());
				}
				break;

			case "3":
				bdVeiculos.mostrarTodosVeiculosPasseio();
				break;

			case "4":
				bdVeiculos.mostrarTodosVeiculosCarga();
				break;

			case "5":
				placa = leitura.entDados("Entre com a placa do ve�culo");
				bdVeiculos.mostraVeiculoPassioPlaca(placa);
				break;

			case "6":
				placa = leitura.entDados("Entre com a placa do ve�culo");
				bdVeiculos.mostraVeiculoCargaPlaca(placa);
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
