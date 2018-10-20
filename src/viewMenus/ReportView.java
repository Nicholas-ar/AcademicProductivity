package viewMenus;

import collaborators.*;
import projects.Project;
import productions.*;

import java.util.ArrayList;

public class ReportView {

    public static void countCollaborators(ArrayList<Collaborator> collaborators) {
        if (collaborators.size() == 1) {
            System.out.println("There is 1 collaborator");
        } else {
            System.out.println("There are " + collaborators.size() + " collaborators");
        }
    }

    public static void countProjectsInElaboration(ArrayList<Project> projects) {
        int total = 0;
        for (Project project:projects){
            if(project.getCurrentStatus().equals("In elaboration")){
                total++;
            }
        }
        if (total == 1) {
            System.out.println("There is 1 project in elaboration");
        } else {
            System.out.println("There are " + total + " projects in elaboration");
        }
    }

    public static void countProjectsInProgress(ArrayList<Project> projects) {
        int total = 0;
        for (Project project:projects){
            if(project.getCurrentStatus().equals("In progress")){
                total++;
            }
        }
        if (total == 1) {
            System.out.println("There is 1 project in progress");
        } else {
            System.out.println("There are " + total + " projects in progress");
        }
    }

    public static void countProjectsConcluded(ArrayList<Project> projects) {
        int total = 0;
        for (Project project:projects){
            if(project.getCurrentStatus().equals("Concluded")){
                total++;
            }
        }
        if (total == 1) {
            System.out.println("There is 1 project concluded");
        } else {
            System.out.println("There are " + total + " projects concluded");
        }
    }

    public static void countProjectsTotal(ArrayList<Project> projects) {
        if (projects.size() == 1) {
            System.out.println("There is 1 project in total");
        } else {
            System.out.println("There are " + projects.size() + " projects in total");
        }
    }

    public static void countPublications(ArrayList<Publication> publications) {
        if (publications.size() == 1) {
            System.out.println("There is 1 publication");
        } else {
            System.out.println("There are " + publications.size() + " publications");
        }
    }

    public static void countOrientations(ArrayList<Orientation> orientations) {
        if (orientations.size() == 1) {
            System.out.println("There is 1 orientation");
        } else {
            System.out.println("There are " + orientations.size() + " orientations");
        }
    }


}
