package 조건문;
import java.util.Scanner;
// 제어문 : 프로그램의 순차적인 흐름을 제어 할 때 사용
// 제어문에는 조건문과 반복문이 있음
// 조건문 :
// - if, if ~ else, if ~ else if ~ else
// - switch ~ case; 조건식이 아닌 값 비교만 가능
// - 삼항 연산자
// 반복문 :
// for, foreach, while, do-while
public class ConditionAndControlEx {
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        operatorEx();
        compareWordCase();
    }

    public static void operatorEx() {
        System.out.printf("정수값 입력 : ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
        }
        int num = sc.nextInt();
        sc.nextLine(); // 개행문자 제거
        System.out.println((num >= 0) ? "양수 입니다." : "음수 입니다.");
        System.out.println((num > 100) ? "100보다 큰 수 입니다." : (num < 100) ? "100보다 작은 수 입니다." : "100과 같습니다.");
    }

    public static void compareWordCase() {
        System.out.print("영문자 입력 : ");
        while(true) {
            char ch = sc.nextLine().charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                System.out.println(ch + "는 소문자 입니다.");
                break;
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println(ch + "는 대문자 입니다.");
                break;
            }
            System.out.println("다시 입력하십시오.");
        }
    }
}
