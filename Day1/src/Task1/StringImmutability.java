package Task1;

public class StringImmutability {
    public static void main(String[] args)
            {

        String str ="hi";
        System.out.println("Original String " +str);
        System.out.println("Memory address before concat:" +System.identityHashCode(str));

        str = str + "Word";
        System.out.println("After concatenation: " +str);
        System.out.println("Memory address after concat:" +System.identityHashCode(str));
        System.out.println("------------------------------");
        StringBuilder sb =new StringBuilder("hi");

        System.out.println("Original String " +sb);
        System.out.println("Memory address before concat:" +System.identityHashCode(sb));
        sb.append("Word");
        System.out.println("After append" +sb);
        System.out.println("Memory address after append:" +System.identityHashCode(sb));



    }

}
