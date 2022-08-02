package ch08_polymorphism_and_innerClass.polymorphism;

abstract class Employee { // 클래스가 추상 메서드를 하나라도 포함하면 abstract 키워드를 명시.
    String name;
    int salary;

    public abstract void calcSalary();  // 본문을 구현할 필요가 없는 메서드. 추상 메서드(abstract 메서드)

    public abstract void calcBonus();
}

class Salesman extends Employee {
    public void calcSalary() {
        System.out.println("Salesman 급여 = 기본급 + 판매수당");
    }

    public void calcBonus() {
        System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
    }
}

abstract class Manager extends Employee {
    public void calcSalary() {
        System.out.println("Manager 급여 = 기본급 + 컨설팅 특별 수당");
    }
}

class Consultant extends Employee {
    public void calcSalary() {
        System.out.println("Salesman 급여 = 기본급 + 팀 성과 수당 ");
    }

    public void calcBonus() {
        System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
    }
}

class Director extends Manager {
    public void calcBonus() {
        System.out.println("Director 보너스 = 기본급 * 12 * 6");
    }
}

public class HRSTest {

    // 다형성 적용 : 부모 타입의 변수에 모든 자식 객체를 대입해 이용할 수 있다.
    public static void calcTax(Employee e) {
        // 인자로 전달된 인스턴스의 소득세 계산
    }

    public static void main(String[] args) {
        Salesman s = new Salesman();
        Consultant c = new Consultant();
        Director d = new Director();

        calcTax(s);
        calcTax(c);
        calcTax(d);

        // "클래스이름@인스턴스ID" 출력
        System.out.println(s.toString()); // ch08_polymorphism_and_innerClass.polymorphism.Salesman@6e8dacdf
        System.out.println(c.toString()); // ch08_polymorphism_and_innerClass.polymorphism.Consultant@7a79be8
        System.out.println(d.toString()); // ch08_polymorphism_and_innerClass.polymorphism.Director@34ce8af7

        if (s.equals(c)) { // 같은 객체인지 판단
            System.out.println("동일한 객체입니다.");
        } else {
            System.out.println("서로 다른 객체입니다.");
        }
    }
}
