package atm;

public class ATM {
    private Bill fistBill;

    public ATM() {
        Bill bill5 = new Bill5();
        Bill bill10 = new Bill10();
        Bill bill20 = new Bill20();

        bill20.setNext(bill10);
        bill10.setNext(bill5);
        fistBill = bill20;
    }
    public void  process(int amount) {
        fistBill.process(amount);
    }
}
