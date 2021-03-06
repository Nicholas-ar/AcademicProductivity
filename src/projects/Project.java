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
    private ArrayList<String> associatedPublications;
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
        this.currentStatus = "In elaboration";
        this.collaborators = new ArrayList();
        this.associatedPublications = new ArrayList();
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

    public ArrayList<String> getAssociatedPublications() {
        return associatedPublications;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void addCollaborators(String collaborator) {
        this.collaborators.add(collaborator);
    }

    public void setAssociatedPublications(ArrayList<String> associatedPublications) {
        this.associatedPublications = associatedPublications;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public String toString() {
        return "Title: " + title + '\n' +
                "Beginning Date: " + beginningDate + '\n' +
                "Ending Date: " + endDate + '\n' +
                "Financier: " + financier + '\n' +
                "FinancedAmount: $" + financedAmount + '\n' +
                "Objective: " + objective + '\n' +
                "Description: " + description + '\n' +
                "ResponsibleTeacher: " + responsibleTeacher.getName() + '\n' +
                "Collaborators: " + collaborators + '\n' +
                "AssociatedPublications: " + associatedPublications + '\n' +
                "CurrentStatus: " + currentStatus + '\n';
    }
}
