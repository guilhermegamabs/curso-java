package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do Funcionário
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56343;
		long pontosAcumulados = 3_232_845_223L;
		
		// Tipos Números reais
		float salario = 11_445.44F;
		double vendasAcumulados = 2_232_121_232.01;
		
		// Tipo Booleano
		boolean estaDeFerias = true;
		
		// Tipo caractere 
		char status = 'A'; // ativo
		
		// Dias de Empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de Viajens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumulados);
		
		System.out.println("O ID: " + id + " ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
