package com.labs.lotteryresult;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.labs.lotteryresult.Gson.Root;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static com.android.volley.VolleyLog.TAG;
import static com.labs.lotteryresult.VariableStatic.root;

public class VolleyGetLottery {

    private Context context;

    public VolleyGetLottery(Context context) {
        this.context = context;
    }

    public void getLottery() {

        RequestQueue requestQueue = Volley.newRequestQueue(context);
        final long startTime = System.currentTimeMillis();
        RssRequest stringRequest = new RssRequest(Request.Method.GET, "http://thanhhungqb.tk:8080/kqxsmn", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                if(isJSONValid(response)){
                    Log.i("aaaa", response);
                }
                Gson gson = new Gson();
                root = gson.fromJson(response, Root.class);
                Log.i("bbb",root.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(TAG, "onErrorResponse: " + error.getMessage());
            }
        });
        requestQueue.add(stringRequest);
    }

    public boolean isJSONValid(String test) {
        try {
            new JSONObject(test);
        } catch (JSONException ex) {
            try {
                new JSONArray(test);
            } catch (JSONException ex1) {
                return false;
            }
        }
        return true;
    }
}


