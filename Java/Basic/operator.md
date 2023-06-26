# 연산자 (operator)
<br>
## 1. 대입 연산자 *assignment operator* <br>
`=` 왼쪽의 변수에 오른쪽의 값을 대입함

***
<br>

## 2. 산술 연산자 *arithmetic operator*
- `+` : 더하기 연산자 *additive operator* 
- `-` : 빼기 연산자 *subtration operator*
- `*` : 곱하기 연산자 *multiplication operator*
- `/` : 나누기 연산자 *division operator*
- `%` : 나머지 연산자 *remainder operator*
```java
int intValue1 = 53;
int intValue2 = 10;
int result = intValue1 / intValue2;     // 5
int result2 = intValue1 % intValue2;    // 3
```

***
<br>

## 3. 복합 대입 연산자 *compound assignment operator*
- `+=` : 기존 값에 우측 항의 값을 더함
- `-=` : 기존 값에 우측 항의 값을 뺌
- `*=` : 기존 값에 우측 항의 값을 곱함
- `/=` : 기존 값을 우측 항의 값으로 나눔
- `%=` : 기존 값을 우측 항의 값으로 나눈 나머지
```java
int intValue = 10;
intValue += 5;      // 15
```

***
<br>

## 4. 단항 연산자 *unary operator*
- `+` : 단항 플러스 연산자 *unary plus operator*
- `-` : 단항 마이너스 연산자 *unary minus operator*
```java
int intValue = -10;
int result = +intValue;     // -10
result = -intValue;     // 10
```
- `++` : 증가 연산자 *increment operator*
- `--` : 감소 연산자 *decrement operator*
```java
int intValue = 1;
System.out.println(intValue++);     // 1
System.out.println(intValue);       // 2
System.out.println(++intValue);     // 3
```
- `!` : 논리 부정 연산자 *logical complement operator*
```java
boolean flag = true;
System.out.println(flag);       // true
System.out.println(!flag);      // false
```

***
<br>

## 5. 우선순위
애매할때는 괄호`( )`를 사용할 것 <br>

| 구분     | 연산자                       |  우선 순위  |
|--------|---------------------------|:-------:|
| 단항 연산자 | `++` `--` `+` `-` `!` `~` |    1    |
| 산술 연산자 | `*` `/` `%`               |    2    |
| 산술 연산자 | `+` `-`                   |    3    |

***
<br>

## 6. 비교 연산자
### 6.1. 등가 비교 연산자 *equality operator*
모든 기본 자료형과 참조 자료형, 즉 모든 타입에 사용 가능함
- `==` : 같음 *equal to*
- `!=` : 같지 않음 *not equal to*

### 6.2. 대소 비교 연산자 *relational operator*
boolean을 제외한 기본 자료형에서 사용 가능함
- `<` : (왼쪽 값이) 큼 *greater than*
- `>` : (왼쪽 값이) 작음 *less than*
- `<=` : (왼쪽 값이) 같거나 큼 *greater than or equal to*
- `>=` : (왼쪽 값이)같거나 작음 *less than or equal to*

***
<br>

## 7. 논리 연산자 *conditional operator*
- `&&` : AND 결합 *conditional AND*
- `||` : OR 결합 *conditional OR*
```java
boolean x = true;
boolean y = true;
System.out.println( x && y );   //  true
System.out.println( x || y );   //  true

x = false;
System.out.println( x && y );   //  false
System.out.println( x || y );   //  true

y = false;
System.out.println( x && y );   //  false
System.out.println( x || y );   //  false
```  

***
<br>

## 8. 비트 연산자
이 연산자들은 숫자에 사용하면 비트 연산을, boolean 타입 사이에 사용하면 논리 연산을 수행한다.
- `&` : 두 값이 모두 true일 경우에만 true
- `|` : 두 값이 모두 false일 경우에만 false
- `^` : 두 값이 서로 다를 경우에만 true

***
<br>

## 9. 타입 별 사용 가능한 연산자
### 9.1. 결과가 boolean인 경우
* 숫자 비교 연산자 : `<` `<=` `>` `>=`
* 숫자 동등 연산자 : `==` `!=`
### 9.2. 결과가 int나 long인 경우
* 기본 사칙 연산자 : `+` `-` `*` `/` `%`
* 증감 연산자 : `++` `--`
* 비트 연산자 : `&` `|` `^` `~` `<<` `>>` `>>>` <br>
double과 float은 소수형이기 때문에 비트 연산이 불가능하다.
### 9.3. 기타 연산자
  * 삼항 연산자 : `?:`
  * 형 변환 연산자 : `(타입)`
  * 문자열 더하기 연산자 : `+`