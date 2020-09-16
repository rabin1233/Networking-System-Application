package CS146Project;

import java.util.ArrayList;


//Author: Rabin Gurung(013855972)
//CS146 (Section 5)

//Creating class Graph for the networking system
public class Graph {
	// Graph contains ArrayList of profiles and edges
	ArrayList<Profile> profiles;			// Profiles
	ArrayList<Edge> edges;					// Connections
	
	// Graph constructor
	Graph() {
		profiles = new ArrayList<Profile>();
		edges = new ArrayList<Edge>();
	}
	
	//Second constructor, adds user friendly profiles into this profiles
	Graph(ArrayList<Profile> profiles) {	
		this.profiles = profiles;
		edges = new ArrayList<Edge>();	
	}
	
	//Creating the Edge class which contains a source profile and destination profile
	class Edge 	
	{
		//This profile, a friend's profile
		Profile source, destination;		
		
		//Edge constructor
		Edge(Profile src, Profile dest) {					
			source = src;				// This profile
			destination = dest;			// This friend's profile
		}
		
		/* Getter methods */
		// Returns this profile
		public Profile getu() { return source; }
		
		// Returns your profile
		public Profile getv() { return destination; }	
	}
	
	/* Getters for Graph class */
	
	// returns the profile with name given in the parameter
	public Profile getProfile(String name) {
		for(int i = 0; i < profiles.size(); i++) {
			if(profiles.get(i).getName().equals(name))
			{
				return profiles.get(i);
			} 
		}
		
		return null;
		
	}
	
	// returns the edge with profile and the destination profile
	public Edge getEdge(Profile p, Profile other) {
		for(int i = 0; i < edges.size(); i++) {
			if((edges.get(i).getu().equals(p) && edges.get(i).getv().equals(other)) ||
					(edges.get(i).getv().equals(p) && edges.get(i).getu().equals(other)))
			{
				return edges.get(i);
			}
		}
		return null;
	
	}
	
	// adds a connection between src and destination(dest) profiles
	public void addConnection(Profile src, Profile dest) {			// Make a connection when adding friends
		edges.add(new Edge(src, dest));								// Add your friend's profile
		src.addFriend(getEdge(src, dest));
		dest.addFriend(getEdge(src, dest));
	}

	//Creating a new profile and adds it to social networking system
	public void addProfile(Profile p) {
		profiles.add(p);
	}
	
	//Removes profile from the system
	//Supposed to remove its friends also but it is incomplete
	public void removeProfile(Profile p) {
		for (int i = 0; i < profiles.size(); i++) {
			if (profiles.get(i).getName().equals(p.getName())){
            	profiles.remove(i);
            	for (int j = 0; j < edges.size(); j++) {
            		
	            	edges.remove(j);
            	}
         	}
		}
	}
	
	//Displays profile that are in the system into the console
	public void displayProfile() {
		for(Profile p : profiles) {
			System.out.println(p.getName() + " ");
		}
	}
	
	// Get's the friend's friend
	public String getFriendsFriend() {
		for(Profile p : profiles) {
			ArrayList<Edge> friends = p.getFriends();
			for(Edge e : friends) {
				ArrayList<Edge> friendsFriends = e.getv().getFriends();
				for(Edge e1 : friendsFriends) {
					e1.getv().getName();
				}
			}
		}
		return "";
	}
}
