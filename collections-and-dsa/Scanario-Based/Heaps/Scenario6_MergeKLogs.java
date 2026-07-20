import java.util.*;
class LogEntry{
int timestamp;
LogEntry(int t){timestamp=t;}
}
class Scenario6{
List<LogEntry> mergeKSortedLogs(List<List<LogEntry>> src){
PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->src.get(a[0]).get(a[1]).timestamp-src.get(b[0]).get(b[1]).timestamp);
for(int i=0;i<src.size();i++)if(!src.get(i).isEmpty())pq.offer(new int[]{i,0});
List<LogEntry> ans=new ArrayList<>();
while(!pq.isEmpty()){
int[] cur=pq.poll();
int s=cur[0],e=cur[1];
ans.add(src.get(s).get(e));
if(e+1<src.get(s).size())pq.offer(new int[]{s,e+1});
}
return ans;
}
}
