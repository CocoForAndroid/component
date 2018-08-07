package component.djc.com.login;

import component.djc.com.componentbase.service.IAccountService;

/**
 * @author dong
 * @date 2018/8/6 15:23
 * @description
 */

public class AccountService implements IAccountService {
    @Override
    public boolean isLogin() {
        return true;
    }

    @Override
    public String getAccountId() {
        return "abcdefg";
    }
}
