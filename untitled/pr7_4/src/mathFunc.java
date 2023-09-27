public class mathFunc implements MathCalculable {
    @Override
    public double complex(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    @Override
    public double pow(double value, int pow) {
        double answer = value;
        for(int i = 0; i < pow - 1; i++){
            answer *= value;
        }
        return answer;
    }
}
