package model;

public class Height {

    private final int height;

    public Height(int height) {
        validate(height);
        this.height = height;
    }

    public static Height from(String value) {
        int height = Integer.parseInt(value);
        return new Height(height);
    }

    private void validate(int value) {
        if (value < 1 || value > 12) {
            throw new IllegalArgumentException(); // TODO: 예외 메시지
        }
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.valueOf(height);
    }
}
