package n1exercici2;

import java.util.LinkedList;
import java.util.ListIterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <Integer> numbers = new LinkedList <Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		LinkedList <Integer> reverseNumbers = new LinkedList <Integer>();
		
		ListIterator <Integer> it = numbers.listIterator();
		
		while (it.hasNext()) {
			it.next();
		}
		
		while (it.hasPrevious()) {
			reverseNumbers.add(it.previous());	
		}

		System.out.println(reverseNumbers);
		
		/*Crea i emplena un List<Integer>. 

Crea un segon List<Integer> i insereix a la segona llista els elements de la primera en ordre invers. 

Empra els objectes ListIterator per a llegir els elements de la primera llista i inserir-los en la segona.*/

	}

}
