final class SingletonTest {
    private static SingletonTest instance = new SingletonTest();

    private SingletonTest() {
        // 생성자는 외부에서 호출못하게 private 으로 지정해야 한다.
    }

    public static SingletonTest getInstance() {
        return instance;
    }

    public void say() {
        System.out.println("hi, there");
    }

}

