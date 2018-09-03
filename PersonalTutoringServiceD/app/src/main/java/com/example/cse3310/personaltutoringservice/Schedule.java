package com.example.cse3310.personaltutoringservice;

import java.util.ArrayList;

/**
 * Created by danie on 11/20/2017.
 */

public class Schedule {
    public TimeBlock[] monday = new TimeBlock[24];
    public TimeBlock[] tuesday = new TimeBlock[24];
    public TimeBlock[] weds = new TimeBlock[24];
    public TimeBlock[] thursday = new TimeBlock[24];
    public TimeBlock[] friday = new TimeBlock[24];
    public TimeBlock[] saturday =new TimeBlock[24];
    public TimeBlock[] sunday = new TimeBlock[24];
    public int monCounter = 0;
    public int tuesCounter=0;
    public int wedsCounter=0;
    public int thursCounter=0;
    public int friCounter=0;
    public int satCounter=0;
    public int sundCounter=0;





    public void addTomonday(TimeBlock t){
        monday[monCounter] = t;
        monCounter++;
    }
    public void addTotuesday(TimeBlock t){
        tuesday[tuesCounter] = t;
        tuesCounter++;
    }
    public void addTowednesday(TimeBlock t){
        weds[wedsCounter] = t;
        wedsCounter++;
    }
    public void addTothursday(TimeBlock t){
        thursday[thursCounter] = t;
        thursCounter++;
    }
    public void addTofriday(TimeBlock t){
        friday[friCounter] = t;
        friCounter++;
    }
    public void addTosaturday(TimeBlock t){
        saturday[satCounter] = t;
        satCounter++;
    }
    public void addTosunday(TimeBlock t){
        sunday[sundCounter] = t;
        sundCounter++;
    }
    public void sortmonday(){
        TimeBlock temp;
        if(monCounter == 0 || monCounter == 1){
            return;
        }
        else
            for(int i = 0; i < monCounter; i++){

                for(int j = i+1; j < monCounter; j++){

                    if(monday[i].getIstarttime() > monday[j].getIstarttime()){
                        temp = monday[i];
                        monday[i] = monday[j];
                        monday[j] = temp;

                    }
                }


            }
    }
    public void sortuesdy(){
        TimeBlock temp;
        if(tuesCounter == 0 || tuesCounter == 1){
            return;
        }
        else
            for(int i = 0; i < tuesCounter; i++){

                for(int j = i+1; j < tuesCounter; j++){

                    if(tuesday[i].getIstarttime() > tuesday[j].getIstarttime()){
                        temp = tuesday[i];
                        tuesday[i] = tuesday[j];
                        tuesday[j] = temp;

                    }
                }


            }
    }
    public void sortwednesday(){
        TimeBlock temp;
        if(wedsCounter == 0 || wedsCounter == 1){
            return;
        }
        else
            for(int i = 0; i < wedsCounter; i++){

                for(int j = i+1; j < wedsCounter; j++){

                    if(weds[i].getIstarttime() > weds[j].getIstarttime()){
                        temp = weds[i];
                        weds[i] = weds[j];
                        weds[j] = temp;

                    }
                }


            }
    }

    public void sorthursday(){
        TimeBlock temp;
        if(thursCounter == 0 || thursCounter == 1){
            return;
        }
        else
            for(int i = 0; i < thursCounter; i++){

                for(int j = i+1; j < thursCounter; j++){

                    if(thursday[i].getIstarttime() > thursday[j].getIstarttime()){
                        temp = thursday[i];
                        thursday[i] = thursday[j];
                        thursday[j]= temp;

                    }
                }


            }
    }

