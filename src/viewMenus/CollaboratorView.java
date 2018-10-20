package viewMenus;

import collaborators.Collaborator;

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
}
