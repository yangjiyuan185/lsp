package com.wulianwang.lsp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.wulianwang.lsp.R;

public class PravcyActivity extends AppCompatActivity {
private ImageButton bt1;
private TextView tv9;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_Pravcy);

        tv9 = (TextView)findViewById(R.id.textView2) ;
        tv9.setMovementMethod(ScrollingMovementMethod.getInstance());

        bt1=(ImageButton)findViewById(R.id.imageButton);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(PravcyActivity.this,MainActivity.class);
                startActivity(i);
            }
        });




    }
}


//setContentView(R.layout.activity_Pravcy);
//SpannableString str = new SpannableString("我已阅读并同意《隐私协议》及《服务政策》");
//str.setSpan(new PravcyActivity(this),7,13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//str.setSpan(new PravcyActivity(this),7,13,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
//tv1.setMovementMethod(LinkMovementMethod.getInstance());
//tv1.setHighlightColor(Color.TRANSPARENT);
//tv1 = (TextView) findViewById(R.id.textview1);



//class Onbuttonlistener implements OnClickListener{
//public void onClick(View v){
//Intent intent = new Intent();
//intent.putExtra("stringname","这是第一个页面传递的信");
//intent .setClass(PravcyActivity.this ,Main3Activity.class);
//PravcyActivity.this.startActivity(intent);
//}
//}




  //tv1.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
        //Intent i=new Intent(PravcyActivity.this ,Main3Activity.class);
        //startActivity(i);
        //}
        //});