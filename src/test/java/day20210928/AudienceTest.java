package day20210928;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AudienceTest {
    @DisplayName("티켓을 구매한 후 고객의 돈 감소 여부 확인")
    @Test
    void buy() {
        Audience audience = new Audience();

        int ticketPrice = 1500;
        audience.buyTicket(ticketPrice);

        assertThat(audience.money()).isEqualTo(new Money(-1500));
    }
}