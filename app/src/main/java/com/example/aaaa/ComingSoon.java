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

public class ComingSoon extends AppCompatActivity {
    TextView mcName1, mcName2, mcName3, mcName4, mcName5, mcName6, mcName7, mcName8,
            mcName9, mcName10, mcName11, mcName12, mcName13;
    ImageView mcImage1, mcImage2, mcImage3, mcImage4, mcImage5, mcImage6, mcImage7, mcImage8,
            mcImage9, mcImage10, mcImage11, mcImage12, mcImage13;
    DatabaseReference mDataBase;
    public void back_comingSoon(View view){
        // This is close page
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coming_soon);

        //ImageView
        mcImage1 = (ImageView)findViewById(R.id.movie_comingSoon1_image1);
        mcImage2 = (ImageView)findViewById(R.id.movie_comingSoon2_image1);
        mcImage3 = (ImageView)findViewById(R.id.movie_comingSoon3_image1);
        mcImage4 = (ImageView)findViewById(R.id.movie_comingSoon4_image1);
        mcImage5 = (ImageView)findViewById(R.id.movie_comingSoon5_image1);
        mcImage6 = (ImageView)findViewById(R.id.movie_comingSoon6_image1);
        mcImage7 = (ImageView)findViewById(R.id.movie_comingSoon7_image1);
        mcImage8 = (ImageView)findViewById(R.id.movie_comingSoon8_image1);
        mcImage9 = (ImageView)findViewById(R.id.movie_comingSoon9_image1);
        mcImage10 = (ImageView)findViewById(R.id.movie_comingSoon10_image1);
        mcImage11 = (ImageView)findViewById(R.id.movie_comingSoon11_image1);
        mcImage12 = (ImageView)findViewById(R.id.movie_comingSoon12_image1);
        mcImage13 = (ImageView)findViewById(R.id.movie_comingSoon13_image1);

        //TextView
        mcName1 = (TextView)findViewById(R.id.movie_comingSoon1_title1);
        mcName2 = (TextView)findViewById(R.id.movie_comingSoon2_title1);
        mcName3 = (TextView)findViewById(R.id.movie_comingSoon3_title1);
        mcName4 = (TextView)findViewById(R.id.movie_comingSoon4_title1);
        mcName5 = (TextView)findViewById(R.id.movie_comingSoon5_title1);
        mcName6 = (TextView)findViewById(R.id.movie_comingSoon6_title1);
        mcName7 = (TextView)findViewById(R.id.movie_comingSoon7_title1);
        mcName8 = (TextView)findViewById(R.id.movie_comingSoon8_title1);
        mcName9 = (TextView)findViewById(R.id.movie_comingSoon9_title1);
        mcName10 = (TextView)findViewById(R.id.movie_comingSoon10_title1);
        mcName11 = (TextView)findViewById(R.id.movie_comingSoon11_title1);
        mcName12 = (TextView)findViewById(R.id.movie_comingSoon12_title1);
        mcName13 = (TextView)findViewById(R.id.movie_comingSoon13_title1);

        //take data from firebase
        mDataBase = FirebaseDatabase.getInstance().getReference().child("category2");

        mDataBase.child("ComingSoon1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage1").getValue(String.class);
                String MovieName1 = dataSnapshot.child("MovieName1").getValue().toString();
                Picasso.get().load(link).into(mcImage1);
                mcName1.setText(MovieName1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("ComingSoon2").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage2").getValue(String.class);
                String MovieName2 = dataSnapshot.child("MovieName2").getValue().toString();
                Picasso.get().load(link).into(mcImage2);
                mcName2.setText(MovieName2);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("ComingSoon3").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage3").getValue(String.class);
                String MovieName3 = dataSnapshot.child("MovieName3").getValue().toString();
                Picasso.get().load(link).into(mcImage3);
                mcName3.setText(MovieName3);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("ComingSoon4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage4").getValue(String.class);
                String MovieName4 = dataSnapshot.child("MovieName4").getValue().toString();
                Picasso.get().load(link).into(mcImage4);
                mcName4.setText(MovieName4);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("ComingSoon5").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage5").getValue(String.class);
                String MovieName5 = dataSnapshot.child("MovieName5").getValue().toString();
                Picasso.get().load(link).into(mcImage5);
                mcName5.setText(MovieName5);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("ComingSoon6").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage6").getValue(String.class);
                String MovieName6 = dataSnapshot.child("MovieName6").getValue().toString();
                Picasso.get().load(link).into(mcImage6);
                mcName6.setText(MovieName6);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("ComingSoon7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage7").getValue(String.class);
                String MovieName7 = dataSnapshot.child("MovieName7").getValue().toString();
                Picasso.get().load(link).into(mcImage7);
                mcName7.setText(MovieName7);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("ComingSoon8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage8").getValue(String.class);
                String MovieName8 = dataSnapshot.child("MovieName8").getValue().toString();
                Picasso.get().load(link).into(mcImage8);
                mcName8.setText(MovieName8);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("ComingSoon9").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage9").getValue(String.class);
                String MovieName9 = dataSnapshot.child("MovieName9").getValue().toString();
                Picasso.get().load(link).into(mcImage9);
                mcName9.setText(MovieName9);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("ComingSoon10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage10").getValue(String.class);
                String MovieName10 = dataSnapshot.child("MovieName10").getValue().toString();
                Picasso.get().load(link).into(mcImage10);
                mcName10.setText(MovieName10);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("ComingSoon11").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage11").getValue(String.class);
                String MovieName11 = dataSnapshot.child("MovieName11").getValue().toString();
                Picasso.get().load(link).into(mcImage11);
                mcName11.setText(MovieName11);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("ComingSoon12").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage12").getValue(String.class);
                String MovieName12 = dataSnapshot.child("MovieName12").getValue().toString();
                Picasso.get().load(link).into(mcImage12);
                mcName12.setText(MovieName12);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("ComingSoon13").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage13").getValue(String.class);
                String MovieName13 = dataSnapshot.child("MovieName13").getValue().toString();
                Picasso.get().load(link).into(mcImage13);
                mcName13.setText(MovieName13);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
    }
}