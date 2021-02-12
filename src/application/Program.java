package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int [][] mat = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Procurar n�mero: ");
		int x = sc.nextInt();
		
		for(int i = 0; i<m; i++) {
			for(int j = 0; j<n; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position: " + i + ", " + j);
					if(j != 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j < (mat[i].length - 1)) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i != 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(i < (mat[i].length-1)) {
						System.out.print("Down: " + mat[i+1][j]);
					}
					System.out.println();
					
				}
			}
		}
		
		sc.close();
		
	
	}

}
