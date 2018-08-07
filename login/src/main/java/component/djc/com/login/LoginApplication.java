package component.djc.com.login;

import android.app.Application;

import common.component.djc.com.BaseApp;
import component.djc.com.componentbase.ServiceFactory;

/**
 * @author dong
 * @date 2018/8/6 15:24
 * @description
 */

public class LoginApplication extends BaseApp {
    @Override
    public void onCreate() {
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setAccountService(new AccountService());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
