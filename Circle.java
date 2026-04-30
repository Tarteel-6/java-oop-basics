public class Circle {
    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
     }
     public double getRadius(){
        return radius;
     }

    public double TheFinalValue(){
        double res = Math.PI * getRadius()*getRadius();
        return res;
    }

    public String toString(){
        return "the area " + TheFinalValue();
    }

}
