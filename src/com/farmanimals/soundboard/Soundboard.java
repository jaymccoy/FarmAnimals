package com.farmanimals.soundboard;

import com.farmanimals.soundboard.SoundManager;
import com.soundboardtest.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Soundboard extends Activity {
	private SoundManager mSoundManager;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_soundboard);

		mSoundManager = new SoundManager();
		mSoundManager.initSounds(getBaseContext());
		mSoundManager.addSound(1, R.raw.sound1);
		mSoundManager.addSound(2, R.raw.sound2);
		mSoundManager.addSound(3, R.raw.sound3);
		mSoundManager.addSound(4, R.raw.sound4);

		Button SoundButton1 = (Button) findViewById(R.id.sound1);
		SoundButton1.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				mSoundManager.playSound(1);
			}
		});
		Button SoundButton2 = (Button) findViewById(R.id.sound2);
		SoundButton2.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				mSoundManager.playSound(2);
			}
		});
		Button SoundButton3 = (Button) findViewById(R.id.sound3);
		SoundButton3.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				mSoundManager.playSound(3);
			}
		});
		Button SoundButton4 = (Button) findViewById(R.id.sound4);
		SoundButton4.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				mSoundManager.playSound(4);
			}
		});
	}
}