import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    private static Input input = new Input();

    public static void main(String[] args) {
        List<Integer> foundNumbers = new ArrayList<>();
        List<Integer> repeatedNumbers = new ArrayList<>();
        int[] resultFound = new int[1];
        input.getData().add(0, 0);

        while (repeatedNumbers.isEmpty()) {
            input.getData()
                    .stream()
                    .reduce((freq, nextFrequency) -> {
                        int currentFreq = freq + nextFrequency;

                        if (foundNumbers.contains(currentFreq)) {
                            repeatedNumbers.add(currentFreq);
                        }

                        foundNumbers.add(currentFreq);
                        return currentFreq;

                    })
                    .map(finalFrequency -> {
                        System.out.println("Final frequency: " + finalFrequency);
                        input.getData().remove(0);
                        input.getData().add(0, finalFrequency);
                        return finalFrequency;
                    });
        }

        System.out.println("The first repeated frequency is: " + repeatedNumbers.get(0));

    }

}
