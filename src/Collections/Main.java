package Collections;

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println(areAnagrams("Dirtyoom".toLowerCase().toCharArray(),"Dormitory".toLowerCase().toCharArray()));
	}
	public static boolean areAnagrams(char str1[],char str2[]){
	    HashMap<Character,Integer> hm1 = new HashMap<>();
	    HashMap<Character,Integer> hm2 = new HashMap<>();
	    
	    for(int i=0;i<str1.length;i++){
	        if(hm1.containsKey(str1[i])){
	            hm1.put(str1[i],hm1.get(str1[i])+1);
	        } else{
	            hm1.put(str1[i],1);
	        }
	    }
	    for(int i=0;i<str2.length;i++){
	        if(hm2.containsKey(str2[i])){
	            hm2.put(str2[i],hm2.get(str2[i])+1);
	        } else{
	            hm2.put(str2[i],1);
	        }
	    }
	   for(Map.Entry<Character,Integer> entry:hm1.entrySet()) {
		   if(entry.getValue()!=hm2.get(entry.getKey())) {
			   return false;
		   }
	   }
	    return true;
	    /*if(str1.length!=str2.length){
	        return false;
	    }
	   Arrays.sort(str1);
	   Arrays.sort(str2);
	   for(int i=0;i<str1.length;i++){
	       if(str1[i]!=str2[i]){
	           return false;
	       }
	   }
	   return true;*/
	}
}
