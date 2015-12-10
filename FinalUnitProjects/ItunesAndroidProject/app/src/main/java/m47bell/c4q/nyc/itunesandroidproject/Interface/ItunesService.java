package m47bell.c4q.nyc.itunesandroidproject.Interface;

import m47bell.c4q.nyc.itunesandroidproject.Model.SearchParameters;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by c4q-marbella on 12/6/15.
 */
public interface ItunesService {
    @GET("/search")
    public Call<SearchParameters> getSearchResults(@Query("media") String mediaType,
                          @Query("term") String termType);

}
