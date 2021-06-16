package ClassActivity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Personal_Data {
//    Create a class Personal_Data;
//    You would need to create two data structures to store names and social security numbers;
//    One of these data structures should be able to store duplicates and the other one - shouldn't allow duplicates
//         (make your own determination where names and SSNs should be stored);
//    Add 5 elements to each of these data structures (at least two of them should be duplicates);
//    Print the number of elements stored in each of these data structures;



    // create two data structures to store names and social security numbers;
    public static void main(String[] args) {
      Set<Integer> ssn = new HashSet<>();
        ssn.add(345_45_654);
        ssn.add(545_23_252);
        ssn.add(235_67_567);
        ssn.add(324_35_678);
        ssn.add(345_45_654);
    List<String> names = new ArrayList<>();
        names.add("Beka");
        names.add("Dima");
        names.add("Dili");
        names.add("Marat");
        names.add("Beka");

 //    Print the number of elements stored in each of these data structures;

        System.out.println("Names : " + names );
        System.out.println("SSN's : " + ssn );

//    Create a config.properties file;
//    Create a key-value pair: key - selection, value - names;
//    Use the Utility that we've built together to connect to the properties file;
//    Write a code that pulls the data from the properties file and based on the value stored in the key-value pair will print
//    either the data structure where names are stored (if the value is "names") or the SSNs (if the value is "SSNs");
//    Run the code and let it print all the elements of the data structure to a console and see if duplicates were removed;
//    Change the value of selection to SSNs;
//    Run the code and let it print all the elements of the data structure to a console and see if duplicates were removed;

        System.out.println(Config.getProperty("bekaSSN"));
    }


}
