package com.example.cse3310.personaltutoringservice;

import java.util.ArrayList;

/**
 * Created by danie on 11/20/2017.
 */

public class Tutor {
    public AccountInfo myaccoutinfo = new AccountInfo();
    public Bankinfo mybankinfo = new Bankinfo();
    public Schedule mySchedule = new Schedule();
    public Review[] myreviews = new Review[10];
    public int ReviewCounter=0;

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
    public void addReview(Review rev){
        myreviews[ReviewCounter] = rev;
        ReviewCounter++;
    }
    public  int reviewsum(){
        float sum = 0;
        int sumtotal;
        if(ReviewCounter == 0){
            return 0;
        }
        else {
            for (int i = 0; i < ReviewCounter; i++) {
                sum = myreviews[i].getRating();
            }
            sumtotal = (int) (sum / ReviewCounter);
            return sumtotal;
        }
    }
    public String gettutorstring(){
        String data = null;
        data = myaccoutinfo.getFirstname() + " " + myaccoutinfo.getLastname() +"\n rating:" + reviewsum();
        return data;
    }
    public String gettutorname(){
        String data = null;
        String one = myaccoutinfo.getFirstname();
        String two = myaccoutinfo.getLastname();
        data = one + two;
        return data;
    }
    public ArrayList<String> getReviewlist(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        for(int i = 0; i < ReviewCounter; i++){
            result = myreviews[i].getReview() + "\n Rating: " + myreviews[i].getRating();
            lis.add(result);
        }
        return lis;
    }
    public String gettutorid(){
        String temp = null;
        temp = myaccoutinfo.getId();
        return temp;
    }
    public String gettutorpassword(){
        String temp = null;
        temp = myaccoutinfo.getPassword();
        return temp;

    }

}
