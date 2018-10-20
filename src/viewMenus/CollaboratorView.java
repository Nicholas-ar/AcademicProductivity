package viewMenus;

import collaborators.Collaborator;
import com.sun.org.apache.xpath.internal.operations.Or;
import productions.Orientation;
import productions.Publication;
import projects.Project;

import java.util.ArrayList;
import java.util.Scanner;

public class CollaboratorView {

    Scanner input = new Scanner(System.in);

    public ArrayList<Collaborator> createCollaborator(ArrayList<Collaborator> collaborators) {
        boolean isGradStudent = false;
        boolean isTeacher = false;
        System.out.println("Type the name of the collaborator");
        String name = input.nextLine();
        System.out.println("Type the email of the collaborator");
        String email = input.nextLine();
        System.out.println("Is this a grad student?(y) or (n)");
        String gradStudent = input.nextLine();
        if(gradStudent.contains("y") || gradStudent.contains("Y")){
            isGradStudent = true;
        }
        System.out.println("Is this a teacher?(y) or (n)");
        String teacher = input.nextLine();
        if(teacher.contains("y") || teacher.contains("Y")){
            isTeacher = true;
        }
        collaborators.add(new Collaborator(name,email,isTeacher,isGradStudent));
        System.out.println("Collaborator successfully created");
        return collaborators;
    }

    public void consultCollaborator(ArrayList<Collaborator> collaborators, ArrayList<Project> projects,
                                    ArrayList<Publication> publications, ArrayList<Orientation> orientations) {
        System.out.println("Type the name of the collaborator to consult");
        String inputName = input.nextLine();
        for (Collaborator collaborator: collaborators){
            if(collaborator.getName().equals(inputName)){
                collaborator.toString();
                System.out.println("Projects participated in: \n");
                for (Project project: projects){
                    if(project.getResponsibleTeacher().getName().equals(inputName) ||
                            project.getCollaborators().contains(inputName)){
                        System.out.println(project.getTitle() + "\n");
                    }
                }
                System.out.println("Publications authored: \n");
                for (Publication publication:publications){
                    if (publication.getAuthors().contains(inputName)){
                        System.out.println(publication.getTitle() + "\n");
                    }
                }
                System.out.println("Orientations participated in: \n");
                for (Orientation orientation:orientations){
                    if(orientation.getStudent().equals(inputName) || orientation.getTeacher().equals(inputName)){
                        System.out.println("Teacher: " + orientation.getTeacher() +
                                "Student: " + orientation.getStudent() + "\n");
                    }
                }
            }
        }
    }
}
