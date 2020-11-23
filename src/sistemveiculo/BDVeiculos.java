package sistemveiculo;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * @author Edilson do Nascmento
 *
 */
public class BDVeiculos {
	
	public BDVeiculos(List<Passeio> listaPasseio, List<Carga> listaCarga) {
		inicializaListaCarga(listaCarga);
		inicializaListaPasseio(listaPasseio);
	}

	public void inicializaListaPasseio(List<Passeio> lista) {
		Passeio camaro      = new Passeio("AXU456", "Chevrolet", "ZT", "preta",    4, 350, 8, 800, 5);
		Passeio corsa       = new Passeio("TOI056", "Chevrolet", "GH", "vermelho", 4, 110, 4, 110, 5);
		Passeio opala       = new Passeio("LOH086", "Chevrolet", "LK", "bordo",    4, 245, 8, 110, 5);
		Passeio mustang     = new Passeio("LTLW90", "Ford",      "TW", "verde",    4, 860, 8, 110, 5);
		Passeio golf        = new Passeio("VBG768", "Volkswagen","PL", "fuxia",    4, 300, 4, 110, 5);
		
	    lista.add(camaro);
	    lista.add(corsa);
	    lista.add(opala);
	    lista.add(mustang);
	    lista.add(golf);
	}
	
	public void inicializaListaCarga(List<Carga> lista) {
		Carga volvoFH540       = new Carga("ABSSE", "Volvo",     "FH540",       "azul",     12, 350, 8, 800, 1500, 16000);
		Carga scaniaR450       = new Carga("HGI056", "Scania",   "R450",        "vermelho", 16, 110, 4, 110, 1500, 16000);
		Carga mercedes         = new Carga("RSH086", "Mercedes", "Actros 2651", "bordo",    14, 245, 8, 110, 1500, 16000);
		Carga dafXf            = new Carga("MNLW90", "Daf",      "XF 105 510",  "preta",    12, 320, 8, 110, 1500, 16000);
		Carga teslaTSLA        = new Carga("WSG768", "tesla",    "Semi",        "chumbo",   12, 300, 4, 110, 1500, 16000);
		
	    lista.add(volvoFH540);
	    lista.add(scaniaR450);
	    lista.add(mercedes);
	    lista.add(dafXf);
	    lista.add(teslaTSLA);
	}

	public void mostrarTodosVeiculosPasseio(List<Passeio> lista) {
		lista.stream().forEach(System.out::println);
	}
	
	public void mostrarTodosVeiculosCarga(List<Carga> lista) {
		lista.stream().forEach(System.out::println);
	}

	public void mostraVeiculoPassioPlaca(String placa, List<Passeio> carrosPasseio) {
		
		try {
			Optional<Passeio> carro = carrosPasseio.stream()
					.filter(veiculo -> veiculo.getPlaca().equals(placa))
					.findFirst();
			System.out.println(carro.get().toString() + ";\n       * Cálculo:  " + carro.get().calcular() + ".\n");			
		} catch (NoSuchElementException n) {
			System.out.println("Veículo não encontrado");
		}
	}

	public void mostraVeiculoCargaPlaca(String placa, List<Carga> carrosCarga) {
		try {
			Optional<Carga> carro = carrosCarga.stream()
					.filter(veiculo -> veiculo.getPlaca().equals(placa))
					.findFirst();
			System.out.println(carro.get().toString() + ";\n       * Cálculo:  " + carro.get().calcular() + ".\n");			
		} catch (NoSuchElementException n) {
			System.out.println("Veículo não encontrado");
		}
	}

	public boolean veiculoExisteListaPasseio(String placa, List<Passeio> carrosPasseio) {		
		return carrosPasseio.stream()		
		                    .anyMatch(listaCarros -> listaCarros.getPlaca().equals(placa));		
	}

	public boolean veiculoExisteListaCarga(String placa, List<Carga> carrosCarga) {		
		return carrosCarga.stream()		
		                    .anyMatch(listaCarros -> listaCarros.getPlaca().equals(placa));		
	}
	public void adicionaVeiculo(List<Passeio> carrosPasseio, Passeio passeio) {
		carrosPasseio.add(passeio);		
	}
	
	public void adicionaVeiculo(List<Carga> carrosCarga, Carga carga) {
		carrosCarga.add(carga);		
	}

	

}
