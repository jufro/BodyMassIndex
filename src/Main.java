public class Main {
    public static void main(String[] args) {
        BmiService Bmi = new BmiService();
        double bodyMassIndex = Bmi.calculate(50, 1.60);
        System.out.println(bodyMassIndex);
    }
}
