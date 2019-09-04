package leetCode;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring2 {
	
	 public static void main(String[] arg) {
		 //String s = "aab";
		 //String s = "bbbbb";
		 String s = "abcabcbb";
		 //String s = "dvdf";
		 int length = lengthOfLongestSubstring(s);
		 System.out.printf("length : "  + String.valueOf(length));
	 }
	  public static int lengthOfLongestSubstring(String s) {
	       Integer maxCnt = 0 ;
	       HashSet hs = new HashSet();
	       Integer tempCnt = 0 ;
	       String sTemp  = "";
	       
	       for(int i=0 ; i < s.length() ; i++) {
	    	   for(int j= i+1 ; j <= s.length() ; j++ )
	    	   {  
	    		   sTemp =  s.substring(j-1,j);
	    		   if( !hs.contains(sTemp) )
	    		   {
	    			   hs.add(sTemp);
	    			   tempCnt++;
	    			   if(maxCnt < tempCnt)
	    				   maxCnt = tempCnt;
	    		   }else {
	    			   hs.clear();
	    			   tempCnt = 0;
	    			   break;
	    		   }   
	    	   } 
			   hs.clear();
			   tempCnt = 0;  
	       }
	       return maxCnt;
	 }
	
}
