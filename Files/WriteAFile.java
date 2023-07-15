package Files;
// we will create a file and write the person details using the person details

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteAFile {

    public static void main(String[] args) throws IOException {
        int i=0;
        Scanner sc= new Scanner(System.in);

        File file = new File("./Details.txt");
        FileWriter FW = new FileWriter(file);
        PrintWriter PW = new PrintWriter(FW);
        PW.println("Name"+"         "+"Age" );
        //loop to write into the file all the details of the person we are entering
        System.out.println("Enter the Person details \n Name should be less than 10 char");
        while(i<=4){
            PersonClass P = new PersonClass();

            String Name=sc.next();
            int Age = sc.nextInt();
            P.setName(Name);
            P.setAge(Age);
            PW.println(P.getName()+"           "+P.getAge());
            i++;
        }
        PW.close();
    }

}
