package entities;

import java.util.HashSet;
import java.util.Set;

public class Courses {

	private char letter;
	private Set<User> users = new HashSet<>();
	
	public Courses(char letter) {
		this.setLetter(letter);
	}
	
	

	public void addUser(User user) {
		users.add(user);
	}
	
	public void removeUser(User user) {
		users.remove(user);
	}



	public char getLetter() {
		return letter;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}



	public void setLetter(char letter) {
		this.letter = letter;
	}
	
	public void printUsers() {
		for(User u : users) {
			System.out.println(u.getCode());
		}
	}
	
}
