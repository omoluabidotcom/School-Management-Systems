package School.management.school;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        School mySchool = new School();
        mySchool.getSchoolInfo(scan);
        mySchool.showMenu(scan);

    }
}
