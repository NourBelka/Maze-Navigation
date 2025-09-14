package Assignment10;
import java.util.Scanner;
public class Maze {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Creating rooms
		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		Node d = new Node("D");
		Node e = new Node("E");
		Node f = new Node("F");
		Node g = new Node("G");
		Node h = new Node("H");
		Node i = new Node("I");
		Node j = new Node("J");
		Node k = new Node("K");
		Node l = new Node("L");		
		
		//Setting directions
		a.setEast(b);
		a.setSouth(e);
		
		b.setWest(a);
		b.setSouth(f);
		
		c.setEast(d);
		c.setSouth(g);
		
		d.setWest(c);
		
		e.setNorth(a);
		e.setSouth(i);
		
		f.setNorth(b);
		f.setEast(g);
		
		g.setWest(f);
		g.setEast(h);
		g.setNorth(c);
		g.setSouth(k);
		
		h.setWest(g);
		h.setSouth(l);
		
		i.setNorth(e);
		i.setEast(j);
		
		j.setWest(i);
		
		k.setNorth(g);
		
		
		System.out.println("You are in room A of a maze of twisty little passages, all alike.");
		a.possibleMoves();
		
		Node currentroom = a;
		
			while (true) {
				
				if(currentroom == l) {
					break;
				}
				
				String input = scanner.next();

				if (input.equalsIgnoreCase("e")) {
					if(currentroom.getEast() == null) 
						System.out.println("Invalid direction. Try again.");
					else {	
					currentroom = currentroom.getEast();
					System.out.println("You are in room " + currentroom.getName() + " of maze of twisty little passages, all alike.");
					currentroom.possibleMoves(); }
				}
				
				else if(input.equalsIgnoreCase("s")) {
					if(currentroom.getSouth() == null) 
						System.out.println("Invalid direction. Try again.");
					else {
					currentroom = currentroom.getSouth();
					System.out.println("You are in room " + currentroom.getName() + " of maze of twisty little passages, all alike.");
					currentroom.possibleMoves(); }
				}
				
				else if(input.equalsIgnoreCase("n")) {
					if(currentroom.getNorth() == null) 
						System.out.println("Invalid direction. Try again.");
						
					else {
					currentroom = currentroom.getNorth();
					System.out.println("You are in room " + currentroom.getName() + " of maze of twisty little passages, all alike.");
					currentroom.possibleMoves();
					}
				}
				
				else if(input.equalsIgnoreCase("w")) {
					if(currentroom.getWest() == null) 
						System.out.println("Invalid direction. Try again.");
					else {	
					currentroom = currentroom.getWest();
					System.out.println("You are in room " + currentroom.getName() + " of maze of twisty little passages, all alike.");
					currentroom.possibleMoves(); }
				}
				
				
			} 
		
			scanner.close();
	}

}
