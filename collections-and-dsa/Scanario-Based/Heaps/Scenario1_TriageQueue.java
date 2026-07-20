import java.util.*;
class Patient{
int severity;
Patient(int severity){this.severity=severity;}
}
class Scenario1{
PriorityQueue<Patient> q=new PriorityQueue<>((a,b)->b.severity-a.severity);
void addPatient(Patient p){
q.offer(p);
}
Patient treatNext(){
return q.poll();
}
}
