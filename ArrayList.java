package collectionDemo;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<String> list1=new java.util.ArrayList<String>();
		System.out.println("No of elements");
		int num=sc.nextInt();
		int i=0;
		while(i<=num) {
			list1.add(sc.nextLine());
			i++;
		}
		for(String ob:list1) {
			System.out.println(ob);
		}
	}

}
