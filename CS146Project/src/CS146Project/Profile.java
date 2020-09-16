package CS146Project;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

import CS146Project.Graph.Edge;

//Author: Rabin Gurung(013855972)
//CS146 (Section 5)


//Creating profile class used in networking system
public class Profile {
	
	// Profile  class contains name, status, and a list of friends
	private String name, status;
	private ArrayList<Edge> friends = new ArrayList<Edge>();
	
	// Profile Constructor,  it contains nothing
	Profile() {
		name = "";
		status = "";
	}
	
	// Second Constructor for Profile, with user friendly name and status
	Profile(String name, String status) {
		this.name = name;
		this.status = status;
	}

	/* Getters Classes Auto Generated*/
	
	//the status of the profile for users
	public String getStatus() {
		return status;
	}
	
	// creating ArrayList for the friends of the profile 
	public ArrayList<Edge> getFriends() {
		return friends;
	}
	
	//getters for the name of the profile
	public String getName() {
		return name;
	}
	
	/* Setters for above classes */
	
	// edits and set the name of the profile
	public void setName(String newName) {
		name = newName;
	}
	
	// edits the and sets the status of the profile
	public void setStatus(String newStatus) {
		status = newStatus;
	}
	
	// add class for adding the friend to the profile
	public void addFriend(Edge friend) {
		friends.add(friend);
	}
}
