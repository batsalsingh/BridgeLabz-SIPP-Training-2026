class Node{
int val;
Node left,right;
Node(int val){this.val=val;}
}
class Scenario3{
Node delete(Node node,int key){
if(node==null)return null;
if(key<node.val)node.left=delete(node.left,key);
else if(key>node.val)node.right=delete(node.right,key);
else{
if(node.left==null&&node.right==null)return null;
if(node.left==null)return node.right;
if(node.right==null)return node.left;
Node s=node.right;
while(s.left!=null)s=s.left;
node.val=s.val;
node.right=delete(node.right,s.val);
}
return node;
}
}
