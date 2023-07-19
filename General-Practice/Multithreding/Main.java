import java.util.*;

class Main2 extends Thread{  
 public void run(){  
     
       Collection<String> competency = new ArrayList<String>(5);
        competency.add("Piyush");
        competency.add("Sharan");
        competency.add("Akash");

        System.out.println("Siting together according to competency....");

        for (String people : competency) {
            System.out.println(people);
        }
        
 }  
 
}  

class Main extends Thread{  
 public void run(){  
     
        Collection<String> friends = new ArrayList<String>(5);
        
        friends.add("Piyushhhhh");
        friends.add("Sharannn");
        friends.add("Akaaash");
        
        System.out.println("Going to eat together with friends....");

         for (String items : friends) {
            System.out.println(items);
        }
 }  
 
 public static void main(String args[]){  
     
      
      Main t1=new Main(); 
      t1.start();
      Main2 t2=new Main2(); 
      t2.start();  
 }

}  