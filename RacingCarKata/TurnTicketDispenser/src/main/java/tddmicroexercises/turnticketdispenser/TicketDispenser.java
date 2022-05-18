package tddmicroexercises.turnticketdispenser;

public class TicketDispenser
{
    ITurnNumberSequence turnNumberSequence;

    public TicketDispenser() {
        this.turnNumberSequence = TurnNumberSequence.GlobalTurnNumberSequence;
    }

    public TicketDispenser(ITurnNumberSequence turnNumberSequence) {
        this.turnNumberSequence = turnNumberSequence;
    }

    public TurnTicket getTurnTicket()
    {
        int newTurnNumber = turnNumberSequence.getNextTurnNumber();
        TurnTicket newTurnTicket = new TurnTicket(newTurnNumber);

        return newTurnTicket;
    }
}
