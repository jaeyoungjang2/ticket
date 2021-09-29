package day20210928;

public class TicketOffice {
    private static final int MARVEL_TICKET_PRICE = 1500;
    private Money money;

    public TicketOffice() {
        this.money = new Money();
    }

    public void sellTicket(int ticketPrice) {
        money.earn(ticketPrice);
    }
}
