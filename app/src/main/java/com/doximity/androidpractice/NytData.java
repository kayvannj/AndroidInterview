package com.doximity.androidpractice;

import java.util.ArrayList;

/**
 * Created by kayvan on 4/13/15.
 */
class NytData {
    Response response;
}

class Response{
    ArrayList<Docs> docs;
}

class Docs{
    String web_url;
    Headline headline;
}

class Headline{
    String main;
}