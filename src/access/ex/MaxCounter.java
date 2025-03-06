package access.ex;

public class MaxCounter {
    // 속성들은 private로
    private int count = 0;
    private int max;

    // 다른 패키지에서도 사용할 수 있으려면 public으로 진행
    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("max값을 넘기면 안됨");
        } else {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
