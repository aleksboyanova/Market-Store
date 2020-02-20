package marketstore;

public class PayDesk {

    public static double getDiscountRate(Card card, double discountRate, double turnover) {
        String cardType = getCardType(card);

        switch (cardType) {
            case "Gold":
                if (card.getTurnover() < 100) {
                    discountRate = 2;
                }

                //For each $100 from the turnover discount rate grows with 1%, capping at 10%
                //Calculating on discount rate
                double rateOfGrowth = 1;
                double amountOfGrowth = 100;
                int maxRate = 10;

                double additionalRate = rateOfGrowth * (int) (card.getTurnover() / amountOfGrowth);
                discountRate = card.getInitialDiscountRate() + additionalRate;

                if (discountRate > maxRate) {
                    return maxRate;
                }
                break;
            case "Silver":
                discountRate = 2;
                if (turnover > 300) {
                    discountRate = 3.5;
                }
                break;
            case "Bronze":
                if (turnover < 100) {
                    discountRate = 0;
                } else if (turnover >= 100 && turnover <= 300) {
                    discountRate = 1;
                } else {
                    discountRate = 2.5;
                }
                break;
        }

        return discountRate;
    }

    public static double getDiscount(double purchaseValue, Card card) {
        return getDiscountRate(card, card.getInitialDiscountRate(), card.getTurnover()) / 100 * purchaseValue;
    }

    public static double getTotalPurchaseValue(double purchaseValue, Card card) {
        return purchaseValue - getDiscount(purchaseValue, card);
    }

    //Determining the type of card
    private static String getCardType(Card card) {
        String cardType = card.getClass().toString();
        if (cardType.contains("GoldCard")) {
            cardType = "Gold";
        } else if (cardType.contains("SilverCard")) {
            cardType = "Silver";
        } else if (cardType.contains("BronzeCard")) {
            cardType = "Bronze";
        }
        return cardType;
    }

    public static void print(Card card, double purchaseValue, double discountRate, double discount, double total) {
        System.out.printf("%s:%n" +
                "Purchase value: $%.2f%n" +
                "Discount rate: %.1f%%%n" +
                "Discount: $%.2f%n" +
                "Total: $%.2f%n%n", getCardType(card), purchaseValue, discountRate, discount, total);
    }
}

