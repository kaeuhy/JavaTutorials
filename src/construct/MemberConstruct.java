package construct;

import java.sql.SQLOutput;

public class MemberConstruct {
    String name;
    int age;
    int grade;


    MemberConstruct(String name, int age) {
        this(name, age, 50);

    }
    // 생성자의 이름은 클래스 이름과 같아야 함
    // 생성자는 반환 타입이 없음
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ",age = " + age + ",grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
