import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Declare Scanner
        Scanner in = new Scanner(System.in);

        //Declare Vars
        boolean doneInput = false;
        boolean done = false;
        String ID = "";
        String firstName = "";
        String lastName = "";
        String title = "";
        String rec = "";
        int yearOfBirth;

        ArrayList<String> personList = new ArrayList<>();

        //Main


        //Loop for input person
        do {
            ID = SafeInput.getNonZeroLenString(in, "Please enter your ID");
            firstName = SafeInput.getNonZeroLenString(in, "Please enter your first name");
            lastName = SafeInput.getNonZeroLenString(in, "Please enter your last name");
            title = SafeInput.getNonZeroLenString(in, "Please enter your title");
            yearOfBirth = SafeInput.getRangedInt(in, "Please enter your year of birth", 1900, 2025);


            rec = ID + " , " + firstName + " , " + lastName + " , " + title + " , " + yearOfBirth;

            System.out.println(rec);

            personList.add(rec);


            done = SafeInput.getYNConfirm(in, "Are you done?");
        } while(!done);




    }
}