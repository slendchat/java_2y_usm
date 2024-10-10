public class Form {

  public class Side {
    public int length;

    public int getLen() {
      return length;
    }

    public void setLen(int length) {
      this.length = length;
    }

    @Override
    public String toString() {
      return "Side [length=" + length + "]";
    }
  }

  public class Rectangle extends Side {

    public int width;

    // CONSTRUCTOR
    public Rectangle(int length, int width) {
      setLen(length);
      this.width = width;
    }

    public int getWidth() {
      return width;
    }

    public void setWidth(int width) {
      this.width = width;
    }

    public int calcArea(){
      return getLen()*getWidth();
    }

    @Override
    public String toString() {
      return super.toString() + "Rectangle [width=" + width + ", area=" + calcArea() + "] ";
    }
  }

  public class Parallelepiped extends Rectangle {
    public int height;
    public double density;

    //CONSTRUCTOR
    public Parallelepiped(int length, int width, int height, double density){
      super(length, width);
      this.height=height;
      this.density=density;
    }

    public int get_height(){
      return height;
    }
    public int calcVolume(){
      return calcArea()*height;
    }
    public double calcWeight(){
      return calcVolume()*density;
    }

    @Override
    public String toString() {
      return super.toString() + "Parallelepiped [height=" + height
              + ", density=" + density
              + ", volume=" + calcVolume()
              + ", weight=" + calcWeight() + "] ";
    }
  }

  public void compareParallelepipeds(Parallelepiped p1, Parallelepiped p2) {
    // Сравнение объемов
    if (p1.calcVolume() > p2.calcVolume()) {
      System.out.println("\n[ + ] Parallelepiped 1 is larger.");
    } else if (p1.calcVolume() < p2.calcVolume()) {
      System.out.println("\n[ + ] Parallelepiped 2 is larger.");
    } else {
      System.out.println("\n[ + ] Both parallelepipeds have the same volume.");
    }

    // Сравнение весов
    if (p1.calcWeight() < p2.calcWeight()) {
      System.out.println("[ + ] Parallelepiped 1 is lighter.\n");
    } else if (p1.calcWeight() > p2.calcWeight()) {
      System.out.println("[ + ] Parallelepiped 2 is lighter.\n");
    } else {
      System.out.println("[ + ] Both parallelepipeds have the same weight.\n");
    }
  }

}
