class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int total = 11*55;
    double blue = total * 0.24;
    double brown = total * 0.13;
    double green = total * 0.16;
    double orange = total * 0.20;
    double red = total * 0.13;
    double yellow = total * 0.14;

    System.out.println("blue:" +blue);
    System.out.println("brown:" +brown);
    System.out.println("green:" +green);
    System.out.println("orange:" +orange);
    System.out.println("red:" +red);
    System.out.println("yellow:" +yellow);

    double sum = blue + brown + green + orange + red + yellow;

    System.out.println("sum:" +sum);

    if(blue>brown && red>orange)
      System.out.println("Blue over Brown and Red over Orange");

    if(brown<=green)
      System.out.println("Brown is less than or equal to Green");
    
    if(sum==total)
      System.out.println("Numbers Match");
  }
}