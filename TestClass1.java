import java.util.*;

public class TestClass1 {

	
	static void outputString(String str ,int n ,int m) {
		StringBuilder my = new StringBuilder();
		char[] arr = str.toCharArray();
		boolean neg1=false;
		boolean neg2=false;
		if(n<0) {
			neg1=true;
			n=-n;
		}
		if(m<0) {
			neg2=true;
			m=-m;
		}
		
		for(int i=0,k=0;i<str.length();i=i+n) {
		
		if(i+n<str.length() && i+m<str.length()) {
			
			if(k%2==0) {
//				++i;
				my = new StringBuilder();
				for(int j=i;j<i+n;j++) {
					my.append(arr[j]);
				}
				if(neg1) {
					System.out.print(my.reverse()+" ");
				}
				else
				System.out.print(my+" ");
			}
			else {
				
				my = new StringBuilder();
				for(int j=i;j<i+m;j++) {
					my.append(arr[j]);
				}
//				++i;
				i=i+m-n;
				if(neg2) {
					System.out.print(my.reverse()+" ");
				}
				else
				System.out.print(my+" ");
			}
			k++;
			
		}
		
		else {
			System.out.print(str.substring(i));
		}
			
		}
		
			
		
//		for(int i=0;i<str.length()-3;i++) {
//			
//			my = str.substring(i,n);
////			i++;
//			System.out.println(my);
//		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
		 
		 String str = s.nextLine();
		 str= str.replaceAll("\\s","");
		 System.out.println(str);
		 outputString(str,-3,2);
		 
		 

	}

}
