public class Main {
    public static void main(String[] args) {



       for (int i = 1; i <= 5 ; i++){
           LPAStudent student = new LPAStudent("s92300" + i,
                   switch (i){
               case 1 -> "abdulkeim";
               case 2 -> "mohammed";
               case 3 -> "Blen";
               case 4 -> "Tim";
               case 5 -> "Lisa";
               default -> "Anonymous"; },
                   switch (i){
               case 1 -> "12/17/1999";
               case 2 -> "11/23/2000";
               case 3 -> "11/15/1998";
               case 4 -> "10/12/2001";
               case 5 -> "06/25/2007";
                       default -> "NoBirth Date";
                   },
                   "java Master class");
           System.out.println(student);
       }

       Student pojoStudent = new Student("s923001","Abdu","12/28/2001","Java master class");
       LPAStudent recordStudent = new LPAStudent("s923001","Abdu","12/28/2001","Java master class");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());

        // Wall
        Wall wall = new Wall(-1.25,-1.25);
        System.out.println("area of the wall = " + wall.getArea());

        // Carpet cost Calculator
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

        // complex Number calculator

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());

        // Circle And Cylinder Calculator

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());

        // Pool Area for Rectangle and Cuboid

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getLength());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
    }
}