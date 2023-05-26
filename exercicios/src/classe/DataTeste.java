package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = 1;
		d1.mes = 10;
		d1.ano = 2004;
		
		//System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
		//System.out.println(d1.obterData());
		d1.imprimirDataFormatada();
	}
}
