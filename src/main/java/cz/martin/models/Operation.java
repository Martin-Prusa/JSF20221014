package cz.martin.models;

public enum Operation {
    Plus('+'),
    Minus('-'),
    Times('*'),
    Divide('/');
    private final char operator;
    Operation(char operator) {
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }
}
