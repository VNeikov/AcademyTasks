package AcademyTaskGame;

import java.util.LinkedList;
import java.util.Queue;

public class ListForObjects {

	
	Queue<Troll> trolls = new LinkedList();
	Queue<Human> humans = new LinkedList();
	

 void createTrollQueue(int numOfTrols){
		
		int numOfiters = numOfTrols;
		
		while(numOfiters > 0) {
			trolls.add(new Troll());
		numOfiters--;
		}	
	}
 
 void createHumanQueue(int numOfHumans) {
	 int numOfiterss = numOfHumans;
	 
	 while(numOfiterss > 0) {
			humans.add(new Human());
		numOfiterss--;
		}	
 }
	

}
