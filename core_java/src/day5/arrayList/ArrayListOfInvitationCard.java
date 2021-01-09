package day5.arrayList;
import java.util.ArrayList;
import java.util.Iterator;

import day5.arrayList.InvitationCard;

public class ArrayListOfInvitationCard {

	public static void main(String[] args) {
	InvitationCard ic1 = new InvitationCard("Arpita", 3);
	InvitationCard ic2 = new InvitationCard("Beena", 4);
	InvitationCard ic3 = new InvitationCard("Chandan", 2);
	
	ArrayList<InvitationCard> icList = new ArrayList<InvitationCard>();
	icList.add(ic1);
	icList.add(ic2);
	icList.add(ic3);
	
	/*for(InvitationCard i : icList) {
		System.out.println(i);
	} */
	
	// Create an iterator for the list 
    // using iterator() method 
    Iterator<InvitationCard> iter 
        = icList.iterator(); 

    // Displaying the values after iterating  through the list 
    System.out.println("\nThe iterator values"
                       + " of list are: "); 
    while (iter.hasNext()) { 
        System.out.print(iter.next() + " "); 
    } 
	}

}
