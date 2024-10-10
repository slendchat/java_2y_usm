public class Program {
  public static void main(String[] args) {
    Form form = new Form();

    Form.Parallelepiped p1 = form.new Parallelepiped(4, 4, 6, 2.5);
    Form.Parallelepiped p2 = form.new Parallelepiped(3, 6, 7, 3.0);

    System.out.println("[ + ] Parallelepiped 1 characteristics:");
    System.out.println(p1);

    System.out.println("\n[ + ] Parallelepiped 2 characteristics:");
    System.out.println(p2);

    form.compareParallelepipeds(p1,p2);
  }
}
