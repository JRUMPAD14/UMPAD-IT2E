
package umpad.it2e;


public class Execution {

    void displayExecution() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    class Task {
    private int id;
    private String name;
    private String assignedTo;
    private String dueDate;
    private String priority;
    private String status;

    public Task(int id, String name, String assignedTo, String dueDate, String priority, String status) {
        this.id = id;
        this.name = name;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }
}

}
