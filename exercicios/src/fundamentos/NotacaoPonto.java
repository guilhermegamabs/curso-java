package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		String s = "Bom Dia";
		
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		System.out.println("Leo".toLowerCase());
		
		String y = "Bom Dia X".replace("X", "Gui");
		System.out.println(y);
	}
}
