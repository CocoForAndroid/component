package component.djc.com.componentbase.empty_service;

import component.djc.com.componentbase.service.IAccountService;

/**
 * @author dong
 * @date 2018/8/6 14:51
 * @description
 */

public class EmptyAccountService implements IAccountService {
    @Override
    public boolean isLogin() {
        return false;
    }

    @Override
    public String getAccountId() {
        return null;
    }
}
