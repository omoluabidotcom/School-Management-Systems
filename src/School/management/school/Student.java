package School.management.school;

import java.io.*;

public class Student extends School {

    protected void updateInfo() {

    }

    protected void paySchoolFees() throws IOException {

                accountNumber += 100000;
                System.out.println("You have paid your school fees and school account has been credited");

                System.out.println("School account balance is "+ accountNumber);

    }
}




































//        BufferedReader reader = null;
//        PrintWriter writer = null;

//        try {

//            reader = new BufferedReader(new FileReader("C:\\Users\\HP\\Desktop\\Test\\admin\\fees.txt"));
//            writer = new PrintWriter(new FileWriter("C:\\Users\\HP\\Desktop\\Test\\admin\\fees.txt"));
//
//            String u;
//            long schoolFees = 100000;
//
//            while ((u = reader.readLine()) != null) {
//
//                schoolFees += Long.valueOf(u);
//                String mainFees = String.valueOf(schoolFees);
//                System.out.println(mainFees);
//
//                writer.write(mainFees);
//            }
//        } catch (Exception e) {
//
//            //TODO: handle exception
//            e.printStackTrace();
//        } finally {
//            if (reader != null) {
//
//                reader.close();
//            }
//
//            if (writer != null) {
//
//                writer.close();
//            }
//        }
