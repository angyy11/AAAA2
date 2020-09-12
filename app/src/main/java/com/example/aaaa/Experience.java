package com.example.aaaa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;

public class Experience extends AppCompatActivity {
    TextView eTitle1, eTitle2, eTitle3, eContent1, eContent2, eContent3;

    DatabaseReference mDataBase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experience);

        //TextView
        eTitle1 = (TextView)findViewById(R.id.movie_experience1_title1);
        eTitle2 = (TextView)findViewById(R.id.movie_experience2_title1);
        eTitle3 = (TextView)findViewById(R.id.movie_experience3_title1);
        eContent1 = (TextView)findViewById(R.id.movie_experience1_info1);
        eContent2 = (TextView)findViewById(R.id.movie_experience2_info1);
        eContent3 = (TextView)findViewById(R.id.movie_experience3_info1);

        //take data from firebase
        mDataBase = FirebaseDatabase.getInstance().getReference().child("MovieExperience");
        mDataBase.child("Experience1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String ExperienceName1 = dataSnapshot.child("ExperienceName1").getValue().toString();
                String ExperienceContent1 = dataSnapshot.child("ExperienceContent1").getValue().toString();
                eTitle1.setText(ExperienceName1);
                eContent1.setText(ExperienceContent1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("Experience2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String ExperienceName2 = dataSnapshot.child("ExperienceName2").getValue().toString();
                String ExperienceContent2 = dataSnapshot.child("ExperienceContent2").getValue().toString();
                eTitle2.setText(ExperienceName2);
                eContent2.setText(ExperienceContent2);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("Experience3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String ExperienceName3 = dataSnapshot.child("ExperienceName3").getValue().toString();
                String ExperienceContent3 = dataSnapshot.child("ExperienceContent3").getValue().toString();
                eTitle3.setText(ExperienceName3);
                eContent3.setText(ExperienceContent3);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
    }
}