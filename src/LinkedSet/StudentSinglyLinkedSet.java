package LinkedSet;

public class StudentSinglyLinkedSet {
    private StudentNode head;
    private int size;
    private StudentNode tail;

    public StudentSinglyLinkedSet() {
        head = null;
        size = 0;
        tail = null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addToFront(Student student){
        StudentNode node = new StudentNode(student);

        node.setNext(head); // lấy next móc vào
        head = node; // gán đầu vào node
        if(this.tail == null){ // nếu không có toa tàu nào thì gán tail vào data vừa thêm
            this.tail = node;
        }
        size++; // tăng thêm một size

    }
    public void printSll() {
        StudentNode current; // 'hiện hành thực tế'

        current = head;

        while(current != null){
            System.out.print(current.getStudent() + "---->");
            current = current.getNext();
        }

        System.out.print("NULL");
    }
}
