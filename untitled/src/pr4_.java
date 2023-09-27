import java.util.*;

public class pr4_ {
    public enum times{
        AUTUMN (5),
        SPRING(2),
        SUMMER(24)
                {
                    @Override
                    String getDiscription(){
                        return "Теплое время года";
                    }
                },
        WINTER(-4);

        private float temp = 0;
        private times(float temp){
            this.temp = temp;
        }
        String getDiscription(){
            return "Холодное время года\n";
        }

        public float getTemp() {
            return temp;
        }
    }
    public void test2(){
        Scanner scan = new Scanner(System.in);
        times inptime = times.valueOf(scan.next());
        switch (inptime){
            case SUMMER:
                System.out.println("Я люблю лето\n");
                break;
        }
        for(times t : inptime.values()){
            System.out.printf(t.toString() + t.getDiscription() + t.getTemp());
        }
    }
    public void test(){
        times lovetime = times.SUMMER;
        test2();

    }
}
