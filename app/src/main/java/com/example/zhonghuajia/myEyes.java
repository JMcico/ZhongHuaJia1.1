package com.example.zhonghuajia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.button;
import static com.example.zhonghuajia.R.id.button_to_heaven;


public class myEyes extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_eyes);

        //屏蔽标题
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null){
            actionbar.hide();
        }

        //启动小伙伴
        Button buttontofriends = (Button) findViewById(R.id.button_to_friends);
        buttontofriends.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(myEyes.this, MyfriendsActivity.class);
                startActivity(intent);
            }
        });

        //启动小天堂
        Button buttontoheaven = (Button) findViewById(R.id.button_to_heaven);
        buttontoheaven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MynotesActivity.actionStart(myEyes.this, "data1", "data2");
            }
        });

        //启动百事通
        Button buttontoencyclopedia = (Button) findViewById(R.id.button_to_encyclopedia);
        buttontoencyclopedia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                MyencyclopediaActivity.actionStart(myEyes.this, "data3", "data4");
            }
        });

    }

}
