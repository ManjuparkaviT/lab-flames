package service;
import java.lang.*;
import java.util.*;
// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService{
	public static char findFlames(String name1,String name2) {
		name1=name1.toLowerCase();
		name2=name2.toLowerCase();
		
		System.out.println("Your Name is "+name1);
		System.out.println("Your Partner Name is "+name2);
		StringBuilder str1=new StringBuilder(name1);
		StringBuilder str2=new StringBuilder(name2);
		
		int a=str1.length(),b=str2.length();
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					str1.replace(i, i+1,"0");
					str2.replace(j, j+1,"0");
				}
			}
		}
		int x1=0;
        int y1=0;
        String s1="";
        String s2="";
        s1 = str1.toString();
        s2 = str2.toString();
        for(int i=0;i<s1.length();i++){ 
        	if(s1.charAt(i)!='0'){
        		x1 +=1;
        	}
        }
        for(int i=0;i<s2.length();i++){
            if(s2.charAt(i)!='0'){
                y1 +=1;
                }
        } 
        int x = x1+y1;
        StringBuilder str3=new StringBuilder("flames");
        
        char flame = '0';
        
        while(str3.length()!=1)
        {
            int y = x%str3.length(); 
            String temp;
            
            if(y!=0)
            {
                temp = str3.substring(y)+str3.substring(0, y-1); // taking substring (counting purpose)
                
            }
            else
            {
                temp = str3.substring(0, str3.length()-1); // taking substring (counting purpose)
                
            }
            str3 = new StringBuilder(temp);
            flame = str3.charAt(0);
            
        }
        switch(flame)
        {
            case 'f':
                System.out.println("You two are Friends");
                break;
            case 'l':
                System.out.println("You two are Lovers");
                break;
            case 'a':
                System.out.println("You two share Affection");
                break;
            case 'm':
                System.out.println("You both will end up in Marriage");
                break;
            case 'e':
                System.out.println("You two are Enemies");
                break;
            case 's':
                System.out.println("You two are Siblings");
                break;
                
        }
        return flame;
 
		
	}
}
