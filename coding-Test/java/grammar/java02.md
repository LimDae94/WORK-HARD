코딩테스트에 자주 나오는 자료구조를 정리해보자.



## 📚 Stack

```java
Stack<Ingeger> stack = new Stack<>();

stack.push(1) // 값 추가
stack.pop() // 값 삭제
stack.clear() // 값 전체삭제
stack.size() // 크기 반환
stack.empty() // 비어있으면 true, 아니면 false
stack.contains(1) // 1을 포함하고 있으면 true, 아니면 false
stack.peek() // Stack top 출력 (제거 X), 비어있으면 null 반환
```



## 📚 Queue

```java
Queue<Integer> queue = new LinkedList<>();

queue.add(1) // 값 추가
queue.offer(2) // 값 추가
queue.poll() // 첫 번째 값 반환, 비어있으면 null 반환
queue.remove() // 첫 번째 값 제거
queue.clear() // 값 모두 삭제
queue.peek() // 첫 번째 값 출력 (제거 X)
```



## 📚 PriorityQueue

```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
// 기본은 낮은 숫자가 우선순위를 갖는다.
// 높은 숫자가 우선되게 하려면 () 안에 Collections.reverseOrder() 작성

pq.add(1) // 값 추가
pq.offer(1) // 값 추가
pq.poll() // 첫 번째 값 반환, 비어있으면 null 반환
pq.remove() // 첫 번째 값 제거
pq.clear() // 값 모두 삭제
pq.peek() // 첫 번째 값 출력 (제거 X)
```



## 📚 HashSet

- HashSet : 중복을 허용하지 않는 구조. 순서가 없고 정렬도 안 함.
- LinkedHashSet : 중복을 허용하지 않는 구조. 삽입된 순서대로 순서를 관리함.
- TreeSet : 중복을 허용하지 않는 구조. 이진탐색트리 형태로 데이터를 저장하므로 정렬 함.

```java
HashSet<Integer> set = new HashSet<>();

set.add(1) // 값 추가
set.remove(1) // 값이 1인 데이터 삭제
set.removeAll(set2) // set의 데이터 중 set2에 들어있는 데이터를 모두 삭제
set.retainAll(set2) // set의 데이터 중 set2에 들어있지 않은 데이터를 모두 삭제
set.clear() // 모든 데이터 삭제
set.size() // 크기 반환
set.contains(1) // 값 1이 있으면 true, 없으면 false

// 값 출력
// 방법 1: get 메소드가 없으므로 원소에 접근하려면 이터레이터 사용
Iterator iter = set.iterator();
while (iter.hasNext())
	System.out.println(iter.next());

// 방법 2: for-each문으로 원소에 접근
for (String item: set)
	System.out.println(item);
```



## 📚 HashMap

- HashMap: <key, value>쌍. 특정 규칙 없이 출력됨.
- LinkedHashMap: <key, value>쌍. 키값이 입력순으로 정렬되어 출력됨.
- TreeMap: <key, value>쌍. 키값이 알파벳순(오름차순)으로 정렬된 상태로 출력됨.

```java
HashMap<Integer, String> map = new HashMap<>();
HashMap<String, String> map = new HashMap<>();

map.put(1, "사과")
map.put(2, "바나나")
map.put(1, "포도") // key 1이 이미 존재하면 key 1의 value가 "포도"로 대체

map.remove(1) // key 값으로만 요소 삭제 가능
map.clear() // 전체 삭제

map.containsKey(1) // key 값 중 1이 있으면 true, 없으면 false
map.containsValue("사과") // value 중 "사과"가 있으면 true, 없으면 false

// 값 출력
// 방법 1
for (Integer i: map.keySet())
	System.out.println(i + map.get(i)); // 1 사과

// 방법 2: key와 value가 모두 필요할 때 주로 사용
for (Entry<Integer, String> entry: map.entrySet())
	System.out.println(entry.getKey() + entry.getValue()); // 1 사과
```