# OOP_WITH_JAVA

This repository is for practicing OOP using java

## 1. Calculator
> 사칙연산이 가능한 계산기 구현
#### 1) 기능 요구 사항
* 덧셈, 뺄셈, 곱셈, 나눗셈에 대한 테스트 코드 우선 작성
* 해당 테스트들에 프로덕션 코드 작성

#### 2) 확인 사항
* TestCase 클래스를 상속받아 테스트 코드 작성
* @Before, @Test 의 실행 순서 및 각 테스트 코드별 실행 순서 확인
* TestCase를 사용한 코드에서 assertj의 assertThat을 사용하는 코드로 수정 후, 차이점 비교

#### 3) 관련 사항 정리 URL [[정리]()]
-----------------
## 2. String Calculator
> 문자열 사칙 연산 계산기 구현
#### 1) 기능 요구 사항
* 사용자가 입력한 문자열에 따라 사칙 연산을 수행하는 계산기 구현.
* 사칙 연산의 연산자 우선 순위가 아닌 입력 순서에 따라 계산한다. (ex) 2 + 3 * 2 -> 10) 
#### 2) 프로그래밍 요구 사항
* 한 메서드에 오직 한 단계의 들여쓰기만 할 것
* else 키워드를 사용하지 말 것
#### 3) 추가 요구 사항(선택 사항)
* 사칙 연산을 구현하면 4개의 if문을 사용하는 코드가 발생하는데, 자바의 다형성을 이용하여 if문을 모두 제거해볼 것.
#### 4) 관련 사항 정리 URL [[정리]()]
-----------------
## 3. String Add Calculator
> 문자열 덧셈 계산기
#### 1) 기능 요구 사항
* 쉼표(,) 또는 콜론(:)을 구분자로 갖는 문자열을 전달하는 경우, 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
* 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 “//”와 “\n” 사이에 위치하는 문자를 커스텀 구분자로 사용한다. 예를 들어 “//;\n1;2;3”과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
* 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw한다.
#### 2) 프로그래밍 요구 사항
* 한 메서드에 오직 한 단계의 들여쓰기만 할 것
* else 키워드를 사용하지 말 것
* indent(들여쓰기) depth를 2단계에서 1단계로 줄여라. depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 depth가 2단계가 된다.
* 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
* method가 한 가지 일만 하도록 최대한 작게 만들어라.
* else를 사용하지 마라.
#### 3) 관련 사항 정리 URL [[정리]()]
-----------------
## 4. Racing Game
> 간단한 자동차 경주 게임을 구현한다.
### STEP. 1
#### 1) 기능 요구 사항
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지 입력할 수 있어야 한다.
* 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
* 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.
#### 2) 프로그래밍 요구 사항
* 메소드가 너무 많은 일을 하지 않도록 분리하기 위해 노력해 본다.
* else 예약어를 쓰지 않는다.
* 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
#### 3) 실행 결과
* 위 요구사항에 따라 3대의 자동차가 5번 움직였을 경우 프로그램을 실행한 결과는 다음과 같다.
```
자동차 대수는 몇 대 인가요?
3
시도할 회수는 몇 회 인가요?
5

실행 결과
-
-
-

--
-
--

---
--
---

----
---
----

----
----
-----
```
#### 4) 힌트
* else 예약어를 쓰지 않는다. - 다음 코드와 같이 바로 return 문을 사용하면 된다.
```
  public int add(String text) {
      if (text == null || text.isEmpty()) {
          return 0;
      }

      return Integer.parseInt(text);
  }
```
* 모든 로직에 단위 테스트를 구현한다. 단, UI(System.out, System.in) 로직은 제외
    * 핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 구분한다.
    * UI 로직을 InputView, ResultView와 같은 클래스를 추가해 분리한다.
* 랜덤 값은 자바 java.util.Random 클래스의 nextInt(10) 메소드를 활용한다.
* 기본 뼈대 클래스는 다음 코드로부터 시작할 수 있다. 배열을 사용하는 것이 싫다면 ArrayList를 사용하는 것도 좋은 방법이다.
```
public class RacingGame {
  private int time;
  private int[] carPositions = {0, 0, 0};

  public int[] move() {
    // TODO 구현
  }
}
```

> 레이싱 게임 UML [이동](https://www.draw.io/?state=%7B%22ids%22:%5B%221CFZINbjVneCibnjpzMsNQP5EoNYEBhth%22%5D,%22action%22:%22open%22,%22userId%22:%22113946954000195770550%22%7D#G1CFZINbjVneCibnjpzMsNQP5EoNYEBhth)
