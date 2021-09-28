package ticket.objectbook;

public class TicketSeller {
    private TicketOffice ticketOffice;


    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }

    public void sellTo(Audience audience) {
//        Ticket ticket = ticketOffice.getTicket();
//        Long fee = audience.buy(ticket);
//        ticketOffice.plusAmount(fee);
        ticketOffice.sellTicketTo(audience);
    }
}
