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
			placa = leitura.entDados("Entre com  a placa do Veículo");
			if (bdVeiculos.veiculoExisteListaPasseio(placa)) {
				throw new VeicExistExcepetion("Passeio");
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
					bdVeiculos.adicionaVeiculo(new Passeio(placa, marca, modelo, cor, qtdRodas, velocMax,
							qtdPistoes, potencia, qtdPassageiro));
				String resposta = leitura.entDados("Deseja continuar com a leitura de veículos? [S]im ou [N]ão?");
				continuar = resposta.equals("S");
			}
		}
	}

	public static void cadastrarVeiculoCarga(BDVeiculos bdVeiculo, Leitura leitura, List<Carga> carrosCarga) throws VeicExistExcepetion {
		boolean continuar = true;

		while (continuar) {
			placa = leitura.entDados("Entre com  a placa do Veículo");
			if (bdVeiculo.veiculoExisteListaCarga(placa)) {				
				throw new VeicExistExcepetion("Carga");
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
					bdVeiculo.adicionaVeiculo(new Carga(placa, marca, modelo, cor, qtdRodas, velocMax, qtdPistoes, potencia, tara, cargaMax));
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
		System.out.println("7) Excluir Veículo de Passeio pela Placa");
		System.out.println("8) Excluir Veículo de Carga pela Placa");
		System.out.println("9) Sair do Sistema");

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
					placa = leitura.entDados("Entre com a placa do veículo");
						bdVeiculos.mostraVeiculoPassioPlaca(placa);
						break;
	
				case "6":
					placa = leitura.entDados("Entre com a placa do veículo: ");
					bdVeiculos.mostraVeiculoCargaPlaca(placa);
					break;				
				
				case "7":
					placa = leitura.entDados("Entre com a placa do veículo para ser Excluído: ");
					bdVeiculos.excluirPasseioPlaca(placa);					
					break;
					
				case "8":
					placa = leitura.entDados("Entre com a placa do veículo para ser Excluído: ");
					bdVeiculos.excluirCargaPlaca(placa);					
					break;
				
			}//switch
			
			if (naoSairDoSistema(opcao)) {
				mostraMenu();
			}
		}//while

		System.out.println("SISTEMA FINALIZADO...");
		System.exit(0);

	}

	private static boolean naoSairDoSistema(String opcao) {
		return !opcao.equals("9");
	}


}// class
