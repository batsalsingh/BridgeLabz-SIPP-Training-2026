class Node{
int val;
Node left,right;
Node(int val){this.val=val;}
}
class Scenario1{
boolean search(Node root,int target){
Node cur=root;
while(cur!=null){
if(cur.val==target)return true;
cur=target<cur.val?cur.left:cur.right;
}
return false;
}
}
