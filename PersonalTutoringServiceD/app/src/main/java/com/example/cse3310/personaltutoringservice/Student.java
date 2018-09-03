package com.example.cse3310.personaltutoringservice;

import java.util.ArrayList;

/**
 * Created by danie on 11/20/2017.
 */

public class Student {
    public AccountInfo myaccoutinfo = new AccountInfo();
    public Bankinfo mybankinfo = new Bankinfo();
    public Schedule mySchedule = new Schedule();
    public String[] tutornamelist = new String[10];
    public int tutornamecounter = 0;

    public AccountInfo getMyaccoutinfo() {
        return myaccoutinfo;
    }

    public void setMyaccoutinfo(AccountInfo Myaccoutinfo) {
        myaccoutinfo = Myaccoutinfo;
    }

    public Bankinfo getMybankinfo() {
        return mybankinfo;
    }

    public void setMybankinfo(Bankinfo Mybankinfo) {
        mybankinfo = Mybankinfo;
    }

    public Schedule getMySchedule() {
        return mySchedule;
    }

    public void setMySchedule(Schedule MySchedule) {
        mySchedule = MySchedule;
    }

    public void addtutorname(String s){
        tutornamelist[tutornamecounter] = s;
        tutornamecounter++;
    }
    public ArrayList<String> getturornamelist(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        for(int i = 0; i < tutornamecounter; i++){
            result =tutornamelist[i];
            lis.add(result);
        }
        return lis;
    }
    public String getstudentid(){
        String temp = null;
        temp = myaccoutinfo.getId();
        return temp;
    }
    public String getstudentpassword(){
        String temp = null;
        temp = myaccoutinfo.getPassword();
        return temp;

    }
    public String getfirstname(){
        String temp = null;
        temp = myaccoutinfo.getFirstname();
        return temp;

    }
}
