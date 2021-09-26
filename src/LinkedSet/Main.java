package LinkedSet;

public class Main {
    public static void main(String[] args) {
        StudentSinglyLinkedSet studentList = new StudentSinglyLinkedSet();


        Student a = new Student( "A", 2021-001);
        Student b = new Student( "B", 2021-002);
        Student c = new Student( "C", 2021-003);

        studentList.addToFront(a);
        studentList.addToFront(b);
        studentList.addToFront(c);

        studentList.printSll();



    }
}
