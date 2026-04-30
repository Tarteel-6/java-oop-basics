public class Book {
    private String title;
    private int pages;

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setPages(int pages){
        this.pages = pages;
    }
    public int getPages(){
        return pages;
    }
    public String toString(){
        return "The Title of the book is "+ getTitle() + ", and the num of the pages is " + getPages() ;

    }

}
