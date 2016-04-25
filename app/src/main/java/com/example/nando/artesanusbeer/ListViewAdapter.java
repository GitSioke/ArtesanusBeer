package com.example.nando.artesanusbeer;

/**
 * Created by Nando on 24/04/2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ListViewAdapter extends BaseAdapter{

    private Context context;
    private String[] elements;

    public ListViewAdapter(Context context, String[] elements){

        this.context = context;
        this.elements = elements;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return elements.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return elements[position];
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = (View) inflater.inflate(R.layout.list_view_adapter, null);
        }

        TextView textView = (TextView)convertView.findViewById(R.id.row_text);
        textView.setText(elements[position]);

        return convertView;
    }

}