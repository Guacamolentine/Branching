package ua.ithilel.java;

public class Main {

    public static void main(String[] args) {

        CreditCard client = new CreditCard();

        client.cardNumber = "897837459953985739";
        client.owner = "Valentine Yuirievich";
        client.type = "VISA";

        switch (client.type) {
            case "VISA":
            case "MASTERCARD":
                System.out.println("Dear " + client.owner + " congratulations, you are using a normal card");
                break;
            case "WORLD":
                System.out.println("Dear " + client.owner + " FUCK YOU WITH YOUR russian WARSHIP!!!");
                break;
            default:
                System.out.println("Unknown card type " + client.type);
        }
    }
}
