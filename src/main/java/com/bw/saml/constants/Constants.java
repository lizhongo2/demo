package com.bw.saml.constants;

/**
 * @author Xiaosy
 * @date 2017-12-21 9:49
 */
public class Constants {

    /**
     * cookie相关
     */
    /**
     * sp 端cookie的key
     */
    public static final String SP_COOKIE_KEY = "sp_cookie_key";
    /**
     * sp 端cookie的value
     */
    public static final String SP_COOKIE_VALUE = "sp_cookie_value";
    /**
     * idp端cookie的key
     */
    public static final String IDP_COOKIE_KEY = "idp_cookie_key";
    /**
     * idp 端 cookie的value
     */
    public static final String IDP_COOKIE_VALUE = "idp_cookie_value";


    /**
     * sp的身份标识
     */
    public static final String SP_ENTITY_ID = "http://127.0.0.1:8083/sp";
    /**
     * idp的身份标识
     */
    public static final String IDP_ENTITY_ID = "http://proxy.server.com/am";
    /**
     * idp的sso地址
     */
    public static final String IDP_SSO_URL = "http://proxy.server.com/am/SSORedirect/metaAlias/idp";
    /**
     * sp的acs地址
     */
    public static final String SP_ACS_URL = "http://127.0.0.1:8083/sp/consumer";

}
