package component.djc.com;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

import common.component.djc.com.AppConfig;
import common.component.djc.com.BaseApp;

/**
 * @author dong
 * @date 2018/8/6 15:42
 * @description
 */

public class MyApplication extends BaseApp {
    @Override
    public void onCreate() {
        // 打印日志
        ARouter.openLog();
        // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        ARouter.openDebug();
        // 初始化 ARouter
        ARouter.init(this);
        initModuleApp(this);
        initModuleData(this);
        super.onCreate();

    }

    @Override
    public void initModuleApp(Application application) {
        for (String moduleApp: AppConfig.moduleApps){
            try{
                Class clazz = Class.forName(moduleApp);
                BaseApp app = (BaseApp) clazz.newInstance();
                app.initModuleApp(this);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void initModuleData(Application application) {
        for (String moduleApp: AppConfig.moduleApps){
            try{
                Class clazz = Class.forName(moduleApp);
                BaseApp app = (BaseApp) clazz.newInstance();
                app.initModuleData(this);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
