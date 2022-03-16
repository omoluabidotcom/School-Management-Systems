package School.management.school;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Teacher extends  School {

    protected void updateInfo(String searchName, Scanner scan) throws IOException {

//        Path dir = Paths.get("C:\\Users\\HP\\Desktop\\Test\\student");
//        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
//            for (Path file: stream) {
//
//                BufferedReader reader = null;
//
//                reader = new BufferedReader(new FileReader(String.valueOf(file)));
//                String u;
//
//                while ((u = reader.readLine()) != null) {
//
//                    System.out.println(u);
//                }
//            }
//        } catch (IOException e) {
//
//            e.printStackTrace();
//        }

        Path dir = Paths.get("C:\\Users\\HP\\Desktop\\Test\\teacher");
        try (DirectoryStream<Path> direct = Files.newDirectoryStream(dir)) {

            for (Path eachValue : direct) {

//                System.out.println(eachValue);
                String path = String.valueOf(eachValue);
                int slash = path.lastIndexOf("\\");
                int dot = path.lastIndexOf(".");
                String fileName = path.substring(slash + 1, dot);

                if(fileName.equals(searchName)) {

                    String tUpdatedName;
                    String tUpdatedEmail;
                    Long tUpdatedNumber;
                    int tUpdatedLevel;
                    String tUpdatedAddress;

                    System.out.println("This Teacher has a record on the "+nameOfSchool+" Management System");
                    System.out.println("To make update to your data you will have to provide all your details again");

                    System.out.println("Enter your Name");
                    tUpdatedName = scan.nextLine();

                    System.out.println("Enter your Email");
                    tUpdatedEmail = scan.nextLine();

                    System.out.println("Enter your Mobile Number");
                    tUpdatedNumber = scan.nextLong();

                    System.out.println("Enter your Level");
                    tUpdatedLevel = scan.nextInt();

                    System.out.println("Enter your Address");
                    tUpdatedAddress = scan.nextLine();

                    System.out.println();
                    scan.nextLine();


                    FileWriter overWriteTeacher = new FileWriter("C:\\Users\\HP\\Desktop\\Test\\teacher\\"+tUpdatedName+".txt");

                        overWriteTeacher.write(tUpdatedName);
                        overWriteTeacher.write(tUpdatedEmail);
                        overWriteTeacher.write(String.valueOf(tUpdatedNumber));
                        overWriteTeacher.write(tUpdatedLevel);
                        overWriteTeacher.write(tUpdatedAddress);

                        System.out.println("Your data has been updated");
                        overWriteTeacher.close();
                } else {

                    System.out.println("The Teacher you are searching for doesn't exist");
                    System.exit(1);
                }
            }
        } catch(IOException e) {

            e.printStackTrace();
        }
    }
}
