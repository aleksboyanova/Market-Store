package marketstore;

public class GoldCard extends Card {

    public GoldCard(Owner owner, double turnover, double initialDiscountRate) {
        super(owner, turnover, initialDiscountRate);
        super.setInitialDiscountRate(2);
    }
}
