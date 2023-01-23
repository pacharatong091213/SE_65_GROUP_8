import java.util.Vector;

public class OurGroup {
	private Vector<String> groupMembers;
	
	public OurGroup() {
		groupMembers = new Vector<String>();
		groupMembers.add("Sasicha Salabkaeo");
		groupMembers.add("Kittipat Chofa");
		groupMembers.add("Sukanya Khamcharoen");
	}
	
	public Vector<String> getGroupMemmbers(){
		return groupMembers;
	}
}