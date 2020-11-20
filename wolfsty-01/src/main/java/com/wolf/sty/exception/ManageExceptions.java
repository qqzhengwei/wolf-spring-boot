package com.wolf.sty.exception;

import static com.wolf.sty.exception.ManageExceptions.Constant.*;

/**
 * 管理后台枚举异常常量
 *
 * @author Nian.Li
 * @version v1.0
 * @date 2017年2月24日
 */
public interface ManageExceptions {

    /**
     * 异常模块code
     */
    interface Constant {
        int SYSTEM = 100;// 系统异常
        int COMMON = 150;//公共异常
        int AD = 200;// 后台广告
        int GEO = 300;// 后台地市信息
        int SENSITIVE_WORDS = 400;// 后台敏感词
        int MOOD = 500;// 后台心情
        int USER = 600;// 后台用户
        int MENU = 700;// 后台菜单
        int ROLE = 800;// 后台角色
        int USER_LEVEL = 900;//用户等级
        int CATEGORY = 1000;//分类
        int REPAIR = 1100;//报事报修
        int SERVICE = 1200;//服务
        int TOPIC = 1300;//话题
        int STORE = 1400;//店铺
        int BANNER = 1500;//banner
        int SPECIAL = 1600;//专题
        int PROPERTYINFO = 1700;//物业信息
        int FAMILYBIOTOPE = 1800;//小区信息
        int PRODUCT_CATEGORY = 1900;//商品分类
        int SYSTEMAVATAR = 2000;//系统头像
        int FEEDBACK_MSG = 2100;//用户意见反馈
        int HELP_MSG = 2200;//帮助信息
        int BILL = 2300;//结算
        int COMMEND_PRODUCT = 2400;//推荐商品
        int TOPIC_COMMENT = 2500;//话题评论
        int PUSH_MESSAGE = 2600;//PUSH消息
        int PROPERTY_BANNER = 2700;//物业banner
        int PRODUCT_COMMENT = 2800;//产品评论
        int COMMEND_PRODUCT_CATEGORY = 2900;//推荐商品分类
        int POSTER = 3000;//海报
        int HEALTHY_FOOD = 3100;//膳食
        int E_GOVERNMENT_SERVICE = 3200;//政务服务
        int MEDICAL_INSTITUTION = 3300;//体检机构
        int COMMON_LABEL = 3400;//标签库
        int EXCHANGE_TREASURE = 3500;//宝物交换
        int SHARE_SKILL = 3600;//技能共享
        int CHANNEL_ARTICLE = 3700;//频道文章
        int REPLY = 3800;//频道回复
        int HOT_KEYWORD = 3900;//热搜词
        int RECOMMEND_CONFIG=4000;//推荐位配置
    }

    enum Common implements ExceptionType {

        ID_NULL(COMMON + 1, "ID为空"),
        SAVE_FAIL(COMMON + 2, "保存失败"),
        DELETE_FAIL(COMMON + 3, "删除失败"),
        USER_ID_NULL(COMMON + 4, "用户ID为空"),
        FAIL(COMMON + 5, "操作失败,请稍后重试"),
        IMPORT_CONTENT_NULL(COMMON+10,"导入内容不能为空"),
        CONTENT_INVALID(COMMON+11,""),
        IMPORT_FAIL(COMMON+12,"导入失败"),
        ;
        private int code;
        private String description;

