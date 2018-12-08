package com.example.lolaabudu.group_portfolio_hw_team_coding_heroes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Fribelsprofile extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fribelsprofile);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.fribel_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.fribel_project1){

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData( Uri.parse("https://github.com/fribelguzman/killercommute.git"));
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Project 1", Toast.LENGTH_SHORT).show();

        } else if(id == R.id.fribel_project2){

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData( Uri.parse("https://github.com/fribelguzman/Java_Bank_Pursuit_HW_Guzman_Fribel-fr33d00m.git"));
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Project 2", Toast.LENGTH_SHORT).show();

        } else if(id == R.id.fribel_project3){

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData( Uri.parse("https://github.com/fribelguzman/Story_App_HW_Guzman_Fribell.git"));
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Project 3", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }

}
