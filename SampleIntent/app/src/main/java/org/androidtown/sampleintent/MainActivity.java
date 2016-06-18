package org.androidtown.sampleintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE_ANOTHER=1001;
    public static final int REQUEST_CODE_ANOTHER_2=200;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton3Clicked(View v) {
        Intent intent = new Intent(this,AnotherActivity.class);
        startActivityForResult(intent,REQUEST_CODE_ANOTHER_2);
    }

    public void onButton1Clicked(View v) {
        Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
        startActivityForResult(intent,REQUEST_CODE_ANOTHER);//인텐트 실행.
    } //클래스 실행시키는 인텐트 객체형성
      //인텐트에의해 다른 엑티비티가 실행.
      //리퀘스트값은 인텐트를 구분하는 값이라고 생각하면 됌.

    //응답의 대한 결과를 실행시키는 메서드(onActivityResult)는 공통적으로 쓰이기 때문에
    //인텐트를 구분하는 리퀘스트값이 필요함.(어떤 인텐트에대한 응답인지 구분하기위해.)

    protected void onActivityResult(int requestCode,int resultCode,Intent intent) {
        super.onActivityResult(requestCode,resultCode,intent);

        Toast toast=Toast.makeText(getApplicationContext(),
                "요청코드: "+requestCode+" 결과코드: "+resultCode,Toast.LENGTH_SHORT);
        toast.show();

        if(requestCode==REQUEST_CODE_ANOTHER) {
            String name=intent.getExtras().getString("name");
            toast=Toast.makeText(getApplicationContext(),
                    "응답된 전달값"+name,Toast.LENGTH_SHORT);
            toast.show();
        }

        if(requestCode==REQUEST_CODE_ANOTHER_2) {
            String twice=intent.getExtras().getString("twice");
            toast=Toast.makeText(getApplicationContext(),
                    "응답된 전달값"+twice,Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}