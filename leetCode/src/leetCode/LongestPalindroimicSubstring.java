package leetCode;

import java.util.HashSet;

public class LongestPalindroimicSubstring {
	
	 public static void main(String[] arg) {
		 //String s = "babad";
		 //String s = "a";
		 String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		 String lps = longestPalindrome(s);
		 System.out.printf("result : "  + lps);
	 }
	  public static String longestPalindrome(String s) {
	       String tempS = "";
	       String mLps = "";
	       String sFrist = "";
	       String sSecond = "";
	       
	       if(s.length() > 1)
	    	   mLps = s.substring(0,1);
	       
	       for(int i=0 ; i < s.length() ; i++)
	       {
	    	   for(int j=i+1; j <= s.length() ; j++)
	    	   {
	    		   tempS = s.substring(i,j);
	    		   if(isPalindormic_Se(tempS))
	    		   {
	    			   if( mLps.length() < tempS.length())
	    				   mLps = tempS;
	    		   }
	    	   }
	       }
	       return mLps;
	 }
	  public static boolean isPalindormic_Se(String s) {
		  boolean rVal = false;
		  int sLength = s.length() ;
		  char c1;
		  char c2;
		  
		  if(sLength < 2)
			  return true;
		  
		  int istart = 0, iend=1, jstart =sLength-1, jend=sLength;
		  while(istart < sLength) {
			  c1 = s.charAt(istart);
			  c2 = s.charAt(jstart);
	   		   	
	   		   	if( c1 == c2)
	   		   	{
	   		   		rVal = true;
	   		   	}
	   		   	else {
	   		   		return false;
	   		   	}
	   		 istart++;
	   		 jstart--;
		  }
			return rVal;
	  }
	  
	  public static boolean isPalindormic(String s) {
		  boolean rVal = false;
		  int sLength = s.length() ;
		  String s1 , s2;
		  
		  if(sLength < 2)
			  return true;
		  
		  int istart = 0, iend=1, jstart =sLength-1, jend=sLength;
		  while(true) {
				s1 = s.substring(istart, iend);
	   		   	s2 =s.substring(jstart,jend);
	   		   	if( s1.equals(s2))
	   		   	{
	   		   		rVal = true;
	   		   	}
	   		   	else {
	   		   		return false;
	   		   	}
	   		 // 2글자 일경우도 포함
	   		 if(jstart == iend || jstart-iend == 1 )
	   			 break;
	   		 
	   		 istart++;
	   		 iend++;
	   		 jstart--;
	   		 jend--;
		  }
			return rVal;
	  }
}
