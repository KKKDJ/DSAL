import java.io.*;
import java.util.LinkedList;

public class OE3 {

    public static void main(String[] args) throws Exception {

        LinkedList<String> wordsList = new LinkedList<String>();
        String inputString;

        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputReader);

        // Menu, user chooses an option.
        do {
            int menuInput;

            System.out.print("\033[H\033[2J");

            System.out.println("[1] Enter the 5 Initial Elements for the Linked List");
            System.out.println("[2] Add word at the beginning of the Linked List");
            System.out.println("[3] Add word at the end of the Linked List");
            System.out.println("[4] Add word AFTER the specified WORD in the Linked List");
            System.out.println("[5] Exit");

            System.out.print("\nChoose an Option: ");
            
            menuInput = Integer.parseInt(bufferedReader.readLine());

            if (menuInput == 1) {
                System.out.println("Enter 5 words in the Linked List");

                for (int i = 0; i < 5; i++) {
                    inputString = bufferedReader.readLine();
                    wordsList.add(inputString);
                }

                System.out.println("\n");
                System.out.println(wordsList);

                promptAndWait();

            } else if (menuInput == 2) {
                String firstWord;

                System.out.println("Enter a word to add at the beginning of the Linked List");
                firstWord = bufferedReader.readLine();

                wordsList.addFirst(firstWord);
                System.out.println("\n");
                System.out.println(wordsList);

                promptAndWait();

            } else if (menuInput == 3) {
                String lastWord;

                System.out.println("Enter a word to add at the end of the Linked List");
                lastWord = bufferedReader.readLine();

                wordsList.addLast(lastWord);

                System.out.println("\n");
                System.out.println(wordsList);

                promptAndWait();

            } else if (menuInput == 4) {
                String specificWord;
                String specificNode;

                System.out.println("Enter a word to add after the specified word in the Linked List");
                specificWord = bufferedReader.readLine();

                System.out.println("\n");
                System.out.println(wordsList);

                System.out.println("Enter the specific word in the Linked List: ");
                specificNode = bufferedReader.readLine();

                int nodeIndex = wordsList.indexOf(specificNode);

                wordsList.add(nodeIndex + 1, specificWord);

                System.out.println("\n");
                System.out.println(wordsList);

                promptAndWait();

            } else if (menuInput == 5) {
                System.exit(0);
            }

        } while (true);

    }

    public static void promptAndWait() throws Exception {

        InputStreamReader inputReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputReader);

        String key;

        System.out.print("\nPress any key to continue");
        key = bufferedReader.readLine();

    }

}