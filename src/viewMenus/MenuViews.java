package viewMenus;

import java.util.Scanner;

public class MenuViews {

    public String mainMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Academic Productivity - Main Menu");
        System.out.println("Choose an option:");
        System.out.println("(1)Create project");
        System.out.println("(2)Allocate student to a project");
        System.out.println("(3)Change project status");
        System.out.println("(4)Add collaborator");
        System.out.println("(5)Add resources");
        System.out.println("(6)Consult collaborator");
        System.out.println("(7)Consult project");
        System.out.println("(8)Get academic production report");
        System.out.println("(9)Shut down");
        String option = input.next();
        return option;
    }

    public String changeProjectStatus(){
        System.out.println("Type the name of the project you wish to change");
        Scanner input = new Scanner(System.in);
        String option = input.next();
        return option;
    }

    public String reportMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("(1)Number of collaborators");
        System.out.println("(2)Number of projects 'In elaboration'");
        System.out.println("(3)Number of projects 'In progress'");
        System.out.println("(4)Number of projects 'Concluded'");
        System.out.println("(5)Total of projects");
        System.out.println("(6)Number of academic productions by type");
        String option = input.next();
        return option;
    }

}
