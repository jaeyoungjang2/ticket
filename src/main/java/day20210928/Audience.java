package day20210928;

public class Audience {

    private final Bag bag;
    private final Money money;
    private final Invitation invitation;

    public Audience() {
        this.invitation = new Invitation();
        this.money = new Money();
        this.bag = new Bag();
    }

    public void buyTicket(int ticketPrice) {
        money.spend(ticketPrice);
    }

    public Money money() {
        return money;
    }
}