    public void sortfriday(){
        TimeBlock temp;
        if(friCounter == 0 || friCounter == 1){
            return;
        }
        else
            for(int i = 0; i < friCounter; i++){

                for(int j = i+1; j < friCounter; j++){

                    if(friday[i].getIstarttime() > friday[j].getIstarttime()){
                        temp = friday[i];
                        friday[i] = friday[j];
                        friday[j] = temp;
                    }
                }


            }
    }
    public void sortSaturday(){
        TimeBlock temp;
        if(satCounter == 0 || satCounter == 1){
            return;
        }
        else
            for(int i = 0; i < satCounter; i++){

                for(int j = i+1; j < satCounter; j++){

                    if(saturday[i].getIstarttime() > saturday[j].getIstarttime()){
                        temp = saturday[i];
                        saturday[i] = saturday[j];
                        saturday[j] = temp;

                    }
                }


            }
    }
    public void sortSunday(){
        TimeBlock temp;
        if(sundCounter == 0 || sundCounter == 1){
            return;
        }
        else
            for(int i = 0; i < sundCounter; i++){

                for(int j = i+1; j < sundCounter; j++){

                    if(sunday[i].getIstarttime() > sunday[j].getIstarttime()){
                        temp = sunday[i];
                        sunday[i] = sunday[j];
                        sunday[j] = temp;

                    }
                }


            }
    }
    public void monremove(int x){
        if(monCounter == 0){
            return;
        }
        else if(monCounter == 1){
            monday[0] = null;
            monCounter--;
        }
        else{
            monday[x] = monday[monCounter-1];
            monday[monCounter-1] = null;
            monCounter--;
            sortmonday();
        }

    }
    public void tuesremove(int x){
        if(tuesCounter == 0){
            return;
        }
        else if(tuesCounter == 1){
            tuesday[0] = null;
            tuesCounter--;
        }
        else{
            tuesday[x] = tuesday[monCounter-1];
            tuesday[monCounter-1] = null;
            tuesCounter--;
            sortuesdy();
        }

    }
    public void wedsremove(int x){
        if(wedsCounter == 0){
            return;
        }
        else if(wedsCounter == 1){
            weds[0] = null;
            wedsCounter--;
        }
        else{
            weds[x] = weds[wedsCounter-1];
            weds[wedsCounter-1] = null;
            wedsCounter--;
            sortwednesday();
        }

    }
    public void thursremove(int x){
        if(thursCounter == 0){
            return;
        }
        else if(thursCounter == 1){
            thursday[0] = null;
            thursCounter--;
        }
        else{
            thursday[x] = thursday[thursCounter-1];
            thursday[thursCounter-1] = null;
            thursCounter--;
            sorthursday();
        }

    }
    public void fridayremove(int x){
        if(friCounter == 0){
            return;
        }
        else if(friCounter == 1){
            friday[0] = null;
            friCounter--;
        }
        else{
            friday[x] = friday[friCounter-1];
            friday[friCounter-1] = null;
            friCounter--;
            sortfriday();
        }

    }
    public void Satremove(int x){
        if(satCounter == 0){
            return;
        }
        else if(satCounter == 1){
            saturday[0] = null;
            satCounter--;
        }
        else{
            saturday[x] = saturday[satCounter-1];
            saturday[satCounter-1] = null;
            satCounter--;
            sortSaturday();
        }

    }
    public void Sundayemove(int x){
        if(sundCounter == 0){
            return;
        }
        else if(sundCounter == 1){
            sunday[0] = null;
            sundCounter--;
        }
        else{
            sunday[x] = sunday[sundCounter-1];
            sunday[sundCounter-1] = null;
            sundCounter--;
            sortSunday();
        }

    }
    public boolean checkstartmonday(int a){
        int check = 0;
        int b = a;
        if(monCounter == 0){
            return true;
        }
        else {
            for (int i = 0; i < monCounter; i++) {
                if (monday[i].getIstarttime() <= b && b < monday[i].getIfinishtime()) {
                    return false;
                }
            }
            return true;
        }

    }
    public boolean checkfinishmonday(int a){
        int check = 0;
        if(monCounter == 0){
            return true;
        }
        else
            for(int i = 0; i < monCounter; i++){
                if( a > monday[i].getIstarttime() && a <= monday[i].getIfinishtime()){
                    check++;
                }
            }
        if(check > 0){
            return false;
        }
        else
            return true;

    }

