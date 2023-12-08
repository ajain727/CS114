public class studentGrade {
    public static void main(String[] args) {
        linklist studentGrades = new linklist();
        studentGrades.addnode(90);
        studentGrades.addnode(95);
        studentGrades.addnode(80);
        studentGrades.addnode(60);
        studentGrades.addnode(75);
        studentGrades.insertHead(50);
        studentGrades.insertTail(25);
        studentGrades.insertAtPosition(20, 2);
        studentGrades.deleteHead();
        studentGrades.deleteTail();
        studentGrades.display();
    }
}
