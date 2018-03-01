package tdd.common.helper;

/***
 * 역할 : 문자열 관련 처리하는 공통 클래스
 */
public class StringHelper {
    public static String removeSpace(String s) {
        return s.replaceAll(" ", "");
    }
}
