package component.djc.com.componentbase.service;

/**
 * @author dong
 * @date 2018/8/6 14:48
 * @description
 */

public interface IAccountService {
    /**
     * 是否登录
     * @return 登录状态
     */
    boolean isLogin();

    /**
     * 登录Id
     * @return id
     */
    String getAccountId();
}
