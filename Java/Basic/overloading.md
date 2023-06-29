# Overloading

## 1. 기본 생성자
```java
public class ReferenceDefault {
    public static void main(String[] args) {
        ReferenceDefault reference = new ReferenceDefault();
    }
}
```
클래스 기본생성자를 통해 객체를 생성하였다.  
이처럼 기본생성자는 생성자 메소드를 정의하지 않아도 컴파일할 때 자동으로 정의된다.  
하지만 생성자를 따로 만든다면 기본생성자는 자동으로 정의되지 않는다.  

```java
public class ReferenceString {
    public ReferenceString(String arg){  }
    public ReferenceString() {  }
    public static void main (String[] args) {
        ReferenceString reference = new ReferenceString();
    }
}
```
따라서 위와 같이 생성자를 정의해주어야 한다.
<br>

***
## 2. 메소드 오버로딩 method overloading
메소드의 이름을 같도록 하고, 매개변수만 다르게 하는 것을 **오버로딩**이라고 한다.
```java
public class ReferenceOverloading {
    public static void main(String[] args) {
        ReferenceOverloading reference = new ReferenceOverloading();
    }
    public void prinit(int data) { }
    public void prinit(String data) { }
    public void prinit(int intData, String stringData) { }
    public void prinit(String stringData, int intData) { }
}
```
매개변수의 타입이나 타입의 순서, 타입의 개수가 다르면 다른 메소드로 인식된다.
<br>

***
## 3. static 메소드와 일반 메소드
static 메소드는 객체를 생성하지 않아도 호출되는 메소드이다.
```java
public class ReferenceStatic {
    public static void main(String args[]) {
        ReferenceStatic.staticMethod();
    }
    public static void main(String[] args) {
        System.out.println("This is a staticMethod");
    }
}
```

- static이 아닌 변수는 static 메소드에서 사용할 수 없다.
