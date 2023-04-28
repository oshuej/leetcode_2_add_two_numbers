package main.java.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("l1 = ");
		var l1 = Arrays.stream(br.readLine().split(","))
		               .mapToInt(Integer::parseInt)
		               .toArray();
		System.out.println("l2 = ");
		var l2 = Arrays.stream(br.readLine().split(","))
		                    .mapToInt(Integer::parseInt)
		                    .toArray();
		System.out.println(
				addTwoNumbers(
						ListNode.createFromArray(l1, 0),
						ListNode.createFromArray(l2, 0)
				             )
		);
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		var dummy = new ListNode(0);
		var curr = dummy;
		var carry = 0;
		do {
			int sum = 0;
			if (l1 != null) {
				sum += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val;
				l2 = l2.next;
			}
			sum += carry;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
		} while (l1 != null || l2 != null || carry == 1);
		return dummy.next;
	}
}