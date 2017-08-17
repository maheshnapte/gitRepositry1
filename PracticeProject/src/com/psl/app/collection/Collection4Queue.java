package com.app;

import java.util.PriorityQueue;

class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		for (int i = 0; i <= 10; i++) {
			q.offer(i);
		}

		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q);
	}
}

public class Collection4Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
