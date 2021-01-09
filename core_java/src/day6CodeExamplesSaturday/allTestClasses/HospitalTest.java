//question1. Aishwarya_93032
package day6CodeExamplesSaturday.allTestClasses;
import java.util.*;
import day6CodeExamplesSaturday.beans.HospitalBean;

public class HospitalTest {

	public static void main(String[] args) {
		HospitalBean hb1 = new HospitalBean(4310, "Arpita", 300);
		HospitalBean hb2 = new HospitalBean(4320, "Barack", 400);
		HospitalBean hb3 = new HospitalBean(4330, "Charlie", 5300);
		HospitalBean hb4 = new HospitalBean(4340, "Denver", 3060);
		
		List<HospitalBean> ar1 = new ArrayList<HospitalBean>();
		ar1.add(hb1);
		ar1.add(hb2);
		ar1.add(hb3);
		ar1.add(hb4);
		
		//accessing elements of the array-list using for-loop
		System.out.println("Printing elements of the array-list using for-loop");
		for(HospitalBean x : ar1) {
			System.out.println(x);
		}
	}

}
