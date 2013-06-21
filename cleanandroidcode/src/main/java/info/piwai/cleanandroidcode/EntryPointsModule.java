package info.piwai.cleanandroidcode;

import javax.inject.Singleton;

import com.squareup.otto.Bus;

import dagger.Module;
import dagger.Provides;

@Module(injects={HelloAndroidActivity_.class,HelloFragment_.class})
public class EntryPointsModule {
}
