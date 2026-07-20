class Node{
int val;
Node left,right;
Node(int val){this.val=val;}
}
class Scenario6{
Node lowestCommonAncestor(Node root,int p,int q){
Node cur=root;
while(cur!=null){
if(p<cur.val&&q<cur.val)cur=cur.left;
else if(p>cur.val&&q>cur.val)cur=cur.right;
else return cur;
}
return null;
}
}
