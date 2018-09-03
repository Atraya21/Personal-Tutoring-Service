package com.example.cse3310.personaltutoringservice;

import java.util.ArrayList;

/**
 * Created by danie on 11/20/2017.
 */

public class Category {
    public String Category;
    public Tutor[] tutorlist = new Tutor[10];
    public int tutorcounter = 0;

    public void setCategory(String s){
        Category = s;
    }

    public String getCategory(String s){return Category;}
    public int getTutorcounter(){
        return tutorcounter;
    }

    public void addTutor(Tutor t){
        tutorlist[tutorcounter] = t;
        tutorcounter++;
    }
    public Tutor getTutor(int x){
        return tutorlist[x];
    }

    public ArrayList<String> getturorlist(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        for(int i = 0; i < tutorcounter; i++){
            result = tutorlist[i].gettutorstring();
            result = result + "\n Subject: " + Category;
            lis.add(result);
        }
        return lis;
    }
    public Tutor getthetutor(int x){
        Tutor me = new Tutor();
        me = tutorlist[x];
        return me;
    }
    public void updatetutor(Tutor t, int x){
        tutorlist[x] = t;
    }

}
