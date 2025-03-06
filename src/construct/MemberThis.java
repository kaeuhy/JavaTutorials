package construct;

public class MemberThis {
    String nameField;

    // 멤버 변수에 접근하는 경우에 항상 this를 사용하여 구분
    void initMember(String nameParameter) {
        this.nameField = nameParameter;
    }
}
