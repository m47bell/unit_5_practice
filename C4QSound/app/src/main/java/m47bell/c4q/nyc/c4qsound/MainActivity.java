package m47bell.c4q.nyc.c4qsound;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

//source: http://www.sitepoint.com/develop-music-streaming-android-app/

public class MainActivity extends AppCompatActivity {
    private static final String CLIENT_ID = "adbc1e1ac37f6fbf581a75f523a3aa5a";
    private static final String CLIENt_SECRET = "f87e3eac06add20327c79da11a31b223";
    private static final String End_USER = "https://soundcloud.com/connect";
    private static final String TOKEN = "https://api.soundcloud.com/oauth2/token";
    private static final String url = End_USER + "client_id=" + CLIENT_ID + "&client_secret=" + CLIENt_SECRET + "?response_type_code=";
    private static final String TAG = "MainActivity";

    ListView track_ListView;
    TrackAdapter mTrackAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        track_ListView = (ListView) findViewById(R.id.track_listview);
        track_ListView.setAdapter(mTrackAdapter);

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(Config.API_URL).build();
        SoundCloudService soundCloudService = restAdapter.create(SoundCloudService.class);
        soundCloudService.getRecentTracks(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()),
                new Callback<List<Track>>() {
                    @Override
                    public void success(List<Track> tracks, Response response) {
                        Log.d(TAG,"Track #1 Title: " + tracks.get(0).getTitle());
                    }

                    @Override
                    public void failure(RetrofitError error) {
                        Log.d(TAG,"Error: " +error);
                    }
                });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
