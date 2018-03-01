package tdd.common;

import java.util.Arrays;

/***
 * 수학 연산자(Operator)에 대한 정보를 처리하기 위한 Enum 클래스
 */
public enum Operator {
    PLUS( "+" ){ int calculate(int v1, int v2) { return v1 + v2;} },
    MINUS( "-" ){ int calculate(int v1, int v2) { return v1 - v2;} },
    MULTIPLY( "*" ){ int calculate(int v1, int v2) { return v1 * v2;} },
    DIVIDE( "/" ){ int calculate(int v1, int v2) { return v1 / v2;} };

    private String expression;

    Operator(String expression) {
        this.expression = expression;
    }

    public static Operator findOperator(String s) {
        return Arrays.stream(Operator.values())
                .filter( operator -> operator.getExpression().equals(s) )
                .findAny()
                .orElse(null);
    }

    public String getExpression() {
        return expression;
    }

    abstract int calculate(int v1, int v2);
}
