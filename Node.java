import java.util.ArrayList;
import java.util.List;

public class Node {

	private String name;
	private Node north;
	private Node south;
	private Node east;
	private Node west;
	
	//Default constructor
	public Node() {
		name = null;
		north = null;
		south = null;
		east = null;
		west = null;
	}
	
	//Constructor with name parameter
	public Node(String name) {
		this.name = name; 
	}
	
	//Setters
	public void setNorth(Node north) {
		this.north = north;
	}
	
	public void setSouth(Node south) {
		this.south = south;
	}
	
	public void setWest(Node west) {
		this.west = west;
	}
	
	public void setEast(Node east) {
		this.east = east;
	}
	
	
	//Getters
	public Node getNorth() {
		return north;
	}
	
	public Node getSouth() {
		return south;
	}
	
	public Node getWest() {
		return west;
	}
	
	public Node getEast() {
		return east;
	}
	
	public String getName() {
		return name;
	}
	
	//Method displaying the available directions
	public void possibleMoves() {
		List <String> message = new ArrayList<>();
	
		if(west != null) 
			message.add("west");
		if (east != null)
			message.add("east");
		if (north != null) 
			message.add("north");
		if (south != null) 
			message.add("south");
		
		if (!message.isEmpty()) {
			System.out.print("You can go ");
		
			for (int i = 0; i < message.size(); i++) {
				System.out.print(message.get(i));
				if (i < message.size()-1)
					System.out.print(" or ");
			
			}
			System.out.println("."); 
		
		} else 
		 System.out.println("Congratulations! You have reached the finish.");
		
	}
}

