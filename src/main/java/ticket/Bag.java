package ticket;

public class Bag {
    // 가방안에는 돈과, 초대장, 티켓이 있을 수 있다.
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public Bag(Long amount) {
        this.amount = amount;
    }

    // 초대장 보유 여부 판단
    public boolean hasInvitation() {
        return invitation != null;
    }

    // 티켓의 소유 판단
    public boolean hasTicket() {
        return ticket != null;
    }

    // 초대장을 티켓으로 교환
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    // 현금을 감소
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    // 현금을 증가
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
