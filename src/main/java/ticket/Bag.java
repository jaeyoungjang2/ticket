package ticket;

public class Bag {
    private Long amount;
    private Ticket ticket;
    private Invitation invitation;

    public Bag(Long amount) {
        this.amount = amount;
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean hasTicket() {
        return ticket != null;
    }

    public boolean hasInvitation() {
        return invitation != null;
    }

    public Invitation getInvitation() {
        return invitation;
    }

    public void minusAmount(Long fee) {
        amount -= fee;
    }

    public void plusAmount(Long fee) {
        amount += fee;
    }
}
