package School.management.school;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class School extends Main{

    protected String nameOfSchool;
    private int classroomsNumber;
    private String principalName;
    private String principalNameFake;
    protected final int schoolFees = 100000;
    protected final int teacherSalary = 250000;
    protected int accountNumber = 0;

    protected void getSchoolInfo(Scanner scan) {

        System.out.println("***********************************************");
        System.out.println("\tWelcome to the School Management System");
        System.out.println("***********************************************");
        System.out.println("\n\n");

        System.out.println("Enter the name of your School");
        nameOfSchool = scan.nextLine();

        System.out.println("Enter the number of Classrooms "+nameOfSchool);
        classroomsNumber = scan.nextInt();

        System.out.println("Enter the name of the Principal");
        principalNameFake = scan.nextLine();
        principalName = scan.nextLine();


    }

    private int getNumberOfTeachers() {

        int count = 0;
        Path dir = Paths.get("C:\\Users\\HP\\Desktop\\Test\\teacher");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path file: stream) {

                count++;
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
        return  count;
    }

    private void printAllTeachers() {

        Path dir = Paths.get("C:\\Users\\HP\\Desktop\\Test\\teacher");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path file: stream) {

                BufferedReader reader = null;

                    reader = new BufferedReader(new FileReader(String.valueOf(file)));
                    String u;

                    while ((u = reader.readLine()) != null) {

                        System.out.println(u);
                    }
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    private int getNumberOfStudents() {

        int count = 0;
        Path dir = Paths.get("C:\\Users\\HP\\Desktop\\Test\\student");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path file: stream) {

                count++;
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
        return  count;
    }

    private void printAllStudents() {

        Path dir = Paths.get("C:\\Users\\HP\\Desktop\\Test\\student");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (Path file: stream) {

                BufferedReader reader = null;

                reader = new BufferedReader(new FileReader(String.valueOf(file)));
                String u;

                while ((u = reader.readLine()) != null) {

                    System.out.println(u);
                }
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    protected void showMenu(Scanner scan) throws IOException {

        System.out.println("\n");
        System.out.println("**************************************************");
        System.out.println(" Welcome "+nameOfSchool+" Management System");
        System.out.println("**************************************************");
        System.out.println("\n");

        System.out.println("How do you want to Login");
        System.out.println("\n");

        System.out.println("Press A to login as Admin");
        System.out.println("Press T to login as Teacher");
        System.out.println("Press S to login as Student");
        System.out.println("Press E to exit the Program");

        do{

            switch(scan.next()) {

                case "A":
                    System.out.println("\n");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println(" Welcome back Admin what action would you like to perform");
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("\n");

                    System.out.println("Press 1 to register Teacher");
                    System.out.println("Press 2 to register Student");
                    System.out.println("Press 3 to access other School details");
                    System.out.println("press 4 to access details of all Teachers");
                    System.out.println("Press 5 to access details of all Students");
//                    System.out.println("press 6 to access details of a specific Teacher");
//                    System.out.println("Press 7 to access details of a specific Student");

                    String tName;
                    String tFakeName;
                    String tEmail;
                    long tNumber;
                    int tLevel;
                    String tAddress;
                    String tAddressFake;

                    String sName;
                    String sFakeName;
                    String sEmail;
                    long sNumber;
                    int sGrade;
                    String sAddress;
                    String sAddressFake;

                    switch (scan.nextInt()) {

                        case 1:

                            System.out.println();
                            tFakeName = scan.nextLine();

                            System.out.println("Enter Teacher's name");
                            tName = scan.nextLine();

                            System.out.println("Enter Teacher's email");
                            tEmail = scan.nextLine();

                            System.out.println("Enter Teacher's number");
                            tNumber = scan.nextLong();

                            System.out.println("Enter Teacher's Level(should be a number)");
                            tLevel = scan.nextInt();

                            System.out.println("Enter Teacher's address");
                            tAddress = scan.nextLine();
                            tAddress = scan.nextLine();

                            System.out.println();
                            tAddressFake = scan.nextLine();

                            File fileCreator = new File("C:\\Users\\HP\\Desktop\\Test\\teacher\\"+tName+".txt");

                            try{

                                if(fileCreator.createNewFile()) {

                                    FileWriter fileWrite = new FileWriter("C:\\Users\\HP\\Desktop\\Test\\teacher\\" + tName + ".txt");

                                    fileWrite.write(tName + "\n");
                                    fileWrite.write(tEmail + "\n");
                                    fileWrite.write(String.valueOf(tNumber) + "\n");
                                    fileWrite.write(tLevel+ "\n");
                                    fileWrite.write(tAddress + "\n");
                                    fileWrite.write("End of Data" );

                                    System.out.println("Teacher "+tName+" has been added to the School Management System");
                                    fileWrite.close();
                                }
                            } catch (IOException e) {

                                e.printStackTrace();
                            } finally {
//                                scan.close();
                            }
                            break;

                        case 2:

                            System.out.println();
                            tFakeName = scan.nextLine();

                            System.out.println("Enter Student's name");
                            sName = scan.nextLine();

                            System.out.println("Enter Student's email");
                            sEmail = scan.nextLine();

                            System.out.println("Enter Student's number");
                            sNumber = scan.nextLong();

                            System.out.println("Enter Student's grade(should be a number)");
                            sGrade = scan.nextInt();

                            System.out.println("Enter Student's address");
                            sAddress = scan.nextLine();
                            sAddress = scan.nextLine();

                            System.out.println();
                            tAddressFake = scan.nextLine();

                            File studentCreate = new File("C:\\Users\\HP\\Desktop\\Test\\student\\" + sName + ".txt");

                            try{

                                if(studentCreate.createNewFile()) {

                                    FileWriter studentWrite = new FileWriter("C:\\Users\\HP\\Desktop\\Test\\student\\" + sName + ".txt");

                                    studentWrite.write(sName + "\n");
                                    studentWrite.write(sEmail + "\n");
                                    studentWrite.write(String.valueOf(sNumber) + "\n");
                                    studentWrite.write(sGrade + "\n");
                                    studentWrite.write(sAddress + "\n");
                                    studentWrite.write("End of Data" );

                                    System.out.println("Student with name "+sName+" has been added to the School Management System");
                                    studentWrite.close();
                                }
                            } catch (IOException e) {

                                e.printStackTrace();
                            } finally {
//                                scan.close();
                            }
                            break;

                        case 3:

                            System.out.println(nameOfSchool+" Schools Details in brief");
                            System.out.println("School Name: "+nameOfSchool);
                            System.out.println("Numbers of classrooms: "+classroomsNumber);
                            System.out.println("Numbers of Teachers: " +getNumberOfTeachers());
                            System.out.println("Numbers of Students: " +getNumberOfStudents());
                            System.out.println("Principal name: "+principalName);
                            break;

                        case 4:

                            System.out.println("Details of all Teachers");
                            printAllTeachers();
                            break;

                        case 5:

                            System.out.println("Details of all Students");
                            printAllStudents();
                            break;

                        default:

                            System.out.println("Wrong option");
                            break;

                    }
                    break;

                case "T":

                    System.out.println("What action do you want to perform");

                    System.out.println("Press 1 to update your information");
                    System.out.println("Press 2 to exit program");

                    switch (scan.nextInt()) {

                        case 1:

                            System.out.println();
                            tFakeName = scan.nextLine();

                            System.out.println("Enter your name to search");
                            String seeName = scan.nextLine();
                            Teacher myTeacher = new Teacher();
                            myTeacher.updateInfo(seeName, scan);
                            break;

                        case 2:


                            break;

                        default:
                            System.out.println("Wrong option");
                    }
                    break;

                case "S":

                    System.out.println("What action do you want to perform");

                    System.out.println("Press 1 to pay school fees(Note:School fees is 100K)");

                    switch (scan.nextInt()) {

                        case 1:

                            Student student = new Student();
                            student.paySchoolFees();
                            break;

                        case 2:


                            break;

                        default:

                            System.out.println("Wrong option");
                            break;
                    }

                    break;

                default:

                    System.out.println("Wrong option");
            }
        } while (scan.next().equals("E"));
    }
}
