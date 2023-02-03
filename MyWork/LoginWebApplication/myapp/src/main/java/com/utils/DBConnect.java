package com.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;


public class DBConnect {

//	public String[] getdata(String url) throws IOException {
////		UserPojo data;
//		URL reqUrl = new URL(url);
//		URLConnection con = reqUrl.openConnection();
//		InputStreamReader in = new InputStreamReader(con.getInputStream());
//		BufferedReader br = new BufferedReader(in);
//		StringBuilder sb = new StringBuilder();
////		UserPojo users1= 
//		int cp = 0;
//		try {
//			while ((cp = in.read()) != -1) {
//				sb.append((char) cp);
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//		}
////		data = new UserPojo(sb);
//		String json = sb.toString();
//		System.out.println(json);
//		String[] sorted = json.split(":"); 
//		return sorted;
//
//	}

	public String getdata(String url) throws IOException {
		URL reqUrl = new URL(url);
		URLConnection con = reqUrl.openConnection();
		InputStreamReader in = new InputStreamReader(con.getInputStream());
		BufferedReader br = new BufferedReader(in);
		StringBuilder sb = new StringBuilder();
		int cp = 0;
		try {
			while ((cp = br.read()) != -1) {
				sb.append((char) cp);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		String json = sb.toString();
		System.out.println(json);
		return json;
	}

}