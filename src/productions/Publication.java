package productions;

import java.util.ArrayList;
import java.util.Date;

public class Publication implements Comparable<Publication> {
    private String title;
    private ArrayList<String> authors;
    private Date publicationDate;

    public Publication(String title, ArrayList<String> authors, Date publicationDate) {
        this.title = title;
        this.authors = authors;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
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
}
