public class Circle {
    public double radius;
     public double TheFinalValue(){
         double res = Math.PI*radius*radius;
        return res;
     }
     public String ToString(){
         return "the area " + TheFinalValue();
     }

}
