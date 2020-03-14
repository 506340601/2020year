package com.lsl;

import java.util.Stack;

/**
 * @author Long
 * @Date 2020/3/10 10:48
 */
public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1,8,4,4,8,1};
        Node head1 = init(arr1);
        isPalindrome(head1,3);

        int[] arr2 = {1,2,5,2,1};
        Node head2 = init(arr2);
        isPalindrome(head2,2);

        int[] arr3 = {1,2,5,3,2,1};
        Node head3 = init(arr3);
        isPalindrome(head3,3);


    }
    public static class Node {//不带头节点
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }
    public static void isPalindrome(Node head, int k) {
        boolean a = isPalindrome(head);
        Node p = head;
        delete(head,k);
        boolean b = isPalindrome(head);
        System.out.println(a + " " + b);
    }
    //初始化一个链表
    public static Node init(int[] values){
        if(values != null &&values.length > 0){
            Node head = new Node(values[0]);
            Node p = head;
            for(int i = 1; i < values.length ; i ++){
                p.next = new Node(values[i]);
                p = p.next;
            }
            return head;
        }
        return null;
    }
    //删除第k个节点
    public static void delete(Node head, int k) {
        if (k < 1) return;
        if (k == 1) {
            if(head.next != null){
                head = head.next;
            }
        }else {
            Node front = null;
            Node p = head;
            for(int i = 1; i < k && p.next != null; i ++, p = p.next){
                front = p;
            }
            front.next = p.next;
        }
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;

        Node low = head.next;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            low = low.next;
            fast = fast.next.next;
        }
        Stack<Node> stack = new Stack<Node>();
        while (low != null) {
            stack.push(low);
            low = low.next;
        }
        Node p = head;
        while (!stack.isEmpty()) {
            if (p.value != stack.pop().value) {
                return false;
            }
            p = p.next;
        }
        return true;
    }
}
