package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Hirep2 extends AppCompatActivity {
    String starttime = null;
    String starttime2 = null;
    String finishtime = null;
    String finishtime2 = null;
    int newnumber = 0;
    int startnumber = 0;
    int finishnumber = 0;
    int startnumber2 = 0;
    int finishnumber2 = 0;
    int day = 0;
    TimeBlock editblock = new TimeBlock();
    TimeBlock editblock2 = new TimeBlock();
    Tutor metutor = new Tutor();
    Student mestudent = new Student();
    Schedule temp = new Schedule();
    Schedule temp2 = new Schedule();
    String nameT = null;
    String nameTlast = null;
    String finalname = null;
    String nameS = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hirep2);
    }
    public void clickedone(View view){
        FullData g = (FullData) getApplication();
        editblock = g.getEditblock();
        day = g.getBlockdaychoice();
        startnumber = editblock.getIstarttime();
        finishnumber = editblock.getIfinishtime();
        newnumber = startnumber + 1;
        if(newnumber > finishnumber){
            Toast.makeText(this,"Error execds times select sorter time",Toast.LENGTH_LONG).show();

        }
        else if(newnumber == finishnumber){
            mestudent = g.getMainuserstudent();
            metutor = g.getPrehiretutor();
            nameT = metutor.myaccoutinfo.getFirstname();
            nameTlast = metutor.myaccoutinfo.getLastname();
            finalname = nameT+nameTlast;
            nameS = mestudent.myaccoutinfo.getFirstname();
            editblock.setTutor(nameT);
            editblock.setStudent(nameS);
            temp = mestudent.getMySchedule();
            temp2 = metutor.getMySchedule();
            if(day ==1){
              temp.addTomonday(editblock);
              temp2.addTomonday(editblock);

            }
            else if(day == 2){
                temp.addTotuesday(editblock);
                temp2.addTotuesday(editblock);

            }
            else if(day == 3){
                temp.addTowednesday(editblock);
                temp2.addTowednesday(editblock);

            }
            else if(day == 4){
                temp.addTothursday(editblock);
                temp2.addTothursday(editblock);

            }
            else if(day == 5){
                temp.addTofriday(editblock);
                temp2.addTofriday(editblock);

            }
            else if(day == 6){
                temp.addTosaturday(editblock);
                temp2.addTosaturday(editblock);

            }
            else if(day == 7){
                temp.addTosunday(editblock);
                temp2.addTosunday(editblock);
            }
            mestudent.setMySchedule(temp);
            metutor.setMySchedule(temp2);
            mestudent.addtutorname(finalname);
            g.setMainuserstudent(mestudent);
            g.setPrehiretutor(metutor);
            g.updatePreHire();
            Intent nextpage = new Intent(Hirep2.this,StudentHomepage.class);
            startActivity(nextpage);
    }
        else if(newnumber < finishnumber){
            editblock = g.getEditblock();
            day = g.getBlockdaychoice();
            startnumber = editblock.getIstarttime();
            finishnumber = editblock.getIfinishtime();
            starttime = editblock.getFinishtime();
            startnumber2 = editblock.getIfinishtime();
            mestudent = g.getMainuserstudent();
            metutor = g.getPrehiretutor();
            nameT = metutor.myaccoutinfo.getFirstname();
            nameTlast = metutor.myaccoutinfo.getLastname();
            finalname = nameT+nameTlast;
            nameS = mestudent.myaccoutinfo.getFirstname();
            editblock.setTutor(nameT);
            editblock.setStudent(nameS);
            temp = mestudent.getMySchedule();
            temp2 = metutor.getMySchedule();

            if(newnumber == 1){
                starttime2 = "1:00am";
            }
            else if(newnumber == 2){
                starttime2 = "2:00am";
            }
            else if(newnumber == 3){
                starttime2 = "3:00am";
            }

            else if(newnumber == 4){
                starttime2 = "4:00am";
            }

            else if(newnumber == 5){
                starttime2 = "5:00am";
            }
            else if(newnumber == 6){
                starttime2 = "6:00am";
            }
            else if(newnumber == 7){
                starttime2 = "7:00am";
            }
            else if(newnumber == 8){
                starttime2 = "8:00am";
            }
            else if(newnumber == 9){
                starttime2 = "9:00am";
            }
            else if(newnumber == 10){
                starttime2 = "10:00am";
            }
            else if(newnumber == 11){
                starttime2 = "11:00am";
            }

            else if(newnumber == 12){
                starttime2 = "12:00pm";
            }
            else if(newnumber == 13){
                starttime2 = "1:00pm";
            }
            else if(newnumber == 14){
                starttime2 = "2:00pm";
            }
            else if(newnumber == 15){
                starttime2 = "3:00pm";
            }

            else if(newnumber == 16){
                starttime2 = "4:00pm";
            }

            else if(newnumber == 17){
                starttime2 = "5:00pm";
            }
            else if(newnumber == 18){
                starttime2 = "6:00am";
            }
            else if(newnumber == 19){
                starttime2 = "7:00pm";
            }
            else if(newnumber == 20){
                starttime2 = "8:00pm";
            }
            else if(newnumber == 21){
                starttime2 = "9:00pm";
            }
            else if(newnumber == 22){
                starttime2 = "10:00pm";
            }
            else if(newnumber == 23){
                starttime2 = "11:00pm";
            }

            else if(newnumber == 24){
                starttime2 = "12:00am";
            }
            editblock.setFinishtime(starttime2);
            editblock.setIfinishtime(newnumber);
            editblock.setStudent(nameS);
            editblock.setTutor(nameT);
            editblock2.setStarttime(starttime2);
            editblock2.setIstarttime(newnumber);
            editblock2.setFinishtime(starttime);
            editblock2.setIfinishtime(startnumber2);
            if(day ==1){
                temp.addTomonday(editblock);
                temp2.addTomonday(editblock);
                temp2.addTomonday(editblock2);

            }
            else if(day == 2){
                temp.addTotuesday(editblock);
                temp2.addTotuesday(editblock);
                temp2.addTotuesday(editblock2);

            }
            else if(day == 3){
                temp.addTowednesday(editblock);
                temp2.addTowednesday(editblock);
                temp2.addTowednesday(editblock2);

            }
            else if(day == 4){
                temp.addTothursday(editblock);
                temp2.addTothursday(editblock);
                temp2.addTothursday(editblock2);


            }
            else if(day == 5){
                temp.addTofriday(editblock);
                temp2.addTofriday(editblock);
                temp2.addTofriday(editblock2);

            }
            else if(day == 6){
                temp.addTosaturday(editblock);
                temp2.addTosaturday(editblock);
                temp2.addTosaturday(editblock2);

            }
            else if(day == 7){
                temp.addTosunday(editblock);
                temp2.addTosunday(editblock);
                temp2.addTosunday(editblock2);
            }

            mestudent.setMySchedule(temp);
            metutor.setMySchedule(temp2);
            mestudent.addtutorname(finalname);
            g.setMainuserstudent(mestudent);
            g.setPrehiretutor(metutor);
            g.updatePreHire();
            Intent nextpage = new Intent(Hirep2.this,StudentHomepage.class);
            startActivity(nextpage);

        }

        }

    public void clickedtwo(View view){
        FullData g = (FullData) getApplication();
        editblock = g.getEditblock();
        day = g.getBlockdaychoice();
        startnumber = editblock.getIstarttime();
        finishnumber = editblock.getIfinishtime();
        newnumber = startnumber + 2;
        if(newnumber > finishnumber){
            Toast.makeText(this,"Error execds times select sorter time",Toast.LENGTH_LONG).show();

        }
        else if(newnumber == finishnumber){
            mestudent = g.getMainuserstudent();
            metutor = g.getPrehiretutor();
            nameT = metutor.myaccoutinfo.getFirstname();
            nameTlast = metutor.myaccoutinfo.getLastname();
            finalname = nameT+nameTlast;
            nameS = mestudent.myaccoutinfo.getFirstname();
            editblock.setTutor(nameT);
            editblock.setStudent(nameS);
            temp = mestudent.getMySchedule();
            temp2 = metutor.getMySchedule();
            if(day ==1){
                temp.addTomonday(editblock);
                temp2.addTomonday(editblock);

            }
            else if(day == 2){
                temp.addTotuesday(editblock);
                temp2.addTotuesday(editblock);

            }
            else if(day == 3){
                temp.addTowednesday(editblock);
                temp2.addTowednesday(editblock);

            }
            else if(day == 4){
                temp.addTothursday(editblock);
                temp2.addTothursday(editblock);

            }
            else if(day == 5){
                temp.addTofriday(editblock);
                temp2.addTofriday(editblock);

            }
            else if(day == 6){
                temp.addTosaturday(editblock);
                temp2.addTosaturday(editblock);

            }
            else if(day == 7){
                temp.addTosunday(editblock);
                temp2.addTosunday(editblock);
            }
            mestudent.setMySchedule(temp);
            metutor.setMySchedule(temp2);
            mestudent.addtutorname(finalname);
            g.setMainuserstudent(mestudent);
            g.setPrehiretutor(metutor);
            g.updatePreHire();
            Intent nextpage = new Intent(Hirep2.this,StudentHomepage.class);
            startActivity(nextpage);
        }
        else if(newnumber < finishnumber){
            editblock = g.getEditblock();
            day = g.getBlockdaychoice();
            startnumber = editblock.getIstarttime();
            finishnumber = editblock.getIfinishtime();
            starttime = editblock.getFinishtime();
            startnumber2 = editblock.getIfinishtime();
            mestudent = g.getMainuserstudent();
            metutor = g.getPrehiretutor();
            nameT = metutor.myaccoutinfo.getFirstname();
            nameTlast = metutor.myaccoutinfo.getLastname();
            finalname = nameT+nameTlast;
            nameS = mestudent.myaccoutinfo.getFirstname();
            editblock.setTutor(nameT);
            editblock.setStudent(nameS);
            temp = mestudent.getMySchedule();
            temp2 = metutor.getMySchedule();

            if(newnumber == 1){
                starttime2 = "1:00am";
            }
            else if(newnumber == 2){
                starttime2 = "2:00am";
            }
            else if(newnumber == 3){
                starttime2 = "3:00am";
            }

            else if(newnumber == 4){
                starttime2 = "4:00am";
            }

            else if(newnumber == 5){
                starttime2 = "5:00am";
            }
            else if(newnumber == 6){
                starttime2 = "6:00am";
            }
            else if(newnumber == 7){
                starttime2 = "7:00am";
            }
            else if(newnumber == 8){
                starttime2 = "8:00am";
            }
            else if(newnumber == 9){
                starttime2 = "9:00am";
            }
            else if(newnumber == 10){
                starttime2 = "10:00am";
            }
            else if(newnumber == 11){
                starttime2 = "11:00am";
            }

            else if(newnumber == 12){
                starttime2 = "12:00pm";
            }
            else if(newnumber == 13){
                starttime2 = "1:00pm";
            }
            else if(newnumber == 14){
                starttime2 = "2:00pm";
            }
            else if(newnumber == 15){
                starttime2 = "3:00pm";
            }

            else if(newnumber == 16){
                starttime2 = "4:00pm";
            }

            else if(newnumber == 17){
                starttime2 = "5:00pm";
            }
            else if(newnumber == 18){
                starttime2 = "6:00am";
            }
            else if(newnumber == 19){
                starttime2 = "7:00pm";
            }
            else if(newnumber == 20){
                starttime2 = "8:00pm";
            }
            else if(newnumber == 21){
                starttime2 = "9:00pm";
            }
            else if(newnumber == 22){
                starttime2 = "10:00pm";
            }
            else if(newnumber == 23){
                starttime2 = "11:00pm";
            }

            else if(newnumber == 24){
                starttime2 = "12:00am";
            }
            editblock.setFinishtime(starttime2);
            editblock.setIfinishtime(newnumber);
            editblock.setStudent(nameS);
            editblock.setTutor(nameT);
            editblock2.setStarttime(starttime2);
            editblock2.setIstarttime(newnumber);
            editblock2.setFinishtime(starttime);
            editblock2.setIfinishtime(startnumber2);

            if(day ==1){
                temp.addTomonday(editblock);
                temp2.addTomonday(editblock);
                temp2.addTomonday(editblock2);

            }
            else if(day == 2){
                temp.addTotuesday(editblock);
                temp2.addTotuesday(editblock);
                temp2.addTotuesday(editblock2);

            }
            else if(day == 3){
                temp.addTowednesday(editblock);
                temp2.addTowednesday(editblock);
                temp2.addTowednesday(editblock2);

            }
            else if(day == 4){
                temp.addTothursday(editblock);
                temp2.addTothursday(editblock);
                temp2.addTothursday(editblock2);


            }
            else if(day == 5){
                temp.addTofriday(editblock);
                temp2.addTofriday(editblock);
                temp2.addTofriday(editblock2);

            }
            else if(day == 6){
                temp.addTosaturday(editblock);
                temp2.addTosaturday(editblock);
                temp2.addTosaturday(editblock2);

            }
            else if(day == 7){
                temp.addTosunday(editblock);
                temp2.addTosunday(editblock);
                temp2.addTosunday(editblock2);
            }

            mestudent.setMySchedule(temp);
            metutor.setMySchedule(temp2);
            mestudent.addtutorname(finalname);
            g.setMainuserstudent(mestudent);
            g.setPrehiretutor(metutor);
            g.updatePreHire();
            Intent nextpage = new Intent(Hirep2.this,StudentHomepage.class);
            startActivity(nextpage);

        }

    }

    public void clickedfour(View view){
        FullData g = (FullData) getApplication();
        editblock = g.getEditblock();
        day = g.getBlockdaychoice();
        startnumber = editblock.getIstarttime();
        finishnumber = editblock.getIfinishtime();
        newnumber = startnumber + 4;
        if(newnumber > finishnumber){
            Toast.makeText(this,"Error execds times select sorter time",Toast.LENGTH_LONG).show();

        }
        else if(newnumber == finishnumber){
            mestudent = g.getMainuserstudent();
            metutor = g.getPrehiretutor();
            nameT = metutor.myaccoutinfo.getFirstname();
            nameTlast = metutor.myaccoutinfo.getLastname();
            finalname = nameT+nameTlast;
            nameS = mestudent.myaccoutinfo.getFirstname();
            editblock.setTutor(nameT);
            editblock.setStudent(nameS);
            temp = mestudent.getMySchedule();
            temp2 = metutor.getMySchedule();
            if(day ==1){
                temp.addTomonday(editblock);
                temp2.addTomonday(editblock);

            }
            else if(day == 2){
                temp.addTotuesday(editblock);
                temp2.addTotuesday(editblock);

            }
            else if(day == 3){
                temp.addTowednesday(editblock);
                temp2.addTowednesday(editblock);

            }
            else if(day == 4){
                temp.addTothursday(editblock);
                temp2.addTothursday(editblock);

            }
            else if(day == 5){
                temp.addTofriday(editblock);
                temp2.addTofriday(editblock);

            }
            else if(day == 6){
                temp.addTosaturday(editblock);
                temp2.addTosaturday(editblock);

            }
            else if(day == 7){
                temp.addTosunday(editblock);
                temp2.addTosunday(editblock);
            }
            mestudent.setMySchedule(temp);
            metutor.setMySchedule(temp2);
            mestudent.addtutorname(finalname);
            g.setMainuserstudent(mestudent);
            g.setPrehiretutor(metutor);
            g.updatePreHire();
            Intent nextpage = new Intent(Hirep2.this,StudentHomepage.class);
            startActivity(nextpage);
        }
        else if(newnumber < finishnumber){
            editblock = g.getEditblock();
            day = g.getBlockdaychoice();
            startnumber = editblock.getIstarttime();
            finishnumber = editblock.getIfinishtime();
            starttime = editblock.getFinishtime();
            startnumber2 = editblock.getIfinishtime();
            mestudent = g.getMainuserstudent();
            metutor = g.getPrehiretutor();
            nameT = metutor.myaccoutinfo.getFirstname();
            nameTlast = metutor.myaccoutinfo.getLastname();
            finalname = nameT+nameTlast;
            nameS = mestudent.myaccoutinfo.getFirstname();
            editblock.setTutor(nameT);
            editblock.setStudent(nameS);
            temp = mestudent.getMySchedule();
            temp2 = metutor.getMySchedule();

            if(newnumber == 1){
                starttime2 = "1:00am";
            }
            else if(newnumber == 2){
                starttime2 = "2:00am";
            }
            else if(newnumber == 3){
                starttime2 = "3:00am";
            }

            else if(newnumber == 4){
                starttime2 = "4:00am";
            }

            else if(newnumber == 5){
                starttime2 = "5:00am";
            }
            else if(newnumber == 6){
                starttime2 = "6:00am";
            }
            else if(newnumber == 7){
                starttime2 = "7:00am";
            }
            else if(newnumber == 8){
                starttime2 = "8:00am";
            }
            else if(newnumber == 9){
                starttime2 = "9:00am";
            }
            else if(newnumber == 10){
                starttime2 = "10:00am";
            }
            else if(newnumber == 11){
                starttime2 = "11:00am";
            }

            else if(newnumber == 12){
                starttime2 = "12:00pm";
            }
            else if(newnumber == 13){
                starttime2 = "1:00pm";
            }
            else if(newnumber == 14){
                starttime2 = "2:00pm";
            }
            else if(newnumber == 15){
                starttime2 = "3:00pm";
            }

            else if(newnumber == 16){
                starttime2 = "4:00pm";
            }

            else if(newnumber == 17){
                starttime2 = "5:00pm";
            }
            else if(newnumber == 18){
                starttime2 = "6:00am";
            }
            else if(newnumber == 19){
                starttime2 = "7:00pm";
            }
            else if(newnumber == 20){
                starttime2 = "8:00pm";
            }
            else if(newnumber == 21){
                starttime2 = "9:00pm";
            }
            else if(newnumber == 22){
                starttime2 = "10:00pm";
            }
            else if(newnumber == 23){
                starttime2 = "11:00pm";
            }

            else if(newnumber == 24){
                starttime2 = "12:00am";
            }
            editblock.setFinishtime(starttime2);
            editblock.setIfinishtime(newnumber);
            editblock.setStudent(nameS);
            editblock.setTutor(nameT);
            editblock2.setStarttime(starttime2);
            editblock2.setIstarttime(newnumber);
            editblock2.setFinishtime(starttime);
            editblock2.setIfinishtime(startnumber2);

            if(day ==1){
                temp.addTomonday(editblock);
                temp2.addTomonday(editblock);
                temp2.addTomonday(editblock2);

            }
            else if(day == 2){
                temp.addTotuesday(editblock);
                temp2.addTotuesday(editblock);
                temp2.addTotuesday(editblock2);

            }
            else if(day == 3){
                temp.addTowednesday(editblock);
                temp2.addTowednesday(editblock);
                temp2.addTowednesday(editblock2);

            }
            else if(day == 4){
                temp.addTothursday(editblock);
                temp2.addTothursday(editblock);
                temp2.addTothursday(editblock2);


            }
            else if(day == 5){
                temp.addTofriday(editblock);
                temp2.addTofriday(editblock);
                temp2.addTofriday(editblock2);

            }
            else if(day == 6){
                temp.addTosaturday(editblock);
                temp2.addTosaturday(editblock);
                temp2.addTosaturday(editblock2);

            }
            else if(day == 7){
                temp.addTosunday(editblock);
                temp2.addTosunday(editblock);
                temp2.addTosunday(editblock2);
            }

            mestudent.setMySchedule(temp);
            metutor.setMySchedule(temp2);
            mestudent.addtutorname(finalname);
            g.setMainuserstudent(mestudent);
            g.setPrehiretutor(metutor);
            g.updatePreHire();
            Intent nextpage = new Intent(Hirep2.this,StudentHomepage.class);
            startActivity(nextpage);

        }

    }
}
