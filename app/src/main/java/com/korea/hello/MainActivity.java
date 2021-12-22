package com.korea.hello;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View v) { // 버튼 클릭 메소드.
        // 버튼을 클릭했을때 에뮬레이터 하단에 실행창 띄우기.
        Toast.makeText(getApplicationContext(), "버튼을 눌렸어요.", Toast.LENGTH_LONG).show();
    }

    public void onButton2Clicked(View v) {
        // 버튼 클릭시 네이버 페이지로 이동.
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
        startActivity(intent);
    }

    public void onButton3Clicked(View v) {
        // 메뉴엑티비티 화면으로 이동.
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }
}