public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();

        int expected = 30; //ожидаемый
        long actual = service.calculate(1_000, true);
        System.out.println("1. " + expected + " == ? == " + actual);

        expected = 10; //ожидаемый
        actual = service.calculate(1_000, false);
        System.out.println("2. " + expected + " == ? == " + actual);

    }
}
