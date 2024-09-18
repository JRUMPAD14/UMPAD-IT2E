package umpad.it2e;

import umpad.it2e.Execution.Task;

public class Implementor {
    private Task[] tasks;
    private int taskCount;

   
    public Implementor() {
        tasks = new Task[10];
        taskCount = 0;
    }

    
    public void addTask(int id, String name, String assignedTo, String dueDate, String priority, String status) {
        if (taskCount < tasks.length) {
            
        } else {
            System.out.println("Task list is full. Cannot add more tasks.");
        }
    }

    public void displayTasks() {
        if (taskCount == 0) {
            System.out.println("No tasks to display.");
            return;
        }

        System.out.printf("%-10s %-20s %-15s %-15s %-10s %-15s%n", "Task ID", "Task Name", "Assigned To", "Due Date", "Priority", "Status");
        for (int i = 0; i < taskCount; i++) {
            System.out.printf("%-10d %-20s %-15s %-15s %-10s %-15s%n", tasks[i].getId(), tasks[i].getName(), tasks[i].getAssignedTo(), tasks[i].getDueDate(), tasks[i].getPriority(), tasks[i].getStatus());
        }
    }
}