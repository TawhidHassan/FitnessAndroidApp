package com.example.fitnessapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titlePage,subtitlePage,progressbtn;
    ImageView imgPage;
    Animation animimgpage,bttone,bttwo,btthree,ltr;
    View bgprogress,bgprogresstop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        titlePage=findViewById(R.id.titlePageId);
        subtitlePage=findViewById(R.id.subtitlePageId);
        progressbtn=findViewById(R.id.progressBtnId);
        imgPage=findViewById(R.id.imgPageId);
        bgprogress=findViewById(R.id.bgprogressId);
        bgprogresstop=findViewById(R.id.bgprogressTopId);

        animimgpage= AnimationUtils.loadAnimation(this,R.anim.animimgpage);
        bttone= AnimationUtils.loadAnimation(this,R.anim.bttone);
        bttwo= AnimationUtils.loadAnimation(this,R.anim.bttwo);
        btthree= AnimationUtils.loadAnimation(this,R.anim.btthree);
        ltr= AnimationUtils.loadAnimation(this,R.anim.ltr);

        Typeface MLight=Typeface.createFromAsset(getAssets(),"fonts/MLight.ttf");
        Typeface MMedium=Typeface.createFromAsset(getAssets(),"fonts/MMedium.ttf");
        Typeface Vidaloka=Typeface.createFromAsset(getAssets(),"fonts/Vidaloka.ttf");

        titlePage.setTypeface(Vidaloka);
        subtitlePage.setTypeface(MLight);
        progressbtn.setTypeface(MMedium);

        imgPage.setAnimation(animimgpage);
        titlePage.setAnimation(bttone);
        subtitlePage.setAnimation(bttone);

        progressbtn.setAnimation(btthree);
        bgprogress.setAnimation(bttwo);
        bgprogresstop.setAnimation(ltr);

        progressbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getApplicationContext(),WorkoutAct.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });
    }
}
