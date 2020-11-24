package sistemveiculo;
/**
 * @author Edilson do Nascmento 
 */

public class VeicExistExcepetion extends Exception{
	
	private static final long serialVersionUID = 1L;

	public VeicExistExcepetion(String tipoVeiculo) {
		System.out.println("Veículo de " + tipoVeiculo + " já cadastrado!");		
	}
	
	@Override
	public String getMessage() {
		return "Escolha uma nova opção do Menu";
	}

}
