public class qq2ew {
    public static void hanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        hanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        hanoi(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        int n = 3; // 디스크의 개수
        hanoi(n, 'A', 'C', 'B'); // 말뚝 A에서 말뚝 C로 디스크를 옮기는 함수 호출
    }
}
