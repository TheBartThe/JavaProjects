package tddmicroexercises.turnticketdispenser;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TicketDispenserTest {

    @Test
    void foo() {
        TicketDispenser dispenser = new TicketDispenser();
        TurnTicket ticket = dispenser.getTurnTicket();
        assertEquals(1, ticket.getTurnNumber());
    }

    @Test
    void testTicketNumberIsInitialValue() {
        TurnNumberSequence turnNumberTest = new TurnNumberSequence();
        TicketDispenser dispenser = new TicketDispenser(turnNumberTest);
        TurnTicket ticket = dispenser.getTurnTicket();
        assertEquals(1, ticket.getTurnNumber());
    }

    @Test
    void testTicketNumberIncreasesByOne() {
        TurnNumberSequence turnNumberTest = new TurnNumberSequence();
        TicketDispenser dispenser = new TicketDispenser(turnNumberTest);
        TurnTicket ticket1 = dispenser.getTurnTicket();
        TurnTicket ticket2 = dispenser.getTurnTicket();
        int ticketNumberOne = ticket1.getTurnNumber();
        int ticketNumberTwo = ticket2.getTurnNumber();
        assertEquals(1, (ticketNumberTwo - ticketNumberOne));
    }

}
