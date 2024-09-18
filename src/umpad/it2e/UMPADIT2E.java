
package umpad.it2e;


   public class UMPADIT2E {
    public static void main(String[] args) {
        Implementor implementor = new Implementor();
        implementor.addTask(201, "Complete Report", "Alice", "2024-09-15", "High", "In Progress");
        implementor.addTask(202, "Update Website", "Bob", "2024-08-25", "Medium", "Completed");
        implementor.displayTasks();
        
        Execution execution = new Execution ();
        execution.displayExecution();
        

    }
    
}



