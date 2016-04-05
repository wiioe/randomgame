package kr.hs.emirim.grace0106.monchicken;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

/**
 * Created by appcreator39 on 2016. 3. 28..
 */
public class ResultActivity extends ActionBarActivity {

    TextView mResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mResult = (TextView)findViewById(R.id.result);
        mResult.setText("결과");

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", -1);
        mResult.setText(name + "님, 안녕하세요!");
    }
}
