package pr1STR;

public class converter {
    private double usd_rub = 100.2;
    private double eur_rub = 123.2;

    public converter(double usd_rub, double eur_rub){
        this.usd_rub = usd_rub;
        this.eur_rub = eur_rub;
    }
    public double convertRUB_(double sum, String inf){
        if(inf == "USD"){
            return sum / this.usd_rub;
        }
        if(inf == "EUR"){
            return sum / this.eur_rub;
        }
        return -1;
    }

    public double getUsd_rub() {
        return usd_rub;
    }

    public void setUsd_rub(double usd_rub) {
        this.usd_rub = usd_rub;
    }

    public double getEur_rub() {
        return eur_rub;
    }

    public void setEur_rub(double eur_rub) {
        this.eur_rub = eur_rub;
    }
}
