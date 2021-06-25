package controllers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JsonRequester {
    private HttpURLConnection conn;
    public JsonRequester(String url) {
	try {
	    conn = (HttpURLConnection) new URL(url).openConnection();
	    
	} catch (MalformedURLException e) {
	    throw new IncorrectURIException();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}
