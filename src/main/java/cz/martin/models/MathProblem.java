package cz.martin.models;

public class MathProblem {
    private int first;
    private int second;
    private Operation operation;
    private float answer;

    public MathProblem(int first, int second, Operation operation) {
        this.first = first;
        this.second = second;
        this.operation = operation;
    }

    public boolean isValid() {
        if(operation == Operation.Times) return answer == first*second;
        if(operation == Operation.Divide) return answer == (first*1f)/second;
        if(operation == Operation.Plus) return answer == first+second;
        if(operation == Operation.Minus) return answer == first-second;
        return false;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    public Operation getOperation() {
        return operation;
    }

    public float getAnswer() {
        return answer;
    }

    public void setAnswer(float answer) {
        this.answer = answer;
    }
}
