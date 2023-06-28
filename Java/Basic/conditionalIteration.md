# 조건문
## 1. if 문
- 기본 공식
```java
if( boolean 값 ) 처리문장1;  
else if 처리문장2;  
else 처리문장3;
```
- 처리문장은 `{ }`를 활용하면 여러 코드를 실행시킬 수 있다.
```java
if(point > 90) System.out.println("A");
else if(point > 80) System.out.println("B");
else {
    System.out.println("F");
    System.out.println("분발하세요.");
}
```
### 1.1. 삼항 연산자 `? :`
- 기본 공식  
```java
boolean 값 ? 처리문장1 : 처리문장2;
```
- boolean 값이 true면 처리문장1을, false면 처리문장2를 실행한다.
```java
System.out.println(point>80 ? "Good" : "Bad");

String result = point>90 ? "A" : point>80 ? "B" : "F";
```
<br>

***
## 2. switch 문
- 기본 공식  
```java
switch( 비교대상변수 ) {
    case 점검값1:
        처리문장1;
        ...;
        break;
    case 점검값1:
        처리문장2;
        ...;
        break;
    default:
        기본처리문장;
        ...;
        break;
}
```
- 비교대상변수가 점검값과 같으면 `:` 뒤에 있는 문장을 처리한다.
- `break`를 만나면 현시점에서 가장 가까운 `{ }`를 벗어난다.
- `default`는 위에서 조건을 찾지 못했을때 실행된다.
- `break`를 쓰지 않았을 경우 예시
```java
switch (numberOfWheel) {
    case 1:
        System.out.println(numberOfWheel + " : It is one foot bicycle.")
    case 2:
        System.out.println(numberOfWheel + " : It is a motor cycle or bicycle.")
    case 4:
        System.out.println(numberOfWheel + " : It is a car.")
        break;
    default:
        System.out.println(numberOfWheel + " : It is an expensive car.")
        break;
}
```
numberOfWheel이 1일 경우,아래와 같이 출력된다.
```
1 : It is one foot bicycle.
1 : It is a motor cycle or bicycle.
1 : It is a car.
```
switch 문에서는 한번 조건을 만족시켰다면, 다음 break가 올때까지, 어떤 case가 오든 상관 안하고 실행한다.

- 좋은 예시
```java
switch(month) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        System.out.println(month + " has 31 days.");
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        System.out.println(month + " has 30 days.");
        break;
    case 2:
        System.out.println(month + " has 28 or 29 days.");
        break;
    default:
        System.out.println(month + " is not a month.");
        break;
}
```
<br>

***
## 3. for 문
- 기본 공식
```java
for ( a초기화; b종료조건; d조건 값 증가 ) {
    c처리문장;
    ...
}
e
```
a - b - c - d - b - c - d - b - e  
종료 조건에 맞으면 for문을 빠져나온다.  
<br>

***
## 4. while 문
- 기본 공식
```java
while( boolean 조건 ) {
    처리문장;
    ...
}
```
- 예시
```java
int loop = 1;
while(loop<8) {
    loop++;
    if(loop == 5) continue;
    System.out.println("line num is " + loop);
}
```
여기서 `continue`는 다음행을 실행시키지 않고 다음 반복으로 넘어가라는 예약어다.  
따라서 결과는 아래와 같다.
```
line num is 1
line num is 2
line num is 3
line num is 4
line num is 6
line num is 7
```
### 4.1. do-while 문
- 적어도 한번은 실행시키고 싶을 때 사용한다.
- 기본 공식
```java
do {
    처리문장;
    ...
} while( boolean 조건 );
```
처리문장을 모두 실행한 뒤, 조건을 따지고 true면 처리문장을 실행하고 false면 반복문을 나간다.
- 예시
```java
int loop = 1;
do{
    loop++;
    System.out.println("line num is " + loop);
} while (loop<8);
```
<br>

***
## 5. label
- 두개 이상의 for이나 while 루프가 있을때 사용된다.
- 예시
```java
startLabel:
for(int level=2; level<10; lever++) {
    for(int unit=1; unit<10; unit++) {
        if(unit == 4) continue startLabel;
        System.out.println(level + "*" + unit + "=" + level*unit);
    }
}
```
4번째 줄의 startLabel이 실행되면 1번째 줄의 startLabel 위치로 돌아간다.