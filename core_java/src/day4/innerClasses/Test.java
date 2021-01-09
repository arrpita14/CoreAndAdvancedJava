package day4.innerClasses;

import day4.innerClasses.OuterClass.InnerClass;

public class Test {

	public static void main(String[] args) {
	OuterClass oc1 = new OuterClass();
System.out.println(oc1.x);

InnerClass ic1 = oc1.new InnerClass(); //innerclass ke object banane ke liye outerClass ka obj.new InnerClass
System.out.println(ic1.y);
int z = oc1.x+ic1.y;
System.out.println(z);

	}

}