    public boolean checkstartues(int a){
        int check = 0;
        if(tuesCounter == 0){
            return true;
        }
        else
            for(int i = 0; i < tuesCounter; i++){
                if( a >= tuesday[i].getIstarttime() && a < tuesday[i].getIfinishtime()){
                    check++;
                }
            }
        if(check > 0){
            return false;
        }
        else
            return true;

    }
    public boolean checkfinishtues(int a){
        int check = 0;
        if(tuesCounter == 0){
            return true;
        }
        else
            for(int i = 0; i < tuesCounter; i++){
                if( a > tuesday[i].getIstarttime() && a <= tuesday[i].getIfinishtime()){
                    check++;
                }
            }
        if(check > 0){
            return false;
        }
        else
            return true;

    }public boolean checkstartweds(int a){
        int check = 0;
        if(wedsCounter == 0){
            return true;
        }
        else
            for(int i = 0; i < wedsCounter; i++){
                if( a >= weds[i].getIstarttime() && a < weds[i].getIfinishtime()){
                    check++;
                }
            }
        if(check > 0){
            return false;
        }
        else
            return true;

    }
    public boolean checkfinishweds(int a){
        int check = 0;
        if(wedsCounter == 0){
            return true;
        }
        else
            for(int i = 0; i < wedsCounter; i++){
                if( a > weds[i].getIstarttime() && a <= weds[i].getIfinishtime()){
                    check++;
                }
            }
        if(check > 0){
            return false;
        }
        else
            return true;

    }
    public boolean checkstartthurs(int a){
        int check = 0;
        if(thursCounter == 0){
            return true;
        }
        else
            for(int i = 0; i < thursCounter; i++){
                if( a >= thursday[i].getIstarttime() && a < thursday[i].getIfinishtime()){
                    check++;
                }
            }
        if(check > 0){
            return false;
        }
        else
            return true;

    }
    public boolean checkfinishthurs(int a){
        int check = 0;
        if(thursCounter == 0){
            return true;
        }
        else
            for(int i = 0; i < thursCounter; i++){
                if( a > thursday[i].getIstarttime() && a <= thursday[i].getIfinishtime()){
                    check++;
                }
            }
        if(check > 0){
            return false;
        }
        else
            return true;

    }
    public boolean checkstartfriday(int a){
        int check = 0;
        if(friCounter == 0){
            return true;
        }
        else
            for(int i = 0; i < friCounter; i++){
                if( a >= friday[i].getIstarttime() && a < friday[i].getIfinishtime()){
                    check++;
                }
            }
        if(check > 0){
            return false;
        }
        else
            return true;

    }
    public boolean checkfinishfriday(int a){
        int check = 0;
        if(friCounter == 0){
            return true;
        }
        else
            for(int i = 0; i < friCounter; i++){
                if( a > friday[i].getIstarttime() && a <= friday[i].getIfinishtime()){
                    check++;
                }
            }
        if(check > 0){
            return false;
        }
        else
            return true;

    }
    public boolean checkstartSat(int a){
        int check = 0;
        if(satCounter == 0){
            return true;
        }
        else
            for(int i = 0; i < satCounter; i++){
                if( a >= saturday[i].getIstarttime() && a < saturday[i].getIfinishtime()){
                    check++;
                }
            }
        if(check > 0){
            return false;
        }
        else
            return true;

    }
    public boolean checkfinishsat(int a){
        int check = 0;
        if(satCounter == 0){
            return true;
        }
        else
            for(int i = 0; i < satCounter; i++){
                if( a > saturday[i].getIstarttime() && a <= saturday[i].getIfinishtime()){
                    check++;
                }
            }
        if(check > 0){
            return false;
        }
        else
            return true;

    }


