package m47bell.c4q.nyc.c4qsound;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by c4q-marbella on 12/7/15.
 */
public class TrackAdapter extends BaseAdapter {
    private Context mContext;
    private List<Track> mTrackList;

    public TrackAdapter(Context context, List<Track> trackList) {
        mContext = context;
        mTrackList = trackList;
    }

    @Override
    public int getCount() {
        return mTrackList.size();
    }

    @Override
    public Track getItem(int position) {
        return mTrackList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Track track = getItem(position);

        ViewHolder holder;

        if(view == null){
            view = LayoutInflater.from(mContext).inflate(R.layout.tracklist_row, parent,false);
            holder = new ViewHolder();
            holder.album_image = (ImageView) view.findViewById(R.id.album_art_imageview);
            holder.track_title = (TextView) view.findViewById(R.id.track_title);
            view.setTag(holder);
        }else{
            holder = (ViewHolder) view.getTag();
        }

        holder.track_title.setText(track.getTitle());
        Picasso.with(mContext).load(track.getArtworkURL()).into(holder.album_image);

        return view;
    }

    static class ViewHolder{
        ImageView album_image;
        TextView track_title;
    }

}
