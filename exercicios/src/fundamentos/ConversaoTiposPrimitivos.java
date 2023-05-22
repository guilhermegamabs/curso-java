package fundamentos;

public class ConversaoTiposPrimitivos {
	public static void main(String[] args) {
		double a = 1; // implícita
		System.out.println(a);
		
		float b = 1.02323242432F; // explicíta
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // explicíta (CAST)
		System.out.println(d);

	}
}
