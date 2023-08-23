public class RewardValue {
    double cash;
    int miles;
    RewardValue(double cash){
        this.cash=cash;
    }
    RewardValue(int miles){
        this.miles=miles;
    }
    double getCashValue(){
        cash=miles*0.0035;
        return cash;
    }
    int getMilesValue(){
        miles= (int) (cash/0.0035);
        return miles;
    }
}
