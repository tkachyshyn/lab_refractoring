package atm;

import static org.junit.jupiter.api.Assertions.*;

class DefaultBillTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        int amount = scanner.nextInt();
        ATM atm = new ATM();
    }

    @org.junit.jupiter.api.Test
    void testprocess() {
        assertEqual("", process(amount));
    }
}