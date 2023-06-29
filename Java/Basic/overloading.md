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
## 3. static
### 3.1. static 메소드
객체를 생성하지 않아도 호출되는 메소드이다.
```java
public class ReferenceStatic {
    public static void main(String args[]) {
        ReferenceStatic.staticMethod();
    }
    public static void staticMethod() {
        System.out.println("This is a staticMethod");
    }
}
```
static이 아닌 변수는 static 메소드에서 사용할 수 없다.

### 3.2. static 변수
```java
public class ReferenceStaticVariable {
    static String name;
    public ReferenceStaticVariable() {}
    public ReferenceStaticVariable(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        ReferenceStaticVariable reference = new ReferenceStaticVariable();
        reference.checkName();
    }
    public void checkName() {
        ReferenceStaticVariable reference1 = new ReferenceStaticVariable("Sangmin");
        System.out.println(reference1.name);
        ReferenceStaticVariable reference2 = new ReferenceStaticVariable("Sungchoon");
        System.out.println(reference1.name);
        System.out.println(reference2.name);
    }
}
```
위의 결과는 아래와 같다.
```java
Sangmin
Sungchoon 
Sungchoon
```
name은 static 변수이다.  
객체가 다르더라도 같은 클래스에서 생성된 객체이므로 같은 값을 가진다.

### 3.3. static 블록
```java
// StaticBlock class
public class StaticBlock {
    static int data = 1;
    public StaticBlock() {
        System.out.println("StaticBlock Constructor");
    }
    static {
        System.out.println("*** First static block. ***");
        data = 3;
    }
    static {
        System.out.println("*** Second static block. ***");
        data = 5;
    }
    public static int getData(){
        return data;
    }
}

// StaticBlockCheck class
public class StaticBlockCheck {
    public static void main(String[] args) {
        StaticBlockCheck check = new StaticBlockCheck();
        check.makeStaticBlockObject();
    }
    public void makeStaticBlockObject() {
        System.out.println("Creating block1");
        StaticBlock block1 = new StaticBlock();
        System.out.println("Created bolck1");
        System.out.println("------------------");
        System.out.println("Creating block2");
        StaticBlock block2 = new StaticBlock();
        System.out.println("Created bolck2");
    }
}
```
위의 결과는 아래와 같다.
```java
Creating block1
*** First static block. ***
*** Second static block. ***
StaticBlock Constructor
Created bolck1
------------------
Creating block2
StaticBlock Constructor
Created bolck2
```

static 블록은 객체가 계속 생성되더라도 처음 딱 한번만 호출된다.
따라서 static 블록은 클래스를 초기화할 때 유용하다.