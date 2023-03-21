package com.ds;

//Delete Nth Node from last  (size-n+1)
public class LLque1 {

    public static void main(String[] args) {
        LL list=new LL();
        int n=2;
        int size=getSize(list);
        int fIndex= size-n+1;

        LL.Node currNode=list.head;
        int i=0;
        if(list.head.next==null)
        {
            list.head=null;
        }
        while(i<fIndex)
        {
            currNode=currNode.next;
        }
        currNode.next=currNode.next.next;

    }
    public static int getSize(LL list)
    {
        int size=0;
        LL.Node currNode=list.head;
        while(currNode!=null)
        {
            currNode=currNode.next;
            size++;
        }
        return size;
    }
}
