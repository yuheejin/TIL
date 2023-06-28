# 배열

## 1. 선언 방법
```java
int [] lottoNumbers;

int lottoNumbers[];

int [] lottoNumbers = new int[7];   // int형의 데이터를 7개 넣을 수 있는 배열 선언 
        
int [] lottoNumbers;
lottoNumbers = new int[7];

int [] lottoNumbers = {1, 10, 12, 24, 33, 45, 31};

int [] lottoNumbers;
lottoNumbers = {1, 10, 12, 24, 33, 45, 31};     // compile error
```

- index는 0부터 시작한다.
```java
int [] lottoNumbers = {1, 10, 12, 24, 33, 45, 31};
System.out.println(lottoNumbers[0]);        // 1이 출력됨
System.out.println(lottoNumbers[6]);        // 31이 출력됨
```
<br>

***
## 2. 기본값
```
byteArray[0] = 0
shortArray[0] = 0
intArray[0] = 0
longArray[0] = 0
floatArray[0] = 0.0
doubleArray[0] = 0.0
charArray[0] =          // '\u0000' 인 공백이다.
booleanArray[0] = false

stringArray[0] = null   // new를 써서 생성자를 호출한 경우 기본값은 null이다.
```
<br>

***
## 3. 2차원 배열
배열의 배열
```java
int [][]twoDim;
int [] twoDim[];
int twoDim[][];

int [][]twoDim = {{1,2,3}, {4,5,6}};

int [][] twoDim = new int[2][3];
twoDim[0][0] = 1;
twoDim[0][1] = 2;
twoDim[0][2] = 3;
twoDim[1][0] = 4;
twoDim[1][1] = 5;
twoDim[1][2] = 6;
```
<br>

***
## 4. 배열의 길이
.length
```java
int[] oneDim = new int[3];
int[][] twoDim = new int[4][2];
System.out.println(oneDim.length);      // 3
System.out.println(twoDim.length);      // 4
System.out.println(twoDim[0].length);   // 2
```
<br>

***
## 5. 배열을 위한 for 문
- JDK 5부터 사용 가능하다.
- 기본 문법
```java
for ( 타입이름 임시변수명 : 반복대상객체 ) {
}
```
- 예시
```java
int[] oneDim = new int[]{1,2,3,4,5,6,7,8,9,10};
for(int data : oneDim) {
    System.out.println(data);
}
```
```java
int [][]twoDim = {{1,2,3},{4,5,6}};
int oneCounter = 0;
for(int[] dimArray : twoDim) {
    int twoCounter = 0;
    for(int data : dimArray) {
        System.out.println(data);
        twoCounter++;
    }
    oneCounter++;
}
```
