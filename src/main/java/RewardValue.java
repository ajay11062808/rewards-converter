public class RewardValue {
    private final double cash;
    public static final double CONVERSION_RATE = 0.0035;
    public RewardValue(double cash){
        this.cash=cash;
    }
    public RewardValue(int miles){
        this.cash=cashConvert(miles);
    }
   private static int milesConvert(double cashValue) {
        return (int) (cash / CONVERSION_RATE);
    }

    private static double cashConvert(int miles) {
        return milesValue * CONVERSION_RATE;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return milesConvert(this.cashValue);
    }
}
