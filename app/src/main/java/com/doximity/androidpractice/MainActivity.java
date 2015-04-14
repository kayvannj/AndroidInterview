package com.doximity.androidpractice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import butterknife.InjectView;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by kayvan on 4/13/15.
 */
public class MainActivity extends Activity {
    @InjectView(R.id.list)
    ListView LISTVIEW;
    @InjectView(R.id.query)
    EditText QUERY;
    @InjectView(R.id.search)
    Button SEARCH;

    /* TODO Make a request with the input query and get the articles
    Display the headline of articles in a listView
    Tapping each item in listView should open that article URL in a browser
    */
    interface api{
        @GET("/svc/search/v2/articlesearch.json?page=2&sort=oldest&api-key=f8e3e0aab0c3cc0ff9c9daac65bb4863:0:71846732")
        public void getArticles(@Query("q") String q, Callback<NytData> res);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        RestAdapter restAdapter = new RestAdapter.Builder().setEndpoint("http://api.nytimes.com").build();
//        restAdapter.create(api.class).getArticles(YOUR_QUERY_TEXT,new Callback<NytData>() {
//            @Override
//            public void success(NytData nytData, retrofit.client.Response response2) {
//                ArrayList<Docs> docs = nytData.response.docs;
//                // TODO fill your list
//
//            }
//
//            @Override
//            public void failure(RetrofitError error) {
//                // Do nothing
//            }
//        });
    }



    @Override
    protected void onResume() {
        super.onResume();

    }
}
