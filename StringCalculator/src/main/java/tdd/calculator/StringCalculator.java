package tdd.calculator;

import tdd.common.MathOperator;
import tdd.common.Operator;
import tdd.common.helper.StringHelper;

import java.util.*;

/***
 * 문자열 사칙 연산 계산기 구현
 1) 기능 요구 사항
 사용자가 입력한 문자열에 따라 사칙 연산을 수행하는 계산기 구현.
 사칙 연산의 연산자 우선 순위가 아닌 입력 순서에 따라 계산한다. (ex) 2 + 3 * 2 -> 10)

 2) 프로그래밍 요구 사항
 한 메서드에 오직 한 단계의 들여쓰기만 할 것
 else 키워드를 사용하지 말 것

 3) 추가 요구 사항(선택 사항)
 사칙 연산을 구현하면 4개의 if문을 사용하는 코드가 발생하는데, 자바의 다형성을 이용하여 if문을 모두 제거해볼 것.

 4) 관련 사항 정리 URL [정리]
 */
public class StringCalculator {
    List<String> calculateList; //연산 대상 리스트
    String stringEquation;  //입력받은 문자열계산식
    char[] charList;

    public StringCalculator(String stringEquation) {
        this.stringEquation = stringEquation;
        this.calculateList = new ArrayList<>();
    }

    /**
     * 연산자(Operator)로 입력받은 str을 ArrayList로 변환하는 메소드
     * @return
     */
    private void splitStringByOperator() {
        stringEquation = StringHelper.removeSpace(stringEquation);
        charList = stringEquation.toCharArray();

        Operator operator = null;
        int start = 0;

        for( int i=0; i<charList.length; i++) {
            operator = Operator.findOperator( Character.toString(charList[i]) );
            addCalculateList(operator, start, i, false);
            start = getNextNumberIndex(operator, i, start);
        }

        //마지막꺼 따로 넣어주기
        addCalculateList(operator, start, stringEquation.length(), true);
    }

    /***
     * 다음 숫자에 대한 start index 가져오기
     * @param operator
     * @param index
     * @param start
     * @return
     */
    private int getNextNumberIndex(Operator operator, int index, int start) {
        if(operator != null)
            return index + 1;

        return start;
    }

    /**
     * String을 쪼개어 ArrayList에 저장하는 메소드
     * @param operator
     * @param start
     * @param index
     * @param isEnd
     */
    private void addCalculateList(Operator operator, int start, int index, boolean isEnd) {
        if( operator != null ) {
            calculateList.add(stringEquation.substring(start, index));
            calculateList.add(stringEquation.substring(index, index + 1));
        }

        if( isEnd ) {
            calculateList.add(stringEquation.substring(start, index));
        }
    }

    /***
     * StringCalculator 계산 수행 (메인 함수)
     * @return
     */
    public int calculate() {
        splitStringByOperator();

        int result = (calculateList != null && calculateList.size() > 0) ? Integer.parseInt(calculateList.get(0)) : 0;

        for( int i=1; i<calculateList.size() - 1; i++ )
            result = MathOperator.excuteOperation(calculateList.get(i), calculateList.get(i + 1), result);

        return result;
    }
}
