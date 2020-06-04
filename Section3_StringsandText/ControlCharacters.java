package Section3_StringsandText;

public class ControlCharacters {
    public static void main(String[] args) {
        String text = "\tTo be or not to be. \n\tThat is the question.";

        System.out.println(text);


        /*
         * Select an option:
         *   1. add an entry
         *   2. view the database
         *   3. exit
         * */


        /*
        String statement = "\tSelect an option:";
        String option1 = "\n\t\t1. Add an entry";
        String option2 = "\n\t\t2. View the database";
        String option3 = "\n\t\t3. Exit";

        System.out.println(statement + option1 + option2 + option3);
        */

        // Solution:
        String prompt = "Select an option:";
        String option1 = "Add an entry";
        String option2 = "View the databse";
        String option3 = "Exit";

        int value1 = 1;
        int value2 = 2;
        int value3 = 3;

        String menu = "\t" + prompt + "\n";
        menu += "\t\t" + value1 + "." + option1 + "\n";
        menu += "\t\t" + value2 + "." + option2 + "\n";
        menu += "\t\t" + value3 + "." + option3 + "\n";

        System.out.println(menu);
    }
}
