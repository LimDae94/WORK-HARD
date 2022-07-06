## 배열(array)

<br>

## 1.1 배열(array)이란?

- 배열은 **같은 타입의 여러 변수를 하나의 묶음으로 다루는 것**
- 변수와 다르게 배열은 각 저장 공간이 **연속적**으로 배치되어 있다는 특징

<br>

## 1.2 배열의 선언과 생성

| 선언 방법         | 선언 예                          |
| ----------------- | -------------------------------- |
| 타입[ ] 변수이름; | `int[] score;`, `String[] name;` |
| 타입 변수이름[ ]; | `int socre[];`, `String name[]`  |

<br>

### 배열의 생성

> ```
> 타입[ ] 변수이름;  //배열을 선언(배열을 다루기 위한 참조변수 선언)
> 변수이름 = new 타입[길이]  // 배열을 생성(실제 저장 공간을 생성)
> ```

배열을 선언한 다음에는 배열을 생성해야 합니다. 배열의 선언은 단순히 생성된 배열을 다루기 위한 참조변수를 위한 공간이 만들어질 뿐이고, 배열을 생성해야만 비로소 값을 저장할 수 있는 공간이 만들어지는 것입니다. 배열을 생성하기 위해서는 연산자 `new`와 함께 **배열의 타입과 길이를 지정**해주면 됩니다.

<br>

### 길이가 5인 int 배열

```java
int[] score;  // int타입의 배열을 다루기 위한 참조변수 score 선언
score = new int[5]; // int타입의 값 5개를 저장할 수 있는 배열
```

다음과 같이 **배열의 선언과 생성을 동시에 하면 간략히 한 줄**로 할 수 있는데, 대부분의 경우는 다음과 같이 합니다.

````java
int[] score = new int[5];
타입[] 변수이름 = new 타입[길이];
````

<br>

### 자바에서 배열이 생성되는 순서

1. `int[] score;`

   int형 배열 참조변수 score를 선언합니다. **데이터를 저장할 수 있는 공간은 아직 마련되지 않았습니다.**

2. `score = new int[5];`

   연산자 `new`에 의해서 **메모리의 빈 공간에 5개의 int형 데이터를 저장할 수 있는 공간이 마련됩니다.**

3. 그리고 각 배열요소는 **자동적으로 int의 기본값(default)인 0으로 초기화 됩니다.**

4. 끝으로 대입 연산자'='에 의해 **배열의 주소가 int형 배열 참조변수 score에 저장됩니다.**

이제 참조변수 score를 통해서 생성된 배열에 값을 **저장** 또는 **읽기**를 할 수 있습니다. 이 배열은 **길이가 5인 int 배열이며, 참조변수의 이름을 따서 배열 score라고 부르면 됩니다.**

<br>

## 1.3 배열의 길이와 인덱스

- **배열의 요소(element)**

  생성된 배열의 각 저장공간으로, `배열이름[인덱스]` 형식으로 배열의 요소에 접근이 가능 

- **인덱스(index)**

  배열의 요소마다 붙여진 일련번호, 각 요소를 구별하는데 사용

  인덱스의 범위는 **0부터 배열길이-1** 까지

### <br>

### 배열의 길이

- 배열을 생성할 때, 괄호`[]`안에 배열의 길이를 작성하고 값을 저장할 수 있는 **공간의 개수를 의미**
- 배열의 길이는 **0을 포함한 양의 정수이어야 하며 최대값은 int타입의 최대값**
- 한 번 생성된 배열의 길이 변경이 불가능

```java
int[] arr1 = new int[0];  // 길이가 0인 배열 생성
int[] arr2 = new int[5]; // 길이가 5인 배열 생성
```

<br>

### 배열이름.length

- 자바에서는 JVM이 모든 배열의 길이를 별도로 관리
- **배열이름.length**를 통해서 배열의 길이에 대한 정보를 얻을 수 있음

```java
int[] arr = new int[5]; // 길이가 5인 int배열
int tmp = arr.length; // arr.length의 값은 5이고 tmp에 5가 저장
int[] arr = new int[5];
arr.length = 10;  // 에러! 배열의 길이는 변경이 불가능
```

<br>

### 배열의 길이 변경하기

> 배열의 길이를 변경하는 방법 :
>
> 1. 더 큰 배열을 새로 생성
> 2. 기존 배열의 내용을 새로운 배열에 복사

결론부터 말하자면, **한 번 생성된 배열의 길이는 변경이 불가능**합니다. 따라서 위의 두 가지 방법에 의해서 변경을 해야 됩니다.

<br>

## 1.4 배열의 초기화

> 배열을 초기화 하는 방법
>
> 1. 각 요소마다 값을 지정해서 저장
> 2. for문으로 배열에 값을 저장
> 3. 배열 생성과 초기화를 동시에

배열을 생성과 초기화를 동시에 할 때, 배열의 길이가 자동적으로 결정되기 떄문에 길이를 작성하지 않아도 됩니다. 

````java
// 1. 한 줄로 생성 그리고 초기화할 경우, new int[] 생략 가능
int[] score = new int[]{50, 60, 70, 80, 90};
int[] score = {50, 60, 70, 80, 90}; // new int[]를 생략할 수 있음

