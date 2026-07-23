import java.util.*;
class Scenario4{
List<Integer> topKLargest(int[] arr,int k){
PriorityQueue<Integer> pq=new PriorityQueue<>();
for(int x:arr){
if(pq.size()<k)pq.offer(x);
else if(x>pq.peek()){
pq.poll();
pq.offer(x);
}
}
return new ArrayList<>(pq);
}
}
