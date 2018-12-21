package jliu2882;

public class Main {

    public static void main(String[] args) {
        String[] wordArray = {"wheels","on","the","bus"};
        RandomStringChooser sChooser = new RandomStringChooser(wordArray);
        System.out.println("Result of part a");
        for(int k = 0; k < 6; k++){
            System.out.println(sChooser.getNext() + "");
        }


        System.out.println("\nResult of part b");
        RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
        for(int a = 0; a < 4; a++){
            System.out.println(letterChooser.getNext());
        }
    }
}
