// Create a Batter interface with methods like int getRuns().  
//Create a Bowler interface with methods like int getWickets().  
//Create an abstract Player class with id, name, age, and matchesPlayed as fields.  
//Create a class Cricketer inherited from Player as well as Batter and Bowler interfaces.  
//In all classes write appropriate constructors, getter/setters, accept(), toString(), and equals() 
//methods.  
//In main(), create a team (array) of 11 players and input their details from end user in a menu driven 
//code.  
//Also display menu that shows count of number of total runs of all players, wickets taken by all 
//players and total matched played. 
//Also display all the cricketers with their name and no of matches played individually.
package com.sunbeam;

public interface Batter {
	int getRuns();
}
