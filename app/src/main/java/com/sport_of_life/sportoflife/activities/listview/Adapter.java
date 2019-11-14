package com.sport_of_life.sportoflife.activities.listview;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import com.sport_of_life.sportoflife.R;


public class Adapter extends BaseAdapter {

    private Context mContext;
    private List<Program> mProgramList;



    public Adapter(Context mContext, List<Program> mProgramList) {
        this.mContext = mContext;
        this.mProgramList = mProgramList;
    }

    @Override
    public int getCount() {
        return mProgramList.size();
    }

    @Override
    public Object getItem(int position) {
        return mProgramList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.item_program_list, null);
        TextView tvhareketIsmi = (TextView)v.findViewById(R.id.tv_hareketIsmi);
        TextView tvalet = (TextView)v.findViewById(R.id.tv_alet);
        TextView tvsetMiktarı = (TextView)v.findViewById(R.id.tv_setMiktarı);

        tvhareketIsmi.setText(mProgramList.get(position).gethareketIsmi());
        tvalet.setText(String.valueOf(mProgramList.get(position).getAlet()));
        tvsetMiktarı.setText(mProgramList.get(position).getsetMiktarı());


        v.setTag(mProgramList.get(position).getId());

        return v;
    }
}