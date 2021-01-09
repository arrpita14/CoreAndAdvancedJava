//Question5 Chanda_93036
package day6CodeExamplesSaturday.allTestClasses;

import java.util.*;
import day6CodeExamplesSaturday.beans.BookInfo;

public class BookInfoTest {

	public static void main(String[] args) {
		BookInfo bf1 = new BookInfo("Math", 125, 200);
		BookInfo bf2 = new BookInfo("English", 125, 200);
		BookInfo bf3 = new BookInfo("Science", 125, 200);
		BookInfo bf4 = new BookInfo("History", 125, 200);

		Set<BookInfo> hs1 = new HashSet<BookInfo>();
		hs1.add(bf1);
		hs1.add(bf2);
		hs1.add(bf3);
		hs1.add(bf4);

		// printing values of HashSet using Iterator
		System.out.println("printing values of HashSet using Iterator");
		Iterator<BookInfo> i1 = hs1.iterator();
		while (i1.hasNext()) {
			BookInfo x = i1.next();
			System.out.println(x);
		}
	}

}
