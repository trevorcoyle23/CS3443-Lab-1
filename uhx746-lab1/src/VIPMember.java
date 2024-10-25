/**
 * 
 * @author Trevor Coyle (uhx746)
 *
 * VIPMember describes a type of ComedyClubMember and their corresponding attributes.
 */

public class VIPMember extends ComedyClubMember {
	
	private int numFreeDrinks;
	private int numGuestPasses;
	
	/**
	 * Following are constructors for different input types throughout the Lab1 java class.
	 * @param name
	 * @param membershipType
	 * @param laughterIntensity
	 * @param phoneNumber
	 * @param numFreeDrinks
	 * @param numGuestPasses
	 */
	public VIPMember(String name, String membershipType, int laughterIntensity, String phoneNumber, int numFreeDrinks, int numGuestPasses) {
		super(name, "VIP", laughterIntensity, phoneNumber);
		this.numFreeDrinks = numFreeDrinks;
		this.numGuestPasses = numGuestPasses;
	}

	public VIPMember(String name, int laughterIntensity, int numFreeDrinks, int numGuestPasses) {
		super(name, "VIP", laughterIntensity, "Not provided");
		this.numFreeDrinks = numFreeDrinks;
		this.numGuestPasses = numGuestPasses;
	}

	public VIPMember(String name, int laughterIntensity, int numFreeDrinks, int numGuestPasses, String phoneNumber) {
		super(name, "VIP", laughterIntensity, phoneNumber);
		this.numFreeDrinks = numFreeDrinks;
		this.numGuestPasses = numGuestPasses;
	}

	/**
	 * Getter and Setter functions
	 * @return - either returning an attribute or setting an attribute of a given VIPMember object.
	 */
	public int getNumFreeDrinks() {
		return numFreeDrinks;
	}
	
	public void setNumFreeDrinks(int numFreeDrinks) {
		this.numFreeDrinks = numFreeDrinks;
	}
	
	public int getNumGuestPasses() {
		return numGuestPasses;
	}
	
	public void setNumGuestPasses(int numGuestPasses) {
		this.numGuestPasses = numGuestPasses;
	}
	
	/**
	 * Overriden toString method to set the output format specifically for a VIPMember object.
	 */
	@Override
	public String toString() {
		return String.format("VIP Club Member name: %s, laughterIntensity: %d, Phone Number: %s, Free Drinks: %d, Guest Passes: %d", getName(), getLaughterIntensity(), getPhoneNumber(), getNumFreeDrinks(), getNumGuestPasses());
	}

}
