package viewMenus;

import collaborators.Collaborator;
import projects.Project;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class ProjectsView {
    Scanner input = new Scanner(System.in);

    public ArrayList<Project> createProject(ArrayList<Project> projects, ArrayList<Collaborator> collaborators){
        boolean doesTeacherExist = false;
        Collaborator responsibleTeacher = null;
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        System.out.println("Type the title of the project:");
        String title = input.nextLine();
        System.out.println("Type the day(number) of the beginning date of the project:");
        int beginDay = input.nextInt();
        System.out.println("Type the month(number) of the beginning date of the project:");
        int beginMonth = input.nextInt();
        System.out.println("Type the year(number) of the beginning date of the project:");
        int beginYear = input.nextInt();
        Date beginningDate = null;
        try {
            beginningDate = ft.parse((beginDay + "-" + beginMonth + "-" + beginYear));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Type the day(number) of the end date of the project:");
        int endDay = input.nextInt();
        System.out.println("Type the month(number) of the end date of the project:");
        int endMonth = input.nextInt();
        System.out.println("Type the year(number) of the end date of the project:");
        int endYear = input.nextInt();
        Date endDate = null;
        try {
            endDate = ft.parse((endDay + "-" + endMonth + "-" + endYear));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String trash = input.nextLine();
        System.out.println("Type the name of the financier of the project:");
        String financier = input.nextLine();
        System.out.println("Type the financed amount of the project:");
        double amountFinanced = input.nextDouble();
        System.out.println("Type the objective of the project:");
        trash = input.nextLine();
        String objective = input.nextLine();
        System.out.println("Type the description of the project:");
        String description = input.nextLine();
        System.out.println("Type the name of the teacher responsible for the project:");
        String responsibleTeacherName = input.nextLine();
        for(Collaborator collaborator : collaborators) {
            if(collaborator.getName().equals(responsibleTeacherName ) && collaborator.isTeacher()){
                doesTeacherExist = true;
                responsibleTeacher = collaborator;
            }
        }
        if(!doesTeacherExist){
            System.out.println("No such teacher, project not created");
            return projects;
        }
        projects.add(new Project(title,beginningDate,endDate,financier,amountFinanced,objective,description,
                responsibleTeacher));
        return projects;

    }

    public ArrayList<Project> addColaborator(ArrayList<Project> projects, ArrayList<Collaborator> collaborators) {
        return projects;
    }

    public ArrayList<Project> changeStatus(ArrayList<Project> projects) {
        System.out.println();
        System.out.println("Type the title of the project you wish to change the status of:");
        String title = input.nextLine();
        boolean doesProjectExist = false;
        for(Project project: projects){
            if(project.getTitle().equals(title)){
                doesProjectExist = true;
                if(project.getCurrentStatus().equals("In elaboration") && project.getCollaborators()!=null){
                    System.out.println("Status changed to 'In progress'");
                    project.setCurrentStatus("In progress");
                }
                else if(project.getCurrentStatus().equals("In elaboration") && project.getCollaborators()==null){
                    System.out.println("No collaborators, status unchanged");
                }
                else if(project.getCurrentStatus().equals("In progress") && project.getAssociatedPublications()!=null){
                    System.out.println("Status changed to 'Concluded'");
                    project.setCurrentStatus("Concluded");
                }
                else if(project.getCurrentStatus().equals("In progress") && project.getAssociatedPublications()==null){
                    System.out.println("No associated publications, status unchanged");
                }
                else if(project.getCurrentStatus().equals("Concluded")){
                    System.out.println("Status is already set to 'Concluded'");
                }
            }
        }
        if(!doesProjectExist){
            System.out.println("Project not found");
        }
        return projects;
    }
}
