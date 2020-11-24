package sistemveiculo;
/**
 * @author Edilson do Nascimento
 */

public class VelocException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public VelocException(Veiculo veiculo) {
		System.out.println("\n A velocidade máxima está fora dos limites brasileiros:  " + veiculo.getPlaca());		
	}
	

}
