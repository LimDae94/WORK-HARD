# 오버로딩(overloading)


<br>

## 4.1 오버로딩이란?

메서드도 변수와 마찬가지로 같은 클래스 내에서 서로 구별될 수 있어야 하기 때문에 각기 다른 이름을 가져야 합니다. 그러나 자바에서는 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메서드가 있더라도 **매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 메서드를 정의**할 수 있습니다.

이처럼 한 클래스 내에 같은 이름의 매서드를 여러 개 정의하는 것을 **메서드 오버로딩(method overloading) 또는 오버로딩(overloading)**이라고 합니다. 하나의 메서드 이름으로 여러 기능을 구현하기 때문에 붙여진 이름이라 생각하실 수 있습니다.

> overloading	vt. 과적하다; 너무 많이 주다[부과하다]; n. 지나치게 많음, 과부하





<br>







## 4.2 오버로딩의 조건

<br>

> 1. **메서드 이름이 같아야 한다.**
> 2. **매개변수의 개수 또는 타입이 달라야 한다.**

오버로딩된 메서드들은 매개변수에 의해서만 구별될 수 있으므로 **반환 타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다는 것에 주의**해야 합니다.

<br>

## 4.3 오버로딩의 예

<br>

> `println` 메서드는 대표적인 오버로딩이다.

~~~java
void println()
void println(boolean x)
void println(char x)
void println(char[] x)
void println(double x)
void println(float x)
void println(int x)
void println(long x)
void println(Object x)
void println(String x)
~~~

실제로, `println`메서드를 호출할 때 매개변수로 지정하는 값의 타입에 따라서 호출되는 `println`메서드가 달라집니다! 지금까지 이렇게  사용해왔다는 것을 알게 되니까 신기하죠? `PrintStream`클래스에는 어떤 종류의 매개변수를 지정해도 출력할 수 있도록 위의 코드와 같이 10개의 오버로딩된 `println`메서드를 정의하고 있습니다. `println`메서드를 호출할 때 매개변수로 넘겨준 값의 타입에 따라서 위의 오버로딩된 메서드들 중의 하나가 선택되어서 실행되는 것입니다.

<br>

오버로딩이 안되는 경우도 보겠습니다. 변수 이름이 같아야 하고, 매개변수의 개수 또는 타입이 달라야 합니다. 쉬운 예부터 살펴볼까요?

~~~ java
// 오버로딩 안되는 예제
int add(int a, int b) { return a+b; }
int add(int x, int y) { return x+y; }
~~~

매개변수의 개수 또는 타입이 다른 것이 아니라 **매개변수의 이름이 다릅니다!** 당연하게도 오버로딩이 성립 되지 않습니다.

<br>

~~~java
// 오버로딩 안되는 예제
int add(int a, int b) { return a+b; }
long add(int x, int y) { return (long)(a+b); }
~~~

매개변수의 개수 또는 타입이 다른 것이 아니라 **리턴타입만 다릅니다!** 당연하게도 오버로딩이 성립 되지 않습니다. 이유는 간단해요. **매개변수의 타입과 개수가 일치하기 때문에 컴파일하면 어떤 메서드가 호출될 것인지를 결정할 수가 없습니다.**

<br>

~~~java
// 오버로딩 성공 예제
long add(int a, long b) { return a+b; }
long add(long x, int y) { return (long)(a+b); }
~~~

두 메서드 모두 `int`, `long`형 매개변수가 하나씩 선언되어 있습니다. 비슷하면서도 안비슷하네요... 이 경우에는 오버로딩이 맞습니다! 왜냐하면 **메서드를 호출할 때 매개변수의 값에 의해 호출될 메서드가 구분될 수 있으므로, 중복된 메서드가 아닙니다.** 이렇게 작성하면 사용자가 매개변수의 순서를 외우지 않아도 되는 장점이 있지만, 흔하게 오류가 발생합니다. 만약, `add(3, 3)`과 같이 호출되면 컴파일이 어느 메서드를 호출할 지 알 수 없습니다.



<br>

## 4.4 오버로딩의 장점

이미 오버로딩된 `println`메서드 하나만으로 장점은 크게 와닿고 있지 않나요? 하나의 이름으로 정의하니까 기억하기도 쉽고, 사용하기도 쉬운 장점이 있습니다. 아래에서는 한 번 오버로딩 찐~~~하게 코드로 학습하는 시간 가져볼까요?

