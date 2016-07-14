package com.example.hatanoeiko.whenwhere;

/**
 * Created by hatanoeiko on 2016/07/11.
 */
public class What {
    Future fu = new Future();
    Present pr = new Present();
    Past pa = new Past();
    String sentence;

    void what(int a){
        if(a == 0){ //未来
            sentence = fu.future(1);
        }else if(a == 1){ //現在
            sentence = pr.present(1);
        }else if(a == 2){ //
            sentence = pa.past(1);
        }else{ //エラー
            sentence = "what is error";
        }
    }
}
