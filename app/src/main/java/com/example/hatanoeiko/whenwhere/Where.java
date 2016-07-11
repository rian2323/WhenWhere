package com.example.hatanoeiko.whenwhere;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by hatanoeiko on 2016/07/11.
 */
public class Where {
    String sentence;
    ArrayList <String> wherewords = new ArrayList<String>();
    void where(int a){
        addToArray();
        Random rn = new Random();
        int n = rn.nextInt();
        String sentence = wherewords.get(n);
    }
    void addToArray(){
        wherewords.add("津田塾大学で");
        wherewords.add("アメリカで");
        wherewords.add("プールで");
        wherewords.add("教授の部屋で");
        wherewords.add("焼き鳥屋で");
        wherewords.add("船の上で");
        wherewords.add("映画館で");
        wherewords.add("お風呂で");
        wherewords.add("友達の家で");
        wherewords.add("ディズニーで");
        wherewords.add("富士山の樹海で");
    }
}
