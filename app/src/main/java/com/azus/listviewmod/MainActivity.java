package com.azus.listviewmod;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    private String[] Judul = new String[10];
    private String[] subJudul = new String[10];
    private int[] Gambar = new int[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prosesIsiData();
        ListAdapter adapter = new ListAdapter(getBaseContext(), Judul,
                subJudul, Gambar);
        setListAdapter(adapter);
    }

    private void prosesIsiData() {
        for (int i = 0; i < Judul.length; i++) {
            Judul[i] = "Judul ke " + (i + 1);
            subJudul[i] = "Sub Judul ke " + (i + 1);
            Gambar[i] = R.drawable.icaksama;
        }
    }

    // Method untuk mengeluarkan event saat list di click
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Tampung.Judul = Judul[position];
        Tampung.subJudul = subJudul[position];
        Tampung.Gambar = Gambar[position];
        startActivity(new Intent(getBaseContext(), TampilanKeDua.class));
    }

}
