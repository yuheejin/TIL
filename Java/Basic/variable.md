# 변수 (variable)
어떠한 형태의 값을 저장해두는 것을 변수라고 한다.

***
## 1. 변수의 종류
- 지역 변수 *local variables*
  - 지역변수를 선언한 중괄호 내에서만 유효하다.
- 매개 변수 *parameters*
  - 메소드가 호출될 때 생성되며, 메소드가 종료되면 소멸된다.
- 인스턴스 변수 *instance variables*
  - 객체가 생성될 때 생성되며, 객체를 참조하는 다른 객체가 없으면 소멸된다.
- 클래스 변수 *class variables*
  - static이 붙는다.
  - 클래스가 처음 호출될 때 생성되며, 자바 프로그램이 끝나면 소멸된다.
  
```java
public class VariableTypes {
    int 인스턴스_변수;
    static int 클래스_변수;
    public void method (int 매개_변수) {
        int 지역_변수;
    }
}
```

***
## 2. 변수 명명 규칙
- 길이 제한은 없다.
- 문자는 유니코드 문자, 알파벳, 숫자, $, _만 올 수 있다.
- 첫문자에는 일반적으로 $와 _로 시작하지 않으며, 숫자가 올 수 없다. 
- 보통 첫번째 단어는 소문자로 시작하고, 두번째 단어부터는 첫문자만 대문자로 시작한다.
  - 낙타 표기법 *camelCase* 라고도 불린다.
  - 형태가 마치 낙타등의 혹처럼 생겼기 때문이다.
- 상수 *constant value*는 모두 대문자로 지정하며, 단어와 단어 사이에는 _로 구분한다.
  - 상수는 절대 변하지 않는 값을 의미한다.
```java
thisIsJava
THIS_IS_JAVA //상수
thisIsJava1
```

***
## 3. 자료형
### 3.1. 기본 자료형 *Primitive data type*
  - 정수형 : `byte`, `short`, `int`, `long`, `char`
  - 소수형 : `float`, `double`
  - 기타 : `boolean`  
  - bsil fd (비실한 FD) 로 외우기  
<br>

#### 3.1.1. 정수형

| 타입      | 기본값 |                         최소 |                        최대 | 최소 (2진법) | 최대 (2진법) |
|---------|:---:|---------------------------:|--------------------------:|:--------:|:--------:|
| `byte`  |  0  |                       -128 |                       127 |   -2^7   |  2^7-1   |
| `short` |  0  |                    -32,768 |                    32,767 |  -2^15   |  2^15-1  |
| `int`   |  0  |             -2,147,483,648 |             2,147,483,647 |  -2^31   |  2^31-1  |
| `long`  |  0  | -9,223,372,036,854,775,808 | 9,223,372,036,854,775,807 |  -2^63   |  2^63-1  |
| `char`  |     |               0 ('\u0000') |          65,535('\uffff') |    0     |  2^16-1  |

- `byte` : 8비트 부호가 있는 타입이다. <br>
- `long` : int 범위를 넘어섰을 때, 맨 끝에 L을 붙여야 한다.
```java
long longMax = 9223372036854775807L; // 자바에서는 숫자를 명시하면 int로 인식하기 때문에
```
- `char` : 기본값은 '공백' 이다.
```java
char a = 'a';
char b = '가';       // 한글은 대부분 2바이트로 표현하며 유니코드에 포함되어 있어 사용가능함
char c = '\u0018';
char d = 999;
```
<br>

#### 3.1.2. 소수형
- `float` : single-precision 32-bit IEEE 754 floating point <br>
  부호 (1자리) + 지수 (8자리) + 가수(23자리) = 32비트
- `double` : double-precision 64-bit IEEE 754 floating point <br>
  부호 (1자리) + 지수 (11자리) + 가수(52자리) = 64비트
- 돈과 같이 중요한 부분에서는 이 타입들을 사용하면 안된다. <br>
제공할 수 있는 범위를 넘어서면 그 값의 정확성을 보장하지 못하기 때문이다.   
<br>

#### 3.1.3. boolean
- `true` 와 `false`
- 기본값은 `false` 이다.

<br>

### 3.2. 참조 자료형 *Reference data type*