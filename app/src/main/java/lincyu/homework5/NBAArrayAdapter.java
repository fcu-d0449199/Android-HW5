package lincyu.homework5;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NBAArrayAdapter extends ArrayAdapter<NBAitem> {


    private Context context;

    public NBAArrayAdapter(Context context, ArrayList<NBAitem> nbAitems) {
        super(context, 0, nbAitems);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout itemlayout = null;
        if(convertView == null) {
            itemlayout = (LinearLayout)inflater.inflate(R.layout.itemlist, null);
        } else {
            itemlayout = (LinearLayout) convertView;
        }

        NBAitem item = (NBAitem) getItem(position);
        //host
        TextView hostName = (TextView)itemlayout.findViewById(R.id.itemtv_guest);
        TextView hostScore = (TextView)itemlayout.findViewById(R.id.itemtv2_guest);
        ImageView hostImg = (ImageView)itemlayout.findViewById(R.id.itemiv_guest);
        hostName.setText(item.getHostName());
        hostScore.setText(String.valueOf(item.getHostScore()));
        hostImg.setImageResource(item.getHostImg());
        //guest
        TextView guestName = (TextView)itemlayout.findViewById(R.id.itemtv_host);
        TextView guestScore = (TextView)itemlayout.findViewById(R.id.itemtv2_host);
        ImageView guestImg = (ImageView)itemlayout.findViewById(R.id.itemiv_host);
        guestName.setText(item.getGuestName());
        guestScore.setText(String.valueOf(item.getGuestScore()));
        guestImg.setImageResource(item.getGuestImg());
//        guestImg.setImageResource(R.drawable.hou);

        if(item.getGuestScore() > item.getHostScore()){
            guestScore.setTextColor(Color.RED);
        }else{
            hostScore.setTextColor(Color.RED);
        }

        return itemlayout;

    }
}
