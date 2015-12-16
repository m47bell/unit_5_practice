package m47bell.c4q.nyc.itunesandroidproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;
import m47bell.c4q.nyc.itunesandroidproject.Interface.ItunesService;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

/**
 * Created by c4q-marbella on 12/9/15.
 */
public class SearchContentFragment extends Fragment {

    @Bind(R.id.search_button) Button search_bt;
    @Bind(R.id.list_view) ListView mListView;
    @Bind(R.id.search_editText) Button search_field;
    String search_item;

    public static String itunesApiUri= "https://itunes.apple.com/search?";
    public static String TAG2 = SearchContentFragment.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_result, container, false);
        ButterKnife.bind(this,v);

        String mediaType = getArguments().getString("mediaType");

        search_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                search_item = search_field.getText().toString();
                search_item.replace('-', '+');

                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl(itunesApiUri).addConverterFactory(GsonConverterFactory.create()).build();


                ItunesService service = retrofit.create(ItunesService.class);
            }
        });


        return v;
    }






}
