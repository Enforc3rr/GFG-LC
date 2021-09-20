package LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class IntersectionNode {
    public static void main(String[] args) {
        ListNode list1Node1 = new ListNode(9);
        ListNode list1Node2 = new ListNode(8);
        ListNode list1Node3 = new ListNode(7);
        ListNode list1Node4 = new ListNode(6);
        ListNode list1Node5 = new ListNode(5);
        ListNode list1Node6 = new ListNode(4);


        ListNode list2Node1 = new ListNode(8);
        ListNode list2Node2 = new ListNode(3);
        ListNode list2Node3 = new ListNode(2);
        ListNode list2Node4 = new ListNode(1);

        list1Node1.next = list1Node2;
        list1Node2.next = list1Node3;
        list1Node3.next = list1Node4;
        list1Node4.next = list1Node5;

        list1Node6.next = list2Node2;
        list2Node2.next = list2Node3;
        list2Node3.next = list2Node4;

        System.out.println(getIntersectionNode(list1Node1,list2Node1).val);

    }
    private static ListNode getIntersectionNode(ListNode newHeadA, ListNode newHeadB) {
        HashSet<ListNode> hashSet = new HashSet<>();

        while (newHeadA != null){
            hashSet.add(newHeadA);
            newHeadA = newHeadA.next;
        }
        while (newHeadB != null){
            if(hashSet.contains(newHeadB)){
                    return newHeadB;
                }
            newHeadB = newHeadB.next;
        }
        return null;
    }
}
