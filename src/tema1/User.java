package tema1;

 
import java.util.*;

public class User {
	  int ID;
	private String Nume;
	public List<User> prieteni ;
	public User(int iD, String nume, List<User> prieteni) {
		super();
		ID = iD;
		Nume = nume;
		prieteni =  new ArrayList<User>();
	}
	public User(int iD, String nume) {
		prieteni =  new ArrayList<User>();
		ID = iD;
		Nume = nume;
	}
	
	public User(int iD) {
		prieteni =  new ArrayList<User>();
		ID = iD;
	}
	@Override
	public String toString() {
		return "User ID=" + ID  ;
	}
	String Friends( ){
		String str = " ";
		for(User e:prieteni){
			str=str+e.ID;
			str+=" ";
		}
		return str;
	}
	  void friend(User u){
		  prieteni.add( u);
	  }
	  void unfriend(User u){
		  prieteni.remove(u);
	  }
	
		
	
	
}
