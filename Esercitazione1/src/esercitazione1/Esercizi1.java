package esercitazione1;

import java.util.Scanner;

public class Esercizi1 {
	public static void PariDispari(int[] array) {
		
		int pari = 0, dispari = 0;
		for (int i = 0; i < array.length; i+=2) 
			pari += array[i];
		
		for (int i = 1; i < array.length; i+=2) 
			dispari += array[i];
		
		if (pari == dispari)
			System.out.print("Pari e dispari uguali");
		else
			System.out.print("Pari e dispari diversi");
	}
	
	static void FirstLast(int[] array) {
		
		for (int i = 0; i < array.length/2; i++) {
			System.out.print("" + array[i] + array[array.length - 1 - i]);
		}
	}
	
	static void TreDiFila(int[] array) {
		int count = 0;
		int value = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] == value)
				count++;
			else
			{
				value = array[i];
				count = 0;
			}
			if (count == 2) {
				System.out.print("Tre valori consecutivi uguali");
				return;
			}
			
		}
		System.out.print("NO");
	}
	
	static void StessaSequenza(String[] str1, String[] str2) {
		
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i].equals(str2[j])) {
					System.out.print("OK");
					return;
				}
			}
		}
		System.out.print("KO");
	}
	
	static void InvertiStampa(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	
	static void StampaVocali(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ( c == 'a' ||  c == 'e' ||  c == 'i' ||  c == 'o' ||  c == 'u')
				System.out.print(c);
		}
	}
	
	static void SommaMaiuscole(String[] str) {
		int i = 0, sum = 0;
		while (str[i] != ""){
			if (Character.isUpperCase(str[i].charAt(0)))
				sum += str[i].length();
			i++;
		}
		System.out.print(sum);			
	}
	
	static void TuttiPari(int[] array) {
		for (int value : array) {
			if (value < 0 || value % 2 == 1) {
				System.out.print("NO");
				return;
			}
				
		}
		System.out.print("Tutti positivi e pari");
	}
	
	static void MediaMultipliTre(int[] array) {
		float somma = 0;
		int count = 0;
		for (int value : array) {
			if (value % 3 == 0) {
				count++;
				somma += value;
			}
		}
		System.out.print(somma/count);
		
	}
	
	static void AcquisizioneCaratteri() {
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Inserire numero di caratteri che si vuole inserire");
			int caratteri = s.nextInt();
			System.out.println("Inserire caratteri");
			for (int j = 0; j < caratteri; j++) {
				char c = s.next().charAt(0);
				System.out.println(c);
			}
		}
		s.close();
		
	}
	
	static int[] BubbleSort(int[] array) {
		boolean swap = true;
		while(swap) {
			swap = false;
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swap = true;
 				}
			}
		}
		return array;
	}
	
	static boolean Palindroma(String s) {
		for (int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}
		return true;	
	}
	
	static void Fibonacci() {
		long first = 0, second = 1, current;
		System.out.print("0 1 ");
		for (int i = 0; i < 50; i++) {
			current = first + second;
			System.out.print(current + " ");
			first = second;
			second = current;
		}
	}
	
	static int[][] Trasposta(int[][] matrix){
		int[][] result = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				result[i][j] = matrix [j][i];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		return result;
	}

}
