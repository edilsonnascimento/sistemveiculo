package sistemveiculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {

	public String entDados(String dados) {

		System.out.println(dados);

		InputStreamReader teclado = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(teclado);

		String s = "";

		try {
			s = buffer.readLine();
		} catch (IOException ioe) {
			System.out.println("\n Erro no sistema ou na JVM");
		}
		return s;
	}
}
