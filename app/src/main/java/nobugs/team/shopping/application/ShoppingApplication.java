package nobugs.team.shopping.application;

import android.app.Application;

import com.facebook.stetho.Stetho;

/**
 * Created by xiayong on 2015/8/8.
 */
public class ShoppingApplication extends Application {
    public void onCreate() {
        super.onCreate();
        Stetho.initialize(
                Stetho.newInitializerBuilder(this)
                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                        .enableWebKitInspector(Stetho.defaultInspectorModulesProvider(this))
                        .build());
    }
}
