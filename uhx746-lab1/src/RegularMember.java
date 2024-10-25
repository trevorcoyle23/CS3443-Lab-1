
/**
 * 
 * @author Trevor Coyle (uhx746)
 * RegularMember describes a type of ComedyClubMember and their corresponding attributes.
 *
 */

public class RegularMember extends ComedyClubMember {
	
	private String membershipEndDate;
	private boolean hasDiscountCoupon;
	
	/**
	 * Following are constructors for different input types throughout the Lab1 java class.
	 * @param name
	 * @param membershipType
	 * @param laughterIntensity
	 * @param phoneNumber
	 * @param membershipEndDate
	 * @param hasDiscountCoupon
	 */
	public RegularMember(String name, String membershipType, int laughterIntensity, String phoneNumber, String membershipEndDate, boolean hasDiscountCoupon) {
		super(name, "Regular", laughterIntensity, phoneNumber);
		this.membershipEndDate = membershipEndDate;
		this.hasDiscountCoupon = hasDiscountCoupon;
	}
	
	public RegularMember(String name, int laughterIntensity, String phoneNumber, String membershipEndDate, boolean hasDiscountCoupon) {
		super(name, "Regular", laughterIntensity, phoneNumber);
		this.membershipEndDate = membershipEndDate;
		this.hasDiscountCoupon = hasDiscountCoupon;
	}

	public RegularMember(String name, int laughterIntensity, String membershipEndDate, boolean hasDiscountCoupon) {
		super(name, "Regular", laughterIntensity, "Not provided");
		this.membershipEndDate = membershipEndDate;
		this.hasDiscountCoupon = hasDiscountCoupon;
		
	}
	
	/**
	 * Getters and Setters functions.
	 * @return - either returning an attribute or setting an attribute of a given RegularMember object.
	 */

	public String getMembershipEndDate() {
		return membershipEndDate;
	}
	
	public void setMembershipEndDate(String membershipEndDate) {
		this.membershipEndDate = membershipEndDate;
	}
	
	public boolean hasDiscountCoupon() {
		return hasDiscountCoupon;
	}
	
	public void setHasDiscountCoupon(boolean hasDiscountCoupon) {
		this.hasDiscountCoupon = hasDiscountCoupon;
	}
	
	/**
	 * Overriden toString method to set the output format specifically for a VIPMember object.
	 */
	@Override
	public String toString() {
		return String.format("Regular Club Member name: %s, laughterIntensity: %d, Phone Number: %s, Membership End Date: %s, Discount Coupons: %b", getName(), getLaughterIntensity(), getPhoneNumber(), getMembershipEndDate(), hasDiscountCoupon());
	}
}
