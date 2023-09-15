package Report;

public class Employee {
    private String FIO = "";
    private double salary = 10000;
    public Employee(String FIO, double salary){
        this.FIO = FIO;
        this.salary = salary;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
