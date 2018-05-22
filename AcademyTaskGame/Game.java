package AcademyTaskGame;

import java.util.Scanner;

public class Game {
	
	Scanner sc = new Scanner(System.in);
	 int numOfTrols;
	 int numOfHumans;
	ListForObjects e = new ListForObjects();
	 
	 void simulation() {
		 
		 while(true) {
			
			Troll currentT = e.trolls.poll(); 
			Human currentH = e.humans.poll();
			
			while(currentT.getHealth() > 0 && currentH.getHealth() > 0 ) {
				
						
				
						int punch2 = currentH.getStrength();					
						System.out.println("Troll's punch power is " + punch2);	
						currentH.setHealth((currentH.getHealth() >= punch2) ? (currentH.getHealth() - punch2) : 0); 
						System.out.println("Human Health is " + currentH.getHealth() );
						
						if(currentH.getHealth() > 0 ) {		
							if(Math.random() < 0.17) {
								System.out.println("Human miss");
								continue;
							}
					}
						
						if(currentH.getHealth() < 0) {
							System.out.println("The Winner is - Troll");
							}
							
						
						int punch1 = currentH.getStrength();	
						System.out.println("Human's punch power is " + punch1);	
						currentT.setHealth((currentT.getHealth() >= punch1) ? (currentT.getHealth() - punch1) : 0);
						System.out.println("Troll's Health is " + currentT.getHealth() );
						
						
						if(currentT.getHealth() > 0 ) {		
							if(Math.random() < 0.17) {
								System.out.println("Human miss");
								continue;
							}
					}
						
					}
				
					
			
			
			if(currentT.getHealth() < 0) {
			System.out.println("The Winner is - Human");
			}
			
			
			
			
			if((e.trolls.peek() != null) || (e.humans.peek() != null)){
				break;
			}
			
			}
		 
	 }
	 
	void menu() {

		
		System.out.println(".....................................................");
		System.out.println("            T R O L L   VS     H U M A N             ");
		System.out.println(".....................................................");
		
		System.out.println("FOR STARTING A GAME - TYPE 1");
		System.out.println("FOR GAME SIMULATION - TYPE 2");
		
		
		int input = sc.nextInt();
		
		switch (input) {
		case 1:
			
			System.out.println("NOW YOU ARE CREATING A GAME...");
			System.out.println("Enter number of Trolls : ");
			
			while(true) {
			numOfTrols = sc.nextInt();
			if(numOfTrols < 0) {
				System.out.println("Wrong input! Must be positive number!");
			} else {
				e.createTrollQueue(numOfTrols);
				break;
				}
			}
	
			System.out.println("Enter number of Humans :");
			while(true) {
				numOfHumans = sc.nextInt();
				if(numOfHumans < 0) {
					System.out.println("Wrong input! Must be positive number!");
				} else {
				e.createHumanQueue(numOfHumans);
					break;
					}
				}
			System.out.println(numOfTrols + " TROLLS AND" + numOfHumans + " HUMANS ARE CREATED!");
			menu();
			break;
		case 2:
			
			simulation();
			
			
			break;
		default:
			break;
		}
	
		
		
	}

	
	

}
