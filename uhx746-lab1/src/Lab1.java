/**
 * A program that simulates a Comedy Club Membership System.
 * 
 * @author Trevor Coyle(uhx746) CS3443
 *
 */

public class Lab1 {

	public static void main(String[] args) {

		// Simulate the Comedy Club Membership System with an array of club members

		/* 
		 * UTSA Club
		 */
		ComedyClubMember memberOne = new RegularMember("Ahmed Ali", 5, "210-456-7890", "01-01-2025", true);
		ComedyClubMember memberTwo = new RegularMember("Sam Adams", 7, "05-05-2025", false);
		ComedyClubMember memberThree = new VIPMember("Omar Garcia", 4, 3, 5);

		ComedyClubMember[] clubMembers = {memberOne, memberTwo, memberThree};

		ComedyClub utsaClub = new ComedyClub("UTSA", clubMembers);

		// Calculate and display the average laughter intensity for UTSA club members
		int totalLaughterIntensity = 0;
		for (ComedyClubMember member : clubMembers) {
			totalLaughterIntensity += member.getLaughterIntensity();
		}
		double averageLaughterIntensity = (double) totalLaughterIntensity / clubMembers.length;
		System.out.printf("%s %s Club: %.2f\n" , "The Average Laughter Intensity in", utsaClub.getName(), averageLaughterIntensity);

		
		/* 
		 * Alamo Club     
		 */
		ComedyClubMember memberA = new RegularMember("Sara Mate", 2, "02-29-2024", true);
		ComedyClubMember memberB = new RegularMember("Mia Expo", 3, "03-15-2024", true);
		ComedyClubMember memberC = new VIPMember("Dan Gutman", 10, 2, 8, "521-098-7667");
		ComedyClubMember memberD = new VIPMember("Norman Fin", 1, 2, 10, "521-098-7667");
		
		ComedyClub alamoClub = new ComedyClub("Alamo");

		alamoClub.addMember(memberA);
		alamoClub.addMember(memberB);
		alamoClub.addMember(memberC);
		alamoClub.addMember(memberD);
		
		alamoClub.removeMember(memberB);

		// Display information about each Alamo club member
		System.out.println();
		System.out.println(alamoClub);


	}
}