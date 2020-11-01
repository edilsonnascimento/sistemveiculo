package sistemveiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		int opcao = 0;
		Scanner in = new Scanner(System.in);
		VeiculoUtil util = new VeiculoUtil();
		List<Passeio> carrosPasseio = new ArrayList<Passeio>();
		List<Carga> carrosCarga = new ArrayList<Carga>();

		util.inicializaListaPasseio(carrosPasseio);
		
		while (opcao != 7) {

			System.out.println("Sistema de Gestão de Veículos - Menu Inicial");
			System.out.println("1) Cadastrar Veículo de Passeio");
			System.out.println("2) Cadastrar Veículo de Carga");
			System.out.println("3) Imprimir Todos os Veículos de Passeio");
			System.out.println("4) Imprimir Todos os Veículos de Carga");
			System.out.println("5) Imprimir Veículo de Passeio pela Placa ");
			System.out.println("6) Imprimir Veículo de Carga pela Placa");
			System.out.println("7) Sair do Sistema");
			opcao = in.nextInt();
			
			switch(opcao) {
				case 1: break;
				case 3: 
					util.mostrarTodosVeiculos(carrosPasseio);
					System.out.println("Escolha outra opção...\n");
					break;
				case 5: 
					System.out.println("Entre com a placa do veículo");
					String placa = in.next();
					util.mostraVeiculoPassioPlaca(placa, carrosPasseio);
					System.out.println("Escolha outra opção...\n");
					break;
				
			}
						
		}
		
		System.out.println("Programa Finalizado");
		in.close();

	}
}
