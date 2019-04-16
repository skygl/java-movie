package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
    private static final char NEW_LINE = '\n';
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputMovieId() {
        System.out.println(NEW_LINE + "## 예약할 영화를 선택하세요.");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ime) {
            scanner.nextLine();
            System.out.println("잘못된 값을 입력하셨습니다.");
            return inputMovieId();
        }
    }

    public static int inputMovieTable() {
        System.out.println(NEW_LINE + "## 예약할 시간표를 선택하세요. (첫번째 상영 시간이 1번)");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ime) {
            scanner.nextLine();
            System.out.println("잘못된 값을 입력하셨습니다.");
            return inputMovieTable();
        }
    }

    public static int inputNumPeople() {
        System.out.println(NEW_LINE + "## 예약할 인원을 입력하세요.");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ime) {
            scanner.nextLine();
            System.out.println("잘못된 값을 입력하셨습니다.");
            return inputNumPeople();
        }
    }

    public static int inputPoint() {
        System.out.println(NEW_LINE + "## 결제를 진행합니다." + NEW_LINE);
        System.out.println("## 포인트 사용 금액을 입력하세요. 포인트가 없으면 0 입력");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ime) {
            scanner.nextLine();
            System.out.println("잘못된 값을 입력하셨습니다.");
            return inputPoint();
        }
    }

    public static int inputPayMethod() {
        System.out.println(NEW_LINE + "## 신용카드는 1번, 현금은 2번");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ime) {
            scanner.nextLine();
            System.out.println("잘못된 값을 입력하셨습니다.");
            return inputPayMethod();
        }
    }

    public static int inputQuitSignal() {
        System.out.println(NEW_LINE + "## 예약을 종료하고 결제를 진행하려면 1번, 추가 예약을 진행하려면 2번");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ime) {
            scanner.nextLine();
            System.out.println("잘못된 값을 입력하셨습니다.");
            return inputPayMethod();
        }
    }
}
