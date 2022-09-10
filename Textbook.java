package Textbook;

public class Textbook {
    //The variables for the textbook class
    private int numOfPages;
    private String subject;
    private int numOfChapter;
    //no-arg constructor in the program
    public Textbook(){
        this(2400,"History",21);
    }
    //three argument constructor
    public Textbook(int numOfPages, String subject, int numOfChapter){
        this.numOfPages = numOfPages;
        this.subject = subject;
        this.numOfChapter = numOfChapter;
    }
    //getters and setters of numOfPages
    public int getNumOfPages(){
        return numOfPages;
    }
    public void setNumOfPages(int numOfPages){
        this.numOfPages = numOfPages;
    }
    //getters and setters of subject
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    //getters and setters of numOfChapter
    public int getNumOfChapter(){
        return numOfChapter;
    }
    public void setNumOfChapter(int numOfChapter){
        this.numOfChapter = numOfChapter;
    }

    public void detail(){
        System.out.println("The number of pages is: " + numOfPages);
        System.out.println("The subject matter of the textbook: " + subject);
        System.out.println("The number of chapters is: " + numOfChapter);
    }

    @Override
    public String toString(){
        return "Number of pages: " + numOfPages + "\n" + "Subject matter: " + subject + "\n" + "Number of chapters: " + numOfChapter;
    }
}
