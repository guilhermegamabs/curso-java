package arraysECollections.arrays;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		int[] a = new int[6];
		double[][] b = new double[2][2];
		
		a[0] = 10;
		a[1] = 20;
		
		b[0][0] = 30;
		
		double[] notas = { 6.4, 2.1, 2.5};
		
		String aFormatado = Arrays.toString(a);
		
		System.out.println(a[1]);
		System.out.println(b[0][0]);
		System.out.println(aFormatado);
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}
}
