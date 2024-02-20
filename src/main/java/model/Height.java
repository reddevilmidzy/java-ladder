package model;

public class Height {

    private final int value;

    public Height(int value) {
        validate(value);
        this.value = value;
    }

    private void validate(int value) {
        if (value < 1 || value > 12) {
            throw new IllegalArgumentException(); // TODO: 예외 메시지
        }
    }
}
