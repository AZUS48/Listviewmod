package com.azus.listviewmod;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Azus_48 on 4/12/2016.
 */
public class TampilanKeDua extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilan_ke_dua);
        TextView txtJudul = (TextView) findViewById(R.id.txtJudul);

        ImageView imgFormList = (ImageView) findViewById(R.id.imgFromList);
        // Proses pengisian
        txtJudul.setText(Tampung.Judul);

        imgFormList.setImageResource(Tampung.Gambar);

    }
}