```java
public class OverloadingTest {
    public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
        System.out.println("mm.add(3, 3) 결과: " + mm.add(3, 3));
        System.out.println("mm.add(3, 3L) 결과: " + mm.add(3, 3L));
        System.out.println("mm.add(3L, 3) 결과: " + mm.add(3L, 3));
        System.out.println("mm.add(3L, 3L) 결과: " + mm.add(3L, 3L));

        int[] a = {100, 200, 300};
        System.out.println("mm.add(a) 결과: " + mm.add(a));
    }
}

class MyMath3 {
    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }
    long add(int a, long b) {
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }
    long add(long a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }
    long add(long a, long b) {
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }
    int add(int[] a) {
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for (int i = 0;i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}

```



<br>



## 4.5 가변인자(varargs)와 오버로딩

JDK1.5 이전에는 메서드의 매개변수 개수가 고정적이었습니다. 이후에는 동적으로 지정해 줄 수 있게 되었으며, 이 기능을 **가변인자(variable arguments)**라고 합니다.

> 가변인자는 `타입... 변수명` 형식으로 선언하고, `PrintStream`클래스의 `printf()`가 대표적이다.
>
> `public PrintStream printf(String format, Object... args) { ... }`

가변인자 외에도 매개변수가 더 있을 경우, 가변인자를 매개변수 중에서 제일 마지막에 선언해야 합니다. 그렇지 않으면, 컴파일 에러가 발생합니다. 가변인자인지 아닌지를 구별할 수 있는 방법이 없기 때문에 허용하지 않는 것입니다.





<br>





**가변인자는 동적으로 매개변수의 개수를 지정**할 수 있다는데, 어떻게 사용될까요? 예를 들어서, 여러 문자열을 하나로 결합하여 반환하는 `concatenate`메서드를 작성으로 설명하겠습니다.

```java
String concatenate(String s1, String s2) { ... }
String concatenate(String s1, String s2, String s3) { ... }
String concatenate(String s1, String s2, String s3, String s4) { ... }
```

메서드의 매개변수 개수가 고정적이니까, 가독성도 떨어질 뿐더러 호출할 때 마다 매개변수 개수를 전부 작성해야 됩니다. 이럴 때, 가변인자를 사용하면 메서드 하나로 간단히 대체를 할 수 있습니다.

``` java
String concatenate(String ... str) { ... }
```

가변인자 사용으로 메서드를 호출할 때는 아래처럼 인자의 개수를 가변적으로 작성할 수 있습니다. 심지어는 인자가 아예 없어도 되고, 배열도 인자가 될 수 있습니다! 활용할 수 있는 범위가 대폭 증가할 수 있죠?

```java
System.out.println(concatenate());	// 인자가 없어도 가능
System.out.println(concatenate("a"));	// 인자 1개
System.out.println(concatenate("a", "b"));	//	인자 2개
System.out.println(concatenate(new String[]{"A", "B"}));	// 배열도 가능
```

<br>

가변인자는 어떻게 동적으로 매개변수를 지정할 수 있을까요? 그 이유는 내부적으로 배열을 이용하기 때문입니다. 그래서 가변인자가 선언된 메서드를 호출할 때마다 배열이 새로 생성됩니다. 가변인자가 편리하지만, **이런 비효율이 숨어있으므로 꼭 필요한 경우에만** 가변인자를 사용해야 됩니다!

<br>

가변인자는 내부적으로 배열을 사용한다고 했는데, 매개변수의 타입을 배열로 하는 것과 어떤 차이가 있을까요?

~~~java
String concatenate(String[] str) { ... }

String result  = concatenate(new String[0]);
String result  = concatenate(null);
String result  = concatenate();

~~~

매개변수의 타입을 배열로 하면, 반드시 인자를 지정해 줘야하기 때문에, 위의 코드에서처럼 인자를 생략할 수 없습니다. 그래서 `null`이나 길이가 `0`인 배열을 인자로 지정해줘야 하는 불편함이 있습니다.

<br>



```java
public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
        System.out.println("[" + concatenate(",", new String[0]) + "]");
        System.out.println("["+concatenate(",") +"]");
    }

    static String concatenate(String delim, String... args) {
        String result = "";

        for (String str : args) {
            result += str + delim;
        }
        return result;
    }
    /*
    	두 오버로딩된 메서드가 구분되지 않아서 발생하는 에러입니다.
    	가변인자를 선언한 메서드를 오버로딩하면, 메서드를 호출했을 때,
    	이와 같이 구별되지 못하는 경우가 발생하기 쉽기 때문에 주의를 해야 합니다. 
    	가능하면 가변인자를 사용한 메서드는 오버로딩 하지 않는 것이 좋습니다.
    */
    /*
        static String concatenate(String ... args) {
        return concatenate("", args);
     */
}

```

