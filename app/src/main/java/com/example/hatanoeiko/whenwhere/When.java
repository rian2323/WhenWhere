package com.example.hatanoeiko.whenwhere;

/**
 * Created by hatanoeiko on 2016/07/11.
 */
public class When {
    Future fu = new Future();
    Present pr = new Present();
    Past pa = new Past();
    String sentence;

    void when(int a){
        if(a == 0){ //未来
            sentence = fu.future(0);
        }else if(a == 1){ //現在
            sentence = pr.present(0);
        }else if(a == 2){ //
            sentence = pa.past(0);
        }else{ //エラー
            sentence = "when is error";
        }
    }
}
