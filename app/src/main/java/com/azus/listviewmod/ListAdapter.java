package com.azus.listviewmod;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Azus_48 on 4/12/2016.
 */
public class ListAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] valuestitle;
    private final String[] valuessubtitle;
    private final int[] valuesimage;

    public ListAdapter(Context context, String[] valuestitle,
                       String[] valuessubtitle, int[] valuesimage){
        super(context, R.layout.listview_layout, valuestitle);
        this.context = context;
        this.valuestitle = valuestitle;
        this.valuessubtitle = valuessubtitle;
        this.valuesimage = valuesimage;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // tampilan listview di atur dalam listview_layout.xml yang berada dalam
        // res/layout
        View rowView = inflater
                .inflate(R.layout.listview_layout, parent, false);
        TextView title = (TextView) rowView.findViewById(R.id.title);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);

        //Mengisi item listview
        title.setText(valuestitle[position]);

        imageView.setImageResource(valuesimage[position]);

        return rowView;
    }


}
