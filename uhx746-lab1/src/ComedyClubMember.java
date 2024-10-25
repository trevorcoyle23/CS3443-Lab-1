/**
 * Abstract class used to describe a ComedyClubMember object.
 * @author Trevor Coyle (uhx746)
 *
 */

public abstract class ComedyClubMember {
	private String name;
	private String membershipType;
	private int laughterIntensity;
	private String phoneNumber;
	
	/**
	 * ComedyClubMember Constructor
	 * @param name - name of member
	 * @param membershipType - type of membership (Regular, VIP)
	 * @param laughterIntensity - how loud the crowd will laugh in their show
	 * @param phoneNumber - club members' number
	 */
	
	public ComedyClubMember(String name, String membershipType, int laughterIntensity, String phoneNumber) {
		this.name = name;
		this.laughterIntensity = laughterIntensity;
		this.membershipType = membershipType;
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * Getters and Setter functions
	 * @return - either returns an attribute or sets an attribute
	 */
	
	public String getName() {
		return name;
	}
	
	public String getMembershipType() {
		return membershipType;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public int getLaughterIntensity() {
		return laughterIntensity;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}
	
	public void setLaughterIntensity(int laughterIntensity) {
		this.laughterIntensity = laughterIntensity;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public abstract String toString();
}
