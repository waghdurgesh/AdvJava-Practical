package com.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Tester {

	public static void main(String[] args) throws IOException {
		String url = "https://api.github.com/users/waghdurgesh";
		URL requestUrl = new URL(url);
		URLConnection con = requestUrl.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		StringBuilder sb = new StringBuilder();

		try {
			int cp;
			while ((cp = in.read()) != -1) {
				sb.append((char) cp);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		String json = sb.toString();
		System.out.println(json);

	}

}
