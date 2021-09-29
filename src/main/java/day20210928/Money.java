package day20210928;

import java.util.Objects;

public class Money {
    private int amount;

    public Money() {}

    public Money(int amount) {
        this.amount = amount;
    }

    public void spend(int ticketPrice) {
        amount -= ticketPrice;
    }

    public void earn(int ticketPrice) {
        amount += ticketPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount);
    }
}
