package esercitazione1;

import java.util.Scanner;


public class Esercizi1 {
	
	//somma i valori dei numeri pari e dispari e li confronta
	public static void PariDispari(int[] array) {
		
		int pari = 0, dispari = 0;
		for (int i = 0; i < array.length; i+=2) 
			pari += array[i];
		
		for (int i = 1; i < array.length; i+=2) 
			dispari += array[i];
		
		if (pari == dispari)
			System.out.println("Pari e dispari uguali");
		else
			System.out.println("Pari e dispari diversi");
	}
	
	//stampa in modo alternato dall'inizio e dal fondo
	static void FirstLast(int[] array) {
		
		for (int i = 0; i < array.length/2; i++) {
			System.out.print(array[i] + " " + array[array.length - 1 - i] + " ");
		}
		System.out.println();
	}
	
	//controlla se ci sono tre valori uguali di fila
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
				System.out.println("Tre valori consecutivi uguali");
				return;
			}
			
		}
		System.out.println("NO");
	}
	
	// almeno una stringa uguale
	static void StessaSequenza(String[] str1, String[] str2) {
		
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i].equals(str2[j])) {
					System.out.println("OK");
					return;
				}
			}
		}
		System.out.println("KO");
	}
	
	//inverte la stringa
	static void InvertiStampa(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	
	//stampa le vocali
	static void StampaVocali(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ( c == 'a' ||  c == 'e' ||  c == 'i' ||  c == 'o' ||  c == 'u')
				System.out.print(c);
		}
		System.out.println();
	}
	
	// lunghezze di parole che iniziano mcol maiuscolo
	static void SommaMaiuscole(String[] str) {
		int i = 0, sum = 0;
		while (str[i] != ""){
			if (Character.isUpperCase(str[i].charAt(0)))
				sum += str[i].length();
			i++;
			if(i == str.length) {
				System.out.println("Errore manca la stringa vuota");
				return;
			}
		}
		System.out.println(sum);			
	}
	
	//valuta se i valori sono tutti pari
	static void TuttiPari(int[] array) {
		for (int value : array) {
			if (value < 0 || value % 2 == 1) {
				System.out.print("NO");
				return;
			}
				
		}
		System.out.println("Tutti positivi e pari");
	}
	
	//fa la media dei multipli di 3
	static void MediaMultipliTre(int[] array) {
		float somma = 0;
		int count = 0;
		for (int value : array) {
			if (value % 3 == 0) {
				count++;
				somma += value;
			}
		}
		System.out.println(somma/count);
		
	}
	
	//...
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
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		return array;
	}
	
	//controlla se la stringa è palindroma
	static boolean Palindroma(String s) {
		for (int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				System.out.println("stringa non palindroma");
				return false;
			}
		}
		System.out.println("stringa palindroma");
		return true;	
	}
	
	//stampa fibonacci
	static void Fibonacci() {
		long first = 0, second = 1, current;
		System.out.print("0 1 ");
		for (int i = 0; i < 50; i++) {
			current = first + second;
			System.out.print(current + " ");
			first = second;
			second = current;
		}
		System.out.println();
	}
	
	//traspone matrice
	static int[][] Trasposta(int[][] matrix){
		int[][] result = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < matrix[0].length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				result[i][j] = matrix [j][i];
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n;
		int[] arr;
		int[][] mat;
		String frase;
		String[] str1, str2;
		
		System.out.println("scegliere categoria esercizi:\n1. Array\n2. Stringhe\n3. Cicli\n4. Altri");
		n = s.nextInt();
		
		switch(n) {
		
			case 1:System.out.println("metodo pari/dispari");
				arr = getInputInt(s);
				PariDispari(arr);
				
				System.out.println("metodo primo/ultimo");
				arr = getInputInt(s);
				FirstLast(arr);
				
				System.out.println("metodo tre di fila");
				arr = getInputInt(s);
				TreDiFila(arr);
				
				System.out.println("metodo stessa sequenza");
				str1 = getInputString(s);
				str2 = getInputString(s);
				StessaSequenza(str1, str2);
				
				break;
				
			case 2: System.out.println("metodo inverti stringa\ndigitare stringa da invertire");
				frase = s.next();
				InvertiStampa(frase);
				
				System.out.println("metodo stampa vocali\ndigitare stringa da cui ricavare le vocali");
				frase = s.next();
				StampaVocali(frase);
				
				System.out.println("metodo somma maiuscole");
				str1 = getInputString(s);
				SommaMaiuscole(str1);
				
				break;
			
			case 3:	System.out.println("metodo tutti pari");
				arr = getInputInt(s);
				TuttiPari(arr);
				
				System.out.println("metodo media multipli di 3");
				arr = getInputInt(s);
				MediaMultipliTre(arr);
	
				System.out.println("metodo di ordinamento");
				arr = getInputInt(s);
				BubbleSort(arr);
			
				break;
			
			case 4:	System.out.println("metodo palindroma\ndigitare stringa che si vuole controllare");
				frase = s.next();
				Palindroma(frase);
				
				System.out.println("metodo di Fibonacci");
				Fibonacci();
				
				System.out.println("metodo di trasposizione matrice");
				mat = getInputMatrix(s);
				Trasposta(mat);
				
				for (int i = 0; i < 5; i++) {
					System.out.println("Inserire numero di caratteri che si vuole inserire");
					int caratteri = s.nextInt();
					System.out.println("Inserire caratteri");
					for (int j = 0; j < caratteri; j++) {
						char c = s.next().charAt(0);
						System.out.println(c);
					}
				}
				
				break;	
		}

		s.close();
	}
	
	//supporto all'input di numeri
	static int[] getInputInt(Scanner s) {
		int n;
		int[] arr;
		
		System.out.println("Digitare il numero di valori che si vuole inserire");
		n = s.nextInt();
		arr = new int[n+1];
		System.out.println("Inserire i valori uno alla volta");
		for (int i = 0; i < n; i++)
			arr[i] = s.nextInt();
		return arr;
	}
	//supporto all'input di stringhe
	static String[] getInputString(Scanner s) {
		int n;
		String buffer;
		String[] str;
		
		System.out.println("Digitare il numero di stringhe che si vuole inserire");
		n = s.nextInt();
		s.nextLine();
		str = new String[n];
		System.out.println("Inserire le stringhe una alla volta");
		for (int i = 0; i < n; i++) {
			if ((buffer = s.nextLine()).isBlank())
				buffer = "";
			str[i] = buffer;
		}
		return str;
	}
		
	
	static int[][] getInputMatrix(Scanner s) {
		int n, m;
		int[][] mat;
		
		System.out.println("Digitare il numero di righe");
		n = s.nextInt();
		System.out.println("Digitare il numero di colonne");
		m = s.nextInt();
		mat = new int[n][m];
		System.out.println("Inserire i valori uno alla volta");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				mat[i][j] = s.nextInt();
		}
			
		return mat;
	}
	

}
