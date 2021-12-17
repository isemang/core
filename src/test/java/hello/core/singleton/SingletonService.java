package hello.core.singleton;

//싱글톤 패턴을 구현하는 방법은 여러가지가 있는데,
//이 서비스에서 구현한 방식은 객체를 미리 생성해두는 단순하고 안전한 방법을 이용했음
public class SingletonService {

    //자기자신을 내부에 프라이빗으로 하나 가지고 있는다
    //1. static 영역에 객체를 딱 1개만 생성해둔다.
    private static final SingletonService instance = new SingletonService();

    //2. public으로 열어서 객체 인스턴스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.
    public static SingletonService getInstance() {
        return instance;
    }

    //3. 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체생성을 못하게 막는다.
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}