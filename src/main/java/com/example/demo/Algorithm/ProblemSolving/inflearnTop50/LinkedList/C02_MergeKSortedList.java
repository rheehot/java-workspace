package com.example.demo.Algorithm.ProblemSolving.inflearnTop50.LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @since 2020-08-16
 */
public class C02_MergeKSortedList {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] list = new ListNode[3];
        list[0] = l1;
        list[1] = l2;
        list[2] = l3;

        ListNode solve = solve(list);


        System.out.println(solve);

    }

    // 우선순위 큐에 넣는다. 오름차순
    // 새로운 ListNode 담을 그릇을 마련한다.
    // 각 ListNode를 꺼내와서 새로운 그릇에 적절하게 mapping 한다.
    private static ListNode solve(ListNode[] list) {
        Queue<ListNode> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
        ListNode newHead = new ListNode(0);
        ListNode p = newHead;

        for (ListNode node : list) {
            if (node != null) {
                queue.offer(node);
            }
        }

        while (!queue.isEmpty()) {
            ListNode node = queue.poll();
            System.out.println("node " + node);

            p.next = node;
            p = p.next;

            // node.next 값이 not null이면 다시 우선순위 큐에 넣는다.
            if (node.next != null) {
                queue.offer(node.next);
            }
        }

        return newHead.next;

    }
}
