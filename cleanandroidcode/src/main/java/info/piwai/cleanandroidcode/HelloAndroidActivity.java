package info.piwai.cleanandroidcode;

import javax.inject.Inject;

import android.os.Bundle;
import android.util.Log;
import info.piwai.cleanandroidcode.base.BaseActivity;

import com.squareup.otto.Bus;

import com.googlecode.androidannotations.annotations.EActivity;
import com.squareup.otto.Subscribe;
import info.piwai.cleanandroidcode.base.GraphRetriever;

@EActivity(R.layout.hello_activity)
public class HelloAndroidActivity extends BaseActivity {
    @Inject
    Bus bus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bus.register(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        bus.unregister(this);
    }

	@Subscribe
	public void onUpdateTitle(UpdateTitleEvent event) {
        Log.i("jelly", "UpdateTitleEvent received.");
		setTitle(event.title);
	}

}
