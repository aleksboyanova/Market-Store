package marketstore;

public class SilverCard extends Card {

    public SilverCard(Owner owner, double turnover, double initialDiscountRate) {
        super(owner, turnover, initialDiscountRate);
        super.setInitialDiscountRate(2);
    }
}