package edu.byu.cs329.hw0;

public abstract class ListNode {

  protected ListNode next;
  
  public ListNode() {
    this.next = null;
  }

  public ListNode(ListNode next) {
    this.next = next;
  }
    
  public abstract void accept(ListNodeVisitor v);
    
}
