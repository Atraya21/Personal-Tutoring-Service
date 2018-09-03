package com.example.cse3310.personaltutoringservice;

/**
 * Created by danie on 11/20/2017.
 */

public class TimeBlock {
    String starttime = null;
    String finishtime = null;
    String tutor = null;
    String student = null;
    int    Istarttime = 0;
    int    Ifinishtime = 0;

    public int getIstarttime() {
        return Istarttime;
    }

    public void setIstarttime(int istarttime) {
        Istarttime = istarttime;
    }

    public int getIfinishtime() {
        return Ifinishtime;
    }

    public void setIfinishtime(int ifinishtime) {
        Ifinishtime = ifinishtime;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String Starttime) {
        starttime = Starttime;
    }

    public String getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(String Finishtime) {
        finishtime = Finishtime;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String Tutor) {
        tutor = Tutor;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String Student) {
        student = Student;
    }
}
