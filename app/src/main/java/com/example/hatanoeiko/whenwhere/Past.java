package com.example.hatanoeiko.whenwhere;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by hatanoeiko on 2016/07/08.
 */
public class Past {
    String strWhen;
    String strWhat;
    ArrayList<String> whenpawords = new ArrayList<String>();
    ArrayList<String>whatpawords = new ArrayList<String>();
    String past(int w){
        if(w == 0){
            addTowhenpaArray();
            Random rn = new Random();
            int n = rn.nextInt();
            String strWhen = whenpawords.get(n);
            return strWhen;
        }else if(w == 1){
            addTowhatpaArray();
            Random rn = new Random();
            int n = rn.nextInt();
            String strWhat = whatpawords.get(n);
            return strWhat;
        }
        else return "past is error";
    }
    void addTowhenpaArray(){
        whenpawords.add("昨日");
        whenpawords.add("５年前");
        whenpawords.add("先週");
    }
    void addTowhatpaArray(){
        whatpawords.add("転けた");
        whatpawords.add("テニスをした");
        whatpawords.add("コーヒーを頂いた");
    }
}
