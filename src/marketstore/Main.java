package marketstore;

public class Main {
    public static void main(String[] args) {

        //Creating a instances of an owner and a card
        //Calculating the individual card information and printing

        Owner owner = new Owner("Peter", "Dimitrov");
        Card card = new BronzeCard(owner, 0, 0);
        double purchaseValue = 150;
        double total = PayDesk.getTotalPurchaseValue(purchaseValue, card);
        double discount = PayDesk.getDiscount(purchaseValue, card);
        double discountRate = PayDesk.getDiscountRate(card, card.getInitialDiscountRate(), card.getTurnover());
        PayDesk.print(card, purchaseValue, discountRate, discount, total);


        owner = new Owner("Alexander", "Iliev");
        card = new SilverCard(owner, 600, card.getInitialDiscountRate());
        purchaseValue = 850;
        total = PayDesk.getTotalPurchaseValue(purchaseValue, card);
        discount = PayDesk.getDiscount(purchaseValue, card);
        discountRate = PayDesk.getDiscountRate(card, card.getInitialDiscountRate(), card.getTurnover());
        PayDesk.print(card, purchaseValue, discountRate, discount, total);


        owner = new Owner("Anna", "Marinova");
        card = new GoldCard(owner, 1500, card.getInitialDiscountRate());
        purchaseValue = 1300;
        total = PayDesk.getTotalPurchaseValue(purchaseValue, card);
        discount = PayDesk.getDiscount(purchaseValue, card);
        discountRate = PayDesk.getDiscountRate(card, card.getInitialDiscountRate(), card.getTurnover());
        PayDesk.print(card, purchaseValue, discountRate, discount, total);
    }
}