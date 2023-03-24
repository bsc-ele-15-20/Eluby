public class TaskNonThreadDemo {
	
public static void main(String[] args) {
    // Create  Objects
    programmingLanguages task1 = new programmingLanguages();
    techCompanies task2 = new techCompanies();
    // Start threads
    task1.run();
    task2.run();
  }
}
// The thread 1 task
//this can be for example summing numbers
class programmingLanguages implements Runnable{
  //  run method in call by thread.start()
  String[] programmingLanguages = {"java","Javascript", "C", "C++","C#", "Python","PHP"
,"Cobol","Swift","Go","R","Matlab"};
 public void run(){
   for (int i = 0; i < programmingLanguages.length; i++) {
     System.out.println(" programming language  ** "+programmingLanguages[i]);
   }
  }
 }
 // The thread 2 task
 //this can be for example averaging  numbers
 class techCompanies implements Runnable {
   String[] techCompaniesList = {"Google","Microsoft", "Facebook", "Oracle","Apple", "Samsung","Intel"
 ,"IBM","Hon Hai Precision","adobe","LinkedIn","Mhub","Baobab"};
   //  run method in call by thread.start()
   public void run(){
     for (int i = 0; i < techCompaniesList.length; i++) {
       System.out.println(" tech Companies   ++ "+techCompaniesList[i]);
     }

   }
 }
