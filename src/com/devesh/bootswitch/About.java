package com.devesh.bootswitch;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class About extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
	}

	public void root(View v) {
		Intent intent = new Intent(Intent.ACTION_VIEW);

		intent.setData(Uri
				.parse("https://www.google.co.in/#q=how+to+root+android"));
		startActivity(intent);
	}

	public void update(View v) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("market://details?id=com.devesh.bootswitch"));

		startActivity(intent);
	}

	public void more(View v) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri
				.parse("market://search?q=pub:Devesh%20Chaudhari&hl=en"));

		startActivity(intent);
	}
	public void fb(View v) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("https://www.facebook.com/deveshappsstore")); 																			
																				
		startActivity(intent);
	}
	public void gplus(View v) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("https://plus.google.com/+DeveshChaudhari95")); 																			
																				
		startActivity(intent);
	}
	
	public void xda(View v) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("http://forum.xda-developers.com/member.php?u=5634236")); 																			
																				
		startActivity(intent);
	}
}