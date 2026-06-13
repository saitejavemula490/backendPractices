package practiceJava;

public class MergeLinkedLists {
    
	public static void main(String[] args) {
		 Node head1 = new Node(5);
		 head1.next = new Node(10);
		 head1.next.next = new Node(15);
		 head1.next.next.next = new Node(20);
         
         Node head2 = new Node(2);
         head2.next = new Node(3);
         head2.next.next = new Node(40);
         
         Node res = mergeList(head1,head2);
         printres(res);
         
         
	}
	private static void printres(Node head) {
		 while (head != null) {
	            System.out.print(head.data);
	            if (head.next != null) {
	                System.out.print(" -> ");
	            }
	            head = head.next;
	        }
	        System.out.println();

		
	}
	private static Node mergeList(Node head1, Node head2) {
		Node dummy = new Node(-1);
		Node curr = dummy;
		while (head1!=null && head2!=null) {
			if(head1.data <= head2.data) {
				curr.next = head1;
				head1 = head1.next;				
			}else {
				curr.next = head2;
				head2 = head2.next;
			}
			curr =curr.next;
			 if (head1 != null) {
		            curr.next = head1;
		        } else {
		            curr.next = head2;
		        }
		        
	}
		return dummy.next;
	}

}
class Node{
    int data;
    Node next;
	Node(int x) {
		data =x;
		next =null;
	}
	
}
