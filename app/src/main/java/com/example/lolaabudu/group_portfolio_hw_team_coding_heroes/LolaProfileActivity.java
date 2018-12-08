package com.example.lolaabudu.group_portfolio_hw_team_coding_heroes;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LolaProfileActivity extends AppCompatActivity {

//    TextView textView;
//    ImageView imageView;
    Menu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lola);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.lola_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.lola_project1){

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData( Uri.parse("https://github.com/LolaAbudu/EMT-text-based-Game"));
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Project 1-EMT-text-based-Game selected", Toast.LENGTH_SHORT).show();

        } else if(id == R.id.lola_project2){

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData( Uri.parse("https://github.com/LolaAbudu/BankTeller"));
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Project 2-BankTeller selected", Toast.LENGTH_SHORT).show();

        } else if(id == R.id.lola_project3){

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData( Uri.parse("https://github.com/LolaAbudu/Mad-Lib-Story"));
            startActivity(intent);
            Toast.makeText(getApplicationContext(), "Project 3-Mad-Lib-Story selected", Toast.LENGTH_SHORT).show();

        }
        return super.onOptionsItemSelected(item);
    }
}
