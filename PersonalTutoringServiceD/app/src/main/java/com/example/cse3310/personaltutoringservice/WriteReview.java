package com.example.cse3310.personaltutoringservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class WriteReview extends AppCompatActivity {
    String review = null;
    float rating = 0;
    Tutor temp = new Tutor();
    Review tempreview = new Review();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_review);
        final FullData data = (FullData) getApplication();
        final RatingBar rateBar = (RatingBar)findViewById(R.id.ratingBarID);
        Button submitButton = (Button) findViewById(R.id.buttonID);
        final TextView displayRate = (TextView) findViewById(R.id.textViewID);
        final TextView comment = (TextView) findViewById(R.id.commentID);


        submitButton.setOnClickListener
                (new View.OnClickListener()
                {
                    public void onClick(View v)
                    {

                        //has to add this review details to the tutor page as part of the array
                        displayRate.setText("Your rating is: " + rateBar.getRating());

                        comment.setText(comment.getText().toString());

                        //if the review is completed then shows the completion message


                        review = comment.getText().toString();
                        rating = rateBar.getRating();
                        tempreview.setReview(review);
                        tempreview.setRating(rating);
                        temp = data.getPrehiretutor();
                        temp.addReview(tempreview); // this is the function
                        data.setPrehiretutor(temp);
                        data.updatePreHire();
                        Intent intend = new Intent(WriteReview.this,StudentHomepage.class);
                        startActivity(intend);
                    }
                });
    }
}
