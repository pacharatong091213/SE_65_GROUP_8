import java.util.Vector;

public class OurGroup {
	private Vector<String> groupMembers;
	
	public OurGroup() {
		groupMembers = new Vector<String>();
		groupMembers.add("Sasicha Salabkaeo");
		groupMembers.add("Kittipat Chofa");
<<<<<<< HEAD
		groupMembers.add("Sukanya Khamcharoen");
=======
		groupMembers.add("Nared Fuengverojsakul");
>>>>>>> ef081774fee1038f76364269401cd747859550b5
	}
	
	public Vector<String> getGroupMemmbers(){
		return groupMembers;
	}
}