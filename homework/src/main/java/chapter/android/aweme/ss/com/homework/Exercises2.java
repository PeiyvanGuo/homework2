package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.BreakIterator;


/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */

// 遍历viewGroup


// 遍历viewGroup
public class Exercises2 extends AppCompatActivity {

private TextView sa;
private ViewGroup gh;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.excercises2);
        gh = findViewById(R.id.root);
        sa = findViewById(R.id.textView5);

        String str = "算上我自己共有"+Integer.toString(traverseViewGroup(gh))+"个";
        sa.setText(str);



    }


// 遍历viewGroup

    public int traverseViewGroup(View view) {

        int viewCount = 0;

        if (null == view) {

            return 0;

        }

        if (view instanceof ViewGroup) {

            //遍历ViewGroup,是子view加1，是ViewGroup递归调用

            for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++) {

                View child = ((ViewGroup) view).getChildAt(i);

                if (child instanceof ViewGroup) {

                    viewCount += traverseViewGroup(((ViewGroup) view).getChildAt(i));

                } else {

                    viewCount++;

                }

            }

        } else {

            viewCount++;

        }

        return viewCount;

    }


}
