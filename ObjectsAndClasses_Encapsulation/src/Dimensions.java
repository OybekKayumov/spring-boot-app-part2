public class Dimensions {

   private final double width;
   private final double height;
   private final double length;

    public Dimensions(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double calcVolume() {
       return width * height * length;
   }
}
