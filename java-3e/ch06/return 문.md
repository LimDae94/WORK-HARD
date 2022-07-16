

# return 문

> 현재 실행중인 메서드를 종료하고 호출한 메서드로 돌아갑니다.
>
> 모든 메서드에는 적어도 하나 이상의 return문이 있어야 합니다.

<br>

## 반환 타입 없는 경우

<br>

> 반환 타입이 void인 경우, return 생략 가능

지금까지 return문 없이도 아무런 문제가 없었던 이유는, 컴파일러가 메서드의 마지막에 `return;` 을 자동적으로 추가를 한 것입니다!

~~~java
void printGugudan (int dan) {	// 반환 타입이 void 인 printGugudan 메서드 
	for ( int i = 0; i <= 9; i++) {
        System.out.printf("%d * %d = %d\n", dna, i, dan * i);
        
    return;	// 반환 타입이 void 이므로 생략이 가능합니다. -> 컴파일러가 자동 추가    
    }
}
~~~

<br>

## 반환 타입 있는 경우



<br>

> 반환 타입이 있는 경우, return 생략 불가능

~~~java
int multiply(int x, int y) {	// 반환 타입이 int 인 multiply 메서드
	int result = x * y;
    
    return result;	// 반환 타입이 void가 아닙니다! 생략 불가능!
}
~~~



## 메서드 + if문 + 반환

<br>

return을 메서드에 활용하는 경우가 많습니다. 그러나 가끔 실수하는 부분이 발생할 수가 있는데, 사례를 살펴보겠습니다.

~~~java
/* 잘못된 사례 -> 거짓인 경우 return 문 없어서 반환 오류 발생! */
int max(int a, int b) {
    if (a > b) {
        return a; 	// a 가 b 보다 크면 a 를 반환
    }
}
~~~



~~~java
/* 올바른 사례 -> 거짓인 경우도 반환이 가능 */
int max(int a, int b) {
    if (a > b) {
        return a; 	// a 가 b 보다 크면 a 를 반환
    }
    else {
        return b;	// a 가 b 보다 작으면 b 를 반환
    }
}
~~~



## 반환값(return value)

<br>

> 반환값으로 주로 변수를 사용하고 수식을 계산한 결과를 반환하는 경우도 있다.

~~~java
/* 반환값이 동일한 두 메서드 */
int add(int x, int y) {
    int result = x + y;
    return result;
}

int add(int x, int y) {
    return x + y;
}
~~~

~~~java
/* 반환값이 동일한 두 메서드 */
int abs(int x) {
    if ( x >= 0) {
        return x;
    } else {
        return -x;
    }
}

int abs(int x) {
    return x >= 0 ? x : -x;
}
~~~



<br>

### 메서드의 유효성 검사

<br>

> 메서드의 구현부 `{ }` 를 작성할 때, 매개변수의 값이 적절한 것인지 확인을 가장 먼저 해야 된다.
>
> 매개변수의 유효성 검사하는 코드는 반드시 넣는 것을 권장한다.

~~~java
/* 나눗셈 메서드 -> 0으로 나누는 것은 금지되어 있습니다! */
float divide(int x, int y) {	
    if ( y == 0 ) {
        System.out.println(" 0 으로 나눌 수 없습니다. ");
        return 0;
    }
    return x / (float)y;
}
~~~

<br>

## JVM의 메모리 구조

<img src="https://t1.daumcdn.net/cfile/tistory/998961345AC494CE09" alt="자바의 정석 - 객체지향 (2)" style="zoom:67%;" />

<br>

> JVM은 시스템으로부터 프로그램을 수행하는데 필요한 메모리를 할당받고,
>
> 이 메모리를 용도에 따라 여러 영역으로 나누어 관리를 한다.

<br>

### 메서드 영역(method area)

> 해당 클래스의 클래스파일(*.class)을 읽어서 분석하여 클래스에 대한 정보(클래스 데이터)를 저장하는 영역
>
> 클래스의 클래스변수(class cariable)도 이 영역에 함께 생성

<br>

### 힙(heap)

> 인스턴스가 생성되는 공간으로, 프로그램 실행 중 생성되는 인스턴스는 모두 이곳에 생성
>
> 인스턴스변수(instance variable)들이 생성되는 공간

<br>

### 호출스택(call stack 또는 execution stack)

> 메서드의 작업에 필요한 메모리 공간을 제공
>
> 지역변수(매개변수 포함)들과 연산의 중간결과 등을 저장하는데 사용