    public boolean checkstartsunday(int a){
        int check = 0;
        if(sundCounter == 0){
            return true;
        }
        else
            for(int i = 0; i < sundCounter; i++){
                if( a >= sunday[i].getIstarttime() && a < sunday[i].getIfinishtime()){
                    check++;
                }
            }
        if(check > 0){
            return false;
        }
        else
            return true;

    }
    public boolean checkfinishsunday(int a){
        int check = 0;
        if(sundCounter == 0){
            return true;
        }
        else
            for(int i = 0; i < sundCounter; i++){
                if( a > sunday[i].getIstarttime() && a <= sunday[i].getIfinishtime()){
                    check++;
                }
            }
        if(check > 0){
            return false;
        }
        else
            return true;

    }
    public ArrayList<String> getmondaylistst(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        sortmonday();
        for(int i = 0; i < monCounter; i++){
            if(monday[i].getTutor() == null){
                result = "start time: " + monday[i].getStarttime() +"\n finishtime: " + monday[i].getFinishtime();
                lis.add(result);
            }
            else if (monday[i].getTutor() != null){
                result = "start time: " + monday[i].getStarttime() +"\n finishtime: " + monday[i].getFinishtime() +
                        "\n tutor: " + monday[i].getTutor();
                lis.add(result);
            }
        }
        return lis;

    }
    public ArrayList<String> getmondaylisttut(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        sortmonday();
        for(int i = 0; i < monCounter; i++){
            if(monday[i].getStudent() == null){
                result = "start time: " + monday[i].getStarttime() +"\n finishtime: " + monday[i].getFinishtime();
                lis.add(result);
            }
            else if (monday[i].getStudent() != null){
                result = "start time: " + monday[i].getStarttime() +"\n finishtime: " + monday[i].getFinishtime() +
                        "\n student: " + monday[i].getStudent();
                lis.add(result);
            }
        }
        return lis;

    }
    public ArrayList<String> gettuesdaylistst(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        sortuesdy();
        for(int i = 0; i < tuesCounter; i++){
            if(tuesday[i].getTutor() == null){
                result = "start time: " + tuesday[i].getStarttime() +"\n finishtime: " + tuesday[i].getFinishtime();
                lis.add(result);
            }
            else if (tuesday[i].getTutor() != null){
                result = "start time: " + tuesday[i].getStarttime() +"\n finishtime: " + tuesday[i].getFinishtime() +
                        "\n tutor: " + tuesday[i].getTutor();
                lis.add(result);
            }
        }
        return lis;

    }
    public ArrayList<String> gettuesdaylisttut(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        sortuesdy();
        for(int i = 0; i < tuesCounter; i++){
            if(tuesday[i].getStudent() == null){
                result = "start time: " + tuesday[i].getStarttime() +"\n finishtime: " + tuesday[i].getFinishtime();
                lis.add(result);
            }
            else if (tuesday[i].getStudent() != null){
                result = "start time: " + tuesday[i].getStarttime() +"\n finishtime: " + tuesday[i].getFinishtime() +
                        "\n student: " + tuesday[i].getStudent();
                lis.add(result);
            }
        }
        return lis;

    }
    public ArrayList<String> getwedlistst(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        sortwednesday();
        for(int i = 0; i < wedsCounter; i++){
            if(weds[i].getTutor() == null){
                result = "start time: " + weds[i].getStarttime() +"\n finishtime: " + weds[i].getFinishtime();
                lis.add(result);
            }
            else if (weds[i].getTutor() != null){
                result = "start time: " + weds[i].getStarttime() +"\n finishtime: " + weds[i].getFinishtime() +
                        "\n tutor: " + weds[i].getTutor();
                lis.add(result);
            }
        }
        return lis;

    }
    public ArrayList<String> getwedlisttut(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        sortwednesday();
        for(int i = 0; i < wedsCounter; i++){
            if(weds[i].getStudent() == null){
                result = "start time: " + weds[i].getStarttime() +"\n finishtime: " + weds[i].getFinishtime();
                lis.add(result);
            }
            else if (weds[i].getStudent() != null){
                result = "start time: " + weds[i].getStarttime() +"\n finishtime: " + weds[i].getFinishtime() +
                        "\n student: " + weds[i].getStudent();
                lis.add(result);
            }
        }
        return lis;

    }public ArrayList<String> getthurslistst(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        sorthursday();
        for(int i = 0; i < thursCounter; i++){
            if(thursday[i].getTutor() == null){
                result = "start time: " + thursday[i].getStarttime() +"\n finishtime: " +thursday[i].getFinishtime();
                lis.add(result);
            }
            else if (thursday[i].getTutor() != null){
                result = "start time: " + thursday[i].getStarttime() +"\n finishtime: " + thursday[i].getFinishtime() +
                        "\n tutor: " + thursday[i].getTutor();
                lis.add(result);
            }
        }
        return lis;

    }
    public ArrayList<String> getthurslisttut(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        sorthursday();
        for(int i = 0; i < thursCounter; i++){
            if(thursday[i].getStudent() == null){
                result = "start time: " + thursday[i].getStarttime() +"\n finishtime: " + thursday[i].getFinishtime();
                lis.add(result);
            }
            else if (thursday[i].getStudent() != null){
                result = "start time: " + thursday[i].getStarttime() +"\n finishtime: " + thursday[i].getFinishtime() +
                        "\n student: " + thursday[i].getStudent();
                lis.add(result);
            }
        }
        return lis;

    }
    public ArrayList<String> getfridaylistst(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        sortfriday();
        for(int i = 0; i < friCounter; i++){
            if(friday[i].getTutor() == null){
                result = "start time: " + friday[i].getStarttime() +"\n finishtime: " + friday[i].getFinishtime();
                lis.add(result);
            }
            else if (friday[i].getTutor() != null){
                result = "start time: " + friday[i].getStarttime() +"\n finishtime: " + friday[i].getFinishtime() +
                        "\n tutor: " + friday[i].getTutor();
                lis.add(result);
            }
        }
        return lis;

    }
    public ArrayList<String> getfridaylisttut(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        sortfriday();
        for(int i = 0; i < friCounter; i++){
            if(friday[i].getStudent() == null){
                result = "start time: " + friday[i].getStarttime() +"\n finishtime: " + friday[i].getFinishtime();
                lis.add(result);
            }
            else if (friday[i].getStudent() != null){
                result = "start time: " + friday[i].getStarttime() +"\n finishtime: " + friday[i].getFinishtime() +
                        "\n student: " + friday[i].getStudent();
                lis.add(result);
            }
        }
        return lis;

    }
    public ArrayList<String> getsatlistst(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        sortSaturday();
        for(int i = 0; i < satCounter; i++){
            if(saturday[i].getTutor() == null){
                result = "start time: " + saturday[i].getStarttime() +"\n finishtime: " + saturday[i].getFinishtime();
                lis.add(result);
            }
            else if (saturday[i].getTutor() != null){
                result = "start time: " + saturday[i].getStarttime() +"\n finishtime: " + saturday[i].getFinishtime() +
                        "\n tutor: " + saturday[i].getTutor();
                lis.add(result);
            }
        }
        return lis;

    }
    public ArrayList<String> getsatlisttut(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        sortSaturday();
        for(int i = 0; i < satCounter; i++){
            if(saturday[i].getStudent() == null){
                result = "start time: " + saturday[i].getStarttime() +"\n finishtime: " + saturday[i].getFinishtime();
                lis.add(result);
            }
            else if (saturday[i].getStudent() != null){
                result = "start time: " + saturday[i].getStarttime() +"\n finishtime: " + saturday[i].getFinishtime() +
                        "\n student: " + saturday[i].getStudent();
                lis.add(result);
            }
        }
        return lis;

    }
    public ArrayList<String> getsundaylistst(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        sortSunday();
        for(int i = 0; i < sundCounter; i++){
            if(sunday[i].getTutor() == null){
                result = "start time: " + sunday[i].getStarttime() +"\n finishtime: " + sunday[i].getFinishtime();
                lis.add(result);
            }
            else if (sunday[i].getTutor() != null){
                result = "start time: " + sunday[i].getStarttime() +"\n finishtime: " + sunday[i].getFinishtime() +
                        "\n tutor: " + sunday[i].getTutor();
                lis.add(result);
            }
        }
        return lis;

    }
    public ArrayList<String> getsundaylisttut(){
        ArrayList<String> lis = new ArrayList<String>();
        String result;
        sortSunday();
        for(int i = 0; i < sundCounter; i++){
            if(sunday[i].getStudent() == null){
                result = "start time: " + sunday[i].getStarttime() +"\n finishtime: " + sunday[i].getFinishtime();
                lis.add(result);
            }
            else if (sunday[i].getStudent() != null){
                result = "start time: " + sunday[i].getStarttime() +"\n finishtime: " + sunday[i].getFinishtime() +
                        "\n student: " + sunday[i].getStudent();
                lis.add(result);
            }
        }
        return lis;

    }
    public TimeBlock getblockmonday(int x){
        return monday[x];
    }
    public TimeBlock getblocktues(int x){
        return tuesday[x];
    }
    public TimeBlock getblockweds(int x){
        return weds[x];
    }
    public TimeBlock getblockthurs(int x){
        return thursday[x];
    }
    public TimeBlock getblockfriday(int x){
        return friday[x];
    }
    public TimeBlock getblocksat(int x){
        return saturday[x];
    }
    public TimeBlock getblocksunday(int x){
        return sunday[x];
    }

