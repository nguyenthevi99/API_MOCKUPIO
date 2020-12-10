/*
package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListView extends BaseAdapter {
    Context ctx;
    int playoutItem;
    ArrayList<User> arrayList;
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).inflate(playoutItem,viewGroup,false);

        TextView tvName = view.findViewById(R.id.tvName);
        TextView tvAge = view.findViewById(R.id.tvage);
        TextView tvCity = view.findViewById(R.id.tvCity);

        tvName.setText(arrayList.get(i).getName());
        tvAge.setText(arrayList.get(i).getAge());
        tvCity.setText(arrayList.get(i).getCity());

        return view;
    }
}
*/
