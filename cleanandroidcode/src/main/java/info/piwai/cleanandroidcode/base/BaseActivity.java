package info.piwai.cleanandroidcode.base;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class BaseActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		GraphRetriever.from(this).inject(this);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
	}

}
