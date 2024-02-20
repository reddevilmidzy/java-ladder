package view;

import java.util.List;
import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in); // TODO: 스캐너 다른거 고려

    public List<String> readPlayers() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        String value = readLine();
        return List.of(value.split(","));
    }

    protected String readLine() {
        return scanner.nextLine();
    }
}
