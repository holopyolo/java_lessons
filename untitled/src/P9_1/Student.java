package P9_1;

public class Student implements Comparable{
    private int id;
    public Student(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        if(((Student) o).getId() > this.id){
            return -1;
        }
        else if(((Student) o).getId() == this.id){
            return 0;
        }
        return 1;
    }
}