        Common(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    enum commendProductCategory implements ExceptionType {
        COMMEND_PRODUCT_CATEGORY_DTO_NULL(COMMEND_PRODUCT_CATEGORY + 1, "提交参数为空"),
        COMMEND_PRODUCT_CATEGORY_THREE_NULL(COMMEND_PRODUCT_CATEGORY + 2, "商品分类三级分类参数不能为空"),
        COMMEND_PRODUCT_CATEGORY_COMMEND_IMAGE_NULL(COMMEND_PRODUCT_CATEGORY + 3, "推荐图片不能为空"),
        COMMEND_PRODUCT_CATEGORY_CATEGORY_NAME_NULL(COMMEND_PRODUCT_CATEGORY + 4, "推荐名称不能为空"),
        COMMEND_PRODUCT_CATEGORY_SAVE_FAIL(COMMEND_PRODUCT_CATEGORY + 5, "商品推荐分类保存失败"),
        COMMEND_PRODUCT_CATEGORY_ID_NULL(COMMEND_PRODUCT_CATEGORY + 6, "商品推荐分类参数不允许为空"),
        COMMEND_PRODUCT_CATEGORY_DELETE_FAIL(COMMEND_PRODUCT_CATEGORY + 7, "商品推荐分类删除失败");
        private int code;
        private String description;

        commendProductCategory(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

        int BILL = 2300;//结算
    }

    enum commendProduct implements ExceptionType {
        COMMEND_PRODUCT_PARAM_NULL(COMMEND_PRODUCT + 1, "提交参数为空"),
        COMMEND_PRODUCT_TYPE_NOT_SUPPORT(COMMEND_PRODUCT + 2, "商品推荐类型不支持"),
        COMMEND_PRODUCT_TYPE_NOT_EXTIS(COMMEND_PRODUCT + 3, "商品推荐类型不存在"),
        COMMEND_PRODUCT_DELETE_FAIL(COMMEND_PRODUCT + 4, "删除失败"),
        COMMEND_PRODUCT_SAVE_FAIL(COMMEND_PRODUCT + 5, "保存失败"),
        COMMEND_PRODUCT_NOT_EXTIS(COMMEND_PRODUCT + 6, "今日特惠或者优选好物信息不存在");
        private int code;
        private String description;

        commendProduct(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

        int BILL = 2300;//结算
    }

    enum ProductCategory implements ExceptionType {
        CATEGORY_NULL(PRODUCT_CATEGORY + 1, "分类信息不允许空"),
        CATEGORY_ID_NULL(PRODUCT_CATEGORY + 2, "分类Id不允许为空"),
        CATEGORY_NAME_NULL(PRODUCT_CATEGORY + 3, "分类名称不允许为空"),
        TYPE_ID_NULL(PRODUCT_CATEGORY + 4, "类型Id不允许为空"),
        CHILD_CATEGORY_EXIST_NOT_DEL(PRODUCT_CATEGORY + 5, "请先删除子分类"),;
        private int code;
        private String description;

        ProductCategory(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum ProductComment implements ExceptionType {
        PRODUCT_COMMENT_ID_NULL(PRODUCT_COMMENT + 1, "评价Id为空"),;
        private int code;
        private String description;

        ProductComment(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum System implements ExceptionType {
        SYSTEM_ERROR(SYSTEM + 1, "系统异常"),
        ADD_FAIL(SYSTEM + 2, "添加失败"),
        UPDATE_FAIL(SYSTEM + 3, "更新失败"),
        SYSTEM_USER_NOT_LOGIN(SYSTEM + 4, "您还未登录，请先登录");
        private int code;
        private String description;

        System(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum Ad implements ExceptionType {
        /*广告*/
        AD_NULL(AD + 1, "广告不存在"),
        AD_SAVE_FAIL(AD + 2, "保存广告失败"),
        AD_VALID_FAIL(AD + 3, "启用/禁用广告失败"),
        /*广告位*/
        AD_POSITION_NULL(AD + 4, "广告位不存在"),
        AD_POSITION_SAVE_ERROR(AD + 5, "保存广告位失败"),
        AD_POSITION_VALID_FAIL(AD + 6, "启用/禁用广告失败"),
        AD_POSITION_RELATION_FAIL(AD + 7, "关联广告位失败"),
        AD_ID_NULL(AD + 8, "广告id不能为空"),
        AD_TYPE_NOT_EXITS(AD + 9,"广告位不存在"),
        SERVICE_CATEGORY_NOT_NULL(AD+10,"服务类型不能为空"),
        AD_TITLE_LEN_LE_10(AD+11,"广告标题最多十个字符"),
        AD_TIME_NOT_NULL(AD+12,"广告开始时间或结束时间不允许为空"),
        AD_TIME_SET_ERROR(AD+13,"广告开始时间不能大于结束时间"),
        AD_TITLE_NOT_NULL(AD+14,"广告标题不允许为空"),
        AD_NEED_LOGIN_NOT_NULL(AD+14,"是否需要登录不允许为空"),
        AD_IMG_NAME_NOT_NULL(AD+15,"广告图片不允许为空"),
        AD_TARGET_NOT_NULL(AD+16,"应用目标不允许为空"),
        AD_OPTION_VALUE_NOT_NOT(AD+17,"操作类型不允许为空"),
        AD_OPTION_VALUE_NOT_SUPPORT(AD+18,"操作类型不支持"),
        AD_LONGVALID_MUST_BE_NO(AD+19,"广告有效类型只能为非长期有效才能设置"),
        AD_AD_STATE_NOT_SUPPORT(AD+20,"广告状态错误"),
        AD_NEED_EXPIRE_REMIND_ERROR(AD+21,"到期提醒不可重复设置"),
        AD_OWNER_ID_NOT_NULL(AD+22,"广告主不能为空"),
        AD_OWNER_PHONE_ID_NOT_NULL(AD+23,"广告主联系电话不能为空"),
        AD_OWNER_ADDRESS_ID_NOT_NULL(AD+24,"广告主联系地址不能为空"),
        AD_OWNER_AGENT_NAME_ID_NOT_NULL(AD+25,"经办人不能为空"),
        AD_OWNER_NAME_LE_8(AD+26,"广告主最多八个字符"),
        AD_OWNER_PHONE_LE_20(AD+27,"广告主最多二十个字符"),
        AD_OWNER_ADDRESS_LE_50(AD+28,"广告主最多五十个字符"),
        AD_OWNER_AGENT_NAME_LE_8(AD+29,"经办人最多八个字符"),
        AD_OWNER_ID_NOT_EXITS(AD+30,"广告主不存在"),
        AD_OWNER_NOT_CAN_DEL(AD+30,"广告主下面存在投放广告不可删除"),
        AD_OWNER_ID_IS_NOT(AD+31,"广告主id不能为空"),
        AD_OWNER_FEATURED_NOT_CAN_DEL(AD+32,"广告主下面存在推荐广告不可删除"),
        ;

        private int code;
        private String description;

        Ad(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum Geo implements ExceptionType {
        /*省市区*/
        GEO_NULL(GEO + 1, "区域信息不存在"),
        GEO_SAVE_FAIL(GEO + 2, "区域信息保存失败"),
        GEO_LEVELTYPE_1(GEO + 3, "新增省份已存在"),
        GEO_LEVELTYPE_2(GEO + 4, "新增城市已存在"),
        GEO_LEVELTYPE_3(GEO + 5, "新增区域已存在");

        private int code;
        private String description;

        Geo(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum SensitiveWords implements ExceptionType {
        /*敏感词*/
        SENSITIVE_WORDS_NULL(SENSITIVE_WORDS + 1, "敏感词不存在"),
        SENSITIVE_WORDS_SAVE_FAIL(SENSITIVE_WORDS + 2, "敏感词保存失败"),
        SENSITIVE_WORDS_VALID_FAIL(SENSITIVE_WORDS + 3, "启用/禁用敏感词失败"),
        SENSITIVE_UPLOAD_FILE_NOT_MATCH(SENSITIVE_WORDS + 4, "上传文件类型不匹配");

        private int code;
        private String description;

        SensitiveWords(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum Mood implements ExceptionType {
        /*心情*/
        MOOD_NULL(MOOD + 1, "心情不存在"),
        MOOD_ATTR_SAVE_FAIL(MOOD + 2, "保存心情属性失败"),
        MOOD_VALID_FAIL(MOOD + 3, "启用/禁用心情失败");

        private int code;
        private String description;

        Mood(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    /**
     * 用户
     *
     * @author Nian.Li
     * @version 1.0
     * @date 2017年3月7日
     */
    enum User implements ExceptionType {
        USER_NULL(USER + 1, "用户不存在"),
        NAME_NULL(USER+1,"姓名为空"),
        USER_SAVE_FAIL(USER + 2, "保存用户失败"),
        USER_VALID_FAIL(USER + 3, "启用/禁用用户失败"),
        USER_USERNAME_NULL(USER + 4, "账号不能为空"),
        USER_PASSWORD_NULL(USER + 5, "密码不能为空"),
        USER_NOT_EXIST(USER + 6, "用户不存在"),
        USER_INVALID(USER + 7, "用户无效"),
        USER_PASSWORD_ERROR(USER + 8, "用户名或密码错误"),
        USER_NO_ROLE(USER + 9, "用户暂时分配角色信息不能正常登录"),
        USER_NO_AUTHORITY(USER + 10, "用户角色权限未分配"),
        USER_NO_LOGIN(USER + 11, "用户未登录"),
        USER_IS_EXIST(USER + 12, "用户账号已被使用"),
        USER_LOGIN_SUROLETYPE_NOT_SUPPORT(USER + 13, "帐号类型不支持"),
        USER_SUACCOUNT_NOT_EXITS(USER + 14, "子账号不存在")
        ;

        private int code;
        private String description;

        User(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    /**
     * 菜单
     *
     * @author Nian.Li
     * @version 1.0
     * @date 2017年3月7日
     */
    enum Menu implements ExceptionType {

        MENU_NULL(MENU + 1, "菜单不存在"),
        MENU_EXIST(MENU + 1, "菜单已存在"),
        MENU_SAVE_FAIL(MENU + 2, "保存菜单失败"),
        MENU_VALID_FAIL(MENU + 3, "启用/禁用菜单失败"),
        NAME_NULL(MENU+4,"菜单名称不能为空"),
        NAME_LEN_GT_30(MENU+4,"菜单名称长度不能超过30"),
        FRONT_NAME_NULL(MENU+5,"前端路由不能为空"),
        FRONT_NAME_LEN_GT_30(MENU+5,"前端路由长度不能超过30"),
        PATH_NULL(MENU+5,"前端路由长度不能超过30"),
        PATH_LEN_GT_255(MENU+5,"后端路径长度不能超过255"),
        ;

        private int code;
        private String description;

        Menu(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    /**
     * 角色/角色菜单
     *
     * @author Nian.Li
     * @version 1.0
     * @date 2017年3月7日
     */
    enum Role implements ExceptionType {
        ROLE_NULL(ROLE + 1, "角色不存在"),
        ROLE_SAVE_FAIL(ROLE + 2, "保存角色失败"),
        ROLE_VALID_FAIL(ROLE + 3, "启用/禁用角色失败"),
        ROLE_MENU_NULL(ROLE + 4, "角色菜单不存在"),
        ROLE_MENU_SAVE_FAIL(ROLE + 5, "保存角色菜单失败"),
        ROLE_MENU_VALID_FAIL(ROLE + 6, "启用/禁用角色菜单失败"),
        ROLE_IS_EXIST(ROLE + 7, "角色已存在"),
        IS_USED(ROLE+8,"角色正在使用中"),
        NAME_NULL(ROLE+8,"角色名不能为空"),
        NAME_LEN_GT_30(ROLE+8,"角色名称长度不能超过30")
        ;
        private int code;
        private String description;

        Role(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum UserLevel implements ExceptionType {
        USER_LEVEL_NULL(USER_LEVEL + 1, "等级不能为空"),
        USER_LEVEL_SAVE_FAIL(USER_LEVEL + 2, "等级保存失败"),
        USER_LEVEL_VALID_FAIL(USER_LEVEL + 3, "用户等级验证失败");
        private int code;
        private String description;

        UserLevel(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum Category implements ExceptionType {

        CATEGORY_NULL(CATEGORY + 1, "分类不存在"),
        CATEGORY_SAVE_FAIL(CATEGORY + 2, "分类保存失败"),
        CATEGORY_VALID_FAIL(CATEGORY + 3, "启用/禁用分类失败");

        private int code;
        private String description;

        Category(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum Repair implements ExceptionType {

        REPAIR_NULL(REPAIR + 1, "报事报修不存在"),
        REPAIR_SAVE_FAIL(REPAIR + 2, "保存失败"),
        REPAIR_COMMENT_FAIL(REPAIR + 3, "点评失败"),
        REPAIR_STATUS_ERROR(REPAIR + 4, "流程状态错误");

        private int code;
        private String description;

        Repair(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum Service implements ExceptionType {

        SERVICE_NULL(SERVICE + 1, "服务不存在"),
        SERVICE_SAVE_FAIL(SERVICE + 2, "服务保存失败"),
        SERVICE_VALID_FAIL(SERVICE + 3, "启用/禁用服务失败");


        private int code;
        private String description;

        Service(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum Topic implements ExceptionType {

        TOPIC_NULL(TOPIC + 1, "话题不存在"),
        TOPIC_SAVE_FAIL(TOPIC + 2, "发布话题失败"),
        TOPIC_VALID_FAIL(TOPIC + 3, "上线/下线话题失败"),
        TOPIC_MARK_FAIL(TOPIC + 4, "关注话题失败"),
        TOPIC_UNMARK_FAIL(TOPIC + 5, "取消话题失败"),
        TOPIC_COMMENT_NULL(TOPIC + 6, "评论不存在"),
        TOPIC_COMMENT_SAVE_FAIL(TOPIC + 7, "评论保存失败"),
        TOPIC_COMMENT_UP_FAIL(TOPIC + 8, "评论点赞失败"),
        TOPIC_COMMENT_VALID_FAIL(TOPIC + 9, "启用/禁用话题评论失败"),
        TOPIC_TITLE__MAX_LEN_LE_100(TOPIC + 10, "话题标题最大不能超过100个字符"),;

        private int code;
        private String description;

        Topic(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum Store implements ExceptionType {
        STORE_NULL(STORE + 1, "店铺不存在"),
        STORE_INVALID(STORE + 2, "无效店铺");

        private int code;
        private String description;

        Store(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum Banner implements ExceptionType {
        BANNER_DTO_NULL(BANNER + 1, "提交参数为空"),
        BANNER_POSITION_NULL(BANNER + 2, "banner位不存在"),
        BANNER_TITILE_NULL(BANNER + 3, "banner标题不能为空"),
        BANNER_IMGURL_NULL(BANNER + 4, "banner图片不能为空"),
        BANNER_LINK_TYPE_NULL(BANNER + 5, "banner链接类型不能为空"),
        BANNER_LINK_TYPE_NOT_SUPPORT(BANNER + 6, "banner链接类型不支持"),
        BANNER_TARGET_NULL(BANNER + 7, "banner目标参数为空"),
        BANNER_TARGET_STORE_NULL(BANNER + 8, "banner目标参数对应的店铺不存在"),
        BANNER_TARGET_PRODUCT_NULL(BANNER + 9, "banner目标参数对应的商品不存在"),
        BANNER_SAVE_FAIL(BANNER + 10, "保存banner失败"),
        BANNER_NOT_EXITS(BANNER + 11, "banner不存在"),
        BANNER_DELETE_FAIL(BANNER + 12, "banner删除失败"),
        BANNER_POSITION_SAVE_ERROR(BANNER + 13, "保存失败"),
        BANNER_POSITION_VALID_FAIL(BANNER + 14, "启用/禁用失败"),
        BANNER_ID_NULL(BANNER + 15, "banner参数不能为空");

        private int code;
        private String description;

        Banner(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum Special implements ExceptionType {
        SPECIAL_POSITION_NULL(SPECIAL + 1, "专题位置不存在"),
        SPECIAL_DTO_NULL(SPECIAL + 2, "专题提交参数不能为空"),
        SPECIAL_TITILE_NULL(SPECIAL + 3, "专题标题不能为空"),
        SPECIAL_IMGURL_NULL(SPECIAL + 4, "专题图片不能为空"),
        SPECIAL_TARGET_TYPE_NULL(SPECIAL + 5, "专题链接类型不能为空"),
        SPECIAL_TARGET_TYPE_NOT_SUPPORT(SPECIAL + 6, "专题链接类型不支持"),
        SPECIAL_TARGET_NULL(SPECIAL + 7, "专题目标参数为空"),
        SPECIAL_TARGET_STORE_NULL(SPECIAL + 8, "专题目标参数对应的店铺不存在"),
        SPECIAL_TARGET_PRODUCT_NULL(SPECIAL + 9, "专题目标参数对应的商品不存在"),
        SPECIAL_TARGET_PRODUCT_CATEGORY_NULL(SPECIAL + 10, "专题目标参数对应的商品分类不存在"),
        SPECIAL_SAVE_FAIL(SPECIAL + 11, "保存专题失败"),
        SPECIAL_NOT_EXITS(SPECIAL + 12, "专题不存在"),
        SPECIAL_DELETE_FAIL(SPECIAL + 13, "专题删除失败"),
        SPECIAL_ID_NULL(SPECIAL + 14, "专题参数不能为空"),


        /*Special*/
        SPECIAL_NULL(BANNER + 1, "专题不存在"),
        SPECIAL_VALID_FAIL(BANNER + 3, "启用/禁用失败"),
        /*Special位*/
        SPECIAL_POSITION_SAVE_ERROR(BANNER + 5, "保存失败"),
        SPECIAL_POSITION_VALID_FAIL(BANNER + 6, "启用/禁用失败"),
        /*关联*/
        SPECIAL_POSITION_RELATION_FAIL(BANNER + 7, "关联专题位失败");

        private int code;
        private String description;

        Special(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum PropertyInfo implements ExceptionType {
        PROPERTYINFO_NULL(PROPERTYINFO + 1, "物业不存在"),
        PROPERTYINFO_SAVE_FAIL(PROPERTYINFO + 2, "保存失败"),
        PROPERTYINFO_VALID_FAIL(PROPERTYINFO + 3, "启用/禁用失败"),
        PROPERTYINFO_INVITE_CODE_REPEAT(PROPERTYINFO + 4, "邀请码生成重复，请重试"),;

        private int code;
        private String description;

        PropertyInfo(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum FamilyBiotope implements ExceptionType {
        FAMILYBIOTOPE_NULL(FAMILYBIOTOPE + 1, "小区不存在"),
        FAMILYBIOTOPE_SAVE_FAIL(FAMILYBIOTOPE + 2, "保存失败"),
        FAMILYBIOTOPE_UPDATE_FAIL(FAMILYBIOTOPE + 3, "修改失败"),
        FAMILYBIOTOPE_VALID_FAIL(FAMILYBIOTOPE + 4, "启用/禁用失败");
        private int code;
        private String description;

        FamilyBiotope(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum SystemAvatar implements ExceptionType {
        SYSTEMAVATAR_NULL(SYSTEMAVATAR + 1, "头像不存在"),
        SYSTEMAVATAR_SAVE_FAIL(SYSTEMAVATAR + 2, "保存失败");
        private int code;
        private String description;

        SystemAvatar(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum FeedbackMsg implements ExceptionType {
        FEEDBACK_SUREHANDLE_FAIL(FEEDBACK_MSG + 1, "确认处理失败"),
        FEEDBACK_MSG_SAVE_FAIL(FEEDBACK_MSG + 2, "保存失败"),
        NOT_EXIST(FEEDBACK_MSG+3,"意见不存在");
        private int code;
        private String description;

        FeedbackMsg(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum HelpMsg implements ExceptionType {
        HELP_MSG_NULL(HELP_MSG + 1, "帮助信息不存在"),
        HELP_MSG_SAVE_FAIL(HELP_MSG + 2, "保存/修改帮助信息失败");
        private int code;
        private String description;

        HelpMsg(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum Bill implements ExceptionType {
        BILL_DATE_NULL(BILL + 1, "结算日期不能为空"),
        BILL_STATE_NULL(BILL + 2, "结算状态不能为空"),
        BILL_STATE_ILLEGAL(BILL + 3, "结算状态非法"),
        BILL_ID_NULL(BILL + 4, "结算单Id不能为空"),
        BILL_FAIL(BILL + 5, "结算失败"),;
        private int code;
        private String description;

        Bill(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum TopicComment implements ExceptionType {
        TOPIC_COMMENT_NULL(TOPIC_COMMENT + 1, "话题评论不存在"),
        TOPIC_COMMENT_SAVE_FAIL(TOPIC_COMMENT + 2, "话题评论保存失败");
        private int code;
        private String description;

        TopicComment(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum PushMessage implements ExceptionType {
        PUSH_MESSAGE_NULL(PUSH_MESSAGE + 1, "消息不存在"),
        PUSH_MESSAGE_SAVE_FAIL(PUSH_MESSAGE + 2, "操作失败"),
        PUSH_MESSAGE_VALID_FAIL(PUSH_MESSAGE + 3, "启用/下线失败");

        private int code;
        private String description;

        PushMessage(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum PropertyBanner implements ExceptionType {
        NULL(PROPERTY_BANNER + 1, "不存在"),
        SAVE_FAIL(PROPERTY_BANNER + 2, "操作失败");

        private int code;
        private String description;

        PropertyBanner(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum Poster implements ExceptionType {
        SN_NULL(POSTER + 1, "批次为空"),
        ID_NULL(POSTER + 2, "海报ID为空"),
        NUM_NULL(POSTER + 3, "数量为空"),
        BIND_FAIL(POSTER + 4, "绑定房屋失败");

        private int code;
        private String description;

        Poster(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum HealthyFood implements ExceptionType {
        ID_NULL(HEALTHY_FOOD + 1, "批次为空"),
        SAVE_FAIL(HEALTHY_FOOD + 2, "保存失败"),
        DELETE_FAIL(HEALTHY_FOOD + 3, "删除失败"),
        NULL(HEALTHY_FOOD + 4, "膳食不存在"),;


        private int code;
        private String description;

        HealthyFood(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }

    enum EGovernmentService implements ExceptionType {
        E_GOVERNMENT_SERVICE_ID_NOT_NULL(E_GOVERNMENT_SERVICE + 1, "政务服务id不能为空"),
        E_GOVERNMENT_SERVICE_NOT_EXIST(E_GOVERNMENT_SERVICE + 2, "政务服务不存在"),
        E_GOVERNMENT_SERVICE_CLICK_USE_FUL(E_GOVERNMENT_SERVICE + 3, "已点击过觉得有用，不能重复"),
        E_GOVERNMENT_SERVICE_DELETE_FAIL(E_GOVERNMENT_SERVICE + 4, "政务服务删除失败!")

        ;

        private int code;
        private String description;

        EGovernmentService(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }

    enum MedicalInstitution implements ExceptionType {
        MEDICAL_INSTITUTION_ID_NOT_NULL(MEDICAL_INSTITUTION + 1, "体检机构id不能为空"),
        MEDICAL_INSTITUTION_NOT_EXIST(MEDICAL_INSTITUTION + 2, "体检机构不存在"),;

        private int code;
        private String description;

        MedicalInstitution(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }

    enum CommonLabel implements ExceptionType {
        CUSTOM_SAVE_FAIL(COMMON_LABEL + 1, "自定义标签失败"),
        LABEL_TYPE_NULL(COMMON_LABEL + 2, "标签类型为空"),
        LABEL_NAME_NULL(COMMON_LABEL + 2, "标签名称为空"),;

        private int code;
        private String description;

        CommonLabel(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }

    enum ExchangeTreasure implements ExceptionType {
        IS_VALID_NOT_NULL(EXCHANGE_TREASURE + 1, "是否屏蔽不能为空"),
        ID_NOT_NULL(EXCHANGE_TREASURE + 2, "宝物id不能为空"),
        EXCHANGE_TREASURE_NOT_EXIST(EXCHANGE_TREASURE + 3, "宝物不存在"),
        IS_VALID_NO_CHANGE(EXCHANGE_TREASURE + 4, "是否屏蔽没有改变"),;


        private int code;
        private String description;

        ExchangeTreasure(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }

    enum ShareSkill implements ExceptionType {
        IS_VALID_NOT_NULL(SHARE_SKILL + 1, "是否屏蔽不能为空"),
        ID_NOT_NULL(SHARE_SKILL + 2, "技能分享id不能为空"),
        SHARE_SKILL_NOT_EXIST(SHARE_SKILL + 3, "技能分享不存在"),
        IS_VALID_NO_CHANGE(SHARE_SKILL + 4, "是否屏蔽没有改变"),;


        private int code;
        private String description;

        ShareSkill(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }
    
    enum ChannelArticle implements ExceptionType {
    	CHANNELARTICLE_NOT_EXIST(CHANNEL_ARTICLE + 1, "频道文章不存在"),
    	UPDATE_CHANNELARTICLE_FAIL(CHANNEL_ARTICLE + 2, "修改频道文章失败"),
    	SAVE_CHANNELARTICLE_FAIL(CHANNEL_ARTICLE + 3, "保存频道文章失败"),
    	CHANNELARTICLE_NAME__MAX_LEN_LE_100(CHANNEL_ARTICLE + 4, "文章标题最大不能超过100个字符"),
    	CHANNEL_NOT_EXIST(CHANNEL_ARTICLE + 5, "频道不存在"),
    	CHANNEL_SAVE_FAIL(CHANNEL_ARTICLE + 6, "频道保存失败"),
    	CHANNEL_UPDATE_FAIL(CHANNEL_ARTICLE + 7, "修改频道失败"),
    	CHANNEL_EXPLAINCONTENT_MAX_LEN_LE_500(CHANNEL_ARTICLE + 8, "频道说明最大不能超过500个字符"),
    	SYSTEM_CHANNEL_NOT_UPDATE(CHANNEL_ARTICLE + 9, "系统内置频道不能修改"),
        DEL_CHANNEL_ARTICLE_FULL(CHANNEL_ARTICLE + 10, "文章删除失败"),
    	;

        private int code;
        private String description;

        ChannelArticle(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }


    enum WirtePersonnel implements ExceptionType {
        PERSONNEL_NOT_EXIST(CHANNEL_ARTICLE + 1, "核销人员不存在"),
        SAVE_FAIL(CHANNEL_ARTICLE + 2, "保存失败"),
        DEL_FAIL(CHANNEL_ARTICLE + 3, "删除失败"),
        OPEN_TYPE_FAIL(CHANNEL_ARTICLE + 4, "启用/停用失败"),
        DEL_TYPE_FAIL(CHANNEL_ARTICLE + 5, "生效状态中删除失败"),
        USER_NAME_IS_NULL(CHANNEL_ARTICLE + 6, "姓名不能为空"),
        PHONE_IS_NULL(CHANNEL_ARTICLE + 7, "登录账号不能为空"),
        START_TIME_IS_NULL(CHANNEL_ARTICLE + 7, "生效开始时间不能为空"),
        END_TIME_IS_NULL(CHANNEL_ARTICLE + 8, "生效结束时间不能为空"),
        PHONE_IS_EXIST(CHANNEL_ARTICLE + 9, "该手机号码核销人员已经存在"),
        ;

        private int code;
        private String description;

        WirtePersonnel(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }


    enum RechargePerson implements ExceptionType {
        PERSONNEL_NOT_EXIST(CHANNEL_ARTICLE + 1, "充值人员不存在"),
        SAVE_FAIL(CHANNEL_ARTICLE + 2, "保存失败"),
        DEL_FAIL(CHANNEL_ARTICLE + 3, "删除失败"),
        OPEN_TYPE_FAIL(CHANNEL_ARTICLE + 4, "操作失败"),
        DEL_TYPE_FAIL(CHANNEL_ARTICLE + 5, "启用状态中删除失败"),
        USER_NAME_IS_NULL(CHANNEL_ARTICLE + 6, "姓名不能为空"),
        PHONE_IS_NULL(CHANNEL_ARTICLE + 7, "登录手机号不能为空"),
        OPEN_TYPE_IS_NULL(CHANNEL_ARTICLE + 8, "状态不能为空"),
        PHONE_IS_EXIST(CHANNEL_ARTICLE + 9, "该手机号码充值人员已经存在"),
        ;

        private int code;
        private String description;

        RechargePerson(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }

    enum RechargeCause implements ExceptionType {
        CAUSE_NOT_EXIST(CHANNEL_ARTICLE + 1, "原因不存在"),
        SAVE_FAIL(CHANNEL_ARTICLE + 2, "保存失败"),
        DEL_FAIL(CHANNEL_ARTICLE + 3, "删除失败"),
        OPEN_TYPE_FAIL(CHANNEL_ARTICLE + 4, "启用/停用失败"),
        DEL_TYPE_FAIL(CHANNEL_ARTICLE + 5, "启用状态中删除失败"),
        CAUSE_IS_NULL(CHANNEL_ARTICLE + 6, "原因不能为空"),
        CAUSE_LENGTH(CHANNEL_ARTICLE + 6, "原因长度不能超过20个长度"),
        USER_IS_NULL(CHANNEL_ARTICLE + 7, "用户信息不存在"),
        ;

        private int code;
        private String description;

        RechargeCause(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }

    enum RechargeOrder implements ExceptionType {
        ORDER_NOT_EXIST(CHANNEL_ARTICLE + 1, "充值记录不存在"),
        ;

        private int code;
        private String description;

        RechargeOrder(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }


    enum EnergyBill implements ExceptionType {
        ENERGY_BILL_NOT_EXIST(CHANNEL_ARTICLE + 1, "记录不存在"),
        SAVE_FAIL(CHANNEL_ARTICLE + 2, "保存失败"),
        DEL_FAIL(CHANNEL_ARTICLE + 3, "删除失败"),
        DATA_IS_EXIST(CHANNEL_ARTICLE + 4, "该月/年度的数据已经存在"),
        TYPE_IS_NULL(CHANNEL_ARTICLE + 5, "统计纬度类型不能为空"),
        COUNT_TIME_IS_NULL(CHANNEL_ARTICLE + 6, "累计时间不能为空"),
        BILL_DETAIL_IS_NULL(CHANNEL_ARTICLE + 7, "统计明细不能为空"),
        BILL_TYPE_IS_NULL(CHANNEL_ARTICLE + 8, "统计渠道不能为空"),
        BILL_MONEY_IS_NULL(CHANNEL_ARTICLE + 9, "金额不能为空"),
        BILL_COUNT_IS_NULL(CHANNEL_ARTICLE + 10, "笔数不能为空"),
        ;

        private int code;
        private String description;

        EnergyBill(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }


    enum TfGiftCoupon implements ExceptionType {
        COUPON_NOT_EXIST(CHANNEL_ARTICLE + 1, "新客券不存在"),
        COUPON_NAME_LENGTH(CHANNEL_ARTICLE + 2, "券名称不能超过10个长度"),
        SAVE_FAIL(CHANNEL_ARTICLE + 3, "保存失败"),
        COUPON_NAME_NOT_NULL(CHANNEL_ARTICLE + 4, "券名称不能为空"),
        COUPON_ACTIVITY_BEGIN_TIME_NULL(CHANNEL_ARTICLE + 5, "请设置活动开始时间"),
        COUPON_ACTIVITY_END_TIME_NULL(CHANNEL_ARTICLE + 6, "请设置活动结束时间"),
        COUPON_PROT_NULL(CHANNEL_ARTICLE + 7, "请选择有效注册端口"),
        COUPON_BEGIN_TIME_NULL(CHANNEL_ARTICLE + 8, "请设置有效开始时间"),
        COUPON_END_TIME_NULL(CHANNEL_ARTICLE + 9, "请设置有效结束时间"),
        COUPON_IS_NUMBER_NULL(CHANNEL_ARTICLE + 10, "请设置是否限制礼券数量"),
        COUPON_NUMBER_NULL(CHANNEL_ARTICLE + 11, "限制数量不能为空"),
        COUPON_NUMBERS(CHANNEL_ARTICLE + 12, "请设置礼券正确的最大数量"),
        COUPON_GIFT_NAME_NULL(CHANNEL_ARTICLE + 13, "请填写兑换礼品名"),
        COUPON_NAME_NULL(CHANNEL_ARTICLE + 14, "券名称不能为空"),
        USER_SEND_NUM_NULL(CHANNEL_ARTICLE + 15, "单账号发放数量不能为空"),
        USER_SEND_NUM_FALSE(CHANNEL_ARTICLE + 16, "请设置正确的单账号发放数量"),
        MARK_NULL(CHANNEL_ARTICLE + 17, "使用说明不能为空"),
        GIFT_NULL(CHANNEL_ARTICLE + 18, "可兑换礼品不能为空"),
        PAY_RESOURCE_NULL(CHANNEL_ARTICLE + 19, "缴费来源不能为空"),
        FULL_RETURN_CONDITION_NULL(CHANNEL_ARTICLE + 20, "满还条件不能为空"),
        COUPON_FOR_FULL_REDUCTION_LIST_NULL(CHANNEL_ARTICLE + 21, "满还条件不能为空"),
        MAX_SINGLE_NUM_IS_NULL(CHANNEL_ARTICLE + 22, "单个账号领取数量不能为空"),
        MAX_SINGLE_NUM_IS_ZERO(CHANNEL_ARTICLE + 22, "单个账号领取数量不能为0"),
        IS_LIMIT_SINGLE_NUM_IS_NULL(CHANNEL_ARTICLE + 23, "请设置单个帐号领取是否上限"),
        MEETS_THE_CONDITION_THE_GIFT_AMOUNT(CHANNEL_ARTICLE + 24, "请填写满足赠送金额条件"),
        NUMBER_COMPLIMENTARY_CARDS(CHANNEL_ARTICLE + 25, "请填写赠送的张数"),
        PLEASE_FILL_IN_THE_CORRECT_AMOUNT_OF_GIFT_REDEMPTION(CHANNEL_ARTICLE + 26, "请正确填写兑换礼品需要的数量"),
        PLEASE_FILL_IN_THE_NAME_OF_THE_GIFT_EXCHANGE(CHANNEL_ARTICLE + 27, "请填写兑换礼品名"),
        START_TIME_ACTIVITY_CANNOT_BE_LONGER_THAN_THE_END_TIME_ACTIVITY(CHANNEL_ARTICLE + 28, "活动开始时间不能大于活动结束时间"),
        VALID_START_TIME_ACTIVITY_CANNOT_BE_LONGER_THAN_THE_VALID_END_TIME_ACTIVITY(CHANNEL_ARTICLE + 29, "有效开始时间不能大于有效结束时间"),
        EFFECTIVE_START_TIME_NO_MORE_THAN_THE_START_TIME_OF_THE_ACTIVITY(CHANNEL_ARTICLE + 30, "活动的开始时间不能大于有效的结束时间"),
        THE_AMOUNT_OF_GIFTS_REDEEMED_CANNOT_BE_ZERO(CHANNEL_ARTICLE + 31, "兑换礼品需要的数量不能为0"),
        THE_AMOUNT_THAT_SATISFIES_THE_CONDITION_CANNOT_BE_ZERO(CHANNEL_ARTICLE + 32, "满足条件金额不能为0"),
        THE_NUMBER_OF_GIFT_CERTIFICATES_THAT_MEET_THE_CRITERIA_CANNOT_BE_ZERO(CHANNEL_ARTICLE + 33, "满足条件赠送礼券张数不能为0"),
        ;
        private int code;
        private String description;

        TfGiftCoupon(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }

    
    enum Reply implements ExceptionType {
    	REPLY_NOT_EXIST(REPLY + 1, "评论不存在"),
    	UPDATE_REPLY_FAIL(REPLY + 2, "修改评论失败"),
    	;

        private int code;
        private String description;

        Reply(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }


    enum HotKeyword implements ExceptionType {
        HOT_KEYWORD_NOT_EXIST(REPLY + 1, "热搜词不存在"),
        HOT_KEYWORD_ID_NULL(REPLY + 2, "热搜词id为空"),
    	;

        private int code;
        private String description;

        HotKeyword(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }

    enum RecommendConfig implements ExceptionType {
        FAIL(RECOMMEND_CONFIG + 1, "保存失败"),
        ID_NULL(RECOMMEND_CONFIG+2,"ID为空"),
        NULL(RECOMMEND_CONFIG+3,"配置不存在"),
        IMAGE_NULL(RECOMMEND_CONFIG+4,"图片为空"),
        TARGET_NULL(RECOMMEND_CONFIG+5,"目标为空"),
        TARGET_LENGTH_GT_150(RECOMMEND_CONFIG+6,"目标长度大于150"),
        TITLE_LEN_LE_10(AD+11,"标题最多十个字符"),
        AD_OWNER_NOT_NULL(RECOMMEND_CONFIG+12,"图片为空"),
        ;

        private int code;
        private String description;

        RecommendConfig(int code, String description) {
            this.code = code;
            this.description = description;
        }

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }

    }
}
