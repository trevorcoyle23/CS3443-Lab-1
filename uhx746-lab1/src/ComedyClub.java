import java.util.Arrays;

/**
 * Class that describes the entire ComedyClub and it's ComedyClubMembers stored in an array.
 * @author Trevor Coyle (uhx746)
 *
 */

public class ComedyClub {
	private String name;
	private ComedyClubMember[] clubMembers;
	
	/**
	 * Constructor for the ComedyClub
	 */
	
	public ComedyClub(String name) {
		this.name = name;
		this.clubMembers = new ComedyClubMember[100];
	}
	
	public ComedyClub(String name, ComedyClubMember[] clubMembers) {
		this.name = name;
		this.clubMembers = Arrays.copyOf(clubMembers, Math.min(clubMembers.length, 100));
	}
	
	/**
	 * Method to add a member to the array of clubMembers
	 * @param member - the current members within the array
	 */
	public void addMember(ComedyClubMember member) {
		for (int i = 0; i < clubMembers.length; i++) {
			if (clubMembers[i] == null) {
				clubMembers[i] = member;
				break;
			}
		}
	}
	
	/**
	 * Method to remove a member from the array of clubMembers
	 * @param member - the current members within the array
	 */
	public void removeMember(ComedyClubMember member) {
		for (int i = 0; i < clubMembers.length; i++) {
			if (clubMembers[i] != null && clubMembers[i].equals(member)) {
				clubMembers[i] = null;
				break;
			}
				
		}
	}
	
	/**
	 * Getter and Setter functions
	 * @return - either returns the attribute value of the object, or sets an attribute to a given value
	 */
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Overriden toString method to handle formatted output of the ComedyClub object and all of it's members
	 */
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder(String.format("Comedy Club Name: %s Number of Current Members: %d Club Members:\n", name, countCurrentMembers()));
		for (ComedyClubMember member : clubMembers) {
			if (member != null) {
				result.append(" * ").append(member.toString()).append("\n");
			}
		}
		
		return result.toString();
	}
	
	/**
	 * Fuction that finds the total number of current members within the array of clubMembers
	 * @return - integer of the total members.
	 */
	private int countCurrentMembers() {
		int count = 0;
		for (ComedyClubMember member : clubMembers) {
			if (member != null) {
				count++;
			}
		}
		return count;
	}
}
