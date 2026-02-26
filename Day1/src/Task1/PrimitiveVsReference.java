package Task1;

public class PrimitiveVsReference {


static class Person {
    String name;
}

        {
            int a=10;
            int b=a;
            System.out.println("Before changing b:");
            System.out.println("a = " +a);
            System.out.println("b = " +b);
            b=20;
            System.out.println("\nAfter changing b:");
            System.out.println("a = " +a);
            System.out.println("b = " +b);

             Person p1 = new Person();
             p1.name ="Sakshi";
             Person p2=p1;System.out.println("\nBefore changing p2.name");
            System.out.println("p1.name = " +p1.name);
            System.out.println("p2.name = " +p2.name);
            p2.name="Priya";
            System.out.println("\nAfter changing p2.name:");
            System.out.println("p1.name = " +p1.name);
            System.out.println("p2.name = " +p2.name);
    }
    }

