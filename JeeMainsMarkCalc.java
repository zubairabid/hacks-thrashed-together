package utility;

import java.util.Scanner;

public class JeeMainsMarkCalc {

	public static void main(String[] args) {
		
		System.out.println("ANSWER KEY:");
		Scanner sc = new Scanner(System.in);
		
		String r1;
		String str = "";
		while(!(r1 = sc.nextLine()).equals("")){
			str+= " "+r1;
		}
		System.out.println(str);
		int indexKey = 1;
		int key[] = new int[91];
		str = str.trim() + " Q";
		System.out.println(str);
		String temp="";
		for(int c = 0; c<str.length()-1; c++){
			
			if(str.charAt(c)=='Q'){
				temp = str.substring(str.indexOf(' ', c), str.indexOf('Q', c+2));
				key[indexKey++] = Integer.parseInt(temp.trim());
				c = str.indexOf('Q', c+2)-1;
			}
		}
		for(int i = 0; i < 91; i++){
			System.out.println(i+"\t"+key[i]);
		}
		
		System.out.println("YOUR ANSWERS:");
		str = "";
		while(!(r1 = sc.nextLine()).equals("")){
			str+= " "+r1;
		}
		System.out.println(str);
		int indexYou = 1;
		int you[] = new int[91];
		str = str.trim() + " Q";
		System.out.println(str);
		temp="";
		String temp1="";
		for(int c = 0; c<str.length()-1; c++){
			
			if(str.charAt(c)=='Q'){
				temp = str.substring(str.indexOf(' ', c), str.indexOf('Q', c+2));
				temp1 = temp.trim();
				if(!temp1.equals("-"))
					you[indexYou++] = Integer.parseInt(temp1.trim());
				else
					you[indexYou++] = 0;
				c = str.indexOf('Q', c+2)-1;
			}
		}
		for(int i = 0; i < 91; i++){
			System.out.println(i+"\t"+you[i]);
		}
		
		int marks = 0;
		for(int i = 1; i < 91; i++){
			if(you[i] == 0)
				continue;
			else if(key[i]==you[i])
				marks+=4;
			else
				marks-=1;
		}		
		System.out.println(marks);
	}

}
