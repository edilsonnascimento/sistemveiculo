package sistemveiculo;
/**
Criado por: Edilson do Nascimento. 
 */

public class VeicExistExcepetion extends Exception{
	
	private static final long serialVersionUID = 1L;

	public VeicExistExcepetion(String tipoVeiculo) {
		System.out.println("Ve�culo de " + tipoVeiculo + " j� cadastrado!");
	}

}
