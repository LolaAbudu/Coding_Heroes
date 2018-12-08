package com.example.lolaabudu.group_portfolio_hw_team_coding_heroes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toolbar;

public class NaomyProfileActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_naomyprofile);

        ImageView photo = findViewById(R.id.profile_imageview);
        photo.setImageResource(R.drawable.profile_photo2);

        TextView name = findViewById(R.id.personal_name_header_textview);
        name.setText("Naomy");

        ImageButton btn = findViewById(R.id.github_menu_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(NaomyProfileActivity.this, v);
                popup.setOnMenuItemClickListener(NaomyProfileActivity.this);
                popup.inflate(R.menu.popup_menu);
                popup.show();
            }
        });

        ImageButton back = (ImageButton)findViewById(R.id.backNav);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    public void linkIntent(String link){

        Intent openLink = new Intent(Intent.ACTION_VIEW);
        openLink.setData(Uri.parse(link));

        if (openLink.resolveActivity(getPackageManager()) != null) {
            startActivity(openLink);
        }
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
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