<br>

### 호출스택의 동작 과정

<br>

<img src="https://velog.velcdn.com/images%2Fqwerspace%2Fpost%2F3be3d304-dc52-4dbc-bee2-42d243f2a94b%2F%ED%99%94%EB%A9%B4%20%EC%BA%A1%EC%B2%98%202021-03-14%20003304.jpg" alt="자바의 정석 - 객체지향4" style="zoom:67%;" />

1. 1️⃣ 메서드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당받는다.
2. 2️⃣ 메서드가 수행을 마치고나면 사용했던 메모리를 반환하고 스택에서 제거된다.
3. 3️⃣ 호출스택의 제일 위에 있는 메서드가 현재 실행 중인 메서드이다.
4. 4️⃣아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드이다.



<br>

~~~java
public class CallStack2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args) 이 시작되었음.");
        firstMethod();
    }

    static void firstMethod() {
        System.out.println("firstMethod() 이 시작되었음.");
        secondMethod();
        System.out.println("firstMethod() 이 끝났음.");
    }

    static void secondMethod() {
        System.out.println("secondMethod() 이 시작되었음.");
        System.out.println("secondMethod() 이 끝났음.");

    }
}
~~~

~~~java
/* 실행 결과 */
main(String[] args) 이 시작되었음.
firstMethod() 이 시작되었음.
secondMethod() 이 시작되었음.
secondMethod() 이 끝났음.
firstMethod() 이 끝났음.
~~~

<br>

## 기본형 매개변수와 참조형 매개변수

<br>

> 기본형(primitive type) ➡️ 기본형의 값이 복사( read only )
>
> - boolean, char, byte, short, int, long, float, double 
>
> 참조형(reference type)➡️ 인스턴스의 주소가 복사 ( read & write )
>
> - class, String, List, StringBuffer, ... 등 기본형을 제외한 나머지 

<br>

### 기본형 매개변수

```java
/* 기본형 매개변수 */

class Data2 { int x; }

class Ex6_7 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x); // 기본형 매개변수로 넘겨준 것
//        change(d);  // 주소를 매개변수로 넘겨준 것
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x) { // 기본형 매개변수
        x = 1000;
        System.out.println("change() : x = " + x);
    }
}
```

~~~java
/* 실행 결과 */
main() : x = 10
change() : x = 1000
After change(d)
main() : x = 10
~~~





<br>

### 참조형 매개변수

~~~java
/* 참조형 매개변수 */ 

class Data2 { int x; }

class Ex6_7 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

//        change(d.x); 에러 발생! 메서드의 매개변수 타입은 Data2 에요... int   
        change(d);  // 주소를 매개변수로 넘겨준 것
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data2 d) { // 참조형 매개변수
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
~~~

~~~java
/* 실행 결과 */
main() : x = 10
change() : x = 1000
After change(d)
main() : x = 1000
~~~

<br>

### 참조형 매개변수 응용

<br>

> 임시적으로 간단히 처리할 때는 별도의 클래스를 선언하는 것보다 배열을 이용할 수 있다.

<br>

### 참조형 매개변수 활용[배열1]

Data 클래스의 인스턴스 대신 길이가 1인 배열 x를 사용해서 변경한 것입니다.

~~~java
public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] x = {10}; // 크기가 1인 배열 선언
        System.out.println("main() : x = " + x[0])

        change(x);
        System.out.println("After change(x)");
        System.out.println("main() : x = " + x[0]);
    }

    static void change(int[] x) {   // 참조형 매개변수
        x[0] = 1000;
        System.out.println("change() : x = " + x[0]);
    }   
}

~~~

~~~java
/* 실행 결과 */
main() : x = 10
change() : x = 1000
After change(x)
main() : x = 1000
~~~



<br>

### 참조형 매개변수 활용[배열2]

