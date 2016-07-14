package com.example.hatanoeiko.whenwhere;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by hatanoeiko on 2016/07/08.
 */
public class Present {
    String strWhen;
    String strWhat;
    ArrayList<String>whenprewords = new ArrayList<String>();
    ArrayList<String>whatprewords = new ArrayList<String>();

    String present(int w){
        if(w == 0){
            addTowhenpreArray();
            Random rn = new Random();
            int n = rn.nextInt();
            String strWhen = whenprewords.get(n);
            return strWhen;
        }else if(w == 1){
            addTowhatpreArray();
            Random rn = new Random();
            int n = rn.nextInt();
            String strWhat = whatprewords.get(n);
            return strWhat;
        }
        else return "present is error";
    }
    void addTowhenpreArray(){
        whenprewords.add("今");
        whenprewords.add("ちょうど");
        whenprewords.add("今日");
    }
    void addTowhatpreArray(){
        whatprewords.add("おにぎりを食べています");
        whatprewords.add("走ります");
        whatprewords.add("着替えます");
    }
}
