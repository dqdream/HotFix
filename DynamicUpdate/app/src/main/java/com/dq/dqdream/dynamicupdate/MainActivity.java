package com.dq.dqdream.dynamicupdate;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private Button button,button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button1 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                Toast.makeText(this,"出错了",Toast.LENGTH_SHORT).show();
//                Toast.makeText(this,"修改了",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                String patchFileString = Environment.getExternalStorageDirectory()
                        .getAbsolutePath() +"/out.apatch";
                HotFixManager.getInstance().hotFixPatch(this,"1.0",patchFileString);
                break;
        }
    }
}
