package com.example.ex01_helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //소스작성은 onCreate메소드에서 한다.
    //AppCompatActivity를 항상 상속받았다 . (화면 하나의 단위를 Activity라고 함)
    //위젯을 디자인단에서 또는 그림파일을 drawble에 넣었을때
    //즉 , res에 어떤 내용이 있다면 모든것들은 R이라는 클래스에서 관리가 된다.
    //R이라는것은 Resoucese를 클래스로 만드는것,=>R
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //소스와 Layout을 연결하는 부분 ↑
        //네이밍룰 java파일은 MainActivity => 디자인 activity_main 앞뒤를 바꾼다.
        //1.버튼을 사용하기 위해서는 버튼을 실제로 찾는 코드를 작성해야 한다.
        Button btn1 = findViewById(R.id.button1);
        Button btn2 = findViewById(R.id.button2);
        //위에서 setContentView에서 지정한 화면에 있는 컨트롤(위젯) 외에 id를 찾게되면
        //어플리케이션이 강제 종료 된다.
        //버튼을 사용자가 클릭했을때 이벤트
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //실제로 버튼 클릭이 일어났을때 실행되는 코드 영역.
                Toast.makeText(MainActivity.this , "HelloWrold입니다.", Toast.LENGTH_LONG).show();
            }
            //?
        });//OnClickListener ..btn

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edt_id = findViewById(R.id.edt_id);
                EditText edt_pw = findViewById(R.id.edt_pw);
                Toast.makeText(MainActivity.this, edt_id.getText()+"", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, edt_pw.getText()+"", Toast.LENGTH_SHORT).show();
                //ID: admin , PW: admin1234 인경우에는
                String id = edt_id.getText()+"";
                String pw = edt_pw.getText()+"";
                //Toast : 로그인 되었습니다.
                //Toast : 아이디 비밀번호를 확인하세요

            }
        });
        

    }
}