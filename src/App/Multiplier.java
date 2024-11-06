package App;

import java.util.Random;

public class Multiplier 
{
	
	public static float[][] generator (int n)
	{
		float[][] matrix = new float[n][n];
		Random random = new Random();
		
		for(int i = 0; i < n; i++) 
		{
			for(int j = 0; j < n; j++) 
			{
				matrix[i][j] = random.nextFloat() * 10;
			}
		}
		return matrix;
	}
	
	public static float[][] calculator(float[][] matrixA, float[][] matrixB)
	{
		int n = matrixA.length;
		float[][] result = new float[n][n];
		
		for(int i = 0; i < n; i++) 
		{
			for(int j = 0; j < n; j++) 
			{
				result[i][j] = 0;
				
				for(int k = 0; k < n; k++) 
				{
					result[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}	
		}
		return result;
	}
	
	
	public static void printM(float[][] matrix) 
	{
		for (float[] row : matrix) 
		{
			for (float value : row)
			{
				System.out.printf("%10.2f", value);
			}
			System.out.println();
		}
	}
	
	
	
	public static void main(String [] args) 
	{
		int n = 2;
		float[][] matrixA = generator(n);
		float[][] matrixB = generator(n);
		
		System.out.println("matrix A:");
		printM(matrixA);
		
		System.out.println("matrix B:");
		printM(matrixB);
		
		float[][] result = calculator(matrixA, matrixB);
		
		System.out.println("\n results of A * B: ");
		printM(result);
	}
}
