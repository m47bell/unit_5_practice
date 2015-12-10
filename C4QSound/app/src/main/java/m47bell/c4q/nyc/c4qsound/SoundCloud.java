package m47bell.c4q.nyc.c4qsound;

/**
 * Created by c4q-marbella on 12/7/15.
 */

import retrofit.RestAdapter;


public class SoundCloud {
    private static final RestAdapter REST_ADAPTER = new RestAdapter.Builder().setEndpoint(Config.API_URL).build();
    private static final SoundCloudService SERVICE = REST_ADAPTER.create(SoundCloudService.class);

    public static SoundCloudService getService() {
        return SERVICE;
    }

}
