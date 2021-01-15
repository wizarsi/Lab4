package prog;

public class AmountException extends RuntimeException{
    private int round;

    public AmountException(int amount){
        System.out.println("Нельзя поместить отрицательное число предметов, " + amount + "!");
        round = Math.abs(amount);
    }

    public int getRound() {
        return round;
    }
}