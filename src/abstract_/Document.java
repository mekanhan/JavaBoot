package abstract_;

import java.util.Date;

abstract class Document {
    private String [] authors;
    private Date date;

    public Document(String[] authors, Date date){
        this.authors=authors;
        this.date=date;
    }
    public String[] getAuthors(){
        return authors;
    }
    public Date getDate(){
        this.date=date;
        return date;
    }
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }
}
