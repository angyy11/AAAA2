package com.example.aaaa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class SelectMovie extends AppCompatActivity {
    TextView msName1, msName2, msName3, msName4, msName5, msName6, msName7, msName8,
            msName9, msName10, msName11, msName12, msName13, msName14, msName15, msName16, msName17;

    TextView msContent1, msContent2, msContent3, msContent4, msContent5, msContent6, msContent7, msContent8,
            msContent9, msContent10, msContent11, msContent12, msContent13, msContent14, msContent15, msContent16, msContent17;

    ImageView msImage1, msImage2, msImage3, msImage4, msImage5, msImage6, msImage7, msImage8,
            msImage9, msImage10, msImage11, msImage12, msImage13, msImage14, msImage15, msImage16, msImage17;

    DatabaseReference mDataBase;

    public void back_selectMovie(View view){
        // This is close page
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_movie);
        //ImageView
        msImage1 = (ImageView)findViewById(R.id.movie_selectMovie1_image1);
        msImage2 = (ImageView)findViewById(R.id.movie_selectMovie2_image1);
        msImage3 = (ImageView)findViewById(R.id.movie_selectMovie3_image1);
        msImage4 = (ImageView)findViewById(R.id.movie_selectMovie4_image1);
        msImage5 = (ImageView)findViewById(R.id.movie_selectMovie5_image1);
        msImage6 = (ImageView)findViewById(R.id.movie_selectMovie6_image1);
        msImage7 = (ImageView)findViewById(R.id.movie_selectMovie7_image1);
        msImage8 = (ImageView)findViewById(R.id.movie_selectMovie8_image1);
        msImage9 = (ImageView)findViewById(R.id.movie_selectMovie9_image1);
        msImage10 = (ImageView)findViewById(R.id.movie_selectMovie10_image1);
        msImage11 = (ImageView)findViewById(R.id.movie_selectMovie11_image1);
        msImage12 = (ImageView)findViewById(R.id.movie_selectMovie12_image1);
        msImage13 = (ImageView)findViewById(R.id.movie_selectMovie13_image1);
        msImage14 = (ImageView)findViewById(R.id.movie_selectMovie14_image1);
        msImage15 = (ImageView)findViewById(R.id.movie_selectMovie15_image1);
        msImage16 = (ImageView)findViewById(R.id.movie_selectMovie16_image1);
        msImage17 = (ImageView)findViewById(R.id.movie_selectMovie17_image1);

        //TextView
        msName1 = (TextView)findViewById(R.id.movie_selectMovie1_title1);
        msName2 = (TextView)findViewById(R.id.movie_selectMovie2_title1);
        msName3 = (TextView)findViewById(R.id.movie_selectMovie3_title1);
        msName4 = (TextView)findViewById(R.id.movie_selectMovie4_title1);
        msName5 = (TextView)findViewById(R.id.movie_selectMovie5_title1);
        msName6 = (TextView)findViewById(R.id.movie_selectMovie6_title1);
        msName7 = (TextView)findViewById(R.id.movie_selectMovie7_title1);
        msName8 = (TextView)findViewById(R.id.movie_selectMovie8_title1);
        msName9 = (TextView)findViewById(R.id.movie_selectMovie9_title1);
        msName10 = (TextView)findViewById(R.id.movie_selectMovie10_title1);
        msName11 = (TextView)findViewById(R.id.movie_selectMovie11_title1);
        msName12 = (TextView)findViewById(R.id.movie_selectMovie12_title1);
        msName13 = (TextView)findViewById(R.id.movie_selectMovie13_title1);
        msName14 = (TextView)findViewById(R.id.movie_selectMovie14_title1);
        msName15 = (TextView)findViewById(R.id.movie_selectMovie15_title1);
        msName16 = (TextView)findViewById(R.id.movie_selectMovie16_title1);
        msName17 = (TextView)findViewById(R.id.movie_selectMovie17_title1);

        msContent1 = (TextView)findViewById(R.id.movie_selectMovie1_content1);
        msContent2 = (TextView)findViewById(R.id.movie_selectMovie2_content1);
        msContent3 = (TextView)findViewById(R.id.movie_selectMovie3_content1);
        msContent4 = (TextView)findViewById(R.id.movie_selectMovie4_content1);
        msContent5 = (TextView)findViewById(R.id.movie_selectMovie5_content1);
        msContent6 = (TextView)findViewById(R.id.movie_selectMovie6_content1);
        msContent7 = (TextView)findViewById(R.id.movie_selectMovie7_content1);
        msContent8 = (TextView)findViewById(R.id.movie_selectMovie8_content1);
        msContent9 = (TextView)findViewById(R.id.movie_selectMovie9_content1);
        msContent10 = (TextView)findViewById(R.id.movie_selectMovie10_content1);
        msContent11 = (TextView)findViewById(R.id.movie_selectMovie11_content1);
        msContent12 = (TextView)findViewById(R.id.movie_selectMovie12_content1);
        msContent13 = (TextView)findViewById(R.id.movie_selectMovie13_content1);
        msContent14 = (TextView)findViewById(R.id.movie_selectMovie14_content1);
        msContent15 = (TextView)findViewById(R.id.movie_selectMovie15_content1);
        msContent16 = (TextView)findViewById(R.id.movie_selectMovie16_content1);
        msContent17 = (TextView)findViewById(R.id.movie_selectMovie17_content1);



        //take data from firebase
        mDataBase = FirebaseDatabase.getInstance().getReference().child("category1");

        mDataBase.child("Nowshowing1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage1").getValue(String.class);
                String MovieName1 = dataSnapshot.child("MovieName1").getValue().toString();
                String MovieDetails1 = dataSnapshot.child("MovieDetails1").getValue().toString();
                Picasso.get().load(link).into(msImage1);
                msName1.setText(MovieName1);
                msContent1.setText(MovieDetails1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("Nowshowing2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage2").getValue(String.class);
                String MovieName2 = dataSnapshot.child("MovieName2").getValue().toString();
                String MovieDetails2 = dataSnapshot.child("MovieDetails2").getValue().toString();
                Picasso.get().load(link).into(msImage2);
                msName2.setText(MovieName2);
                msContent2.setText(MovieDetails2);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage3").getValue(String.class);
                String MovieName3 = dataSnapshot.child("MovieName3").getValue().toString();
                String MovieDetails3 = dataSnapshot.child("MovieDetails3").getValue().toString();
                Picasso.get().load(link).into(msImage3);
                msName3.setText(MovieName3);
                msContent3.setText(MovieDetails3);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage4").getValue(String.class);
                String MovieName4 = dataSnapshot.child("MovieName4").getValue().toString();
                String MovieDetails4 = dataSnapshot.child("MovieDetails4").getValue().toString();
                Picasso.get().load(link).into(msImage4);
                msName4.setText(MovieName4);
                msContent4.setText(MovieDetails4);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage5").getValue(String.class);
                String MovieName5 = dataSnapshot.child("MovieName5").getValue().toString();
                String MovieDetails5 = dataSnapshot.child("MovieDetails5").getValue().toString();
                Picasso.get().load(link).into(msImage5);
                msName5.setText(MovieName5);
                msContent5.setText(MovieDetails5);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage6").getValue(String.class);
                String MovieName6 = dataSnapshot.child("MovieName6").getValue().toString();
                String MovieDetails6 = dataSnapshot.child("MovieDetails6").getValue().toString();
                Picasso.get().load(link).into(msImage6);
                msName6.setText(MovieName6);
                msContent6.setText(MovieDetails6);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage7").getValue(String.class);
                String MovieName7 = dataSnapshot.child("MovieName7").getValue().toString();
                String MovieDetails7 = dataSnapshot.child("MovieDetails7").getValue().toString();
                Picasso.get().load(link).into(msImage7);
                msName7.setText(MovieName7);
                msContent7.setText(MovieDetails7);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage8").getValue(String.class);
                String MovieName8 = dataSnapshot.child("MovieName8").getValue().toString();
                String MovieDetails8 = dataSnapshot.child("MovieDetails8").getValue().toString();
                Picasso.get().load(link).into(msImage8);
                msName8.setText(MovieName8);
                msContent8.setText(MovieDetails8);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage9").getValue(String.class);
                String MovieName9 = dataSnapshot.child("MovieName9").getValue().toString();
                String MovieDetails9 = dataSnapshot.child("MovieDetails9").getValue().toString();
                Picasso.get().load(link).into(msImage9);
                msName9.setText(MovieName9);
                msContent9.setText(MovieDetails9);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage10").getValue(String.class);
                String MovieName10 = dataSnapshot.child("MovieName10").getValue().toString();
                String MovieDetails10 = dataSnapshot.child("MovieDetails10").getValue().toString();
                Picasso.get().load(link).into(msImage10);
                msName10.setText(MovieName10);
                msContent10.setText(MovieDetails10);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing11").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage11").getValue(String.class);
                String MovieName11 = dataSnapshot.child("MovieName11").getValue().toString();
                String MovieDetails11 = dataSnapshot.child("MovieDetails11").getValue().toString();
                Picasso.get().load(link).into(msImage11);
                msName11.setText(MovieName11);
                msContent11.setText(MovieDetails11);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing12").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage12").getValue(String.class);
                String MovieName12 = dataSnapshot.child("MovieName12").getValue().toString();
                String MovieDetails12 = dataSnapshot.child("MovieDetails12").getValue().toString();
                Picasso.get().load(link).into(msImage12);
                msName12.setText(MovieName12);
                msContent12.setText(MovieDetails12);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing13").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage13").getValue(String.class);
                String MovieName13 = dataSnapshot.child("MovieName13").getValue().toString();
                String MovieDetails13 = dataSnapshot.child("MovieDetails13").getValue().toString();
                Picasso.get().load(link).into(msImage13);
                msName13.setText(MovieName13);
                msContent13.setText(MovieDetails13);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing14").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage14").getValue(String.class);
                String MovieName14 = dataSnapshot.child("MovieName14").getValue().toString();
                String MovieDetails14 = dataSnapshot.child("MovieDetails14").getValue().toString();
                Picasso.get().load(link).into(msImage14);
                msName14.setText(MovieName14);
                msContent14.setText(MovieDetails14);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing15").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage15").getValue(String.class);
                String MovieName15 = dataSnapshot.child("MovieName15").getValue().toString();
                String MovieDetails15 = dataSnapshot.child("MovieDetails15").getValue().toString();
                Picasso.get().load(link).into(msImage15);
                msName15.setText(MovieName15);
                msContent15.setText(MovieDetails15);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing16").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage16").getValue(String.class);
                String MovieName16 = dataSnapshot.child("MovieName16").getValue().toString();
                String MovieDetails16 = dataSnapshot.child("MovieDetails16").getValue().toString();
                Picasso.get().load(link).into(msImage16);
                msName16.setText(MovieName16);
                msContent16.setText(MovieDetails16);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing17").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage17").getValue(String.class);
                String MovieName17 = dataSnapshot.child("MovieName17").getValue().toString();
                String MovieDetails17 = dataSnapshot.child("MovieDetails17").getValue().toString();
                Picasso.get().load(link).into(msImage17);
                msName17.setText(MovieName17);
                msContent17.setText(MovieDetails17);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
    }
}