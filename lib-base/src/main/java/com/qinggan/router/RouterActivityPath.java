package com.qinggan.router;

/**
 * 用于组件开发中，ARouter单Activity跳转的统一路径注册
 * 在这里注册添加路由路径，需要清楚的写好注释，标明功能界面
 */

public class RouterActivityPath {
    /**
     * 主业务组件
     */
    public static class Main {
        private static final String MAIN = "/main";
        /*主业务界面*/
        public static final String PAGER_MAIN = MAIN +"/Main";
    }

    /**
     * 酒店组件
     */
    public static class Hotel {
        private static final String HOTEL = "/hotel";
        /*登录界面*/
        public static final String PAGER_HOTEL = HOTEL + "/Hotel";
    }

    /**
     * 登录组件
     */
    public static class Login {
        private static final String LOGIN = "/login";
        /*登录界面*/
        public static final String PAGER_LOGIN = LOGIN + "/Login";
    }

}
