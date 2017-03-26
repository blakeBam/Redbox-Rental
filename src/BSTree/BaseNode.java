//bcb140130
//CS 2336.002
//Blake Bambico
package BSTree;

public class BaseNode {
  private String title;
  private int available;
  private int rented;
  private BaseNode left;
  private BaseNode right;
  
  //default constructor
  public BaseNode()
  {
    title = "";
    available = 0;
    rented = 0;
    left = null;
    right = null;
  }
  
  //overloaded constructor
  public BaseNode(String t, int a, int rent, BaseNode l, BaseNode r)
  {
    title = t;
    available = a;
    rented = rent;
    left = l;
    right = r;
  }
  
  //accessors
  public String getTitle() {return title;}
  public int getAvailable() {return available;}
  public int getRented() {return rented;}
  public BaseNode getLeft() {return left;}
  public BaseNode getRight() {return right;}
  
  //mutators
  public void setTitle(String t) {title = t;}
  public void setAvailable(int a) {available = a;}
  public void setRented(int r) {rented = r;}
  public void setLeft(BaseNode l) {left = l;}
  public void setRight(BaseNode r) {right = r;}
}