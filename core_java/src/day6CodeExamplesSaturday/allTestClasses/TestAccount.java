//Question7 Dhiraj_93037
package day6CodeExamplesSaturday.allTestClasses;

import java.util.*;

import day3.java_OOP.Employee;
import day6CodeExamplesSaturday.beans.Account;

public class TestAccount {

	public static void main(String[] args) {
		Account a1 = new Account(4310, "Arpita");
		Account a2 = new Account(4320, "Babu");
		Account a3 = new Account(4330, "Champa");
		Account a4 = new Account(4340, "Dhabbu");

		Map<Integer, Account> hm1 = new HashMap<Integer, Account>();
		hm1.put(1, a1);
		hm1.put(2, a2);
		hm1.put(3, a3);
		hm1.put(4, a4);

//Printing Hash-map using iterator
		System.out.println("Printing Hash-map using iterator");
		Set<Integer> keysSet = hm1.keySet();
		Iterator<Integer> i1 = keysSet.iterator();
		while (i1.hasNext()) {
			int key = i1.next();
			Account acc = hm1.get(key);
			System.out.println(key + " " + acc);
		}

	}
}
