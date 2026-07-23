class Node{
int val;
Node left,right;
Node(int val){this.val=val;}
}
class Scenario6{
void deleteNode(Node node){}
void deleteFolderTree(Node node){
if(node==null)return;
deleteFolderTree(node.left);
deleteFolderTree(node.right);
deleteNode(node);
}
}
