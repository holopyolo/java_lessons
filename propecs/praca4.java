package propecs;
class Times{
    public enum lovetime{
        AUTUMN,
        SPRING,
        SUMMER,
        WINTER;
    }
    public void test2(enum lt){
        if(lt == lovetime.SUMMER){
            System.out.printf("Я люблю лето\n");

        }
    }
    public void test(){

        lovetime mylove = lovetime.SUMMER;
        System.out.printf(mylove);

    }
}