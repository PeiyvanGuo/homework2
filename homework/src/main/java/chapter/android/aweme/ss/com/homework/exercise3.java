package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class exercise3 extends AppCompatActivity {


    private static final String TAG = "wangyi";



    private TextView mLifecycleDisplay;




    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item3);
        mLifecycleDisplay = findViewById(R.id.textView6);
        Intent intent=getIntent();
        String tmp = intent.getStringExtra("ItemIndex");

        //getIntent().getStringExtra("ItemIndex");
        String str ="第"+tmp+"个";
        mLifecycleDisplay.setText(str);
    }


}
