package leetCode;

public class ZigZagConversion {
	 public static void main(String[] arg) {
		 
		// String s = "PAYPALISHIRING";
		 //int row = 3; 
		 String s = "PAYPALISHIRING";
		 int row = 3; 
		 
		 String sVal = convert(s, row);
		 System.out.printf("result : "  + sVal);
	 }
	
	 public static String convert(String s,int numRows) {
		 String sVal="";
		 int yMax = numRows;
		 int xMax = s.length();
		 char[][] cArray = new char[yMax][xMax];

		 for(int a=0; a <yMax  ; a++ )
		 {
			 for(int b=0; b <xMax  ; b++ )
			 {
				 cArray[a][b] = '\0' ;
			 }
		 }
		 int x = 0;
		 int y = 0;
		 int i = 0;
		
		 if(xMax < 2 )
			 return s;
		 
		 while(true) {
			 
			 if(i == xMax)
					 break;
			 y = 0;
			 while(y < yMax)
			 {
				 if(i == xMax)
					 break;
				 cArray[y][x] =s.charAt(i++);
				 y++;
			 }
			
			 y= y-1;
			 x= x+1;
			 
			 while(y > 1)
			 {
				 y--;
				
				 if(i == xMax)
					 break;
				 cArray[y][x++] =s.charAt(i++);	
			 }
		 }
		 
		 char sTemp;
		 for(int c=0; c <yMax  ; c++ )
		 {
			 for( int d=0; d<xMax  ; d++ )
			 {
				 sTemp = cArray[c][d];
				 if(sTemp != '\0')
					 sVal = sVal + sTemp;
			 }
		 }
		 return sVal;
	 }
}
