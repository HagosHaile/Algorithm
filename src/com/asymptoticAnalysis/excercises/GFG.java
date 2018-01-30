/**
 * 
 */
package com.asymptoticAnalysis.excercises;

/**
 * @author Hagos B. Haile
 *
 */
public class GFG {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[][] multi = new int[n][n];
		multi[0][0]=1;
		int j;
		for (int i = 0; i < n; i++) {

			for (j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					multi[i][j]=1;
					System.out.print(multi[i][j]);
				}
				else {
					multi[i][j]=multi[i-1][j-1] + multi[i-1][j];
					System.out.print(multi[i][j]);

				}
			}
			System.out.println();
		}

	}

}
