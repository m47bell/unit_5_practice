package m47bell.c4q.nyc.c4qsound;


import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by c4q-marbella on 12/7/15.
 */
public interface SoundCloudService {

    @GET("/tracks?client_id=" + Config.CLIENT_ID)
     void getRecentTracks(@Query("created_at[from]") String date, Callback<List<Track>> cb);



}
