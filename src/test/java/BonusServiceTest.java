import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void sholdCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 1000;
        boolean registered = true;
        int expected = 30; //ожидаемый

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 1_000_000;
        boolean registered = true;
        int expected = 500; //ожидаемый

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sholdCalculateForNoRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 1000;
        boolean registered = false;
        int expected = 10; //ожидаемый

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateForNoRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные
        long amount = 1_000_000;
        boolean registered = false;
        int expected = 500; //ожидаемый

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
