package tddmicroexercises.turnticketdispenser;

class TurnNumberSequenceStub implements ITurnNumberSequence {

    private int turnNumber;

    public TurnNumberSequenceStub(int turnNumber) {
        this.turnNumber = turnNumber;
    }

    public TurnNumberSequenceStub() {
        this.turnNumber = 1;
    }

    public int getNextTurnNumber() {
        return turnNumber++;
    }
}
