package controlMenus;

import collaborators.Collaborator;
import productions.Orientation;
import productions.Publication;
import projects.Project;
import controlMenus.*;
import viewMenus.*;

import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;

public class MainControl {
    public void mainAll() {
        Scanner input = new Scanner(System.in);
        boolean on = true;
        MenuViews mainMenu = new MenuViews();
        ProjectsView projectView = new ProjectsView();
        CollaboratorView collaboratorView = new CollaboratorView();
        ArrayList<Project> projects = new ArrayList();
        ArrayList<Collaborator> collaborators = new ArrayList();
        ArrayList<Orientation> orientations = new ArrayList();
        ArrayList<Publication> publications = new ArrayList();

        while(on){
            String option = mainMenu.mainMenu();
            switch (option){
                case "1":
                    projects = projectView.createProject(projects,collaborators);
                    break;
                case "2":
                    projects = projectView.addColaborator(projects,collaborators);
                    break;
                case "3":
                    projects = projectView.changeStatus(projects);
                    break;
                case "4":
                    collaborators = collaboratorView.createCollaborator(collaborators);
                    break;
                case "5":

                    break;
                case "6":

                    break;
                case "7":

                    break;
                case "8":
                    mainMenu.reportMenu(collaborators,projects,publications,orientations);
                    break;
                case "9":
                    System.out.println("Goodbye!");
                    on = false;
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }

        }
    }
}
