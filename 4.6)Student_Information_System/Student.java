public class Student {
    Course dataStructure;
    Course java;
    Course cyberSecurity;
    private String name, stuNo;
    private int classes;
    private double average;
    private boolean isPass;
    public Student(String name, String stuNo,int classes, Course dataStructure, Course java, Course cyberSecurity){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.dataStructure = dataStructure;
        this.java = java;
        this.cyberSecurity = cyberSecurity;
        calculateAverage();
         isPass = false;
    }

    private void calculateAverage() {
        this.average = (this.dataStructure.getNote() + this.java.getNote() + this.cyberSecurity.getNote()) / 3;
    }
    public void addBulkExamNote(int dataStructure, int java, int cyberSecurity) {

        if (dataStructure >= 0 && dataStructure <= 100) {
            this.dataStructure.setNote(dataStructure);
        }

        if (java >= 0 && java <= 100) {
            this.java.setNote(java);
        }

        if (cyberSecurity >= 0 && cyberSecurity <= 100) {
            this.cyberSecurity.setNote(cyberSecurity);
        }
    }
     public void isPass(){
        this.isPass = isCheckPass();
        printNote();
         System.out.println("Average : " + this.average);
         if(this.isPass){
             System.out.println("Passed.");
         }else {
             System.out.println("Failed.");
         }
    }

    private void printNote() {
        System.out.println("====================");
        System.out.println("Student " + this.name);
        System.out.println("Data Structure Note: " + this.dataStructure.getNote());
        System.out.println("Java Note: " + this.java.getNote());
        System.out.println("Cyber Security Note: " + this.cyberSecurity.getNote());
    }

    private boolean isCheckPass() {
        calculateAverage();
        return this.average >= 55;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }
}
