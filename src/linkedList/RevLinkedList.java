package linkedList;

import java.util.Scanner;

public class RevLinkedList {
	private Node first = null;
	
	private class Node {
		Node next;
		int val;
	}
	
	private void push(int item) {
		Node oldFirst = first;
		first = new Node();
		first.val = item;
		first.next = oldFirst;
	}
	
	private int pop() {
		int item = first.val;
		first = first.next;
		return item;
	}
	
	private Node revList(Node head) {
		Node temp = head;
		if(temp.next != null) {
			Node temp2 = temp.next;
			Node temp3 = temp2.next;
			return revList(temp, temp2, temp3);
		} else {
			return temp;
		}
	}
	
	private Node revList(Node temp, Node temp2, Node temp3) {
		if(temp2 == null) return temp;
		else {
			temp2.next = temp;
			temp = temp2;
			if(temp3 == null) temp2 = null;
			else { 
				temp2 = temp3;
				temp3 = temp3.next;
			}
			return revList(temp, temp2, temp3);
		}
		
	}
}







/**public ListNode reverseList(ListNode head) {
    if(head==null || head.next==null)
        return head;
    ListNode nextNode=head.next;
    ListNode newHead=reverseList(nextNode);
    nextNode.next=head;
    head.next=null;
    return newHead;
}**/
