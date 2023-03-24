public class TaskThreadDemo {
	
public static void main(String[] args) {
    // Create tasks from classes below
    programmingLanguages task1 = new programmingLanguages();
    techCompanies task2 = new techCompanies();
    // Create threads
    Thread thread1 = new Thread(task1);
    Thread thread2 = new Thread(task2);
    // Start threads
    thread1.start();
    thread2.start();
  }
}
// The thread 1 task printing programming Languages
class programmingLanguages implements Runnable{

  String[] programmingLanguages = {"java","Javascript", "C", "C++","C#", "Python","PHP"
,"Cobol","Swift","Go","R","Matlab","Coffie script"};
//  run method in call by thread.start()
 public void run(){
   for (int i = 0; i < programmingLanguages.length; i++) {
     System.out.println(programmingLanguages.length+" programming language  ** "+programmingLanguages[i]);
   }
  }
 }
 // The thread 2 task, printing tech Companies
 class techCompanies implements Runnable {
   String[] techCompaniesList = {"Google","Microsoft", "Facebook", "Oracle","Apple", "Samsung","Intel"
 ,"IBM","Hon Hai Precision","adobe","LinkedIn","Mhub","Baobab"};
   //  run method in call by thread.start()
   public void run(){
     for (int i = 0; i < techCompaniesList.length; i++) {
       System.out.println(techCompaniesList.length+" tech Companies   +++++++++++++++++ "+techCompaniesList[i]);
     }

   }
 }
