package com.atefmousa.collageinfo;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.atefmousa.collageinfo.databinding.ActivityDetaliedBinding;

public class DetaliedActivtiy extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalied);
        StudentInfo [] students_info = {new StudentInfo("ahmed","ahmed@","0100246"),
                new StudentInfo("mahmoud","ahmed@","0100246"),
                new StudentInfo("ayman","ahmed@","0100246")};

        ArrayAdapter<StudentInfo> adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,students_info);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }

}