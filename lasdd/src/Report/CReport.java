package Report;
import java.util.*;
public class CReport {
    static private ArrayList<Employee> Personal;
    public CReport(){
        Personal = new ArrayList<Employee>();
    }
    public void addEmployee(Employee emp){
        Personal.add(emp);
    }
    public void deleteEmployee(Employee emp){
        Personal.remove(emp);
    }
    public static String Output(){
        String output = "";
        for(Employee em : Personal){
            output += em.getFIO() + " : " + em.getSalary() + "\n";
        }
        return output;
    }


}
