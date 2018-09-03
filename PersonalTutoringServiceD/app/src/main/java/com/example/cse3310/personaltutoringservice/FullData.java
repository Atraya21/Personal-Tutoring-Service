package com.example.cse3310.personaltutoringservice;

import android.accounts.Account;
import android.app.Application;

import java.util.ArrayList;

/**
 * Created by danie on 11/20/2017.
 */

public class FullData extends Application {
    public Student[] studentlist = new Student[10];
    public Category[] categorylist = new Category[5];
    public Student tempstudent = new Student();
    public Tutor temptutor = new Tutor();
    public Student mainuserstudent = new Student();
    public Tutor mainusertutor = new Tutor();
    public Schedule tempSchedule = new Schedule();
    public Tutor prehiretutor = new Tutor();
    public Student editstudent = new Student();
    public TimeBlock editblock = new TimeBlock();
    public boolean tutorfound = false;
    public boolean tutorlogin = false;
    public boolean studentlogin = false;
    public boolean studentcheck = false;
    public int courschoosen = 0;
    public int studentcounter = 0;
    public int coursecounter = 0;
    public int blockdaychoice = 0;
    public int preCourse = 0;
    public int preTut = 0;
    public int mainSnumber = 0;
    public int mainCnumber = 0;
    public int mainTnumber = 0;


    public void addcategory (Category c){
        categorylist[coursecounter] = c;
        coursecounter++;
    }
    public void setEditblock(TimeBlock t){
        editblock = t;
    }
    public TimeBlock getEditblock(){
        return editblock;
    }
    public void setBlockdaychoice(int x){
        blockdaychoice = x;
    }
    public int getBlockdaychoice(){
        return blockdaychoice;
    }
    public int getCoursecounter(){
        return coursecounter;
    }


    public Category getcategory(int x){
        return categorylist[x];
    }

    public boolean gettutorlogin(){ return tutorlogin;}

    public boolean getstudentlogin(){return studentlogin;}

    public boolean gettutorfound(){
        return tutorfound;
    }

    public boolean getstudentcheck(){return studentcheck;}
    public Student getEditstudent(){return editstudent; }

    public void addstudent(){
        Student temp = new Student();
        studentlist[studentcounter] = tempstudent;
        studentcounter++;
        tempstudent = temp;
    }
    public void addtutor(){
        Tutor temp = new Tutor();
        categorylist[courschoosen].addTutor(temptutor);
        temptutor = temp;
    }
    public void setschedule(){
        temptutor.setMySchedule(tempSchedule);
    }

    public Schedule getTempSchedule(){
        return tempSchedule;
    }

    public void setTempSchedule(Schedule t){
        tempSchedule = t;
    }
    public Tutor gettemptutor(){
        return temptutor;
    }
    public void setTemptutor(Tutor t){
        temptutor = t;
    }
    public Student getTempstudent(){
        return tempstudent;
    }
    public void setTempstudent( Student s){
        tempstudent = s;

    }
    public Tutor getMainusertutor(){
        return mainusertutor;
    }
    public void setMainusertutor(Tutor t){
        mainusertutor = t;
    }
    public Student getMainuserstudent(){
        return mainuserstudent;
    }
    public void setMainuserstudent(Student s){
        mainuserstudent = s;
    }
    public Tutor getPrehiretutor(){
        return prehiretutor;
    }
    public void setPrehiretutor(Tutor t){
        prehiretutor = t;
    }
    public void addcourse(Category c){
        categorylist[coursecounter] = c;
        coursecounter++;
    }

