package com.example.aaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();
            }
        });

        //插入圖片
        TextView name = (TextView) findViewById(R.id.name);

//建立一個ImageSpan元件並帶入要插入的圖片
        ImageSpan mImageSpan = new ImageSpan(Main4Activity.this, R.drawable.ic_menu_sort_by_size);

//建立一個SpannableString元件並帶入要顯示的文字字串
        SpannableString mSpannableString = new SpannableString(" 您目前位於選單...");

//插入mImageSpan圖片，並指定在字串裡的第22個位置到23個位置進行插入 (總字串長度為23，圖片插入位置為22-23的位置)
        mSpannableString.setSpan(mImageSpan, 0 , 1, 11);

//將組合後的文字圖片放入TextView裡
        name.setText(mSpannableString);

        Button button1= (Button)findViewById(R.id.btn1);
        button1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i=new Intent();
                i.setClass(Main4Activity.this,Main2Activity.class);
                startActivity(i);
                Toast.makeText(Main4Activity.this, "行事曆讀取中",Toast.LENGTH_SHORT).show();
                onBackPressed();

            }
        });
        Button button2= (Button)findViewById(R.id.btn2);
        button2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i=new Intent();
                i.setClass(Main4Activity.this,Main3Activity.class);
                startActivity(i);
                Toast.makeText(Main4Activity.this, "備忘錄讀取中",Toast.LENGTH_SHORT).show();
                onBackPressed();

            }
        });

        Button button3= (Button)findViewById(R.id.btn3);
        button3.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i=new Intent();
                i.setClass(Main4Activity.this,Main4Activity.class);
                startActivity(i);
                Toast.makeText(Main4Activity.this, "提醒事項讀取中",Toast.LENGTH_SHORT).show();
                onBackPressed();

            }
        });
        Button button33= (Button)findViewById(R.id.button3);
        button33.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i=new Intent();
                i.setClass(Main4Activity.this,MainActivity.class);
                startActivity(i);
                Toast.makeText(Main4Activity.this, "回首頁",Toast.LENGTH_LONG).show();
                onBackPressed();

            }
        });


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main4, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
