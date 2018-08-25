package widyanto.fauzan.learnrestapi;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by M Nur Fauzan W on 25-Aug-18.
 */

public interface ActorsService {

    @GET("/JSONParsingTutorial/jsonActors")
    Call<ActorsService> getActors();
}
