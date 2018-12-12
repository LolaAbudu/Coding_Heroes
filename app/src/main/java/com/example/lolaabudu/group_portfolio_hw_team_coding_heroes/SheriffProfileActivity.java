package com.example.lolaabudu.group_portfolio_hw_team_coding_heroes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class SheriffProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sheriff_profile);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sheriff_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.sheriff_project1){

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData( Uri.parse("https://github.com/sheriffameen/TheLastShotGame"));
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Project 1-THE LAST SHOT-text-based-Game selected", Toast.LENGTH_SHORT).show();

        } else if(id == R.id.sheriff_project2){

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData( Uri.parse("https://github.com/sheriffameen/JavaBank.git"));
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Project 2-BankTeller selected", Toast.LENGTH_SHORT).show();

        } else if(id == R.id.sheriff_project3){

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData( Uri.parse("https://github.com/sheriffameen/Your-App"));
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Project 3-Mad-Lib-Story selected", Toast.LENGTH_SHORT).show();
        }

        //this takes you back to the mainActivity
        return super.onOptionsItemSelected(item);
    }
}
