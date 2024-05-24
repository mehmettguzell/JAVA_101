public class Main {
    public static void main(String[] args) {
        Course dataStructure = new Course("Data Structure", "DATA101","DATA");
        Course java = new Course("Java", "JAVA101","JAVA");
        Course  cyberSecurity = new Course("Cyber Security", "CompNet101","Comp");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "DATA");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "JAVA");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "COMP");

        dataStructure.addTeacher(t1);
        java.addTeacher(t2);
        cyberSecurity.addTeacher(t3);

        Student s1 = new Student("Mehmet","210706030", 2,dataStructure,java,cyberSecurity);
        s1.addBulkExamNote(70,80,60);
        s1.isPass();

        Student s2 = new Student("Mehmet","210706030", 2,dataStructure,java,cyberSecurity);
        s1.addBulkExamNote(10,20,30);
        s2.isPass();

        Student s3 = new Student("Mehmet","210706030", 2,dataStructure,java,cyberSecurity);
        s1.addBulkExamNote(60,55,50);
        s3.isPass();

    }
}