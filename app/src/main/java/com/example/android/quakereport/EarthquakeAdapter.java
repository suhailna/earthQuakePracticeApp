package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EarthquakeAdapter  extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context, List<Earthquake> earthquakes) {
        super(context, 0, earthquakes);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;



            if (listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.earthquake_list_item, parent, false);
            }

            Earthquake currentEarthquake = getItem(position);

            // Find the TextView in the list_item.xml layout with the ID version_name
            TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
            // Get the version name from the current AndroidFlavor object and
            // set this text on the name TextView
            magnitudeView.setText(currentEarthquake.getMagnitude());

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView locationView = (TextView) listItemView.findViewById(R.id.location);
            // Get the version number from the current AndroidFlavor object and
            // set this text on the number TextView
            locationView.setText(currentEarthquake.getLocation());

            // Find the TextView in the list_item.xml layout with the ID version_number
            TextView dateView = (TextView) listItemView.findViewById(R.id.date);
            // Get the version number from the current AndroidFlavor object and
            // set this text on the number TextView
            locationView.setText(currentEarthquake.getDate());


            // Return the whole list item layout (containing 2 TextViews and an ImageView)
            // so that it can be shown in the ListView
            return listItemView;
        }
    }



