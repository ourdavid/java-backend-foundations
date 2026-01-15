package encapsulation.worker.entities;

public class Department {
    private String department;


    public Department(String department) {
        this.department = department;
    }

    public String getName() {

        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }
}
