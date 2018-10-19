package collaborators;

public class Collaborator {
    private String name;
    private String email;
    private boolean isTeacher;
    private boolean isGradStudent;

    public Collaborator(String name, String email, boolean isTeacher, boolean isGradStudent) {
        this.name = name;
        this.email = email;
        this.isTeacher = isTeacher;
        this.isGradStudent = isGradStudent;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public boolean isTeacher() {
        return isTeacher;
    }

    public boolean isGradStudent() {
        return isGradStudent;
    }
}
