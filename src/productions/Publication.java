package productions;

import collaborators.Collaborator;

import java.util.ArrayList;

public class Publication {
    private String title;
    private ArrayList<String> authors;

    public Publication(String title, ArrayList<String> authors) {
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }
}
