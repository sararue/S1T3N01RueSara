package n1exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class App {
	
	public static void main (String [] args) {
		
		ArrayList <Month> monthList = new ArrayList <Month>();
		
		monthList.add( new Month ("January"));
		monthList.add( new Month ("February"));
		monthList.add( new Month ("March"));
		monthList.add( new Month ("April"));
		monthList.add( new Month ("May"));
		monthList.add( new Month ("June"));
		monthList.add( new Month ("July"));
		monthList.add( new Month ("September"));
		monthList.add( new Month ("October"));
		monthList.add( new Month ("November"));
		monthList.add( new Month ("December"));
		
		
		//Creating and adding august
		Month august = new Month ("August");
		
		monthList.add(7,august);
		
		//From ArrayList  to HashSet
		
		Set <Month> HashSetMonth= new LinkedHashSet <Month> (monthList);
		
		//Testing equals
		
		HashSetMonth.add(new Month ("April"));
		
		//For and iterator
		
		for (Month month : HashSetMonth) {
			
			System.out.println(month.getName());
		}
		
	Iterator <Month> it = HashSetMonth.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next().getName());
						
		}
		
		
		
		
		
		
		
	}

}


/*Crea una classe anomenada Month amb un atribut "name" 
 * (que emmagatzemarà el nom del mes de l'any).
 *  Afegeix 11 objectes Month (cadascun amb el seu atribut diferent) en un ArrayList, 
 *  a excepció de l'objecte amb atribut "Agost". Després, efectua la inserció 
 *  en el lloc que correspon a aquest mes i demostra que l’ArrayList manté l'ordre correcte.
 */