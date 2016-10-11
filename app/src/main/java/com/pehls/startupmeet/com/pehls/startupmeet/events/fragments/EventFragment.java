package com.pehls.startupmeet.com.pehls.startupmeet.events.fragments;


import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ListView;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.pehls.startupmeet.R;
import com.pehls.startupmeet.com.pehls.startupmeet.events.adapter.LocalAdapter;
import com.pehls.startupmeet.com.pehls.startupmeet.events.model.Event;
import com.pehls.startupmeet.com.pehls.startupmeet.events.provider.EventProvider;
import com.pehls.startupmeet.com.pehls.startupmeet.events.service.DownloadResultReceiver;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.gestureStrokeAngleThreshold;
import static android.R.attr.key;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {
    private Event event;
    List<Event> eventsList = new ArrayList<Event>();
    private int i=0;
    private String url;
    private ListView listView;
    private LocalAdapter adapter ;

    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle b = getArguments();
        url = b.getString("url");
        final View tela = inflater.inflate(R.layout.fragment_event, container, false);

        Ion.with(getContext())
                .load("https://mapme.com/api/map/86954f92-b70c-4c41-9dbb-1e9fe007e0aa/events")
                .setLogging("MyLogs", Log.DEBUG)
                .asJsonObject()
                .setCallback(new FutureCallback<JsonObject>() {
                    @Override
                    public void onCompleted(Exception e, JsonObject result) {
                        if(e != null){
                            Log.e("Detalhe","Erro ao baixar o JSON");
                            return ;
                        }
                        try {
                            JsonArray events = result.getAsJsonArray("events");
                            Log.v("Main-", "Total events: " + events.size());
                            i = events.size();
                            JsonObject eventsJson;
                            while (i>0) {
                                if (events.size() > 0) {
                                    eventsJson = (JsonObject) events.get(i).getAsJsonObject();
                                }
                                i--;

                               // EventFragment events

                            }
 /*Faça Sua Magica Aqui */

                        } catch (Exception exception) {
                        }


                    }
                });
        return inflater.inflate(R.layout.fragment_event, container, false);
    }
    public void fragment (Fragment fragment, String title) {

        if (fragment != null) {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container_body, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
        }
    }
}

