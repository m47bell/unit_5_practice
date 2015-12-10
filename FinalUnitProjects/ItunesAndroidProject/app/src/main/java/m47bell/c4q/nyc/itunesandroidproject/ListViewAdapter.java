package m47bell.c4q.nyc.itunesandroidproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import m47bell.c4q.nyc.itunesandroidproject.Model.MusicSearch;

/**
 * Created by c4q-marbella on 12/6/15.
 */
public class ListViewAdapter extends BaseAdapter {

    private Context mContext;
    private List<MusicSearch> mMusicSearches;

    public ListViewAdapter(Context context, List<MusicSearch> musicSearches, ArrayList<MusicSearch> musicResults) {
        mContext = context;
        mMusicSearches = musicSearches;
    }

    @Override
    public int getCount() {
        return mMusicSearches.size();
    }

    @Override
    public MusicSearch getItem(int position) {
        return mMusicSearches.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MusicSearch musicSearch = getItem(position);

        ViewHolder holder;

        if(convertView == null){

            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
            holder = new ViewHolder(convertView);
//            holder.trackImageView = (ImageView) convertView.findViewById(R.id.image_view);
//            holder.titleTextView = (TextView) convertView.findViewById(R.id.trackName_textView);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.titleTextView.setText(musicSearch.getTrackName());

        Picasso.with(mContext).load(musicSearch.getArtworkUrl60());
        return convertView;
    }

    static class ViewHolder {
       @Bind(R.id.image_view) ImageView trackImageView;
       @Bind(R.id.trackName_textView) TextView titleTextView;

        public ViewHolder(View v){
            ButterKnife.bind(this,v);
        }
    }
}
