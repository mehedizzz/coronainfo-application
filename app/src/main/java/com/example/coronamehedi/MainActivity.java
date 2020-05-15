package com.example.coronamehedi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button info,hqua,iso,bsym,whdo,pn,hospital;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        info=findViewById(R.id.info);
        hqua=findViewById(R.id.hqua);
        iso=findViewById(R.id.iso);
        bsym=findViewById(R.id.bsym);
        whdo=findViewById(R.id.whdo);
        pn=findViewById(R.id.pn);
        hospital=findViewById(R.id.hospital);
        toolbar=findViewById(R.id.toolbar);



        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Info.class);
                startActivity(intent);
            }
        });

        hqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Quarentine.class);
                startActivity(intent);
            }
        });

        iso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Isolution.class);
                startActivity(intent);
            }
        });

        bsym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Symptomps.class);
                startActivity(intent);
            }
        });

        whdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MustDo.class);
                startActivity(intent);
            }
        });

        pn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CallHelp.class);
                startActivity(intent);
            }
        });

        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Hospital.class);
                startActivity(intent);
            }
        });

        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.feedback)
        {
           Intent intent=new Intent(MainActivity.this,About.class);
           startActivity(intent);
        }
        else if(item.getItemId()==R.id.about){

            Intent intent=new Intent(MainActivity.this,About.class);
            startActivity(intent);
        }

        return false;
    }
}
