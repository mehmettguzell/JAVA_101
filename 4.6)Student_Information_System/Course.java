public class Course {
    Teacher courseTeacher;
    private String name;
    private String code;
    private String prefix;
    private int note;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (this.prefix.equals(teacher.getBranch())) {
            this.courseTeacher = teacher;
            System.out.println("transaction successful");
        } else {
            System.out.println(teacher.getBranch() + " cannot teach this course");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(" Academician of course " + this.getName() + " : " + courseTeacher.getName());
        } else {
            System.out.println("There is no academician identified for " + this.getName());
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
