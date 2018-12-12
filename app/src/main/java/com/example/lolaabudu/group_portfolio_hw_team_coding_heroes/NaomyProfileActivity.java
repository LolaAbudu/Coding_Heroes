package com.example.lolaabudu.group_portfolio_hw_team_coding_heroes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class NaomyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naomyprofile);

        ImageView photo = findViewById(R.id.profile_imageview);
        photo.setImageResource(R.drawable.naomy_profile_photo1);

        TextView name = findViewById(R.id.personal_name_header_textview);
        name.setText(getString(R.string.headerName_naomy));

        TextView quote = findViewById(R.id.profile_quote_textview);
        quote.setText(getString(R.string.quoteText_naomy));

        TextView bio = findViewById(R.id.profile_aboutyou_textview);
        bio.setText(getString(R.string.bioText_naomy));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.naomy_popup_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void linkIntent(String link){

        Intent openLink = new Intent(Intent.ACTION_VIEW);
        openLink.setData(Uri.parse(link));

        if (openLink.resolveActivity(getPackageManager()) != null) {
            startActivity(openLink);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.project1:
                linkIntent(getString(R.string.naomyGitHubLink1));
                return true;
            case R.id.project2:
                linkIntent(getString(R.string.naomyGitHubLink2));
                return true;
            case R.id.project3:
                linkIntent(getString(R.string.naomyGitHubLink3));
                return true;
            case R.id.project4:
                linkIntent(getString(R.string.naomyGitHubLink4));
                return true;
            default:
                return false;
        }
    }

}
