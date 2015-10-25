package tema1;

import java.util.ArrayList;
import java.util.List;

public class Network {
	public List<User> users = new ArrayList<User>();;
	private static final Network INSTANCE = new Network();

	private Network() {

	}

	public static Network getInstance() {
		return INSTANCE;
	}

	void add(User u) {
		users.add(u);
	}

	void add(int ID, String Nume) {
		users.add(new User(ID, Nume));
	}

	void remove(int ID) {
		users.remove(ID);
	}

	void afis() {
		for (User u : users) {

			System.out.println(u + " pretini: {" + u.Friends() + "}");
		}
	}

	void friend(int ID1, int ID2) {

		if (((users.get(ID1)).prieteni.contains(users.get(ID2)) == true) || (ID1 == ID2)
				|| ((users.get(ID1)).prieteni.contains(users.get(ID2)) == true)) {

		} else {
			users.get(ID1).friend(users.get(ID2));
			users.get(ID2).friend(users.get(ID1));
		}
	}

	void unfriend(int ID1, int ID2) {
		users.get(ID1).unfriend(users.get(ID2));
		users.get(ID2).unfriend(users.get(ID1));
	}

	void comm() {
		int i = 0;
		int[] arr = new int[10];
		while (i < 7) {
			int size;
			arr[i] = users.get(i).ID;
			 // System.out.println(arr[i]);
			for (int j = 1; j < 7; j++) {
				size = users.get(j).prieteni.size();
				for (int k = 0; k < size; k++) {

					if (users.get(j).prieteni.get(k).ID==arr[i]) {
						System.out.println(users.get(j).prieteni.get(k).ID);
					}
				}

			}

			// System.out.println(users.get(i).prieteni.get(0).ID);
			i++;
		}
	}

}