<br>

 `concatenate`메서드는 매개변수로 입력된 문자열에 구분자를 사이에 포함시켜 결합해서 반환합니다. 가반인자로 매개변수를 선언했기 때문에 문자열의 개수의 제약없이 매개변수로 지정할 수 있습니다.

~~~java
String[] strArr = new String[]{"100", "200", "300"};
System.out.println(concatenate("-", strArr));

// 위의 코드와 동일한 문장
System.out.println(concatenate("-", new String[]{"1", "2", "3"}));

// 위의 코드와 전혀 다른 문장
System.out.println(concatenate("-", {"1", "2", "3"}));
~~~



# 생성자(constructor)

## 5.1 생성자란?

생성자는 **인스턴스가 생성될 때 호출되는 "인스턴스 초기화 메서드"**입니다. 따라서 인스턴스 변수의 초기화 작업에 주로 사용되며, 인스턴스 생성 시에 실행되어야 할 작업을 위해서도 사용됩니다.

> 인스턴스 초기화란, 인스턴스변수들을 초기화 하는 것을 뜻한다.
>
> 1. 생성자의 이름은 클래스의 이름과 같아야 한다.
> 2. 생성자는 리턴 값이 없다.

```java
클래스이름(타입 변수명, 타입 변수명, ... ) {
	// 인스턴스 생성 시 수행될 코드,
	// 주로 인스턴스 변수의 초기화 코드를 적는다.
}

class Card {
    Card() {	// 매개변수가 없는 생성자
        ...
    }
    
    Card(String k, int num) {	// 매개변수가 있는 생성자
        ...
    }
    ...
}
```

**연산자 `new`가 인스턴스를 생성하는 것이지, 생성자가 인스턴스를 생성하는 것은 아닙니다.**

생성자라는 용어 때문에 오해하기 쉬운데, 생성자는 단순히 인스턴스변수들의 초기화에 사용되는 조금 특별한 메서드일 뿐입니다. 생성자가 갖는 몇 가지 특징만 제외하면 메서드와 전혀 다르지 않습니다. `Card c = new Card();` 수행되는 과정으로 알아보겠습니다.

> `Card c = new Card();`
>
> 1. 연산자 `new`에 의해서 메모리(heap)에 `Card`클래스의 인스턴스가 생성됩니다.
> 2. 생성자 `Card()`가 호출되어 수행됩니다.
> 3. 연산자 `new`의 결과로, 생성된 `Card`인스턴스의 주소가 반환되어 참조변수 `c`에 저장됩니다.

 지금까지 인스턴스를 생성하기위해 사용해왔던 **"클래스이름()"**이 바로 **생성자**였던 것입니다. **인스턴스를 생성할 때는 반드시 클래스 내에 정의된 생성자 중의 하나를 선택하여 지정**해주어야 합니다.

<br>

## 5.2 기본 생성자(default constructor)

1. 모든 클래스에는 반드시 하나 이상의 생성자가 정의되어 있음

2. 생성자가 정의되지 않는 경우, 컴파일러가 제공하는 "기본 생성자(default constructor)"에 의해서 자동적으로 생성

3. 기본 생성자가 컴파일러에 의해서 생성되는 경우는 클래스에 정의된 생성자가 하나도 없을 때 뿐이다.

   ~~~java
   // 컴파일러가 생성하는 기본적인 생성자 형식
   클래스이름() { }
   Card() { }
   ~~~

> 클래스의 "접근 제어자(Access Modifier)"가 `public`인 경우, 기본 생성자로 `public 클래스이름() {}`이 추가됩니다.



<br>

## 5.3 매개변수가 있는 생성자

1. 인스턴스마다 각기 다른 값으로 최기화 되어야하는 경우, 매개변수를 사용한 초기화는 매우 유용

```java
class Car {	// 매개변수 없는 생성자
    String color;
    String gearType;
    int door;
    Car() {}

    Car(String c, String g, int d) {	// 매개변수 있는 생성자
        color = c;
        gearType = g;
        door = d;
    }
}

class Ex6_12 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color    = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4);

        System.out.println("c1 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
    }
}
```

```java
// 출력 결과
c1 color=white, gearType=auto, door=4
c2 color=white, gearType=auto, door=4
```

<br>



## 5.4 생성자에서 다른 생성자 호출하기 - this(), this

> 생성자의 이름으로 클래스이름 대신 `this`를 사용
>
> 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능

