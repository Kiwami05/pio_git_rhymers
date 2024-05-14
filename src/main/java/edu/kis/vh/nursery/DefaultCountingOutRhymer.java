package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_NUMS = 12;
    private final int[] numbers = new int[MAX_NUMS];

    public static final int ERR_CODE = -1;

    public static final int START_AMOUNT = -1;
    public int total = START_AMOUNT;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == START_AMOUNT;
    }

    public boolean isFull() {
        return total == MAX_NUMS - 1;
    }

    protected int getTopElement() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return ERR_CODE;
        return numbers[total--];
    }

}
