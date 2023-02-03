/*
 * package com.utils;
 * 
 * import java.io.BufferedReader; import java.io.IOException; import
 * java.io.InputStream; import java.io.InputStreamReader; import
 * java.io.UnsupportedEncodingException; import java.net.URL; import
 * java.net.URLConnection;
 * 
 * import org.apache.http.HttpEntity; import org.apache.http.HttpResponse;
 * import org.json.JSONException; import org.json.JSONObject;
 * 
 * @SuppressWarnings("deprecation") public class JsonParser {
 * 
 * String url = "https://api.github.com/users/waghdurgesh"; URL requestUrl = new
 * URL(url); URLConnection con = requestUrl.openConnection(); BufferedReader in
 * = new BufferedReader(new InputStreamReader(con.getInputStream()));
 * StringBuilder sb = new StringBuilder();
 * 
 * try { BufferedReader rd; int cp; while ((cp = rd.read()) != -1) {
 * sb.append((char) cp); } }catch( Exception e) { System.out.println(e); }
 * String json = sb.toString();System.out.println(json); }}
 */