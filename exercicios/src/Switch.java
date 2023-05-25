package estruturaDeControle;

public class Switch {
	public static void main(String[] args) {
		int nota = 6;
		
		switch(nota) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("Reprovado");
			break;
		case 6:
			System.out.println("Aprovado");
			break;
		default:
			System.out.println("Desconhecido");
			break;
		}
		
		System.out.println("Sua nota foi divulgada!");
		
	}
}
