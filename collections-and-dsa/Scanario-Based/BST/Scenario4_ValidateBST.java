class Node{
int val;
Node left,right;
Node(int val){this.val=val;}
}
class Scenario4{
boolean isValidBST(Node root){
return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
}
boolean check(Node node,long min,long max){
if(node==null)return true;
if(node.val<=min||node.val>=max)return false;
return check(node.left,min,node.val)&&check(node.right,node.val,max);
}
}
