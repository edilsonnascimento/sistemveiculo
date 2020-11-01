package sistemveiculo;

import java.util.List;

public class VeiculoUtil {

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
	
	public void mostrarTodosVeiculos(List<Passeio> lista) {
		lista.stream().forEach(System.out::println);
	}

	public void mostraVeiculoPassioPlaca(String placa, List<Passeio> carrosPasseio) {
		carrosPasseio.stream()
				.filter(veiculo -> veiculo.getPlaca().equals(placa))
				.forEach(System.out::println);
	}

}
