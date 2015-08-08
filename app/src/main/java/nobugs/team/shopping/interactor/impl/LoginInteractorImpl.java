package nobugs.team.shopping.interactor.impl;

import android.os.Handler;
import android.text.TextUtils;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

import nobugs.team.shopping.interactor.inter.LoginInteractor;
import nobugs.team.shopping.interfaces.OnLoginFinishedListener;
import nobugs.team.shopping.utils.OkHttpUtil;

public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        // Mock login. I'm creating a handler to delay the answer a couple of seconds
       OkHttpUtil.get("http://www.baidu.com/", new Callback() {
           @Override
           public void onFailure(Request request, IOException e) {

           }

           @Override
           public void onResponse(Response response) throws IOException {
               String result = response.body().toString();
           }
       });
        /*new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                    error = true;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    error = true;
                }
                if (!error){
                    listener.onSuccess();
                }
            }
        }, 2000);*/
    }
}
