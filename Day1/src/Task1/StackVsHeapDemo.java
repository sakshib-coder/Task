package Task1;

class Student{
    int id;
    Student(int id){
        this.id = id;

    }
}
public class StackVsHeapDemo {
    public static void main(String[] args){
        int number = 10;
        System.out.println("Primitive value (Stack):" + number);
        Student s1 = new Student(1);
        Student s2 =new Student (2);
        Student s3 =new Student(3);

        System.out.println("Reference of s1 ;"  +System.identityHashCode(s1));
        System.out.println("Reference of s2 ;"  +System.identityHashCode(s2));
        System.out.println("Reference of s13;"  +System.identityHashCode(s3));

        Student copy =s1;
        System.out.println("Reference of copy(same as s1): "+System.identityHashCode(copy));
    }
}






