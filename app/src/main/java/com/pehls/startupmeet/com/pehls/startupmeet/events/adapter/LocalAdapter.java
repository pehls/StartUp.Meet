package com.pehls.startupmeet.com.pehls.startupmeet.events.adapter;

/**
 * Created by gabri on 02/10/2016.
 */
import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pehls.startupmeet.R;
import com.pehls.startupmeet.com.pehls.startupmeet.events.provider.EventProvider;
import com.squareup.picasso.Picasso;

import static com.pehls.startupmeet.R.id;

public class LocalAdapter extends CursorAdapter {

    private LayoutInflater inflater;

    private static class ViewHolder {
        int nomeIndex;
        int descriptionIndex;
        int logoIndex;
        int linkIndex;
        int startIndex;
        int endIndex;
        int locationIndex;
        TextView nome;
        TextView description;
        ImageView logo;
        TextView start;
        TextView end;


    }

    public LocalAdapter(Context context, Cursor c, int flags) {
        super(context, c, flags);
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        ViewHolder holder  =   (ViewHolder)    view.getTag();
        holder.nome.setText(cursor.getString(holder.nomeIndex));

        Picasso.with(context).load(cursor.getString(holder.logoIndex)).into(holder.logo);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        View   view    =   inflater.inflate(R.layout.fragment_event, null);
        ViewHolder holder  =   new ViewHolder();
        holder.nome    =   (TextView)  view.findViewById(R.id.nomeTxtView);
        holder.logo    =   (ImageView)  view.findViewById(R.id.logoImgView);
        holder.description = (TextView) view.findViewById(R.id.descriptionTxtView);
        holder.start = (TextView) view.findViewById(R.id.startTxtView);
        holder.end = (TextView) view.findViewById(R.id.endTxtView);
        holder.nomeIndex   =   cursor.getColumnIndexOrThrow(EventProvider.NOME);
        holder.logoIndex   =   cursor.getColumnIndexOrThrow(EventProvider.LOGO);
        holder.descriptionIndex = cursor.getColumnIndexOrThrow(EventProvider.DESCRIPTION);
        holder.linkIndex = cursor.getColumnIndexOrThrow(EventProvider.LINK);
        holder.startIndex = cursor.getColumnIndexOrThrow(EventProvider.START);
        holder.endIndex = cursor.getColumnIndexOrThrow(EventProvider.END);
        holder.locationIndex = cursor.getColumnIndexOrThrow(EventProvider.LOCATION);
        view.setTag(holder);
        return view;
    }
}
