package productions;

import java.util.ArrayList;
import java.util.Date;

public class Publication implements Comparable<Publication> {
    private String title;
    private ArrayList<String> authors;
    private Date publicationDate;
    private String linkedProjectTitle;

    public Publication(String title,String linkedProjectTitle, ArrayList<String> authors, Date publicationDate) {
        this.title = title;
        this.linkedProjectTitle = linkedProjectTitle;
        this.authors = authors;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getLinkedProjectTitle() {
        return linkedProjectTitle;
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    @Override
    public int compareTo(Publication o) {
        return getPublicationDate().compareTo(o.getPublicationDate());
    }

    @Override
    public String toString() {
        return "Publication title: " + title + '\n' +
                "Authors:" + authors + '\n' +
                "Publication Date:" + publicationDate + '\n';
    }
}
