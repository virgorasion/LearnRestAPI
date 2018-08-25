package widyanto.fauzan.learnrestapi;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by M Nur Fauzan W on 25-Aug-18.
 */

public class RestClient {

    private static ActorsService service;

    public static ActorsService getService(){
        if (service == null){
            String API_BASE_URL = "http://microblogging.wingnity.com";
            OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
            Retrofit.Builder builder = new Retrofit.Builder().baseUrl(API_BASE_URL)
                    .addConverterFactory(
                            GsonConverterFactory.create()
                    );
            Retrofit retrofit = builder.client(httpClient.build()).build();

            service = retrofit.create(ActorsService.class);
        }
        return service;
    }
}
