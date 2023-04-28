package main.java.leetcode;

public class ListNode {
	int val;
	ListNode next;

	ListNode() {}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static ListNode createFromArray(int[] arr, int index) {
		if (index + 1 < arr.length) {
			return new ListNode(arr[index], createFromArray(arr, index + 1));
		} else {
			return new ListNode(arr[index]);
		}
	}

}