~~~java
public class ReferenceParamEx3 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 6, 5, 4};

        printArr(arr);
        sortArr(arr);
        printArr(arr);
        System.out.println("sum = " + sumArr(arr));
    }

    static void printArr(int[] arr) {
        System.out.print("[");

        for (int i : arr) {
            System.out.print(i + ",");
        }
        System.out.println("]");
    }

    static int sumArr(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void sortArr(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}

~~~

~~~java
/* 실행 결과 */
[3,2,1,6,5,4,]
[1,2,3,4,5,6,]
sum = 21
~~~

<br>

### 참조형 매개변수 활용[반환값]

<br>

> 반환값이 있는 메서드를 반환값이 없는 메서드로 바꾸는 방법이 가능하다.
>
> 참조형 매개변수를 활용하면 반환값이 없어도 메서드의 실행결과를 얻어올 수 있다.

메서드는 단 하나의 값만을 반환할 수 있찌만 이것을 응용하면 여러 개의 값을 반환받는 것과 같은 효과를 얻을 수 있습니다.

~~~java
public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();

        int result = r.add(3, 5);
        System.out.println(result);

        int[] result2 = {0};    // 배열을 생성하고 result2[0]의 값을 0 으로 초기화
        r.add(3, 5, result2);   // 배열을 add 메서드의 매개변수로 전달
        System.out.println(result2[0]);
    }

    int add(int a, int b) {
        return a + b;
    }

    void add(int a, int b, int[] result) {
        result[0] = a + b;  // 매개변수로 넘겨받은 배열에 연산결과를 저장
    }
}

~~~

<br>

## 재귀호출(recursive call)

<br>

> 메서드 내부에서 메서드 자시능ㄹ 다시 호출하는 것을 의미한다
>
> 재귀호출 하는 메서드를 "재귀 메서드"라고 부른다

호출된 메서드는 **"값에 의한 호출(call by value)"** 을 통해, 원래의 값이 아닌 복사된 값으로 작업하기 때문에 호출한 메서드와 관계없이 독립적인 작업수행이 가능합니다. 재귀호출은 무한히 자기 자신을 호출하는 특징으로, 반드시 벗어나는 조건문이 필수적입니다.

<br>

### 팩토리얼[재귀호출]

~~~java
public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);
    }

    static int factorial(int i) {	// 재귀 호출 팩토리얼
        int result = 0;
        if (i == 1) {	// i 가 1이 될 때, 더이상 자신을 호출하지 않는다.
            result = 1;
        } else {
            result = i * factorial(i - 1);
        }
        return result;
    }
}

~~~

~~~java
/* 실행 결과 */
24
~~~





<br>

### 팩토리얼[while문]

~~~java
public class FactorialTest2 {
    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);
    }

    static int factorial(int i) {    // while문 팩토리얼
        int result = 1;

        while (i != 0) {
            result *= i--;
        }
        return result;
    }
}

~~~

~~~java
/* 실행 결과 */
24
~~~



<br>

### x의 n제곱[재귀호출]

~~~java
public class PowerTest {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result += power(x, i);
        }
        System.out.println(result);
    }

    static long power(int x, int n) {
        if (n == 1) {
            return x;
        }
        return x * power(x, n - 1);
    }
}

~~~

<br>

## 클래스 메서드(static메서드)와 인스턴스 메서드

<br>

> 메서드 앞에 static이 붙어 있으면 클래스 메서드이다.
>
> static이 없으면, 인스턴스 메서드이다.

**클래스 메서드**

- 클래스변수처럼, 객체를 생성하지 않고도 "클래스이름.메서드이름(매개변수)" 처럼 호출이 가능
- 인스턴스와 관계없는(인스턴스 변수나 인스턴스 메서드를 사용하지 않는) 메서드를 클래스 메서드(static)로 정의



**인스턴스 메서드**

- 반드시 객체를 생성해야만 호출이 가능
- 메서드의 작업을 수행하는데 인스턴스 변수를 필요로 하는 메서드



<br>

클래스를 정의할 때, 어느 경우에 static 을 사용해서 클래스 메서드로 정의해야 할까요?

메서드 중에서 **인스턴스와 관계없는(인스턴스 변수나 인스턴스 메서드를 사용하지 않는) 메서드를 클래스 메서드(static)로 정의**합니다.

- 🚨 클래스 영역에 선언된 변수를 멤버변수라 합니다. ( 클래스변수와 인스턴스변수를 모두 통칭하는 말 ) 
- 🚨 static이 붙은 것은 클래스변수
- 🚨 붙지 않은 것은 인스턴스변수

<br>

1. **클래스를 설계할 때, 멤버변수 중 모든 인스턴스에 공통으로 사용하는 것에 static을 붙이다.**

   - 생성된 각 인스턴스는 독립적이기 때문에 서로 다른 값을 유지합니다. 

     그러나 모든 인스턴스에서 같은 값이 유지되어야 하는 변수는 static 을 붙여서 클래스변수로 정의해야 합니다.

