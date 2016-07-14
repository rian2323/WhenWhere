package com.example.hatanoeiko.whenwhere;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by hatanoeiko on 2016/07/08.
 */
public class Future {
    String strWhen;
    String strWhat;
    ArrayList<String> whenfuwords = new ArrayList<String>();
    ArrayList<String>whatfuwords = new ArrayList<String>();
    String future(int w){
        if(w == 0){
            addTowhenfuArray();
            Random rn = new Random();
            int n = rn.nextInt();
            String strWhen = whenfuwords.get(n);
            return strWhen;
        }else if(w == 1){
            addTowhatfuArray();
            Random rn = new Random();
            int n = rn.nextInt();
            String strWhat = whatfuwords.get(n);
            return strWhat;
        }
        else return "future is error";
    }
    void addTowhenfuArray(){
        whenfuwords.add("明日");
        whenfuwords.add("来月");
        whenfuwords.add("将来");
    }
    void addTowhatfuArray(){
        whatfuwords.add("研究するだろう");
        whatfuwords.add("旅行するだろう");
        whatfuwords.add("眠くなるだろう");
    }
}