// 2. 생성한 후 초기화 따로 할 경우, new int[] 생략이 불가능
int[] score;
int[] score = new int[]{50, 60, 70, 80, 90};  // OK
int[] score = {50, 60, 70, 80, 90}; // 에러! new int[]를 생략할 수 없음
// 1. 매개변수 int배열을 매개변수로 받는 add 메서드는 반드시 new int[] 작성
int add(int[] arr) { /* 내용 생략 */ }

int result = add(new int[]{100, 90, 80, 70, 60}); // OK
int result = add({100, 90, 80, 70, 60});  // 에러! new int[]를 생략할 수 없음
````

<br>

### 배열의 출력

> 1. for문으로 배열 출력
>
> 2. `Arrays.toString(배열이름)` 메서드를 사용(`import.java.util.*`)

````java
int[] Arr = {100, 95, 80, 70, 60};
System.out.println(Arrays.toString(Arr)); // [100, 95, 80, 70, 60]
System.out.println(iArr);	// I@14318bb와 같은 형식의 문자열이 출력
````

`iArr`의 값을 바로 출력하면 예상한 결과와 전혀 다릅니다. 왜 그럴까요? **그 이유는 `iArr`은 참조변수**이기 때문입니다. 참조변수의 특징은 **배열의 주소를 가리키는 특징**이 있다는 것을 다시 복습합니다! 근데 배열을 특이하게도, `타입@주소`의 형식으로 출력이 되는데요. 위의 출력 결과인 `I@14318bb` 통해서 알아보겠습니다. `I`는 int배열이라는 의미를 가지고, `@`뒤에 나오는 16진수는 배열의 주소이지만 실제 주소가 아닌 내부 주소입니다.

이 때, 예외적으로 char배열은 println메서드로 출력하면 각 요소가 구분자없이 그대로 출력되는데, 이것은 **println메서드가 char배열일 때만 이렇게 동작하도록 작성되었기 떄문입니다.** 전체 코드를 통해서 한 눈에 배운 내용들을 정리해보겠습니다.

```java
import java.util.Arrays;

public class Ex5_1 {
    public static void main(String[] args) {
        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//		int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int[] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i=0; i < iArr1.length ; i++ ) {
            iArr1[i] = i + 1; // 1~10의 숫자를 순서대로 배열에 넣는다.
        }

        for (int i=0; i < iArr2.length ; i++ ) {
            iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 값을 배열에 저장
        }

        // 배열에 저장된 값들을 출력한다.
        for(int i=0; i < iArr1.length;i++) {
            System.out.print(iArr1[i]+",");
        }
        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr3);
        System.out.println(chArr);
    }
}

```

```java
/*출력결과*/
1,2,3,4,5,6,7,8,9,10,
[6, 7, 4, 9, 10, 6, 1, 4, 4, 6]
[100, 95, 80, 70, 60]
[a, b, c, d]
[I@4554617c
abcd
```



<br>



## 1.5 배열의 복사

<br>

기억하시나요? 배열은 한 번 생성하게 될 때, 그 길이를 변경할 수 없습니다. 따라서 더 많은 저장공간이 필요하다면 **새로운 배열을 생성 후 내용을 복사**해야 됩니다. 추가적으로, 배열은 참조변수를 통해서만 접근할 수 있기 때문에 **자신을 가리키는 참조변수가 없는 배열은 사용할 수 없습니다**. 이렇게 쓸모없게 된 배열은 JVM의 가비지 컬렉터에 의해서 자동적으로 메모리에서 제거됩니다.

배열을 복사하는 두 번째 방법은 **`System.arraycopy()`를 이용한 배열의 복사**입니다. `for` 문 대신 `System` 클래스의 `arraycopy()`를 사용하면 보다 간단하고 빠르게 배열을 복사할 수 있습니다. `for`문, `System.arraycopy()` 둘의 차이점을 무엇일까요?

- `for`문은 배열의 요소 하나하나에 접근해서 복사합니다.
- `System.arraycopy()`는 지정된 범위의 값들을 한 번에 통째로 복사합니다.

한 번에 복사가 가능한 이유는 **각 요소들이 연속적으로 메모리에 저장되어 있다는 배열의 특성** 때문에 가능한 것입니다!

> 배열의 복사는 `System.arraycopy()`를 사용하는 것이 효율적입니다.

<br>

이 때, **복사하려는 배열의 위치가 적절하지 못하여 복사하려는 내용보다 여유 공간이 적으면 에러(ArrayIndexOutOfBoundException)가 발생**합니다.

<br>

```java
public class Ex5_2 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(abc);
        System.out.println(num);

        // 배열 abc와 num을 붙여서 하나의 배열 (result)로 만든다.
        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);

        // 배열 abc을 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
        System.arraycopy(abc, 0, num, 0, abc.length);
        System.out.println(num);

        // number의 인덱스 6 위치에 3개를 복사
        System.arraycopy(abc, 0, num, 6, 3);
        System.out.println(num);
    }
}
```

```java
/*출력 결과*/
ABCD
0123456789
ABCD0123456789
ABCD456789
ABCD45ABC9
```

<br>

## 1.6 배열의 활용

- [예제 5-5] 총합과 평균 
- [예제 5-6] 최대값과 최소값 
- [예제 5-7, 8] 섞기(suffle)
- [예제 5-9] 임의의 값으로 배열 채우기
- [예제 5-10] 정렬하기 (sort)
- [예제 5-11] 빈도수 구하기

