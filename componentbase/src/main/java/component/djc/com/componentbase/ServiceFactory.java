package component.djc.com.componentbase;

import component.djc.com.componentbase.empty_service.EmptyAccountService;
import component.djc.com.componentbase.service.IAccountService;

/**
 * @author dong
 * @date 2018/8/6 14:49
 * @description
 */

public class ServiceFactory {
    private IAccountService accountService;
    private ServiceFactory(){

    }
    public static ServiceFactory getInstance(){
        return Inner.serviceFactory;
    }

    private static class Inner {
        private static ServiceFactory serviceFactory = new ServiceFactory();
    }

    /**
     * 接收 Login 组件实现的 Service 实例
     */
    public void setAccountService(IAccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * 返回 Login 组件的 Service 实例
     */
    public IAccountService getAccountService() {
        if (accountService == null) {
            accountService = new EmptyAccountService();
        }
        return accountService;
    }


}
