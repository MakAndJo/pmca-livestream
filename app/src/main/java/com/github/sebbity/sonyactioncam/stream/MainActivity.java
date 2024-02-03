package com.github.sebbity.sonyactioncam.stream;

import android.app.Activity;
import android.os.Bundle;

import java.io.PrintWriter;
import java.io.StringWriter;

public class MainActivity extends UstreamModActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread thread, Throwable throwable) {
				StringWriter sw = new StringWriter();
				sw.append(throwable.toString());
				sw.append("\n");
				throwable.printStackTrace(new PrintWriter(sw));

				System.exit(0);
			}
		});
	}

}
