package projects;

import collaborators.Collaborator;
import productions.Publication;

import java.util.Date;
import java.util.ArrayList;

public class Project {
    private String title;
    private Date beginningDate;
    private Date endDate;
    private String financier;
    private double financedAmount;
    private String objective;
    private String description;
    private Collaborator responsibleTeacher;
    private ArrayList<String> collaborators;
    private ArrayList<Publication> associatedPublications;
    private String currentStatus;

    public Project(String title, Date beginningDate, Date endDate, String financier, double financedAmount,
                   String objective, String description, Collaborator responsibleTeacher) {
        this.title = title;
        this.beginningDate = beginningDate;
        this.endDate = endDate;
        this.financier = financier;
        this.financedAmount = financedAmount;
        this.objective = objective;
        this.description = description;
        this.responsibleTeacher = responsibleTeacher;
        this.collaborators = null;
        this.currentStatus = "In elaboration";
        this.associatedPublications = null;
    }

    public String getTitle() {
        return title;
    }

    public Date getBeginningDate() {
        return beginningDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getFinancier() {
        return financier;
    }

    public double getFinancedAmount() {
        return financedAmount;
    }

    public String getObjective() {
        return objective;
    }

    public String getDescription() {
        return description;
    }

    public Collaborator getResponsibleTeacher() {
        return responsibleTeacher;
    }

    public ArrayList<String> getCollaborators() {
        return collaborators;
    }

    public ArrayList<Publication> getAssociatedPublications() {
        return associatedPublications;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void addCollaborators(String collaborator) {
        this.collaborators.add(collaborator);
    }

    public void setAssociatedPublications(ArrayList<Publication> associatedPublications) {
        this.associatedPublications = associatedPublications;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }
}
