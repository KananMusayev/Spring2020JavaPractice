package Rephlits;

public class Book {
    String title;
    String autor;
    String tableOfContents="";
    int nextPage =1;

    public Book(String title,String autor){
        this.title=title;
        this.autor=autor;
    }
    public void addChapter(String chaptertitle,int numberofpages){
        System.out.println("chapter title"+chaptertitle+nextPage);
        nextPage+=numberofpages;
    }

}
