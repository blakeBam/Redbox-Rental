//bcb140130
//CS 2336.002
//Blake Bambico
package BSTree;

public class Tree {
  private BaseNode root;
  
  public Tree() {root = null;}
  
  public Tree(BaseNode r) {root = r;}
  
  //helper method for the recursive adding function
  public void addNode(BaseNode a)
  {
    if(root == null) {root = a;}
    else {add(a,root);}
  }
  
  //recursive adding funtion, compare the string to each node and navigate the tree accordingly
  private void add(BaseNode a, BaseNode start)
  {
    if(a.getTitle().compareTo(start.getTitle()) > 0)
    {
      if(start.getRight() != null) {add(a,start.getRight());}
      else {start.setRight(a);}
    }
    else if(a.getTitle().compareTo(start.getTitle()) < 0)
    {
      if(start.getLeft() != null) {add(a,start.getLeft());}
      else {start.setLeft(a);}
    }
    else {start.setAvailable(a.getAvailable());}
  }
  
  //public helper method for finding a title in the tree
  public BaseNode findTitle(String a)
  {
    if(root == null) {return null;}
    else {return find(a,root);}
  }
  
  //recursively search the tree for the title
  private BaseNode find(String a, BaseNode c)
  {
    if(a.compareTo(c.getTitle()) > 0)
    {
      if(c.getRight() != null) {find(a,c.getRight());}
      else {return null;}
    }
    else if(a.compareTo(c.getTitle()) < 0)
    {
      if(c.getLeft() != null) {find(a,c.getLeft());}
      else {return null;}
    }
    else {return c;}
    return null;
  }
}