package leetCode;


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

final class ListNode {
  int val;
  ListNode next;
  ListNode(int x) { val = x; }
 }

public class AddTwoNumbers {
	
	 public static void main(String[] arg) {
		 ListNode l1 = new ListNode(2);
		 l1.next = new ListNode(4);
		 l1.next.next = new ListNode(3);
		 

		 ListNode l2 = new ListNode(5);
		 l2.next = new ListNode(6);
		 l2.next.next = new ListNode(4);
		 
		 
		 addTwoNumbers(l1, l2);
		 
	 }
	 public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	  
		    int carry = 0 , sum = 0 , remain = 0;
		    
		    ListNode initalList = new ListNode(0);
		    ListNode currentList = new ListNode(0);
		    ListNode p ;
		    ListNode q ;
		    
		    p = l1;
		    q = l2;
		    
		    currentList = initalList;
		    
		    while(p != null || q != null){
		        
		      int x = (p != null) ? p.val : 0;
		      int y = (q != null) ? q.val : 0;
		      
		      sum   =  x + y + carry ;
		      carry  = sum / 10;
		
		      if(p != null )  p = p.next;
		      if(q != null )  q = q.next;
		        
		        if(carry > 0 )
		        {
		          currentList.val = sum % 10;  
		          currentList.next = new ListNode(carry);
		          currentList = currentList.next;
		            
		        }else {              
		            currentList.val =sum;
		            if(p != null || q != null)
		            {
		            	currentList.next = new ListNode(0);
		            	currentList = currentList.next;
		            }
		            
		        }
		    }
		    
		 return initalList;
		}
}
