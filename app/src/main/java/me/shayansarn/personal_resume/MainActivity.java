package me.shayansarn.personal_resume;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    Button workHistoryButton;
    Button callButton;
    Button emailButton;
    Button educationButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workHistoryButton = findViewById(R.id.workHistoryButton);
        callButton = findViewById(R.id.callButton);
        emailButton = findViewById(R.id.emailButton);
        educationButton = findViewById(R.id.educationButton);


        workHistoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTheOtherActivity = new Intent(getApplicationContext(), WorkHistoryActivity.class);
                startActivity(goToTheOtherActivity);
            }
        });

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri myPhoneNumber = Uri.parse("tel: 4087138570");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, myPhoneNumber);
                startActivity(callIntent);
            }
        });

        emailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"42shayan42@gmail.com"});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Shayan's Resume");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "I really like your resume!");
                startActivity(emailIntent);

            }
        });

        educationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToTheOtherActivity = new Intent(getApplicationContext(), EducationActivity.class);
                startActivity(goToTheOtherActivity);
            }
        });

    }
}
