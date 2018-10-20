package viewMenus;

import collaborators.Collaborator;
import productions.Orientation;
import productions.Publication;
import projects.Project;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuViews {

    public String mainMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Academic Productivity - Main Menu");
        System.out.println("Choose an option:");
        System.out.println("(1)Create project");
        System.out.println("(2)Allocate collaborator to a project");
        System.out.println("(3)Change project status");
        System.out.println("(4)Create collaborator");
        System.out.println("(5)");
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

    public void reportMenu(ArrayList<Collaborator> collaborators, ArrayList<Project> projects,
                           ArrayList<Publication> publications, ArrayList<Orientation> orientations) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("(1)Number of collaborators");
        System.out.println("(2)Number of projects 'In elaboration'");
        System.out.println("(3)Number of projects 'In progress'");
        System.out.println("(4)Number of projects 'Concluded'");
        System.out.println("(5)Number of total of projects");
        System.out.println("(6)Number of academic productions by type");
        String option = input.next();
        switch (option){
            case "1":
                ReportView.countCollaborators(collaborators);
                break;
            case "2":
                ReportView.countProjectsInElaboration(projects);
                break;
            case "3":
                ReportView.countProjectsInProgress(projects);
                break;
            case "4":
                ReportView.countProjectsConcluded(projects);
                break;
            case "5":
                ReportView.countProjectsTotal(projects);
                break;
            case "6":
                ReportView.countPublications(publications);
                ReportView.countOrientations(orientations);
                break;
            default:
                System.out.println("invalid option");
                break;
        }
    }

}
