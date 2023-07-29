package baseball;

import java.util.Scanner;

public class NumberBaseballMain {

    public static void main(String[] args) {
        NumberBaseball nb = new NumberBaseball();
        Scanner s = new Scanner(System.in);

        while(true) {
            String[] answer = nb.receiveInput(s);
            nb.ballCountMatcher(answer);

            if(nb.getStrike() != 3) {
                System.out.printf("%d스트라이크 %d볼 입니다.\n", nb.getStrike(), nb.getBall());
                nb.setStrike(0);
                nb.setBall(0);
                continue;
            }

            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 눌러주세요.");
            int num = s.nextInt();
            if(num == 1) {
                nb.setStrike(0);
                nb.setBall(0);
                s.nextLine();
                continue;
            }
            if(num == 2) {
                break;
            }
        }
    }
}
