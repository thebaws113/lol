package tema1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Network n = Network.getInstance();
		User[] u = new User[7];
		for (int i = 0; i < 7; i++) {
			u[i] = new User(i);
			n.add(u[i]);
		}
		for (int i=0;i<7;i++){
			n.friend((int)(Math.random()*7), (int)(Math.random()*7));
		}
		 
		n.afis();
		n.comm();
	}

}
