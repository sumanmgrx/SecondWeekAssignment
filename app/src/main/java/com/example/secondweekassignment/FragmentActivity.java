package com.example.secondweekassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.secondweekassignment.fragments.ExampleFragment;
import com.example.secondweekassignment.fragments.SecondFragment;

public class FragmentActivity extends AppCompatActivity {
    Button btnF, btnS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        btnF = findViewById(R.id.btnFirstFrag);
        btnS = findViewById(R.id.btnSecondFrag);



        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //fragment manage garna frag manager
                FragmentManager fm = getSupportFragmentManager();
                //fragment lyaudai rakhdai garna transaction.
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragHolder, new ExampleFragment());
                ft.commit();
            }
        });

        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //fragment manage garna frag manager
                FragmentManager fm = getSupportFragmentManager();
                //fragment lyaudai rakhdai garna transaction.
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.fragHolder, new SecondFragment());
                ft.commit();
            }
        });
    }
}
