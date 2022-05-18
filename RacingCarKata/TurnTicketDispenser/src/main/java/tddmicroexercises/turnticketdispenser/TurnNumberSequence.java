package tddmicroexercises.turnticketdispenser;

public class TurnNumberSequence implements ITurnNumberSequence
{
    public static TurnNumberSequence GlobalTurnNumberSequence = new TurnNumberSequence();

    private int turnNumber = 1;

    public int getNextTurnNumber()
    {
        return turnNumber++;
    }
}