2. **클래스변수 ( static 변수 )는 인스턴스를 생성하지 않아도 사용할 수 있다.**
   - 클래스변수는 클래스가 메모리에 올라갈 때 이미 자동적으로 생성되기 때문입니다.

3. **클래스 메서드( static 메서드 )는 인스턴스 변수를 사용할 수 없다.**

   - 인스턴스변수는 인스턴스가 반드시 존재해야만 사용할 수 있습니다.

     클래스가 메모리에 올라갈 때 자동적으로 인스턴스는 생성되지 않기 때문입니다.

4. **메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다.**

   - 인스턴스변수를 필요로 하지 않는다면 static을 붙이는 것으로, 메서드의 호출시간이 짧아져 성능이 향상됩니다.

   

<br>

> 🐝 클래스의 멤버변수 중 모든 인스턴스에 공통된 값을 유지해야 할 때, static을 붙인다.
>
> 🐝작성한 메서드 중에서 인스턴스 변수나 인스턴스 메서드를 사용하지 않는 메서드에 static 붙이는 것은 고려!

<br>

🐜 random(), Math클래스의 모든 메서드는 모두 클래스 메서드입니다. Math클래스에는 인스턴스변수가 하나도 없고, 작업을 수행하는데 필요한 값들을 모두 매개변수로 받아서 처리하기 때문입니다!

<br>

### Math클래스는 모두 클래스 메서드

~~~java
public class MyMathTest2 {
    long a, b;

    // 인스턴스 메서드
    // 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
    long add() {
        return a + b;
    }  // a, b는 인스턴스 변수

    long subtract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double divide() {
        return a / b;
    }

    // 클래스 메서드
    // 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
    static long add(long a, long b) {
        return a + b;
    }  // a, b는 지역변수

    static long subtract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double divide(long a, long b) {
        return a / (double) b;
    }

}


class Ex6_9 {
    public static void main(String args[]) {
        // 클래스 메서드 호출. 인스턴스 생성없이 호출가능
        System.out.println(MyMathTest2.add(200L, 100L));
        System.out.println(MyMathTest2.subtract(200L, 100L));
        System.out.println(MyMathTest2.multiply(200L, 100L));
        System.out.println(MyMathTest2.divide(200L, 100L));

        MyMathTest2 mm = new MyMathTest2(); // 인스턴스를 생성
        mm.a = 200L;
        mm.b = 100L;
        // 인스턴스 메서드는 객체생성 후에만 호출이 가능함.
        System.out.println(mm.add());
        System.out.println(mm.subtract());
        System.out.println(mm.multiply());
        System.out.println(mm.divide());
    }
}

~~~

~~~java
/ *실행 결과 */
300
100
20000
2.0
300
100
20000
2.0
~~~



<br>

### 클래스 멤버와 인스턴스 멤버간의 참조와 호출

>인스턴스 멤버가 존재하는 시점에 클래스 멤버는 항상 존재한다.
>
>클래스 멤버가 존재하는 시점에 인스턴스 멤버가 존재하지 않을 수 있다.

🚨인스턴스 멤버는 인스턴스 변수와 인스턴스 메서드를 의미합니다.

~~~java
class TestClass {
	void instanceMethod() {}	// 인스턴스 메서드
    static void staticMethod() {}	// 클래스 메서드
    
    void instanceMethod2() {	// 인스턴스 메서드 안에서
        instanceMethod();	// 다른 인스턴스 메서드를 호출 가능
        staticMethod();		// 다른 클래스 메서드를 호출 가능
    }
    
    static void staticMethod2() {	// 클래스 메서드 안에서
        instanceMethod();	// 다른 인스턴스 메서드를 호출 불가능!!
        stataicMethod();	// 다른 클래스 메서드 호출 가능
    }
} // end of class
~~~

🚨인스턴스멤버 간의 호출에는 아무런 영향이 없습니다. 하나의 인스턴스멤버가 존재한다는 것은 인스턴스가 이미 생성되어 있다는 것을 의미하며, 즉 다른 인스턴스멤버들도 모두 존재하기 때문입니다.

<br>

## 한 줄로 작성하는 인스턴스

~~~java
/* 위와 아래의 코드는 동일한 결과를 나타냅니다. */
MemberCall c = new MemberCall();
int result = c.instanceMethod1();

/* 단, 아래는 참조변수 선언이 없으므로, 생성된 MemberCall인스턴스는 더 이상 사용이 안됩니다.*/
int result = new MemberCall().instanceMethod1();
~~~

