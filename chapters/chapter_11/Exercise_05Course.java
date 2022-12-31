package chapters.chapter_11;

import java.util.ArrayList;

public class Exercise_05Course {
    private String courName ;
    private ArrayList<String> list = new ArrayList<>() ;
    public Exercise_05Course(){
        this("") ;
    }
    public Exercise_05Course(String courseName){
        this.courName=courseName;
    }
    public void addStudent(String student) {
        list.add(student);
    }
    public String[] getStudents() {
        String[] result = new String[list.size()] ;
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result ;
    }
    public int getNumberOfStudents() {
        return list.size() - 1 ;
    }
    public String getCourName() {
        return courName ;
    }
    public void dropStudent(String student) {
        list.remove(student) ;
    }
}