    public void checkremovemonday(TimeBlock b){
        int k;
        int check = b.getIstarttime();
        TimeBlock tempblock = new TimeBlock();

        for( int i = 0; i <monCounter; i++){
            tempblock = monday[i];
            k = tempblock.getIstarttime();
            if(check == k){
                monremove(i);
            }


        }
    }
    public void checkremovtuesday(TimeBlock b){
        int k;
        int check = b.getIstarttime();
        TimeBlock tempblock = new TimeBlock();

        for( int i = 0; i <tuesCounter; i++){
            tempblock = tuesday[i];
            k = tempblock.getIstarttime();
            if(check == k){
                tuesremove(i);
            }


        }
    }
    public void checkremoveweds(TimeBlock b){
        int k;
        int check = b.getIstarttime();
        TimeBlock tempblock = new TimeBlock();

        for( int i = 0; i <wedsCounter; i++){
            tempblock = weds[i];
            k = tempblock.getIstarttime();
            if(check == k){
                wedsremove(i);
            }


        }
    }
    public void checkremovthursday(TimeBlock b){
        int k;
        int check = b.getIstarttime();
        TimeBlock tempblock = new TimeBlock();

        for( int i = 0; i <thursCounter; i++){
            tempblock = thursday[i];
            k = tempblock.getIstarttime();
            if(check == k){
                thursremove(i);
            }


        }
    }
    public void checkremovefriday(TimeBlock b){
        int k;
        int check = b.getIstarttime();
        TimeBlock tempblock = new TimeBlock();

        for( int i = 0; i < friCounter; i++){
            tempblock = friday[i];
            k = tempblock.getIstarttime();
            if(check == k){
                fridayremove(i);
            }


        }
    }
    public void checkremovesat(TimeBlock b){
        int k;
        int check = b.getIstarttime();
        TimeBlock tempblock = new TimeBlock();

        for( int i = 0; i < satCounter; i++){
            tempblock = saturday[i];
            k = tempblock.getIstarttime();
            if(check == k){
                Satremove(i);
            }


        }
    }
    public void checkremovesunday(TimeBlock b){
        int k;
        int check = b.getIstarttime();
        TimeBlock tempblock = new TimeBlock();

        for( int i = 0; i <sundCounter; i++){
            tempblock = sunday[i];
            k = tempblock.getIstarttime();
            if(check == k){
                Sundayemove(i);
            }


        }
    }

}

