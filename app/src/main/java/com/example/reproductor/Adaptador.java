package com.example.reproductor;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {
    private static LayoutInflater inflater=null;//instanciar el rchivo de diseño que creamos
    Context contexto;//entorno de la aplicacion, genera el adaptador
    String[][] datos;
    int[] datosSong;

    public Adaptador(Context contexto, String[][] datos, int[] songs)
    {
        this.contexto =contexto;
        this.datos = datos;
        this.datosSong = songs;
        inflater = (LayoutInflater) contexto.getSystemService(contexto.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return datosSong.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final View vista= inflater.inflate(R.layout.list_item,null);
        TextView titulo = (TextView) vista.findViewById(R.id.txtSongName);
        TextView autor = (TextView) vista.findViewById(R.id.txtAutor);
        ImageView imagen = (ImageView) vista.findViewById(R.id.imgSong);
        titulo.setText(datos[i][0]);
        autor.setText(datos[i][1]);
        /*imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento1 =  new Intent(contexto, Autor.class);
                //mandar datos para autor agregar imagen tambien!!!!
                contexto.startActivity(intento1);
            }
        });*/
        return vista;
    }
}
