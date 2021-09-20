package LinkedList;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode list1Node1 = new ListNode(9);
        ListNode list1Node2 = new ListNode(9);
        ListNode list1Node3 = new ListNode(9);
        ListNode list1Node4 = new ListNode(9);
        ListNode list1Node5 = new ListNode(9);
        ListNode list1Node6 = new ListNode(9);
        ListNode list1Node7 = new ListNode(9);


        list1Node1.next = list1Node2;
        list1Node2.next = list1Node3;
        list1Node3.next = list1Node4;
        list1Node4.next = list1Node5;
        list1Node5.next = list1Node6;
        list1Node6.next = list1Node7;

        ListNode list2Node1 = new ListNode(9);
        ListNode list2Node2 = new ListNode(9);
        ListNode list2Node3 = new ListNode(9);
        ListNode list2Node4 = new ListNode(9);

        list2Node1.next = list2Node2;
        list2Node2.next = list2Node3;
        list2Node3.next = list2Node4;


        int carry = 0 ;


        ListNode listNode = new ListNode();
        ListNode head = listNode;

        while(list1Node1!=null||list2Node1!=null){
            int l1Val = 0;
            int l2Val = 0;

            if(list1Node1!=null){
                l1Val = list1Node1.val;
            }
            if(list2Node1!=null){
                l2Val = list2Node1.val;
            }

            int sum = l1Val + l2Val + carry;


            ListNode temp = new ListNode();

            if(sum >= 10){
                temp.val = Integer.parseInt(String.valueOf(sum).split("")[1]);
                carry = Integer.parseInt(String.valueOf(sum).split("")[0]);
            }else{
                temp.val = sum;
            }

            listNode.next = temp;
            listNode = temp;


            if(list1Node1!=null){
                list1Node1 = list1Node1.next;
            }
            if(list2Node1!=null){
                list2Node1 = list2Node1.next;
            }
        }



        while (head.next!=null){
            head=head.next;
            System.out.println(head.val);

        }
    }
}
/*
Solution From LeetCode
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return getSumResult(l1, l2, 0);
    }

    public ListNode getSumResult(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null) {
            if (carry > 0)
                return new ListNode(carry);
            else
                return null;
        }else {
            int sum = carry;

            if (l1 != null) sum += l1.val;
            if (l2 != null) sum += l2.val;

            return new ListNode(sum % 10, getSumResult(l1 == null ? null : l1.next,
                                                       l2 == null ? null : l2.next,
                                                       sum / 10)
                               );
        }
    }
 */

