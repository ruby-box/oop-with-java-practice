package tdd.common;

public class MathOperator {
    /**
     * 해당 연산자 calculate 수행
     * @param nowUnit
     * @param nextUnit
     * @param result
     * @return
     */
    public static int excuteOperation(String nowUnit, String nextUnit, int result) {
        Operator operator = Operator.findOperator( nowUnit );
        if( operator != null )
            return operator.calculate(result , Integer.parseInt(nextUnit));

        return result;
    }
}
