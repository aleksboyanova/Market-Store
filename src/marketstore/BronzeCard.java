package marketstore;

public class BronzeCard extends Card {

    public BronzeCard(Owner owner, double turnover, double initialDiscountRate) {
        super(owner, turnover, initialDiscountRate);
        super.setInitialDiscountRate(0);
    }


}
