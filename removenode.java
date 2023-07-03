import java.util.*;

public class removenode{
    public static class node{
        int info;
        node next;
       node(int info){
        this.info=info;
       }
    }
        public static node nthNode(node head,int n){
            node slow=head;
            node fast=head;
            for(int i=0;i<n;i++){
                fast=fast.next;
            }
            if(fast==null){
                head=head.next;
                return head;
            }
            while(fast.next!=null){
                fast=fast.next;
                slow=slow.next;
            }
            slow.next=slow.next.next;
            return head;
        }
       public static void display(node head){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.info+" ");
                temp=temp.next;
            }
            System.out.println();
        }
public static void main(String args[]){
    node a=new node(14);
    node b=new node(30);
    node c=new node(15);
    node d=new node(6);
                a.next=b;
                b.next=c;
                c.next=d;
                display(a);
               a=nthNode(a, 4);
             display(a);
}
}