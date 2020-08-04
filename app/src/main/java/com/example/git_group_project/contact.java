package com.example.git_group_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        this.setTitle("Contact Us");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.custome_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        switch(item.getItemId())
        {

            case R.id.mnuLogin:
                Intent LoginIntent = new Intent(contact.this,login.class);
                startActivity(LoginIntent);

                break;
            case R.id.mnuAbout:
                Intent AboutIntent = new Intent(contact.this,about.class);
                startActivity(AboutIntent);

                break;


        }

        return super.onOptionsItemSelected(item);
    }




}