package viewMenus;

import collaborators.Collaborator;
import productions.*;
import projects.Project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ProductionView {

    Scanner input = new Scanner(System.in);

    public ArrayList<Publication> createPublication(ArrayList<Publication> publications,
                                                    ArrayList<Collaborator> collaborators, ArrayList<Project> projects) {
        boolean doesProjectExist = false;
        boolean finishedCreatingAuthors = true;
        ArrayList<String> authors = new ArrayList();
        System.out.println("Type the name of the publication:");
        String publicationTitle = input.nextLine();
        System.out.println("Type the name of the project to which the publication is linked to:");
        String projectTitle = input.nextLine();
        Project tempProject = null;
        SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
        for (Project project:projects){
            if(project.getTitle().equals(projectTitle) && project.getCurrentStatus().equals("In progress")){
                doesProjectExist = true;
                tempProject = project;
            }
        }
        if(!doesProjectExist){
            System.out.println("Project does not exist or isn't in progress, no changes made");
            return publications;
        }
        while (finishedCreatingAuthors){
            System.out.println("Type the name of an author or (0) to finish input of authors");
            String author = input.nextLine();
            if(author.equals("0")){
                break;
            }
            if(tempProject.getCollaborators().contains(author) || tempProject.getResponsibleTeacher().equals(author)){
                authors.add(author);
                System.out.println( author + " added to authors");
            }
        }
        System.out.println("Type the day(number) of the publication:");
        int beginDay = input.nextInt();
        System.out.println("Type the month(number) of the publication:");
        int beginMonth = input.nextInt();
        System.out.println("Type the year(number) of the publication:");
        int beginYear = input.nextInt();
        Date beginningDate = null;
        try {
            beginningDate = ft.parse((beginDay + "-" + beginMonth + "-" + beginYear));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        publications.add(new Publication(publicationTitle,projectTitle,authors,beginningDate));
        return publications;
    }


    public ArrayList<Orientation> createOrientation(ArrayList<Collaborator> collaborators,
                                                    ArrayList<Orientation> orientations) {
        boolean teacherFound = false;
        boolean studentFound = false;
        System.out.println("Type the name of the teacher:");
        String teacher = input.nextLine();
        for (Collaborator collaborator: collaborators){
            if(collaborator.getName().equals(teacher) && collaborator.isTeacher()){
                teacherFound = true;
            }
        }
        if(!teacherFound){
            System.out.println("Teacher not found, no changes made");
            return orientations;
        }

        System.out.println("Type the name of the student:");
        String student = input.nextLine();
        for (Collaborator collaborator: collaborators){
            if(collaborator.getName().equals(student)){
                studentFound = true;
            }
        }
        if(!studentFound){
            System.out.println("Student not found, no changes made");
            return orientations;
        }
        for(Orientation orientation: orientations){
            if(orientation.getTeacher().equals(teacher) && orientation.getStudent().equals(student)){
                System.out.println("Orientation already exists, no changes made");
                return orientations;
            }
        }
        Orientation temp = new Orientation(teacher,student);
        orientations.add(temp);
        return orientations;
    }
}
