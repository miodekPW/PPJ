package pl.edu.pw.wim;

import java.util.Random;

public class SortowanieBabelkowe {
	
	//funkcja
	static void bubbleSort(int[] x){ 
		for (int j = 0; j < x.length-1; j++){
			for (int i = 0; i < x.length-1; i++){
				if(x[i] > x[i + 1]){ 
					//swap the values
					int temp = x[i];
					x[i] = x[i + 1];
					x[i + 1] = temp;
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//deklaracje
		int[] arr = new int[100];
		int[] occur= new int[10];
		int max=0,min=99,sum=0;
		Random randomGen=new Random(System.currentTimeMillis());
		//funkcja
		
					
				
			
		
		
		//1. Wygenerowanie tablicy i jej wypisanie
		for(int i=0;i<100;i++) {
			arr[i]=randomGen.nextInt(10);
			System.out.println("Liczba nr "+(i+1)+" wynosi: "+arr[i]);
			//zlicznie wystapien
			occur[arr[i]]+=1;
			//sumowanie elementow tablicy
			sum+=arr[i];
		}

		//2. Wypisanie liczby wystapien
		for(int i=0;i<10;i++) {
			if(occur[i]!=1) {
				System.out.println("Cyfra "+i+" wystapila "+occur[i]+ " razy");
			}else {
				System.out.println("Cyfra "+i+" wystapila "+occur[i]+ " raz");
			}
			//szukanie maksymalnej wartosci
			if(occur[i]!=0) {
				max=i;
			}
			//szukanie minimalnej wartosci
			if(occur[i]!=0&&i<min) {
				min=i;
			}
			
		}
		//3.Najmniejsza wartosc
		System.out.println("Minimalna wartosc w tablicy wynosi: "+min);
		
		//4. Najwieksza wartosc
		System.out.println("Maksymalna wartosc w tablicy wynosi: "+max);
		
		//5. Wypisanie sumy
		System.out.println("Suma elementow tablicy wynosi: "+sum);
		
		//6. Sortowanie babelkowe
		bubbleSort(arr);
		for(int i=0;i<100;i++) {
			System.out.println("Liczba na pozycji "+i+" wynosi: "+arr[i]);
		}
		
	}

}
