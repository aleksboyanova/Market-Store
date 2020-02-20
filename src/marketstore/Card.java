package marketstore;

public class Card {
    private double turnover;
    private double initialDiscountRate;
    private Owner owner;

    public Card(Owner owner, double turnover, double initialDiscountRate) {
        this.owner = owner;
        this.turnover = turnover;
        this.initialDiscountRate = initialDiscountRate;
    }

    public void setInitialDiscountRate(double initialDiscountRate) {
        this.initialDiscountRate = initialDiscountRate;
    }

    public double getTurnover() {
        return turnover;
    }

    public double getInitialDiscountRate() {
        return initialDiscountRate;
    }
}