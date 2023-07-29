package baseball;

import java.util.Scanner;

public class NumberBaseball {
    private int strike;
    private int ball;
    private final String[] strAnswer;

    public NumberBaseball() {
        this.strike = 0;
        this.ball = 0;
        this.strAnswer = "123".split("");
                // (Integer.toString((int) (Math.random() * 999))).split("");
    }

    public String[] receiveInput(Scanner s) {
        System.out.print("숫자를 입력해주세요 : ");
        String input = s.nextLine();
        return input.split("");
    }

    public void ballCountMatcher(String[] inputArr) {
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i].equals(strAnswer[i])) {
                strike += 1;
                continue;
            }
            for (String s : strAnswer) {
                if (inputArr[i].equals(s)) {
                    ball += 1;
                    break;
                }
            }
        }
    }

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }
}
