package com.example.hatanoeiko.whenwhere;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.ClipboardManager;
import android.content.ClipDescription;
import android.content.ClipData;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class Third extends AppCompatActivity {

    private Button copy;
    private TextView textView6;
    private ClipboardManager ClipboardManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        this.textView6 = (TextView) this.findViewById(R.id.textView6);
        this.copy = (Button) this.findViewById(R.id.copy);
        this.copy.setOnClickListener((OnClickListener) this);

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
                store();
                break;
        }
    }
    private void store(){}
        textView6.getText().toString());
    }
}