package oop.polymorphism;

public class HandBagCalculator {
 

		public int sizeOfBag(int a, int b) {
			int total = a+b;
			return total;
		}
		public int sizeOfBag(int a, int b, int c) {
			int total  = a+b+c;
			return total;
			
		}
		public int sizeOfBag( int c) {
			int total = c;
			return total;
		}
		public int sizeOfBag(int a, int b, int c, int d) {
			int total = a+ b+ c+ d;
			return total;
		}
		public int sizeOfBag(String landName, int a, int b, int c) {
			int value= Integer.parseInt(landName);
			int total = a+ b + value;
			return total;
			
		}
		
	}


