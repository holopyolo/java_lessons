import org.w3c.dom.css.Counter;

public class Main {
    enum counter{
        XXS(32){
            @Override
            public String getDescrip(){
                return "Детский размер\n";
            }
        },
        XS(34),
        S(36),
        M(38),
        L(40);

        int euroSIZE;
        private counter(int euroSIZE){
            this.euroSIZE = euroSIZE;
        }
        public String getDescrip(){
            return "Взрослый размер\n";
        }
    }
    public static void main(String[] args) {
        counter c = counter.M;

        System.out.println("Hello world!");
    }
}