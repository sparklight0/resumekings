package com.example.t_ste.resumekings;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.HttpEntity;
import cz.msebera.android.httpclient.entity.FileEntity;
import cz.msebera.android.httpclient.entity.StringEntity;


/**
 * Created by t_ste on 11/19/2016.
 */


public class Web_Rest_API {



    private static final String BASE_URL = "";
    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }


    public static void post(String url, StringEntity entity , AsyncHttpResponseHandler responseHandler) {
        client.post(null,getAbsoluteUrl(url), entity, "application/json", responseHandler);
    }

    public static void post(String url, FileEntity entity , AsyncHttpResponseHandler responseHandler) {
        client.post(null,getAbsoluteUrl(url), entity, "application/json", responseHandler);
    }

    public static void delete(String url, AsyncHttpResponseHandler responseHandler) {
        client.delete(getAbsoluteUrl(url), responseHandler);
    }
    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }

}
