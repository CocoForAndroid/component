package common.component.djc.com;

import android.app.Application;

/**
 * @author dong
 * @date 2018/8/6 15:24
 * @description
 */

public abstract class BaseApp extends Application{
    /**
     * Application 初始化
     */
    public abstract void initModuleApp(Application application);

    /**
     * 所有 Application 初始化后的自定义操作
     */
    public abstract void initModuleData(Application application);
}
