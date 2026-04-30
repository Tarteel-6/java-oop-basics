public class Counter {
    private int  count;
     public void setCount(int count ){
         this.count = count;
     }
     public int getCount(){
         return count;
     }

    public void increase() {
        count++;
    }

    public  void decrease() {
        count--;
    }

    public String toString(){
         return "The count is " + getCount();
    }
}

