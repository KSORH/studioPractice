package org.techtown.ad12_01basicwidget;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class AddButtonActivity extends AppCompatActivity {

    // private 변수 선언
    private Button btnAdd;
    private LinearLayout scroll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_button);

        //선언한 변수에 디자인 텝에서 설정한 버튼과 레이아웃 대입하기
        btnAdd = findViewById(R.id.btnAdd);
        scroll = findViewById(R.id.scroll);

        // 버튼 변수에다가 버튼을 눌렀을 경우 이루어지는 기능을 작성
        btnAdd.setOnClickListener(new View.OnClickListener(){
            // 가로는 꽉차게 세로는 적당히 레이아웃이 생성되도록 설정
            public void onClick(View v) {
                LinearLayout.LayoutParams Ip = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );

                // 레이아웃 마진 크기 설정
                Ip.setMargins(500,500,500, 500);

                // btn이라는 버튼 변수 생성
                Button btn = new Button( getApplicationContext() );
                // 버튼 이름 설정
                btn.setText("push me");
                // ip 레이아웃을 btn에 넣어주고
                btn.setLayoutParams(Ip);
                // 색깔 넣어주기
                btn.setBackgroundColor(Color.DKGRAY);

                //adview 라는 기능을 가져와 scroll에 btn 버튼 넣어주기
                scroll.addView(btn);
            }
        });
    }

}
