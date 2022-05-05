package com.example.reproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lista;
    String[][] items={
            {"Cadena Perpetua","Los Outsaiders"},
            {"Slide Away","Oasis"},
            {"Black","Pearl Jam"},
            {"Trátame Suavemente","Soda Stereo"},
            {"The Adults Are Talking","The Strokes"},
    };
    int[] songs= {R.raw.rock1,R.raw.rock2,R.raw.rock3,R.raw.rock4,R.raw.rock5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lista = (ListView) findViewById(R.id.listViewSong);
        //aca se agrega para mandar a adapter
        lista.setAdapter(new Adaptador(this,items,songs));
    }

}