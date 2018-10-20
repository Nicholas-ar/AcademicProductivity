package viewMenus;

import collaborators.Collaborator;
import productions.*;
import projects.Project;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductionView {

    Scanner input = new Scanner(System.in);

    public ArrayList<Publication> createPublication(ArrayList<Publication> publications,
                                                    ArrayList<Collaborator> collaborators, ArrayList<Project> projects) {
        System.out.println("Type the name of the project to which the publication is linked to");

        String project = input.nextLine();


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
