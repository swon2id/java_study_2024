package 상수와리터럴;
import java.util.Scanner;

public class ConstEx {
    public static void main(String[] args) {
        ConstEx.형변환테스트();
    }

    private static void 상수및입력테스트() {
        final double TAX_RATE = 0.1; // 좌항은 지역 변수로 stack에 할당, 우항은 값으로 리터럴로 상수풀에 할당
        int number;
        // 우항 새로운 Scanner 객체는 heap에 동적 할당, 좌항 scanner는 지역 변수로 stack에 할당
        Scanner scanner = new Scanner(System.in);
        System.out.print("수입을 입력하세요: ");
        while(true) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.close();
                break;
            } else {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.next();  // 입력 버퍼를 비워줌 (유효하지 않은 입력 무시)
            }
        }
        System.out.print("납부해야 할 세금은 " + java.lang.Math.round(number * TAX_RATE) + "원 입니다.");
    }

    private static void 형변환테스트() {
        int num1 = 1, num2 = 4;
        double result1 = num1 / num2;
        double result2 = (double) num1 / num2;  // 명시적 형변환

        System.out.println(result1);
        System.out.println(result2);

        System.out.println(""+ result1 + 10); // 연산자 우선순위에 의해서 문자열로 간주 됩니다.
        System.out.println(result1 + 10 + "10"); // 먼저 숫자형 타입이 계산되고 문자열이추가 됩니다.
    }

}
