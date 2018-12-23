public class Main {
    private static Input input = new Input();

    public static void main(String[] args) {
        input.getData()
                .stream()
                .reduce((freq, nextFreque) -> freq + nextFreque)
                .map(finalFrequency -> System.out.printf("Final frequency: " + finalFrequency));
    }
}