    public ArrayList<String>getnameslist(){
        String temp1 = null;
        Tutor temp = new Tutor();
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 5; i++){
            if(categorylist[i].getTutorcounter() > 0) {
                for (int j = 0; j < categorylist[i].getTutorcounter(); j++) {
                    temp = categorylist[i].getTutor(j);
                    temp1 = temp.gettutorname();
                    list.add(temp1);
                }
            }
        }
        return list;
    }
    public void findtutor(String t){
        String temp = null;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < categorylist[i].getTutorcounter();j++){
                temp = categorylist[i].tutorlist[j].gettutorname();
                if(t.equals(temp)){
                    prehiretutor = categorylist[i].tutorlist[j];
                    preCourse = i;
                    preTut = j;
                    tutorfound = true;
                }
            }
        }
    }
    public void setCourschoosen(int t){
        courschoosen = t;
    }
    public void setpretutor(int t){
        prehiretutor = categorylist[courschoosen].tutorlist[t];
        preCourse =courschoosen;
        preTut = t;
        tutorfound = true;
    }
    public void tutorlogin( String one,String two){
        String temp = null;
        String test1 = null;
        Tutor giveme = new Tutor();
        String test2 = null;
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < categorylist[i].getTutorcounter();j++){

                test1 = categorylist[i].tutorlist[j].gettutorid();
                test2 = categorylist[i].tutorlist[j].gettutorpassword();
                if(one.equals(test1) && two.equals(test2)) {
                    giveme = categorylist[i].getthetutor(j);
                    mainusertutor = giveme;
                    mainCnumber = i;
                    mainTnumber = j;
                    tutorlogin = true;
                }

            }
        }

    }
    public void studentlogin(String one,String two){
        String temp = null;
        String test1 = null;
        for(int i = 0; i < studentcounter; i++){
            test1 = studentlist[i].getstudentid();
            temp = studentlist[i].getstudentpassword();
            if(one.equals(test1) && two.equals(temp) ){
                mainuserstudent = studentlist[i];
                mainSnumber = i;
                studentlogin = true;
            }
        }
    }

    public void startdata(){
        if(coursecounter == 0) {
            Category newC = new Category();
            AccountInfo a = new AccountInfo();
            AccountInfo a1 = new AccountInfo();
            AccountInfo a2 = new AccountInfo();
            AccountInfo a3 = new AccountInfo();
            AccountInfo a4 = new AccountInfo();
            AccountInfo a5 = new AccountInfo();
            AccountInfo a6 = new AccountInfo();
            Tutor test1 = new Tutor();
            Student test2 = new Student();
            Tutor emptyTut = new Tutor();
            Student emptyStu = new Student();
            AccountInfo aempty = new AccountInfo();
            Bankinfo bempty = new Bankinfo();
            Bankinfo b = new Bankinfo();
            Bankinfo b1 = new Bankinfo();
            Bankinfo b2 = new Bankinfo();
            Bankinfo b3 = new Bankinfo();
            Bankinfo b4 = new Bankinfo();
            Bankinfo b5 = new Bankinfo();
            Bankinfo b6 = new Bankinfo();
            Schedule tempsced =new Schedule();
            Schedule tempsced1 =new Schedule();
            Schedule tempsced2 =new Schedule();
            Schedule tempsced3 =new Schedule();
            Schedule tempsced4 =new Schedule();
            Schedule tempsced5 =new Schedule();
            TimeBlock oneblock = new TimeBlock();
            TimeBlock oneblock1 = new TimeBlock();
            TimeBlock oneblock2 = new TimeBlock();
            TimeBlock oneblock4 = new TimeBlock();
            TimeBlock oneblock5 = new TimeBlock();

            TimeBlock twoblock = new TimeBlock();
            TimeBlock twoblock2 = new TimeBlock();
            Schedule emptyscedule = new Schedule();

            String temp = "Math";
            newC.setCategory(temp);
            addcategory(newC);
            newC = new Category();
            temp = "Science";
            newC.setCategory(temp);
            addcategory(newC);
            newC = new Category();
            temp = "English";
            newC.setCategory(temp);
            addcategory(newC);
            newC = new Category();
            temp = "Music";
            newC.setCategory(temp);
            addcategory(newC);
            newC = new Category();
            temp = "Arts";
            newC.setCategory(temp);
            addcategory(newC);

            a.setFirstname("Daniel");
            a.setLastname("Benninghoff");
            a.setId("Hoff1234");
            a.setPassword("Zoro@dmb");
            a.setPhonenumber("817-235-1285");
            a.setAddress("6608 beryl drive arlington Tx");
            a.setEmail("daniel.benninghoff@yahoo.com");
            b.setCardnumber("1265579927919911");
            b.setCSVsunumber("379");
            b.setCardtype("Visa");
            test1.setMyaccoutinfo(a);
            test1.setMybankinfo(b);
            oneblock.setStarttime("2:00pm");
            oneblock.setIstarttime(14);
            oneblock.setIfinishtime(16);
            oneblock.setFinishtime("4:00pm");
            oneblock.setStudent("Jina");
            oneblock.setTutor("Daniel");
            tempsced.addTomonday(oneblock);
            twoblock.setStarttime("4:00pm");
            twoblock.setIstarttime(16);
            twoblock.setIfinishtime(20);
            twoblock.setFinishtime("8:00pm");
            tempsced.addTomonday(twoblock);
            oneblock = new TimeBlock();
            twoblock = new TimeBlock();
            twoblock.setStarttime("2:00pm");
            twoblock.setIstarttime(14);
            twoblock.setIfinishtime(20);
            twoblock.setFinishtime("8:00pm");
            tempsced.addTofriday(twoblock);
            tempsced.addTosaturday(twoblock);
            test1.setMySchedule(tempsced);
            temptutor = test1;
            tempsced = emptyscedule;
            courschoosen = 0;
            addtutor();



            a2.setFirstname("Jina");
            a2.setLastname("sparks");
            a2.setId("sparks29");
            a2.setPassword("Spark@1990");
            a2.setPhonenumber("817-679-1499");
            a2.setEmail("Jina@yahoo.com");
            a2.setAddress("399-201 Hemlock Dr Arlington TX");
            b2.setCardnumber("1267574433218811");
            b2.setCSVsunumber("479");
            b2.setCardtype("MasterCard");
            oneblock1.setStarttime("2:00pm");
            oneblock1.setIstarttime(14);
            oneblock1.setIfinishtime(16);
            oneblock1.setFinishtime("4:00pm");
            oneblock1.setStudent("Jina");
            oneblock1.setTutor("Daniel");
            tempsced1.addTomonday(oneblock1);
            tempstudent.setMyaccoutinfo(a2);
            tempstudent.setMybankinfo(b2);
            tempstudent.setMySchedule(tempsced1);
            tempstudent.addtutorname("DanielBenninghoff");
            addstudent();



            a1.setFirstname("James");
            a1.setLastname("Borden");
            a1.setId("BordenJ");
            a1.setPassword("JamesBorden");
            a1.setPhonenumber("817-245-6789");
            a1.setEmail("jamesborden@gmail.com");
            b1.setCardnumber("1265579927919910");
            b1.setCSVsunumber("400");
            b1.setCardtype("Visa");
            temptutor.setMyaccoutinfo(a1);
            temptutor.setMybankinfo(b1);
            oneblock2.setStarttime("3:00pm");
            oneblock2.setIstarttime(15);
            oneblock2.setIfinishtime(16);
            oneblock2.setFinishtime("4:00pm");
            tempsced2.addTomonday(oneblock2);
            temptutor.setMySchedule(tempsced2);
            courschoosen = 1;
            addtutor();
            tempsced2 = new Schedule();

            tempstudent = new Student();
            temptutor = new Tutor();
            oneblock = new TimeBlock();
            twoblock = new TimeBlock();
            tempsced = emptyscedule;
            a = aempty;
            b = bempty;

            a3.setFirstname("Caleb");
            a3.setLastname("Hendricks");
            a3.setId("Hendo");
            a3.setPassword("Hendopass");
            a3.setPhonenumber("817-679-1000");
            a3.setEmail("hendricks@yahoo.com");
            b3.setCardnumber("1111222233334444");
            b3.setCSVsunumber("510");
            b3.setCardtype("MasterCard");
            tempstudent.setMyaccoutinfo(a3);
            tempstudent.setMybankinfo(b3);
            tempstudent.setMySchedule(tempsced3);
            addstudent();

            tempstudent = new Student();
            temptutor = new Tutor();


            a4.setFirstname("Joe");
            a4.setLastname("Burns");
            a4.setId("burn1111");
            a4.setPassword("burnme2017");
            a4.setPhonenumber("817-445-1289");
            a4.setAddress("6605 realhome dr arlington Tx");
            a4.setEmail("burns@gmail.com");
            b4.setCardnumber("1234445612887627");
            b4.setCSVsunumber("889");
            b4.setCardtype("Paypal");
            temptutor.setMyaccoutinfo(a4);
            temptutor.setMybankinfo(b4);
            twoblock = new TimeBlock();
            twoblock.setStarttime("1:00pm");
            twoblock.setIstarttime(13);
            twoblock.setIfinishtime(19);
            twoblock.setFinishtime("7:00pm");
            tempsced.addTothursday(twoblock);
            tempsced.addTosunday(twoblock);
            tempsced.addTofriday(twoblock);
            tempsced.addTosaturday(twoblock);
            temptutor.setMySchedule(tempsced);
            courschoosen = 3;
            addtutor();
            tempsced = emptyscedule;

            temptutor = new Tutor();


            a5.setFirstname("David");
            a5.setLastname("Peterson");
            a5.setId("davidP21");
            a5.setPassword("Pdavid");
            a5.setPhonenumber("817-881-1299");
            a5.setAddress("6202 jennifer dr arlington Tx");
            a5.setEmail("david@gmail.com");
            b5.setCardnumber("1889455699881127");
            b5.setCSVsunumber("897");
            b5.setCardtype("Visa");
            temptutor.setMyaccoutinfo(a5);
            temptutor.setMybankinfo(b5);
            oneblock4 = new TimeBlock();
            oneblock4.setStarttime("3:00pm");
            oneblock4.setIstarttime(15);
            oneblock4.setIfinishtime(21);
            oneblock4.setFinishtime("9:00pm");
            tempsced4.addTomonday(oneblock4);
            tempsced4.addTosunday(oneblock4);
            tempsced4.addTofriday(oneblock4);
            tempsced4.addTosaturday(oneblock4);
            temptutor.setMySchedule(tempsced4);
            courschoosen = 4;
            addtutor();

            temptutor = new Tutor();


            a6.setFirstname("Sarah");
            a6.setLastname("Davids");
            a6.setId("sara27");
            a6.setPassword("sara@2017");
            a6.setPhonenumber("817-661-1221");
            a6.setAddress("1102 preston dr arlington Tx");
            a6.setEmail("sarah@gmail.com");
            b6.setCardnumber("1119445500181227");
            b6.setCSVsunumber("334");
            b6.setCardtype("Visa");
            temptutor.setMyaccoutinfo(a6);
            temptutor.setMybankinfo(b6);
            oneblock5 = new TimeBlock();
            oneblock5.setStarttime("2:00pm");
            oneblock5.setIstarttime(14);
            oneblock5.setIfinishtime(20);
            oneblock5.setFinishtime("8:00pm");
            tempsced5.addTosunday(oneblock5);
            tempsced5.addTofriday(oneblock5);
            tempsced5.addTosaturday(oneblock5);
            temptutor.setMySchedule(tempsced5);
            courschoosen = 2;
            addtutor();


        }
        else if(coursecounter != 0){
            return;
        }
    }
    public void updatePreHire(){
        categorylist[mainCnumber].updatetutor(prehiretutor,mainTnumber);
    }
    public void updateMainTutor(){
        categorylist[mainCnumber].updatetutor( mainusertutor,mainTnumber);
    }
    public void updatemainStudent(){
        studentlist[mainSnumber] = mainuserstudent;
    }

    public void resetdata(){
        tutorlogin = false;
        tutorfound = false;
        studentlogin = false;
        mainuserstudent = new Student();
        mainusertutor = new Tutor();
    }

    public void studentfind(String one){
        String temp = null;
        String test1 = null;
        for(int i = 0; i < studentcounter; i++){
            temp = studentlist[i].getfirstname();
            if(one.equals(temp)){
                editstudent = studentlist[i];
                studentcheck = true;
            }
        }
    }
    public void setEditstudent(Student s){
        editstudent = s;
        mainuserstudent = editstudent;
        updatemainStudent();
        editstudent = new Student();
        mainuserstudent = new Student();
    }
}



