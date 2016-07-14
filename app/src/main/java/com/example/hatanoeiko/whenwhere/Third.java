package com.example.hatanoeiko.whenwhere;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class Third extends AppCompatActivity {

    private Button copy;
    private TextView textView6;
    private ClipboardManager ClipboardManager;
    private String textComp;
    private String textWhen;
    private String textWhere;
    private String textWhat;
    Second second = new Second();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        //dataStore = getSharedPreferences("DataStore", MODE_PRIVATE);
        this.textView6 = (TextView) this.findViewById(R.id.textView6);
        Where wr = new Where();
        wr.where();
        textWhere = wr.sentence;
        textWhat = second.txtWhat;
        textWhen = second.txtWhen;
        textComp = wr.sentence + second.txtWhat + second.txtWhen;
        textView6.setText(textComp);
        this.copy = (Button) this.findViewById(R.id.copy);
        this.copy.setOnClickListener((OnClickListener) this);
        /*Where wr = new Where();
        wr.where();
        textWhere = wr.sentence;
        textWhat = second.txtWhat;
        textWhen = second.txtWhen;
        textComp = wr.sentence + second.txtWhat + second.txtWhen;*/


    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.copy:
                // エディットボックスから値を取り出す
                String copyText = this.textView6.getText().toString();
                // クリップボードへテキストを送る
                this.ClipboardManager.setText(copyText);
                break;
            case R.id.save:
                // ボタン「保存」がタップされたとき
                //store();
                break;
        }
    }

    private void store() {
        /*
        SharedPreferences pref = getSharedPreferences(“pref”,MODE_WORLD_READABLE|MODE_WORLD_WRITEABLE);
        Editor e = pref.edit();
        e.putString(“key”, “value”);
        e.commit();
        */
    }
}