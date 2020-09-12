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


public class Popular extends AppCompatActivity {
    TextView mpName1, mpName2, mpName3, mpName4, mpName5, mpName6, mpName7, mpName8;
    ImageView mpImage1, mpImage2, mpImage3, mpImage4, mpImage5, mpImage6, mpImage7, mpImage8;
    DatabaseReference mDataBase;
    public void back_popular(View view){
        // This is close page
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular);
        //ImageView
        mpImage1 = (ImageView)findViewById(R.id.movie_popular1_image1);
        mpImage2 = (ImageView)findViewById(R.id.movie_popular2_image1);
        mpImage3 = (ImageView)findViewById(R.id.movie_popular3_image1);
        mpImage4 = (ImageView)findViewById(R.id.movie_popular4_image1);
        mpImage5 = (ImageView)findViewById(R.id.movie_popular5_image1);
        mpImage6 = (ImageView)findViewById(R.id.movie_popular6_image1);
        mpImage7 = (ImageView)findViewById(R.id.movie_popular7_image1);
        mpImage8 = (ImageView)findViewById(R.id.movie_popular8_image1);

        //TextView
        mpName1 = (TextView)findViewById(R.id.movie_popular1_title1);
        mpName2 = (TextView)findViewById(R.id.movie_popular2_title1);
        mpName3 = (TextView)findViewById(R.id.movie_popular3_title1);
        mpName4 = (TextView)findViewById(R.id.movie_popular4_title1);
        mpName5 = (TextView)findViewById(R.id.movie_popular5_title1);
        mpName6 = (TextView)findViewById(R.id.movie_popular6_title1);
        mpName7 = (TextView)findViewById(R.id.movie_popular7_title1);
        mpName8 = (TextView)findViewById(R.id.movie_popular8_title1);

        //take data from firebase
        mDataBase = FirebaseDatabase.getInstance().getReference().child("category1");
        //Popular1
        mDataBase.child("Nowshowing1").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage1").getValue(String.class);
                String MovieName1 = dataSnapshot.child("MovieName1").getValue().toString();
                Picasso.get().load(link).into(mpImage1);
                mpName1.setText(MovieName1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing11").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage11").getValue(String.class);
                String MovieName1 = dataSnapshot.child("MovieName11").getValue().toString();
                Picasso.get().load(link).into(mpImage2);
                mpName2.setText(MovieName1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });

        mDataBase.child("NowShowing8").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage8").getValue(String.class);
                String MovieName3 = dataSnapshot.child("MovieName8").getValue().toString();
                Picasso.get().load(link).into(mpImage3);
                mpName3.setText(MovieName3);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        mDataBase.child("NowShowing10").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage10").getValue(String.class);
                String MovieName4 = dataSnapshot.child("MovieName10").getValue().toString();
                Picasso.get().load(link).into(mpImage4);
                mpName4.setText(MovieName4);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        mDataBase.child("NowShowing4").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage4").getValue(String.class);
                String MovieName5 = dataSnapshot.child("MovieName4").getValue().toString();
                Picasso.get().load(link).into(mpImage5);
                mpName5.setText(MovieName5);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        mDataBase.child("NowShowing7").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage7").getValue(String.class);
                String MovieName6 = dataSnapshot.child("MovieName7").getValue().toString();
                Picasso.get().load(link).into(mpImage6);
                mpName6.setText(MovieName6);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        mDataBase.child("NowShowing12").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage12").getValue(String.class);
                String MovieName7 = dataSnapshot.child("MovieName12").getValue().toString();
                Picasso.get().load(link).into(mpImage7);
                mpName7.setText(MovieName7);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        mDataBase.child("NowShowing13").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String link = dataSnapshot.child("MovieImage13").getValue(String.class);
                String MovieName8 = dataSnapshot.child("MovieName13").getValue().toString();
                Picasso.get().load(link).into(mpImage8);
                mpName8.setText(MovieName8);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        });
    }
}