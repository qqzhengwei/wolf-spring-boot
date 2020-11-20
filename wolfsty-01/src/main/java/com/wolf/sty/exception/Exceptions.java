package com.wolf.sty.exception;

import static com.wolf.sty.exception.Exceptions.Constant.*;

/**
 * API枚举异常常量
 *
 * @author Nian.Li
 * @version v1.0
 * @date 2017年2月24日
 */
public interface Exceptions {

    /**
     * 异常模块code
     */
    interface Constant {
        int SYSTEM = 900;// 系统异常
        int COMMON = 800;//公共异常
        int USER = 1000;// 用户模块异常
        int SMS = 2000;// 短信验证模块异常
        int USER_ACCOUNT = 3000;// 账户模块异常
        int STORE = 4000;//店铺模块
        int PRODUCT = 5000;//产品模块
        int CART = 6000;//购物车模块
        int SMART_HOME = 7000;//智能家居模块
        int SMART_HOME_HOUSE = 7100;//房屋信息模块
        int SMART_HOME_MEMBER = 7200;//家族成员模块
        int SMART_HOME_GATED = 7300;//门禁模块
        int SMART_HOME_BIOTOPE = 7400;//小区模块
        int ORDER = 8000;//订单模块
        int TOPIC = 9000;//话题
        int AROUND_SERVICE = 10000;//周边黄页
        int PMC_NOTICE = 11000;//物业公告
        int REPAIR = 12000;//报事报修
        int DATA_VERSION = 13000;//版本控制模块
        int HELP_FEEDBACK = 14000;//帮助与反馈模块
        int ARTICLE = 15000;//文章
        int PAY = 16000;//支付
        int SERVICE = 17000;//小区服务
        int REFUND_RETURN = 18000;//退款退货
        int PUSH_MESSAGE = 19000;//PUSH消息
        int VOTE = 20000;//投票
        int HEALTHY_FOOD = 21000;//健康膳食
        int FAMILY = 30000;//家庭
        int PROPERTY_FEE = 31000;//物业激费
        int REQUIREMENT = 40000;//房屋需求
        int WATER_QUALITY = 50000;//水质设备
        int AIR_RABBIT = 60000;//空气兔设备
        int FAMILY_LEASE_RECORD = 70000;//房源信息
        int CITY_USER = 80000;//用户城市
        int USER_AIR_CLEANER = 90000;//空气净化器
        int SMART_FAMILY_ROOM = 90050;//房间
        int E_GOVERNMENT_CATEGORY = 101000;//政务分类
        int E_GOVERNMENT_SERVICE = 102000;//政务服务
        int PROPERTY_PK = 100000;//pk投票
        int MEDICAL_INSTITUTION = 103000;//体检机构
        int EXCHANGE_TREASURE = 104000;//宝物交换
        int PROPERTY_USER_SERVICE_FREQUENCY = 105000;//物业用户服务使用频率
        int USER_ORDER_CARD_REF = 106000;//用户订单卡卷
        int PROPERTY_APPLY_CONFIG = 107000;//物业后台
        int COUPON = 108000;//优惠劵
        int OTO = 109000;//O2O相关
        int SHARE = 110000;//O2O相关
        int SCREEN_MESSAGE = 120000;//智屏消息
        int LINK_MAN = 130000;//智屏联系人
        int SELLERWXPARAM = 140000;//商家微信配置
        int AIRWATER = 150000;//净水器
        int OFF_LINE = 160000;//线下
        int HEALTH = 165000;//健康小屋
        int TIANFU_BIND_USER = 166000;//天富
        int GIFT = 167000;//赠品
        int TOPICS = 168000;//首页专题
        int USERLOVECARD = 169000;//用户爱卡
        int OTOREFUNDORDER = 170000;//O2O买家退款单
        int NEIGHBOURHOOD = 175000;//邻里圈
        int TFT = 180000;//天富通缴费
        int YY_SERVICE = 185000;//应用服务
        int RECOMMEND_CONFIG = 186000;//APP推荐位配置
        int FACE = 18700;//人脸识别
        int APP_SERVICE = 110;
        int FACE_ERROR = 11111;//人脸识别
    }

    enum YyService implements ExceptionType {
        SERVICE_OPERATION_NOT_SUPPORT(SERVICE + 1, "操作类型不支持"),
        SERVICE_NOT_EXITS(SERVICE + 2, "服务应用不存在"),
        SERVICE_SET_NOT_REPEAT(SERVICE + 3, "不能重复设置服务应用"),;
        private int code;
        private String description;

        YyService(int code, String description) {
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

    enum Tft implements ExceptionType {
        TFT_USER_NOT_EXITS(TFT + 1, "用户不存在"),
        TFT_YNLX_NOT_SUPPORT(TFT + 2, "用能类型不支持"),
        TFT_GET_FY_ERROR(TFT + 3, "获取费用信息失败"),
        TFT_GZBX_ERROR(TFT + 4, "操作失败"),
        TFT_PAY_NOT_EXTIS(TFT + 5, "支付信息不存在"),
        TFT_XLB_CARD_TYPE_NOT_NULL(TFT + 6, "卡片类型不允许为空"),
        TFT_XLB_IC_CARD_INFO_NOT_NULL(TFT + 7, "卡片信息不允许为空"),
        TFT_XLB_CARD_NOT_SUPPORT(TFT + 8, "暂时不支持该卡{cardType}充值"),
        TFT_XLB_ICKH_NOT_NULL(TFT + 9, "IC卡号不允许为空"),
        TFT_XLB_YNLX_NOT_NULL(TFT + 10, "用能类型不允许为空"),
        TFT_BIND_USER_NOT_EXITS(TFT + 11, "未找到绑定户号信息"),
        TFT_APPLY_DDSLH_FAIL(TFT + 12, "发起支付申请，获取订单流水号失败"),
        TFT_DDSLH_NOT_EXTIS(TFT + 13, "订单流水号不存在"),
        TFT_YYQYBM_NOT_NULL(TFT + 14, "营业区域编码不允许为空"),
        TFT_YSLSH_NOT_ERROR(TFT + 15, "发起支付申请,应收流水号不允许为空"),
        TFT_TL_PAY_ORDER_MUST_ONE(TFT + 16, "业务订单编号不存在或者上送数量大于1"),
        PAY_SN_NOT_NULL(TFT + 17, "支付单号未生成"),
        TFT_PAY_CHANNEL_NOT_SUPPORT(TFT + 18, "当前支付渠道不能支付此业务"),
        TFT_PAY_JF_TYPE_NOT_SUPPORT(TFT + 19, ""),
        TFT_PAY_CZYBS_NOT_NULL(TFT + 20, "当前营业区域，操作员编号不存在"),
        TFT_PAY_SYSTEM_MAINTAIN(TFT + 21, "目前时间系统正在数据维护，请十分钟之后再试！"),
        TFT_PAY_YHBH_NOT_NULL(TFT + 22, "用户编号不允许为空"),
        TFT_PAY_YNLX_NOT_NULL(TFT + 23, "用能类型不允许为空"),
        TFT_PAY_YNADDRESS_NOT_NULL(TFT + 24, "用能地址不允许为空"),

        ;
        private int code;
        private String description;

        Tft(int code, String description) {
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

    enum Share implements ExceptionType {
        SHARE_SKILL_SUBMIT_DATA_NOT_NULL(SHARE + 1, "提交参数不允许为空"),
        SHARE_SKILL_TITLE_NOT_NULL(SHARE + 2, "标题不允许为空"),
        SHARE_SKILL_TITLE_MAX_LEN_LE_30(SHARE + 3, "标题最大不能超过30个字符"),
        SHARE_SKILL_CONTENT_NOT_NULL(SHARE + 4, "内容不允许为空"),
        SHARE_SKILL_CONTENT_MAX_LEN_LE_500(SHARE + 5, "内容最大不能超过500个字符"),
        SHARE_SKILL_IMGLIST_NOT_NULL(SHARE + 6, "提交图片不允许为空"),
        SHARE_SKILL_IMGLIST_MAX_LEN_LE_10(SHARE + 7, "提交图片最多不能超过10张"),
        SHARE_SKILL_TYPE_NOT_EXITS(SHARE + 8, "技能共享类型不存在"),
        SHARE_SKILL_PRICEDES_NOT_NULL(SHARE + 9, "价格信息不允许为空"),
        SHARE_SKILL_PRICEDES_MUST_BE_GE_ZERO(SHARE + 10, "价格信息必须大于等于0"),
        SHARE_SKILL_RELEASE_FAIL(SHARE + 11, "技能共享发布失败"),
        SHARE_SKILL_NOT_EXTIS(SHARE + 12, "技能共享不存在"),
        SHARE_SKILL_NOT_VAILD(SHARE + 13, "技能共享不可操作"),
        SHARE_SKILL_STATUS_IS_OPEON(SHARE + 14, "技能共享已经是开启状态"),
        SHARE_SKILL_STATUS_IS_HIDEN(SHARE + 15, "技能共享已经是隐藏状态"),
        SHARE_SKILL_STATUS_SET_FAIL(SHARE + 16, "技能共享隐藏或开启失败"),
        SHARE_SKILL_USER_NOT_MATCH(SHARE + 17, "技能共享发布人与当前登录用户不匹配"),
        SHARE_SKILL_ID_NULL(SHARE + 18, "技能共享id为空"),;
        private int code;
        private String description;

        Share(int code, String description) {
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

    enum Oto implements ExceptionType {
        OTO_STORE_JOININ_MSG_NOT_NULL(OTO + 1, "商户入驻信息不允许为空"),
        OTO_STORE_JOININ_NOT_EXITS(OTO + 2, "商户入驻信息不存在"),
        OTO_STORE_JOININ_APPLY_STATUS_ERROR(OTO + 3, "审核失败的商户入驻信息才能重新提交"),
        OTO_STORE_JOININ_STORE_NAME_LEN_LE_50(OTO + 4, "商户入驻店铺名称最大不能超过50个字符"),
        OTO_STORE_JOININ_STORE_PHONE_FORMAT_ERROR(OTO + 5, "商户电话号码格式错误(只能为手机号码)！"),
        OTO_STORE_JOININ_GEO_PROVINCE_NOT_EXITS(OTO + 6, "省信息不存在"),
        OTO_STORE_JOININ_GEO_CITY_NOT_EXITS(OTO + 7, "市信息不存在"),
        OTO_STORE_JOININ_GEO_DISTRICT_NOT_EXITS(OTO + 8, "区/县信息不存在"),
        OTO_STORE_JOININ_STORE_ADDRESS_NOT_NULL(OTO + 9, "详细地址不允许为空"),
        OTO_STORE_JOININ_STORE_ADDRESS_LEN_LE_200(OTO + 10, "详细地址最大不能超过200个字符"),
        OTO_STORE_JOININ_SHOPHOURSWEEK_NOT_NULL(OTO + 11, "营业时间不允许为空"),
        OTO_STORE_JOININ_BEGINBUSINESSTIME_NOT_NULL(OTO + 12, "开始营业时间不允许为空"),
        OTO_STORE_JOININ_ENDBUSINESSTIME_NOT_NULL(OTO + 13, "打烊时间不允许为空"),
        OTO_STORE_JOININ_DOORIMGLIST_NOT_NULL(OTO + 14, "门店招牌图片不允许为空"),
        OTO_STORE_JOININ_DOORIMGLIST_LEN_LE_5(OTO + 15, "门店招牌图片最多只能上传5张"),
        OTO_STORE_JOININ_DOORENVIMGLIST_LEN_LE_10(OTO + 16, "门店环境图片最多只能上传10张"),
        OTO_STORE_JOININ_IDCARDIMGLIST_NOT_NULL(OTO + 17, "身份证图片不允许为空"),
        OTO_STORE_JOININ_IDCARDIMGLIST_LEN_E_2(OTO + 18, "身份证图片为正面和反面2张组成"),
        OTO_STORE_JOININ_BUSLICENSEIMGLIST_NOT_NULL(OTO + 19, "营业执照图片不允许为空"),
        OTO_STORE_JOININ_SAVE_FAIL(OTO + 20, "商户入驻申请失败"),
        OTO_SERVICE_TYPE_NOT_NULL(OTO + 21, "服务类型不允许为空"),
        OTO_SERVICE_TYPE_NOT_EXITS(OTO + 22, "服务类型不存在"),
        OTO_SERVICE_TYPE_ID_NULL(OTO + 23, "服务类型id不存在"),
        OTO_PRODUCT_ID_NOT_NULL(OTO + 24, "商品ID不能为空"),
        OTO_STORE_ID_NOT_NULL(OTO + 25, "店铺ID不能为空"),
        OTO_CATEGORY_NOT_NULL(OTO + 26, "品类不能为空"),
        OTO_CATEGORY_NOT_EXIST(OTO + 27, "品类不存在"),
        OTO_PRODUCT_IMAGE_NOT_NULL(OTO + 28, "商品图片不能为空"),
        OTO_PRODUCT_IMAGE_FIVE_SIZE(OTO + 29, "商品图片不能大于5张"),
        OTO_PRODUCT_TITLE_NOT_NULL(OTO + 30, "商品标题不能为空"),
        OTO_PRODUCT_SUBHEAD_TITLE_NOT_NULL(OTO + 30, "商品副标题不能为空"),
        OTO_PRODUCT_PRICE_NOT_NULL(OTO + 31, "商品价格不能为空"),
        OTO_PRODUCT_NUM_NOT_NULL(OTO + 32, "商品库存不能为空"),
        OTO_PRODUCT_DESCRIBE_NOT_NULL(OTO + 33, "商品描述不能为空"),
        OTO_PRODUCT_NOT_FIND(OTO + 34, "商品不存在"),
        OTO_ADDRESS_INVALID(OTO + 35, "地址无效"),
        OTO_ID_CARD_NUM_NULL(OTO + 36, "身份证号不能为空"),
        OTO_BUSINESS_CERTIFICATE_NUM_NULL(OTO + 37, "营业执照号为空"),
        /******oto商品相关******/
        OTO_PRODUCT_ID_NULL(OTO + 38, "产品Id为空"),
        OTO_PRODUCT_NOT_EXIST(OTO + 4, "产品不存在"),
        OTO_PRODUCT_UNDER_SHELF(OTO + 5, "产品已下架"),
        /*******oto购物车相关**************/
        OTO_CART_PRODUCT_NUM_ERROR(OTO + 1, "请选择产品数量"),;
        private int code;
        private String description;

        Oto(int code, String description) {
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

    enum Coupon implements ExceptionType {
        USER_COUPON_REF_IS_NOT_EXITS(COUPON + 1, "用户优惠劵不存在"),
        USER_COUPON_REF_STATUS_IS_USE(COUPON + 2, "优惠劵已使用"),
        USER_COUPON_REF_STATUS_IS_EXPIRE(COUPON + 3, "优惠劵已过期"),
        COUPON_IS_NOT_EXITS(COUPON + 4, "优惠劵不存在"),
        COUPON_IS_NOT_VALID(COUPON + 5, "优惠劵不可用"),
        COUPON_CAN_NOT_RECVICE(COUPON + 6, "领取优惠劵时间还未开始"),
        COUPON_STATUS_ERROR(COUPON + 7, "该优惠券已失效，请关注其他优惠！"),
        COUPON_RECEIVE_NUM_IS_MAX(COUPON + 8, "该优惠券已领完，请关注其他优惠！"),
        COUPON_RECEIVE_NUM_GE_ONE(COUPON + 9, "优惠劵领取数量必须大于等于1"),
        COUPON_RECEIVE_FAIL(COUPON + 20, "优惠劵领取失败"),
        COUPON_RECEIVE_NOT_THAN_SET(COUPON + 10, "您已领取过该优惠劵"),
        USER_COUPON_REF_STATUS_NOT_EXIST(COUPON + 11, "优惠劵状态不存在"),
        USER_COUPON_REF_STATUS_UPDATE_FAIL(COUPON + 12, "用户优惠劵状态更新失败"),
        ORDER_COUPON_REF_SAVE_FAIL(COUPON + 13, "订单优惠劵处理失败"),
        USER_RECEIVE_COUPON_NOT_THAN_10(COUPON + 14, "今天领劵数量已经达到最大，请明天领取吧"),
        COUPON_USE_STATUS_NOT_EXITS(COUPON + 15, "优惠劵使用状态不存在"),
        COUPON_CAN_USE_TIME_ERROR(COUPON + 16, "优惠券开始有效时间不能大于结束有效时间"),
        COUPON_RECEIVE_TIME_ERROR(COUPON + 17, "优惠券领卷开始时间不能大于开始有效时间"),
        COUPON_CAN_USE_TIME_NULL(COUPON + 18, "优惠券开始有效时间或者结束有效时间不能为空"),
        COUPON_NUM_CAN_NOT_MORE_THAN_RECEIVE(COUPON + 19, "优惠券数量不能小于已领数量"),
        COUPON_NAME_IS_NULL(COUPON + 20, "优惠券名称不能为空"),
        COUPON_FACE_VALUE_IS_NULL(COUPON + 21, "优惠券面值不能为空"),
        COUPON_ID_IS_NULL(COUPON + 22, "优惠券id不能为空"),
        COUPON_STATUS_IS_NOT_BEGIN(COUPON + 23, "不能删除已开始的活动"),
        COUPON_PRODUCT_IS_NULL(COUPON + 24, "必须选择一项商品"),
        COUPON_CAN_USE_TIME_NOT_START(COUPON + 25, "优惠劵使用时间还未开始"),
        COUPON_RECEIVE_USER_LEVEL_FAIL(COUPON + 26, "优惠劵领取失败，您的会员等级不够!"),
        COUPON_CANT_GET(COUPON + 26, "优惠劵领取失败，您目前不能领取!"),
        COUPON_DELETE_FAIL(COUPON + 27, "优惠劵删除失败!"),;
        private int code;
        private String description;

        Coupon(int code, String description) {
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

    enum PropertyPk implements ExceptionType {

        PROPERTY_PK_NOT_EXITS(PROPERTY_PK + 1, "pk投票信息不存在"),
        PROPERTY_PK_IS_INVALID(PROPERTY_PK + 2, "pk投票信息无效"),
        PROPERTY_PK_UPDATE_FAIL(PROPERTY_PK + 3, "pk投票信息更新失败"),
        PROPERTY_PK_VOTE_TYPE_NOT_SUPPORT(PROPERTY_PK + 4, "投票类型不支持"),
        PROPERTY_PK_VOTE_ADD_FAIL(PROPERTY_PK + 5, "pk投票新增失败"),
        PROPERTY_PK_VOTE_IS_VOTEED(PROPERTY_PK + 6, "不能重复投票"),
        PROPERTY_PK_COMMENT_CONTENT_NOT_NULL(PROPERTY_PK + 7, "评论内容不允许为空"),
        PROPERTY_PK_COMMENT_CONTENT_LEN_GT500(PROPERTY_PK + 8, "评论内容字符个数不能超过500"),
        PROPERTY_PK_COMMENT_ADD_FAIL(PROPERTY_PK + 9, "pk投票评论新增失败"),
        PROPERTY_PK_NOT_NULL(PROPERTY_PK + 10, "pk投票提交内容不允许为空"),
        PROPERTY_PK_SUPPORT_KEYWORD(PROPERTY_PK + 11, "pk投票正方关键字不允许为空"),
        PROPERTY_PK_SUPPORT_KEYWORD_LEN_GT10(PROPERTY_PK + 12, "pk投票正方关键字最大字符不能超过10"),
        PROPERTY_PK_OPPOSITION_KEYWORD(PROPERTY_PK + 13, "pk投票反方关键字不允许为空"),
        PROPERTY_PK_OPPOSITION_KEYWORD_LEN_GT10(PROPERTY_PK + 14, "pk投票反方关键字最大字符不能超过10"),
        PROPERTY_PK_TITILE_NOT_NULL(PROPERTY_PK + 15, "pk投票标题不允许为空"),
        PROPERTY_PK_TITILE_LEN_GT10(PROPERTY_PK + 16, "pk投票标题最大字符不能超过200"),
        PROPERTY_PK_CONTENT_NOT_NULL(PROPERTY_PK + 16, "pk投票内容不允许为空"),
        PROPERTY_PK_RELEASE_FAIL(PROPERTY_PK + 17, "pk投票发布失败"),
        PROPERTY_PK_COMMENT_DELETE_FAIL(PROPERTY_PK + 18, "pk投票评论删除失败"),
        PROPERTY_PK_COMMENT_NOT_EXTIS(PROPERTY_PK + 19, "pk投票评论不存在"),
        PROPERTY_PK_NOT_EXTIS(PROPERTY_PK + 20, "pk投票不存在"),
        PROPERTY_PK_DELETE_FAIL(PROPERTY_PK + 21, "pk投票删除失败"),
        PROPERTY_PK_RELEASE_TYPE_NOT_EXITS(PROPERTY_PK + 22, "pk投票发布状态不存在"),
        PROPERTY_PK_ADD_TIME_CODE_NOT_EXITS(PROPERTY_PK + 23, "发布时间编码不存在"),
        PROPERTY_PK_FAMILYBIOTOPEID_NOT_MATCH(PROPERTY_PK + 24, "pk投票发布小区与当前登录小区不匹配"),
        PROPERTY_PK_RELEASE_TYPE_IS_EQ_OLDTYPE(PROPERTY_PK + 25, "pk投票发布状态与之前状态相同"),
        PROPERTY_PK_ISVALID_ERROR(PROPERTY_PK + 26, "pk投票不可用"),
        PROPERTY_PK_NOT_MATCH(PROPERTY_PK + 27, "pk投票不匹配");
        private int code;
        private String description;

        PropertyPk(int code, String description) {
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

    enum FamilyLeaseRecord implements ExceptionType {
        FAMILY_LEASE_RECORD_SAVE_FAIL(FAMILY_LEASE_RECORD + 1, "房源信息保存失败"),
        FAMILY_LEASE_RECORD_NOT_EXTIS(FAMILY_LEASE_RECORD + 2, "房源信息不存在"),
        FAMILY_HOUSE_NOT_EXTIS(FAMILY_LEASE_RECORD + 3, "房屋信息不存在"),
        FAMILY_RENTAL_MONEY_NOT_NULL(FAMILY_LEASE_RECORD + 4, "房屋租金不允许为空"),
        FAMILY_RENTAL_MONEY_HTAN_ZERO(FAMILY_LEASE_RECORD + 5, "房屋租金必须大于0"),
        FAMILY_LEASE_WAY_NOT_SUPPORT(FAMILY_LEASE_RECORD + 6, "房屋出租方式只支持整租和合租，其他方式不支持"),
        FAMILY_LEASE_DECORATION_TYPE_NOT_SUPPORT(FAMILY_LEASE_RECORD + 7, "房屋装修类型不支持"),
        FAMILY_LEASE_RECORD_USER_NAME_NOT_NULL(FAMILY_LEASE_RECORD + 8, "登记人不允许为空"),
        FAMILY_LEASE_RECORD_USER_NAME_MAXLEN_32(FAMILY_LEASE_RECORD + 9, "登记人字符长度最大为32个字符"),
        FAMILY_LEASE_RECORD_MOBILE_NOT_NULL(FAMILY_LEASE_RECORD + 10, "登记人联系电话不允许为空"),
        FAMILY_LEASE_RECORD_MOBILE_FORMAT_ERROR(FAMILY_LEASE_RECORD + 11, "登记人联系电话格式错误"),
        FAMILY_LEASE_RECORD_BEDROOMNUM_NOT_NULL(FAMILY_LEASE_RECORD + 12, "卧室数量不允许为空"),
        FAMILY_LEASE_RECORD_LIVINGROOMNUM_NOT_NULL(FAMILY_LEASE_RECORD + 13, "客厅数量不允许为空"),
        FAMILY_LEASE_RECORD_TOILETNUM_NOT_NULL(FAMILY_LEASE_RECORD + 14, "卫生间数量不允许为空"),
        FAMILY_LEASE_RECORD_SINGLEROOMNUM_NOT_NULL(FAMILY_LEASE_RECORD + 15, "单间数量不允许为空"),
        FAMILY_LEASE_RECORD_IMAGELIST_NOT_NULL(FAMILY_LEASE_RECORD + 16, "房源图片不允许为空"),
        FAMILY_LEASE_RECORD_IMAGELIST_MAX_SIZE_SIX(FAMILY_LEASE_RECORD + 17, "房源图片最多为6张"),
        FAMILY_BIOTOPE_NOT_NULL(FAMILY_LEASE_RECORD + 18, "小区信息不允许为空"),
        FAMILY_BUILDING_NOT_NULL(FAMILY_LEASE_RECORD + 19, "房屋楼宇栋号不允许为空"),
        FAMILYLEASETYPE_NOT_EXITS(FAMILY_LEASE_RECORD + 20, "房源是否被签约状态错误"),
        ACTUALRENTMONEY_NOT_NULL(FAMILY_LEASE_RECORD + 21, "签约租金不允许为空"),
        ACTUALRENTMONEY_MAST_L_ZERO(FAMILY_LEASE_RECORD + 22, "签约租金必须大于0"),
        AGENCYMONEY_NOT_NULL(FAMILY_LEASE_RECORD + 23, "签约租金不允许为空"),
        AGENCYMONEY_MAST_EL_ZERO(FAMILY_LEASE_RECORD + 24, "中介费必须大于等于0"),
        REMARK_NOT_NULL(FAMILY_LEASE_RECORD + 25, "房源备注信息不允许为空"),
        FAMILY_LEASE_TYPE_NOT_NULL(FAMILY_LEASE_RECORD + 26, "房源是否出租状态不允许为空（由Y或者N表示）"),
        FAMILY_LEASE_TYPE_UPDATE_FAIL(FAMILY_LEASE_RECORD + 27, "更新房源出租状态失败"),
        FAMILY_LEASE_RECORD_REMARK_SAVE_FAIL(FAMILY_LEASE_RECORD + 28, "房源备注信息保存失败"),
        FAMILY_HOUSE_QRCODE_SAVE_FAIL(FAMILY_LEASE_RECORD + 29, "二维码图片保存失败"),
        FAMILY_HOUSE_QRCODE_is_EXTIME_OR_NOT_EXITS(FAMILY_LEASE_RECORD + 30, "房屋二维码信息不存在或者二维码已过期"),
        POSTER_CODE_NOT_EXITS(FAMILY_LEASE_RECORD + 31, "海报编号不存在"),;
        private int code;
        private String description;

        FamilyLeaseRecord(int code, String description) {
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

    enum Requirement implements ExceptionType {
        NOT_EXIST(REQUIREMENT + 1, "客户需求信息不存在"),
        ID_NOT_NULL(REQUIREMENT + 2, "需求ID不能为空"),
        REQUIREMENT_SAVE_FAIL(REQUIREMENT + 3, "客户需求保存失败"),
        REQUIREMENT_DELETE_FAIL(REQUIREMENT + 4, "客户需求删除失败"),
        REQUIREMENT_DETAIL_IS_NULL(REQUIREMENT + 5, "客户需求商品明细不能为空"),
        REQUIREMENT_DETAIL_DELETE_FAIL(REQUIREMENT + 6, "客户需求商品明细删除失败"),
        REQUIREMENT_DETAIL_PRODUCT_NUM_ERROR(REQUIREMENT + 7, "商品数量错误"),
        REQUIREMENT_DETAIL_ID_NOT_NULL(REQUIREMENT + 8, "客户需求明细ID不能为空"),
        REQUIREMENT_NOT_EQ(REQUIREMENT + 9, "当前房屋与需求房屋不匹配"),
        REQUIREMENT_DETAIL_NOT_EQ_PARAM(REQUIREMENT + 10, "提交参数与需求明细数量不匹配"),
        REQUIREMENT_DETAIL_NOT_EXITS_PARAM(REQUIREMENT + 11, "客户需求商品明细不包含提交参数"),;
        private int code;
        private String description;

        Requirement(int code, String description) {
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
     * 小区服务
     */
    enum ServiceCategory implements ExceptionType {
        SERVICES_NOT_NULL(SERVICE + 1, "服务信息不能为空"),
        UNDEFINED_SERVICE(SERVICE + 2, "未定义的服务类型"),
        SERVICE_SEARCH_KEY_NULL(SERVICE + 3, "请输入搜索关键词");

        private int code;
        private String description;

        ServiceCategory(int code, String description) {
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

        int PROPERTY = 17000;//物业模块
    }

    /**
     * 小区信息模块
     */
    enum FamilyBiotope implements ExceptionType {
        NOT_EXIST(SMART_HOME_BIOTOPE + 1, "小区信息不存在"),
        ID_NOT_NULL(SMART_HOME_BIOTOPE + 2, "小区ID不能为空"),
        BIOTOPE_CODE_NOT_NULL(SMART_HOME_BIOTOPE + 3, "小区编码不能为空");
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

    /**
     * 门禁信息定义
     */
    enum FamilyGated implements ExceptionType {
        DTO_NOT_NULL(SMART_HOME_GATED + 1, "请求参数错误"),
        ID_NOT_NULL(SMART_HOME_GATED + 2, "小区ID不能为空"),
        DEVICE_MOT_NULL(SMART_HOME_GATED + 3, "设备码不能为空"),
        DEVICE_LOCATION_NOT_NULL(SMART_HOME_GATED + 4, "设备位置不能为空"),
        VISITOR_MOBILE_NOT_NULL(SMART_HOME_GATED + 5, "访客手机号不能为空"),
        VISITOR_NAME_NOT_NULL(SMART_HOME_GATED + 6, "访客姓名不能为空"),
        VISITOR_TYPE_NOT_NULL(SMART_HOME_GATED + 7, "二维码类型不能为空"),
        QRCODE_UPLOAD_ERROR(SMART_HOME_GATED + 8, "二维码图片上传失败"),
        QRCODE_ID_NOT_NULL(SMART_HOME_GATED + 9, "二维码ID不能为空"),
        QRCODE_INVALID(SMART_HOME_GATED + 10, "二维码已失效"),
        QRCODE_INFO_NOT_NULL(SMART_HOME_GATED + 11, "二维码信息不存在"),
        QRCODE_TIMES_OUT(SMART_HOME_GATED + 12, "二维码次数已用完"),
        BIOTOPE_INCONSISTENT(SMART_HOME_GATED + 13, "不是该小区可用的二维码"),
        GATE_NOT_EXIST(SMART_HOME_GATED + 14, "设备信息不存在");

        private int code;
        private String description;

        FamilyGated(int code, String description) {
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
     * 家庭成员信息定义
     */
    enum FamilyMember implements ExceptionType {
        DTO_NOT_NULL(SMART_HOME_MEMBER + 1, "请求参数错误"),
        INVITER_ID_NULL(SMART_HOME_MEMBER + 2, "邀请函ID不能为空"),
        MOBILE_NOT_NULL(SMART_HOME_MEMBER + 3, "被邀请人手机号不能为空"),
        LABEL_NOT_NULL(SMART_HOME_MEMBER + 4, "请填入姓名"),
        NOT_ALLOW_ADD(SMART_HOME_MEMBER + 5, "家族成员已达到最大上限"),
        GROUP_NOT_NULL(SMART_HOME_MEMBER + 6, "家族群组不能为空"),
        GROUP_ID_NOT_NULL(SMART_HOME_MEMBER + 7, "家族群组ID不能为空"),
        INVITER_NOT_NULL(SMART_HOME_MEMBER + 8, "邀请人信息不存在"),
        CREATE_INVITATION_ERROR(SMART_HOME_MEMBER + 9, "创建邀请函失败"),
        INVITATION_ID_NOT_NULL(SMART_HOME_MEMBER + 10, "邀请函ID不能为空"),
        INVITATION_NOT_NULL(SMART_HOME_MEMBER + 11, "邀请函不能为空"),
        CODE_NOT_NULL(SMART_HOME_MEMBER + 12, "手机验证码不能为空"),
        INVITATION_NOT_EXIST(SMART_HOME_MEMBER + 13, "邀请函信息不存在"),
        CODE_ERROR(SMART_HOME_MEMBER + 14, "验证码错误"),
        MOBILE_NOT_SAME(SMART_HOME_MEMBER + 15, "邀请手机号和该手机号不一致"),
        IS_USED(SMART_HOME_MEMBER + 16, "您已经加入该家族"),
        MEMBER_ADDED(SMART_HOME_MEMBER + 17, "该用户已经加入家庭"),
        NOT_FIND_NICKE_NAME(SMART_HOME_MEMBER, "无法获取用户昵称"),
        NOT_FIND_INVITE_URL(SMART_HOME_MEMBER, "无法获取到邀请链接"),
        NOT_ALLOWED_INVITE_YOURSELF(SMART_HOME_MEMBER, "不能邀请自己"),
        MEMBER_NOT_EXTENDS(SMART_HOME_MEMBER + 18, "未找到此家庭成员"),
        MEMBER_NOT_ADD_GROUP(SMART_HOME_MEMBER + 19, "未加入家庭组"),
        MEMBER_NOT_FOUND_GROUP(SMART_HOME_MEMBER + 20, "未找到该用户的用户组"),
        INVITATION_MOBILE_NOT_SAME(SMART_HOME_MEMBER + 21, "自己不能邀请自己"),
        REMOVE_FAMILY_MEMBER_FAIL(SMART_HOME_MEMBER + 22, "移除家庭成员失败"),
        FAMILY_GROUP_POWER_ENOUGH(SMART_HOME_MEMBER + 23, "只有群主才有移除家庭成员权限");

        private int code;
        private String description;

        FamilyMember(int code, String description) {
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
     * 房屋信息定义
     */
    enum FamilyHouse implements ExceptionType {
        HOUSE_NOT_EXIST(SMART_HOME_HOUSE + 1, "房屋信息不存在"),
        ID_NOT_NULL(SMART_HOME_HOUSE + 2, "房屋ID不能为空"),
        ERROR_OWNER(SMART_HOME_HOUSE + 3, "房屋信息与用户信息不一致"),
        IS_DEFAULT_NOT_NULL(SMART_HOME_HOUSE + 4, "是否设为默认房屋信息不能为空"),
        USER_ID_NOT_NULL(SMART_HOME_HOUSE + 5, "用户ID不能为空"),
        USER_NOT_NULL(SMART_HOME_HOUSE + 6, "用户信息不存在"),
        HOUSE_REGISTRATION_NOT_NULL(SMART_HOME_HOUSE + 7, "注册房屋信息不存在"),
        PARAM_NUT_NULL(SMART_HOME_HOUSE + 8, "请求参数不能为空"),
        HOUSE_REGISTRATION_NOT_EXIST(SMART_HOME_HOUSE + 9, "原房屋绑定信息不存在"),
        NEW_HOUSE_NOT_EXIST(SMART_HOME_HOUSE + 10, "新绑定房屋不存在"),
        ALREADY_BIND(SMART_HOME_HOUSE + 11, "用户已经绑定了该房屋"),
        MOBILE_NOT_NULL(SMART_HOME_HOUSE + 12, "房屋注册手机号不能为空"),
        ORDER_PAYMENTED(SMART_HOME_HOUSE + 13, "订单已经支付完成"),
        NOT_DEFAULT(SMART_HOME_HOUSE + 14, "没有找到默认房屋信息"),
        SYS_CONFIG_CHECK_OWNER_UPDATE(SMART_HOME_HOUSE + 15, "您不是户主，不能修改配置文件");

        private int code;
        private String description;

        FamilyHouse(int code, String description) {
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
     * 智能家居设备信息定义
     */
    enum FamilySmartHome implements ExceptionType {
        PARAM_ERROR(SMART_HOME + 1, "请求参数错误"),
        DEVICE_NAME_NULL(SMART_HOME + 2, "设备名称不能为空"),
        HOST_NULL(SMART_HOME + 3, "主机名不能为空"),
        PORT_NULL(SMART_HOME + 4, "端口号不能为空"),
        DEVICE_CODE_NULL(SMART_HOME + 5, "设备码不能为空"),
        ADD_FAILED(SMART_HOME + 7, "绑定设备信息失败"),
        ID_NOT_NULL(SMART_HOME + 8, "设备信息ID不能为空"),
        INFO_NOT_NULL(SMART_HOME + 9, "该设备信息不存在"),
        ERROR_OWNER(SMART_HOME + 10, "设备信息和用户信息不一致"),
        NOT_EXIST(SMART_HOME + 11, "设备信息不存在"),
        ALREADY_BIND(SMART_HOME + 12, "设备已经被绑定"),
        TOKEN_NULL_NULL(SMART_HOME + 13, "用户token不能为空"),
        TOKEN_DEVICE_NOT_NULL(SMART_HOME + 14, "Redis缓存KEY不能为空"),
        ENVIRONMENT_INFO_NOT_NULL(SMART_HOME + 15, "室内环境信息不能为空"),
        CACHE_ERROR_DEVICE_NOT_NULL(SMART_HOME + 16, "设备信息不存在，缓存信息失败"),
        CACHE_ERROR_TOKEN_NOT_NULL(SMART_HOME + 17, "用户token为空，缓存信息失败"),
        ROOM_NOT_NULL(SMART_HOME + 18, "房间信息不能为空"),
        SMART_PROFILE_NOT_NULL(SMART_HOME + 19, "情景模式不能为空"),
        KEY_WORD_NOT_NULL(SMART_HOME + 20, "关键字不能为空"),
        SPEECH_CONTROL_NOT_NULL(SMART_HOME + 21, "语音控制不存在"),
        DEVICE_COMMAND_NOT_NULL(SMART_HOME + 22, "设备协议不存在"),
        SEND_COMMAND_NOT_NULL(SMART_HOME + 23, "指令信息不能为空"),
        COMMAND_NUT_NULL(SMART_HOME + 24, "控制协议不能为空"),
        COMMAND_TYPE_NOT_NULL(SMART_HOME + 25, "控制类型不能为空"),
        COMMAND_TYPE_ID_NOT_NULL(SMART_HOME + 26, "控制类型对应ID不能为空"),
        DEVICE_COMMAND_NAME_NOT_NULL(SMART_HOME + 27, "设备协议名称不能为空"),
        FAMILY_DEVICE_NOT_NULL(SMART_HOME + 28, "设备信息不能为空"),
        FAMILY_ROOM_NOT_NULL(SMART_HOME + 29, "房间信息不能为空"),
        FAMILY_DEVICE_NAME_NOT_NULL(SMART_HOME + 30, "设备名称不能为空"),
        SWITCH_TYPE_NOT_NULL(SMART_HOME + 31, "开关状态不能为空"),
        USER_SMART_HOME_STATUS_NOT_NULL(SMART_HOME + 32, "设备初始化缓存信息为空"),
        FAMILY_SMART_HOME_NOT_NULL(SMART_HOME + 33, "智能系统信息不能为空"),
        USER_NOT_NULL(SMART_HOME + 34, "用户信息不能为空"),
        FAMILY_SPEECH_CONTRO_NOT_NULL(SMART_HOME + 35, "语音信息匹配失败"),
        SMART_PROFILES_NOT_NULL(SMART_HOME + 36, "情景模式不存在"),
        CAN_NOT_ZERO(SMART_HOME + 37, "端口号不能为0"),
        HOUSE_ALREADY_BIND_DEVICE(SMART_HOME + 38, "该房屋已经绑定了设备"),
        DEVICE_AREADY_ADD(SMART_HOME + 39, "该设备已添加");


        private int code;
        private String description;

        FamilySmartHome(int code, String description) {
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
        SIGN_ERROR(SYSTEM + 2, "API返回的数据签名验证不通过，有可能被第三方篡改"),
        SIGN_ERROR_FAIL(SYSTEM + 3, "数据签名验证失败"),
        SIGN_ERROR_PARAM_NULL(SYSTEM + 4, "请求非法，缺少签名参数"),
        SYSTEM_PARAM_ERROR(SYSTEM + 5, "系统参数错误"),
        SYSTEM_ENVIRONMENT_ERROR(SYSTEM + 6, "系统环境变量配置错误"),
        SYSTEM_QINIU_TOKEN_ERROR(SYSTEM + 7, "获取七牛token失败"),
        SOURCE_FROM_NULL(SYSTEM + 8, "来源为空"),
        BUY_FROM_NULL(SYSTEM + 9, "购买来源为空"),
        SOURCE_FROM_ERROR(SYSTEM + 10, "来源错误"),
        ADD_FAIL(SYSTEM + 11, "添加失败"),
        UPDATE_FAIL(SYSTEM + 12, "修改失败"),
        SAVE_FAIL(SYSTEM + 13, "保存失败"),
        DEL_FAIL(SYSTEM + 14, "删除失败"),
        SOURCE_FROM_ILLEGAL(SYSTEM + 15, "来源非法"),
        SORT_PARAM_ERROR(SYSTEM + 16, "排序参数错误"),
        REQUEST_PARAM_ERROR(SYSTEM + 17, "请求参数错误"),
        UPLOAD_IMAGE_NOT_EXTIS(SYSTEM + 18, "上传图片资源不存在"),
        UPLOAD_IMAGE_KEY_NOT_EXTIS(SYSTEM + 19, "上传图片资源KEY不存在"),
        REQUEST_METHOD_ERROR(SYSTEM + 20, "请求方式错误，请检查GET或者POST方式是否错误"),
        OPERATION_FAIL(SYSTEM + 21, "操作失败"),
        OPERATION_SUCCESS(SYSTEM + 22, "操作成功"),
        REPEAT_REQUEST(SYSTEM + 23, "请求过于频繁");

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

    enum User implements ExceptionType {
        USER_REG_ERROR(USER + 1, "注册失败"),
        //USER_REG_ERROR(USER + 1, "注册参数为空"),
        USERNAME_NULL(USER + 2, "账号为空"),
        PASSWORD_NULL(USER + 3, "密码为空"),
        USER_ID_NULL(USER + 4, "用户参数为空"),
        ASSESS_TOKEN_NULL(USER + 5, "access_token参数为空"),
        ASSESS_TOKEN_INVALID(USER + 6, "access_token无效"),
        USER_MEG_INVALID(USER + 7, "无效的用户信息"),
        ASSESS_TOKEN_EXPIRE(USER + 8, "access_token过期"),
        ASSESS_TOKEN_ERROR(USER + 8, "access_token解析失败"),
        USER_INFO_UPDATE_ERROR(USER + 11, "用户资料更新失败"),
        MOBILE_NULL(USER + 12, "手机号为空"),
        FAVORITE_TYPE_ERROR(USER + 13, "收藏类型错误"),
        FAVORITE_CONTENT_NULL(USER + 14, "收藏内容为空"),
        FAVORITE_FAIL(USER + 15, "收藏失败"),
        FAVORITE_CANCEL_FAIL(USER + 17, "取消收藏失败"),
        FAVORITE_NOT_FAVORITE(USER + 18, "请先收藏"),
        USER_ADDRESS_USER_NAME_NULL(USER + 19, "收货人姓名为空"),
        USER_ADDRESS_GEO_DISTRICT_ID_NULL(USER + 20, "区Id为空"),
        USER_ADDRESS_ADDRESS_NULL(USER + 21, "详细地址为空"),
        USER_ADDRESS_IS_DEFAULT_NULL(USER + 22, "是否默认为空"),
        USER_ADDRESS_GEO_DISTRICT_NOT_EXIST(USER + 23, "区不存在"),
        USER_ADDRESS_GEO_CITY_NOT_EXIST(USER + 24, "市不存在"),
        USER_ADDRESS_GEO_PROVINCE_NOT_EXIST(USER + 25, "省不存在"),
        USER_ADDRESS_ID_NULL(USER + 26, "收货地址Id为空"),
        USER_ADDRESS_NOT_EXIST(USER + 27, "收货地址不存在"),
        USER_ADDRESS_ERROR(USER + 28, "收货地址错误"),
        USER_NOT_EXIST(USER + 29, "用户不存在"),
        USER_ADDRESS_IS_DEFAULT_ERROR(USER + 30, "isDefault错误"),
        FAVORITE_REPEAT(USER + 31, "您已收藏成功，请勿重复收藏"),
        USER_MESSAGE_ID_NULL(USER + 32, "消息Id为空"),
        USER_MESSAGE_NOT_EXIST(USER + 33, "用户消息不存在"),
        USER_ATTENTION_ID_NULL(USER + 34, "关注用户ID为空"),
        CANCEL_ATTENTION_FAIL(USER + 35, "取消关注失败"),
        USER_FANS_NOT_EXIST(USER + 36, "关注关系不存在"),
        USER_FANS_HAS_EXIST(USER + 37, "已经关注过该用户"),
        USER_FANS_NOT_ALLOW_SELF(USER + 38, "用户不允许关注自己"),
        USER_QI_NIU_TOKEN_INVALID(USER + 39, "七牛token错误"),
        USER_QI_NIU_KJ_INVALID(USER + 39, "七牛空间配置不存在或者错误"),
        USER_PAY_PASSWORD_TOO_LONG(USER + 40, "用户支付密码超过6位"),
        USER_ID_NOT_EQUAL_MOBILE(USER + 41, "用户和手机号不匹配"),
        USER_ID_NOT_NULL(USER + 42, "用户ID不能为空"),
        USER_NOT_JOIN_GROUP(USER + 43, "用户未加入家庭"),
        USER_NOT_MATCH_USER_ADDRESS(USER + 44, "用户和收货地址不匹配"),
        FAVORITE_TYPE_NULL(USER + 45, "收藏类型为空"),
        WX_CODE_NULL(USER + 46, "微信code为空"),
        WX_AUTH_FAIL(USER + 47, "微信授权失败"),
        WX_OPENID_NULL(USER + 48, "微信openId为空"),
        WX_OPENID_NOT_BIND_USER(USER + 49, "您还未绑定，请先绑定"),
        USER_IS_EXIST(USER + 50, "该用户账号已被使用"),
        USER_ADDRESS_TOO_LONG(USER + 51, "用户收货地址过长"),
        USER_PAY_PASSWORD_MUST_NUMBER(USER + 52, "用户支付密码必须为纯数字"),
        WX_EXTENDS_BIND(USER + 53, "该微信已绑定用户"),
        USER_STATUS_ERROR(USER + 54, "用户状态信息不存在或账号异常"),
        USER_IS_VALID(USER + 55, "用户不可用"),
        USER_LOGIN_FAIL(USER + 56, "登录失败"),
        USER_USERNAME_IS_BING(USER + 57, "该手机已绑定其他账号，无法绑定到该账号"),
        INVITE_USER_NOT_FIND(USER + 58, "邀请用户不存在"),
        USER_INVITE_EXTENDS(USER + 59, "用户已被邀请"),
        IDENTITY_FAIL(USER + 60, "认证失败"),
        ID_CARD_NULL(USER + 61, "身份证为空"),
        ID_CARD_FORMAT_ERROR(USER + 62, "身份证格式不正确"),
        USER_MOBILE_NOT_MATCH(USER + 63, "该电话和用户不匹配"),
        USER_HEALTH_ID_CARD_HAS_BIND(USER + 64, "您已绑定身份证号码，不可重复绑定"),
        USER_HEALTH_ID_CARD_BIND_FAIL(USER + 65, "用户绑定身份证号码失败"),
        USER_LOGIN_PWD_ERROR(USER + 66, "密码错误"),
        OLD_PWD_ERROR(USER + 67, "旧的支付密码错误"),
        NEW_PAY_PWD_NULL(USER + 68, "新支付密码为空"),
        PWD_FORMAT_ERROR(USER + 69, "请设置6-12位的登录密码"),
        TOW_PAY_PWD_NOT_TONG(USER + 70, "两次密码不一致"),
        USER_PASSWORD_EQUALLY(USER + 71, "旧密码和新密码不能一致"),
        SET_PWD_ERROR(USER + 72, "设置密码失败"),
        USER_APP_SETTING_FAIL(USER + 73, "设置失败"),
        USER_INIT_PWD_NOT_SUPPORT(USER + 74, "您已设置过密码不能再次设置初始化密码"),
        USER_INIT_PWD_NOT_EQ_DEFAULT_PWD(USER + 75, "初始化密码不能与默认密码一致"),
        OLD_LOGIN_PWD_ERROR(USER + 76, "旧的登录密码错误"),
        USER_LOGIN_NOT_ALLOW(USER + 77, "请通过验证码登录后，重新设置密码后登录"),
        USER_LOGIN_PWD_ERROR_MORE(USER + 78, "密码错误次数过多，请稍后重试"),
        CHANGE_PWD_NEW_NOT_DEFAULT(USER + 79, "新密码不能为默认密码"),
        SETTLE_USER_NUMBER_NOT_NULL(USER + 80, "结算户号不允许为空"),
        CONFIG_SETTLE_USER_NUMBER_ERROR(USER + 81, "设置结算户别名信息失败"),
        USER_IS_REGISTER_PAY_PLATFORM(USER + 82, "当前用户已升级"),
        USER_INVITE_EXPIRE(USER + 83, "邀请已过期"),
        INVITE_NOT_INVITE_SELF(USER + 84, "不能自己邀请自己"),
        OTHER_DEVICE_IS_LOGIN(USER + 85, "其他设备已登录，请重新登录"),
        USER_INFO_IS_NULL(USER + 86, "用户信息不存在"),
        OPEN_USER_AUTHORITY_FAILED(USER + 86, "权限开通失败"),

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

    enum TftPay implements ExceptionType {
        PAY_ORDER_IS_NULL(USER + 1, "信息不存在"),
        PAY_REISSUE_IS_NULL(USER + 1, "记录信息不存在"),
        ;

        private int code;
        private String description;

        TftPay(int code, String description) {
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

    enum Sms implements ExceptionType {
        SMS_MOBILE_NULL(SMS + 1, "手机号不能为空"),
        SMS_ONE_MINUTE_SEND_REPEAT(SMS + 2, "验证码一分钟内不能重复获取"),
        SMS_SEND_FAIL(SMS + 3, "验证码发送失败"),
        SMS_VERIFY_CODE_NO_RIGHT(SMS + 4, "验证码不正确"),
        SMS_VERIFY_CODE_NULL(SMS + 5, "验证码不能为空"),
        SMS_MOBILE_ERROR(SMS + 6, "手机号格式不正确"),
        SMS_VERIFY_CODE_EXPIRE(SMS + 7, "验证码已过期，请重新获取"),
        SMS_ONE_DAY_SEND_REPEAT(SMS + 8, "验证码24小时内不能超过9条"),
        SMS_ONE_HOUR_SEND_REPEAT(SMS + 11, "请求太频繁，请稍后获取！"),
        SMS_IS_USED(SMS + 9, "验证码已使用，请重新获取"),
        SMS_GET_AREA_ERROR(SMS + 10, "您所在的网络不在服务范围"),
        MS_GET_IS_ERROR(SMS + 11, "验证码不正确"),
        MS_GET_IS_SUCCESS(SMS + 12, "验证成功"),;

        private int code;
        private String description;

        Sms(int code, String description) {
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

    enum UserAccount implements ExceptionType {
        PAY_PWD_NULL(USER_ACCOUNT + 12, "支付密码为空"),
        OLD_PAY_PWD_NULL(USER_ACCOUNT + 1, "旧支付密码为空"),
        NEW_PAY_PWD_NULL(USER_ACCOUNT + 2, "新支付密码为空"),
        PAY_PWD_FORMAT_ERROR(USER_ACCOUNT + 3, "请设置6位数字的支付密码"),
        ADD_ERROR(USER_ACCOUNT + 10, "新增账户信息失败"),
        SET_PAY_PWD_ERROR(USER_ACCOUNT + 13, "用户设置支付密码失败"),
        NOT_EXIST(USER_ACCOUNT + 14, "账户信息不存在"),
        OLD_PAY_PWD_ERROR(USER_ACCOUNT + 15, "旧的支付密码错误"),
        SCORE_IS_NOT_BLANK(USER_ACCOUNT + 16, "用户积分不能为空"),
        PAY_PWD_EXIST(USER_ACCOUNT + 17, "支付密码存在，不允许直接设置"),
        MONEY_UPDATE_FAIL(USER_ACCOUNT + 18, "钱包金额更新失败"),
        MONEY_LOG_SAVE_FAIL(USER_ACCOUNT + 19, "钱包日志保存失败"),
        USER_RECHARGE_MONEY_ERROR(USER_ACCOUNT + 20, "金额错误"),
        USER_RECHARGE_SAVE_FAIL(USER_ACCOUNT + 21, "充值失败"),
        USER_RECHARGE_NOT_EXIST(USER_ACCOUNT + 22, "充值单不存在"),
        USER_WITHDRAW_NOT_EXIST(USER_ACCOUNT + 22, "提现单不存在"),
        USER_SCORE_INFO_ERROR(USER_ACCOUNT + 23, "积分信息错误"),
        USER_INFO_ERROR(USER_ACCOUNT + 24, "日志保存失败"),
        USER_PASSWORD_EQUALLY(USER_ACCOUNT + 25, "旧密码和新密码不能一致"),
        USER_ACCOUNT_LOG_STATE_UPDATE_FAIL(USER_ACCOUNT + 26, "钱包日志状态更新失败"),
        TOW_PAY_PWD_NOT_TONG(USER_ACCOUNT + 27, "两次密码不一致"),
        USER_RECHARGE_NOT_USE(USER_ACCOUNT + 28, "因充值通道升级，充值通道暂时关闭"),;


        private int code;
        private String description;

        UserAccount(int code, String description) {
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

    enum Product implements ExceptionType {
        PRODUCT_SPU_ID_NULL(PRODUCT + 1, "产品spuId为空"),
        PRODUCT_SKU_ID_NULL(PRODUCT + 2, "产品skuId为空"),
        PRODUCT_CATEGORY_ID_NULL(PRODUCT + 3, "分类Id为空"),
        PRODUCT_NOT_EXIST(PRODUCT + 4, "产品不存在"),
        PRODUCT_UNDER_SHELF(PRODUCT + 5, "产品已下架"),
        PRODUCT_STORAGE_NOT_ENOUGH(PRODUCT + 6, "产品库存不足"),
        PRODUCT_TWO_CATEGORY_NOT_EXIST(PRODUCT + 7, "二级分类不存在"),
        PRODUCT_THREE_CATEGORY_NOT_EXIST(PRODUCT + 8, "三级分类不存在"),
        PART_PRODUCT_NOT_EXIST(PRODUCT + 9, "部分产品不存在"),
        PRODUCT_NUM_ERROR(PRODUCT + 10, "产品数量不正确"),
        PRODUCT_VERSION_NUMBER_NULL(PRODUCT + 11, "产品版本号为空"),
        PRODUCT_UPDATE_TIME_NULL(PRODUCT + 12, "产品修改时间为空"),
        COMMEND_PRODUCT_ID_NULL(PRODUCT + 13, "推荐Id为空"),
        PRODUCT_SKU_ID_ERROR(PRODUCT + 14, "产品skuId错误"),;
        private int code;
        private String description;

        Product(int code, String description) {
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
        STORE_ID_NULL(STORE + 1, "店铺Id为空"),
        STORE_NOT_EXIST(STORE + 2, "店铺不存在"),
        PART_STORE_NOT_EXIST(STORE + 3, "部分店铺不存在"),
        STORE_TYPE_NOT_EXITS(STORE + 4, "店铺类型不存在"),
        STORE_LOGIN_STORE_STATE_NEQ_OPEN(STORE + 5, "您的店铺已关闭!请联系管理员开启店铺后可正常登录!"),;
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

    enum Cart implements ExceptionType {
        CART_PRODUCT_NUM_ERROR(CART + 1, "请选择产品数量"),
        CART_ADD_FAIL(CART + 2, "加入购物车失败"),
        CART_ID_NULL(CART + 3, "购物车Id为空"),
        CART_DEL_FAIL(CART + 4, "删除失败"),
        CART_NOT_ADD_CART(CART + 5, "该产品，您还未加入购物车"),
        CART_PRODUCT_NULL(CART + 6, "请选择产品"),
        CART_BUY_FROM_NULL(CART + 7, "购买来源为空"),
        CART_UPDATE_SELECT_STATE_FAIL(CART + 8, "更新选中状态失败"),
        CART_SELECT_STATE_NULL(CART + 9, "选择状态为空"),
        CART_BUY_FROM_ILLEGAL(CART + 10, "购买来源非法"),
        CART_NULL(CART + 11, "购物车为空"),
        CART_PRODUCT_UNDER_SHELF(CART + 12, "产品已下架"),
        CART_PRODUCT_NO_STOCK(CART + 13, "产品缺货"),
        CART_PRODUCT_NO_EXITS(CART + 14, "购物车中不存在该商品"),;
        private int code;
        private String description;

        Cart(int code, String description) {
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

    enum Order implements ExceptionType {
        ORDER_PRODUCT_ACCOUNT_ERROR(ORDER + 1, "产品金额不正确"),
        ORDER_ORDER_ACCOUNT_ERROR(ORDER + 2, "订单金额不正确"),
        ORDER_INVOICE_SAVE_FAIL(ORDER + 3, "发票保存失败"),
        ORDER_SAVE_FAIL(ORDER + 4, "订单保存失败"),
        ORDER_LOG_SAVE_FAIL(ORDER + 5, "订单日志保存失败"),
        ORDER_ID_NULL(ORDER + 6, "订单Id为空"),
        ORDER_NOT_EXIST(ORDER + 7, "订单不存在"),
        ORDER_NOT_CAN_CANCEL(ORDER + 8, "当前状态，订单不能取消"),
        ORDER_CANCEL_FAIL(ORDER + 9, "订单取消失败"),
        ORDER_STATE_NULL(ORDER + 10, "订单状态为空"),
        ORDER_NOT_CAN_RECEIVE(ORDER + 11, "当前状态，不能确认收货"),
        ORDER_RECEIVE_FAIL(ORDER + 12, "确认收货失败"),
        ORDER_NOT_CAN_REMINDER(ORDER + 13, "当前状态，不能催单"),
        ORDER_REMINDER_FAIL(ORDER + 14, "催单失败"),
        ORDER_COMMENT_NULL(ORDER + 20, "请填写评论信息"),
        ORDER_COMMENT_REPEAT(ORDER + 21, "您已评论，请勿重复评论"),
        ORDER_COMMENT_FAIL(ORDER + 22, "评论失败"),
        ORDER_EXPRESS_CODE_NULL(ORDER + 23, "expressCode为空"),
        ORDER_EXPRESS_NO_NULL(ORDER + 24, "expressNo为空"),
        ORDER_STATE_ERROR(ORDER + 25, "订单状态错误"),
        ORDER_COMMENT_PARAM_ERROR(ORDER + 26, "评论参数错误"),
        ORDER_DELIVERY_INFO_NOT_EXIST(ORDER + 27, "物流信息不存在"),
        SYSTEM_AUTO_CANCEL_ORDER_FAIL(ORDER + 28, "系统自动取消订单失败"),
        SYSTEM_AUTO_ORDER_RECEIVE_FAIL(ORDER + 29, "系统自动确认收货失败"),
        ORDER_EXPRESS_PARAM_ERROR(ORDER + 30, "物流参数错误"),
        ORDER_PROPERTY_FEE_ERROR(ORDER + 31, "物业缴费订单金额不一致"),
        ORDER_NO_ERROR(ORDER + 32, "订单号类型错误"),
        ORDER_STATE_NOT_PAY(ORDER + 33, "当前订单状态，不能付款"),
        ORDER_BILL_SAVE_FAIL(ORDER + 34, "结算单保存失败"),
        ORDER_BILL_UPDATE_FAIL(ORDER + 35, "结算单信息更新失败"),
        USER_NOT_MATCH_ORDER(ORDER + 37, "用户与订单不匹配"),
        ORDER_NOT_CAN_COMMENT(ORDER + 38, "当前状态，不能评论"),
        IS_SEE_NOT_NULL(ORDER + 39, "是否匿名为空"),
        IS_SEE_ERROR(ORDER + 40, "是否匿名错误"),
        ORDER_BILL_STATE_NULL(ORDER + 41, "订单结算状态为空"),
        ORDER_BILL_STATE_UPDATE_FAIL(ORDER + 42, "订单结算状态更新失败"),
        ORDER_BILL_NOT_EXIST(ORDER + 43, "结算单不存在"),
        STORE_BILL_FAIL(ORDER + 45, "店铺结算失败"),
        PERSON_BILL_FAIL(ORDER + 46, "个人结算失败"),
        ORDER_COMMENT_CONTENT_TOO_LONG(ORDER + 47, "评论内容过长"),
        BUY_MSG_TOO_LONG(ORDER + 48, "买家留言过长"),
        INVOICE_TITLE_TOO_LONG(ORDER + 49, "发票抬头过长"),
        ORDER_STATE_CONFIRM_ERROR(ORDER + 50, "确认订单失败"),
        ORDER_NOT_CAN_CONFIRM(ORDER + 51, "当前订单状态，不能确认"),
        ORDER_ADD_TIME_CODE_NOT_EXITS(ORDER + 52, "下单时间编码不存在"),
        ORDER_COMMENT_IMAGE_NUM_MORE_THAN_SIX(ORDER + 53, "商品评论图片不能超过6张"),
        ORDER_COMMENT_CONTENT_NOT_NULL(ORDER + 54, "评论内容不允许为空"),
        ORDER_RECEIVE_ADDRESS_ID_NOT_NULL(ORDER + 55, "收货地址Id，不允许为空"),
        ORDER_EXPRESS_FEE_ERROR(ORDER + 56, "运费金额不正确"),
        CANNOT_CHANGE_ORDER_EXPRESS_FEE(ORDER + 57, "不允许修改运费"),
        ORDER_CANNOT_SET_EXTEND_RECEIVE_TIME(ORDER + 58, "当前订单状态，不能延长收货"),
        ORDER_ALREADY_SET_EXTEND_RECEIVE_TIME(ORDER + 59, "当前订单已设置过延长收货"),
        ORDER_SET_EXTEND_RECEIVE_TIME_FAIL(ORDER + 60, "处理延长收货失败"),
        ORDER_CANCEL_CAUSE_NOT_NULL(ORDER + 61, "订单取消原因不存在"),;
        private int code;
        private String description;

        Order(int code, String description) {
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

    enum RefundReturn implements ExceptionType {
        REFUND_MONEY_FAIL(REFUND_RETURN + 1, "退款申请失败"),
        REFUND_REASON_NULL(REFUND_RETURN + 2, "请选择退款原因"),
        REFUND_REASON_NOT_EXITS(REFUND_RETURN + 3, "退款原因不存在"),
        REFUND_CONTACT_MOBILE_NULL(REFUND_RETURN + 4, "联系手机号码不允许为空"),
        REFUND_IMAGE_SIZE_MAX_THREE(REFUND_RETURN + 5, "凭证图片数量最大为3张"),
        REFUND_PRODUCT_NOT_NULL(REFUND_RETURN + 6, "请选择退款退货商品"),
        REFUND_PRODUCT_IS_EXTIS(REFUND_RETURN + 7, "当前退款退货商品，已存在"),
        REFUND_TYPE_NOT_EXITS(REFUND_RETURN + 8, "退换货类型不支持"),
        RETURN_AMOUNT_MAX_THAN_BUY_PRODUCT_AMOUNT(REFUND_RETURN + 9, "退款退货金额不能大于商品实际购买金额"),
        REFUND_APPLY_NOT_EXIST(REFUND_RETURN + 10, "退款申请不存在"),
        CAN_NOT_REVOKE_REFUND_APPLY(REFUND_RETURN + 11, "当前退款状态，不能撤销"),
        CAN_NOT_HANDLER_REFUND_APPLY(REFUND_RETURN + 12, "当前退款状态，不能处理"),
        CAN_NOT_UPDATE_REFUND_APPLY(REFUND_RETURN + 13, "当前退款状态，不能修改"),
        REVOKE_REFUND_APPLY_FAIL(REFUND_RETURN + 14, "撤销退款申请失败"),
        REVOKE_REFUND_APPLY_USER_NOT_MATCH(REFUND_RETURN + 15, "当前用户与申请退款用户不匹配"),
        NOT_CAN_REFUND_MONEY(REFUND_RETURN + 16, "当前订单状态，不能直接退款"),
        HANDLER_REFUND_APPLY_FAIL(REFUND_RETURN + 17, "处理退款失败"),
        REJECT_EXPLAINCONTENT_NOT_NULL(REFUND_RETURN + 18, "拒绝退款申请，解释内容不允许为空"),
        REJECT_EXPLAINCONTENT_MAX_LEN_LE_200(REFUND_RETURN + 19, "解释内容最大不能超过200个字符"),
        REFUND_LOGISTICS_TYPE_NOT_SUPPORT(REFUND_RETURN + 20, "退货方式不支持"),
        EXPRESS_NOT_EXITS(REFUND_RETURN + 21, "物流公司不存在"),
        EXPRESS_NO_NOT_EXITS(REFUND_RETURN + 22, "货运单号不存在"),
        EXPRESS_NO_MAX_LEN_LE_35(REFUND_RETURN + 23, "货运单号大不能超过35个字符"),
        MOBILE_NOT_NULL(REFUND_RETURN + 24, "联系手机号码不允许为空"),
        MOBILE_FORMAT_ERROR(REFUND_RETURN + 25, "联系手机号码格式不正确"),
        REFUND_EXPRESS_DESCRIBE(REFUND_RETURN + 26, "发货物流备注不允许为空"),
        REFUND_EXPRESS_DESCRIBE_MAX_LEN_LE_200(REFUND_RETURN + 27, "发货物流备注最大不能超过200个字符"),
        REFUND_SUBMIT_LOGISTICS_APPLY(REFUND_RETURN + 28, "提交物流信息失败"),
        REFUND_REASON_CONTENT_MAX_LEN_LE_200(REFUND_RETURN + 29, "退款说明最大不能超过200个字符"),
        REFUND_RETURN_RECEIVE_ADDRESS_NOT_NULL(REFUND_RETURN + 30, "物流收货地址不允许为空"),
        REFUND_RETURN_RECEIVE_ADDRESS_MAX_LEN_LE_200(REFUND_RETURN + 31, "物流收货地址最大不能超过200个字符"),
        REFUND_RETURN_RECEIVE_CONTACT_NOT_NULL(REFUND_RETURN + 32, "收货联系人不允许为空"),
        REFUND_RETURN_RECEIVE_CONTACT_MAX_LEN_LE_20(REFUND_RETURN + 33, "收货联系人最大不能超过20个字符"),
        REFUND_RETURN_RECEIVE_MOBILE_NOT_NULL(REFUND_RETURN + 34, "收货联系手机号码不允许为空"),
        REFUND_RETURN_RECEIVE_MOBILE_FORMAT_ERROR(REFUND_RETURN + 35, "收货联系手机号码格式不正确"),
        REFUND_ORDER_PRODUCT_IS_REFUNDING(REFUND_RETURN + 36, "当前商品正在进行退款申请，不能再次进行售后申请"),
        REFUND_ORDER_PRODUCT_GIFT_CAN_NOT_APPLY(REFUND_RETURN + 37, "赠品不支持申请售后服务"),
        REFUND_ORDER_STATE_ERROR(REFUND_RETURN + 38, "当前订单状态，不能申请售后"),
        REFUND_ORDER_IS_AFTER_REFUND_APPLY(REFUND_RETURN + 39, "当前订单已过申诉期，不能申请售后"),
        USER_NOT_MATCH_REFUND_MONEY_ORDER(REFUND_RETURN + 40, "用户与退款单不匹配"),
        REFUND_MONEY_APPLY_NOT_EXIST(REFUND_RETURN + 41, "退款申请不存在"),
        REFUND_MONEY_FAIL_CARD_USE(REFUND_RETURN + 42, "优惠卷已使用，不能申请退款"),
        REFUND_RETURN_NOT_EXIST(REFUND_RETURN + 43, "退款退货不存在"),
        REFUND_RETURN_IS_NOT_THIS_STORE(REFUND_RETURN + 44, "退款退货不属于当前店铺"),
        RETURN_RECEIVE_ADDRESS_IS_NULL(REFUND_RETURN + 45, "退货地址不能为空"),
        RETURN_RECEIVE_MOBILE_IS_NULL(REFUND_RETURN + 46, "卖家收货联系电话不能为空"),
        RETURN_RECEIVE_CONTACT_IS_NULL(REFUND_RETURN + 47, "卖家收货联系人不能为空"),
        AUTO_RETURN(REFUND_RETURN + 48, "当前正在自动退款处理中，暂不能操作"),
        REFUND_APPLY_HAS_SUBMIT(REFUND_RETURN + 49, "当前订单已进行直接退款申请，不能再次提交"),;

        private int code;
        private String description;

        RefundReturn(int code, String description) {
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
        TOPIC_ID_NULL(TOPIC + 1, "话题ID为空"),
        TOPIC_NOT_EXIST(TOPIC + 2, "话题不存在"),
        TOPIC_NUM_ERROR(TOPIC + 3, "置顶数量不正确"),
        TOPIC_COMMENT_ID_NULL(TOPIC + 4, "评论ID为空"),
        TOPIC_COMMEND_TYPE_NULL(TOPIC + 5, "推荐话题类型为空"),
        TOPIC_COMMEND_TYPE_ERROR(TOPIC + 6, "推荐话题类型错误"),;

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

    enum AroundService implements ExceptionType {
        CATEGORY_ID_NULL(AROUND_SERVICE + 1, "分类ID为空"),
        BIOTOPE_ID_NULL(AROUND_SERVICE + 2, "小区ID为空"),
        LIMIT_NUM_NULL(AROUND_SERVICE + 3, "限制数量为空");


        private int code;
        private String description;

        AroundService(int code, String description) {
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

    enum PmcNotice implements ExceptionType {

        BIOTOPE_ID_NULL(PMC_NOTICE + 1, "小区ID为空"),
        NOTICE_ID_NULL(PMC_NOTICE + 2, "公告ID为空"),
        MARK_FAIL(PMC_NOTICE + 3, "标记失败");

        private int code;
        private String description;

        PmcNotice(int code, String description) {
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

        HOUSE_ID_NULL(REPAIR + 1, "房屋ID为空"),
        ID_NULL(REPAIR + 2, "报修ID为空"),
        REPAIR_NAME_NULL(REPAIR + 3, "报修名称为空"),
        REPAIR_TYPE_NULL(REPAIR + 4, "报修类型ID为空"),
        RESERVATION_TIME_ERROR(REPAIR + 12, "预约时间格式不正确"),;;

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

    /**
     * 版本控制
     */
    enum DataVersion implements ExceptionType {
        DATA_VERSION_CODE_NULL(DATA_VERSION + 1, "项目版本code不能为空"),
        DATA_VERSION_CODE_ERROR(DATA_VERSION + 2, "项目版本code不正确"),
        DATA_VERSION_CODE_NOT_EXIST(DATA_VERSION + 3, "项目版本不存在"),
        DATA_VERSION_NOT_EXIST(DATA_VERSION + 4, "版本不存在"),
        PARAM_NOT_NULL(DATA_VERSION + 5, "请求参数不能为空"),
        DATA_VERSION_ISMUST_NOT_NULL(DATA_VERSION + 6, "是否强制升级不能为空"),
        DATA_VERSION_DESC_NOT_NULL(DATA_VERSION + 7, "更新描述不能为空"),
        DATA_VERSION_VERSION_NOT_NULL(DATA_VERSION + 8, "版本号不能为空"),
        DATA_VERSION_ID_NOT_NULL(DATA_VERSION + 9, "版本控制ID不能为空"),
        DATA_VERSION_LOG_ID_NOT_NULL(DATA_VERSION + 10, "版本控制记录ID不能为空"),
        APK_FILE_NOT_NULL(DATA_VERSION + 11, "上传文件不能为空"),
        DATA_VERSION_DOWNLOAD_URL_NOT_NULL(DATA_VERSION + 12, "文件下载地址为空"),
        UPLOAD_APK_FAIL(DATA_VERSION + 13, "上传文件失败"),
        DATA_VERSION_VERSION_NAME_NOT_NULL(DATA_VERSION + 14, "版本名称不能为空");

        private int code;
        private String description;

        DataVersion(int code, String description) {
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
     * 帮助与反馈
     */
    enum HelpAndFeedback implements ExceptionType {
        HELP_ID_NULL(HELP_FEEDBACK + 1, "帮助信息ID不能为空"),
        HELP_MSG_NOT_EXIST(HELP_FEEDBACK + 2, "帮助信息不存在"),
        FEEDBACK_TYPE_NOT_EXIST(HELP_FEEDBACK + 3, "传入的类型不存在"),
        FEEDBACK_MSG_INSERT_ERROR(HELP_FEEDBACK + 4, "用户反馈添加失败"),
        FEEDBACK_MSG_DETAIL_NULL(HELP_FEEDBACK + 5, "用户反馈详情不能为空"),
        FEEDBACK_MSG_TELEPHONE_NULL(HELP_FEEDBACK + 6, "用户反馈手机号不能为空"),
        FEEDBACK_MSG_TELEPHONE_ERROR(HELP_FEEDBACK + 7, "用户反馈手机号格式错误"),;
        private int code;
        private String description;

        HelpAndFeedback(int code, String description) {
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
     * 文章
     */
    enum Article implements ExceptionType {
        ARTICLE_ID_NULL(ARTICLE + 1, "文章Id不能为空"),
        ARTICLE_NOT_EXIST(ARTICLE + 2, "文章不存在"),;
        private int code;
        private String description;

        Article(int code, String description) {
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
     * 支付
     */
    enum Pay implements ExceptionType {
        PAY_PARAM_ERROR(PAY + 1, "支付参数错误"),
        PAY_BUSINESS_TYPE_ERROR(PAY + 2, "支付业务类型错误"),
        PAY_USER_NOT_MATCH_ORDER(PAY + 3, "用户与订单不匹配"),
        PAY_SAVE_FAIL(PAY + 4, "支付单生成失败"),
        PAY_UPDATE_FAIL(PAY + 5, "支付单更新失败"),
        ALI_PAY_SIGN_FAIL(PAY + 6, "支付宝签名异常"),
        SIGN_NOT_EXITS(PAY + 6, "签名不存在"),
        PAY_NO_NULL(PAY + 7, "支付单号为空"),
        PAY_NOT_EXIST(PAY + 8, "支付单不存在"),
        PAY_MONEY_ERROR(PAY + 9, "业务往来金额被篡改"),
        PAY_ID_NULL(PAY + 10, "支付单Id为空"),
        PAY_THIRD_PAY_SN_NULL(PAY + 11, "第三方支付流水号为空"),
        PAY_FAIL(PAY + 12, "支付失败"),
        PAY_CALL_BACK_FAIL(PAY + 13, "支付回调失败"),
        PAY_CODE_ERROR(PAY + 14, "支付方式错误"),
        PAY_CODE_NOT_SUPPORT(PAY + 14, "支付方式不支持"),
        PAY_PWD_ERROR(PAY + 15, "密码错误，请重新输入"),
        PAY_MONEY_NOT_ENOUGH(PAY + 16, "钱包金额不足"),
        ORDER_PAY_TIME_EXPIRED(PAY + 17, "订单支付时间已过期"),
        ALI_QR_FAIL(PAY + 18, "支付宝二维码生成失败"),
        REQUEST_FAIL(PAY + 19, "支付接口请求失败"),
        VERIFY_FAIL(PAY + 20, "验签失败"),
        REFUND_PAY_PARAM_ERROR(PAY + 21, "退款参数错误"),
        REFUND_PAY_BUSINESS_TYPE_ERROR(PAY + 22, "退款业务类型错误"),
        REFUND_PAY_NOT_EXITS(PAY + 23, "退款信息不存在"),
        REFUND_PAY_TYPE_NOT_SUPPORT(PAY + 23, "当前退款业务原支付方式不支持"),
        REFUND_PAY_RETURN_MSG_FAIL(PAY + 13, "退款申请处理失败"),
        REFUND_PAY_SETTLE_MSG_FAIL(PAY + 13, "退款第三方支付返回的对账信息保存失败"),
        REFUND_ORDER_STATE_NOT_SUPPORT(PAY + 13, "当前退款状态不支持"),
        REFUND_ORDER_IS_EXITS(PAY + 13, "当前订单已存在退款信息"),
        REFUND_ORDER_NOT_EXITS(PAY + 13, "退款订单不存在"),
        PAY_STATUS_ERROR(PAY + 14, "支付状态错误，请刷新后重试"),
        PAY_FREQUENTLY(PAY + 15, ""),
        PAY_RECIEVER_NOT_EXTIS(PAY + 16, "收单商户不存在"),
        AMOUNT_GT_ZERO(PAY + 16, "金额必须大于0"),
        AGENT_AMOUNT_THAN_RECIEVER_AMOUNT(PAY + 16, "代付金额超过商户实际应收金额"),
        AGENT_RECIEVER_STATE_NOT_SUPPORT(PAY + 16, "代付商户状态不支持"),
        CREATE_ORDER_AGENT_PAY_FAIL(PAY + 16, "创建代付订单失败"),
        ORDER_AGENT_NOT_EXITS(PAY + 16, "代付订单不存在"),
        PAY_NOT_UPGRADE(PAY + 16, "请先完成钱包升级"),
        BANK_CARD_NOT_EXTIS(PAY + 16, "银行卡不存在"),
        RECEIVER_NOT_EXTIS(PAY + 16, "收款商户不存在"),
        APP_ID_NOT_MATCHING(PAY + 17, "appId不匹配"),
        TRADE_STATUS_NOT_HANDLER(PAY + 17, "交易状态无法处理"),
        WITHDRAW_BANK_CARD_NOT_NULL(PAY + 17, "提现银行卡不允许为空"),
        STORE_NOT_RECEIVABLES(PAY + 17, "当前店铺不能收款"),
        RECIEVER_LIST_PARAMS_ERROR(ORDER + 8, "参数错误, 示例：[{\"bizUserId\":\"xxxx\",\"buttCode\":\"xxx\",\"amount\":12.22}]"),
        ORDER_PAY_RECEIVER_NOT_EXITS(ORDER + 8, "代付收款商户配置信息不存在"),
        HAS_SETTLED(ORDER + 18, "已对过账，不能再次对账"),
        PAY_ORDER_FAIL(PAY + 19, "微信支付统一下单失败"),;
        private int code;
        private String description;

        Pay(int code, String description) {
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
        MESSAGE_ID_NULL(PUSH_MESSAGE + 2, "消息ID不存在");

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

    enum Vote implements ExceptionType {
        BIOTOPE_NULL(VOTE + 1, "小区ID为空"),
        ID_NULL(VOTE + 2, "投票ID为空"),
        USER_ID_NULL(VOTE + 5, "用户ID为空"),
        OPTION_ID_NULL(VOTE + 3, "投票选项为空"),
        HAS_VOTED(VOTE + 4, "已投票"),
        VOTE_FAIL(VOTE + 6, "投票失败"),
        BROWSE_FAIL(VOTE + 7, "浏览量累加失败");

        private int code;
        private String description;

        Vote(int code, String description) {
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
        ID_NULL(HEALTHY_FOOD + 1, "ID为空"),
        BROWSE_FAIL(HEALTHY_FOOD + 2, "浏览量增加失败"),
        NULL(HEALTHY_FOOD + 3, "膳食不存在");

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

    enum FamilyDynamic implements ExceptionType {
        PARAM_NOT_NULL(FAMILY + 1, "参数不能为空"),
        GROUP_ID_NOT_NULL(FAMILY + 2, "家族ID不能为空"),
        CONTENT_NOT_NULL(FAMILY + 3, "动态信息不能为空"),
        TYPE_NOT_NULL(FAMILY + 4, "信息类型不能为空"),
        FAMILY_GROUP_NOT_EXIST(FAMILY + 5, "家族群不存在"),
        USER_ID_NOT_NULL(FAMILY + 6, "动态用户ID不能为空");

        private int code;
        private String description;

        FamilyDynamic(int code, String description) {
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

    enum PropertyFee implements ExceptionType {
        HOUSE_ID_NULL(PROPERTY_FEE + 1, "房屋ID为空"),
        PAY_SN_NULL(PROPERTY_FEE + 2, "支付单号为空"),
        PAYING(PROPERTY_FEE + 3, "正在被其他用户支付,请稍后再试!"),
        BIOTOPE_NULL(PROPERTY_FEE + 4, "小区ID为空"),
        BUILDING_NULL(PROPERTY_FEE + 5, "建筑ID为空"),
        USER_ID_NULL(PROPERTY_FEE + 6, "用户ID为空");

        private int code;
        private String description;

        PropertyFee(int code, String description) {
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

    enum WaterQuality implements ExceptionType {
        WATER_DEVICE_NUM_NOT_NULL(WATER_QUALITY + 1, "设备编号不能为空"),
        PARAM_ERROR(WATER_QUALITY + 2, "参数错误"),
        WATER_DEVICE_ALREADY_BIND(WATER_QUALITY + 3, "设备已经被绑定"),
        WATER_DEVICE_NOT_EXTENDS(WATER_QUALITY + 4, "该房屋未绑定设备"),
        WATER_HOUSE_EXTENDS(WATER_QUALITY + 5, "该设备已经被绑定"),
        USER_EXTEND_BIND_DEVICE(WATER_QUALITY + 6, "该用户已绑定设备");

        private int code;
        private String description;

        WaterQuality(int code, String description) {
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

    enum AirRabbit implements ExceptionType {

        AIR_RABBIT_NOT_EXTENDS(AIR_RABBIT + 1, "空气兔设备不存在"),
        AIR_RABBIT_ALERDY_BIND(AIR_RABBIT + 2, "该设备已经被绑定"),
        USER_NOT_BIND_AIR_RABBIT(AIR_RABBIT + 3, "该用户未绑定设备"),
        AIR_ENUM_TYPE(AIR_RABBIT + 4, "类型不能为空"),
        AIR_START_DATE(AIR_RABBIT + 5, "查询开始时间不能为空"),
        AIR_END_DATE(AIR_RABBIT + 6, "查询结束时间不能为空"),
        AIR_LOGIN_FAILD(AIR_RABBIT + 7, "空气兔第三方接口登录失败"),
        AIR_RABBIT_PM_ORDER_NOT_NULL(AIR_RABBIT + 8, "空气兔pm条件不能为空"),
        AIR_RABBIT_AUTO_ORDER_ID_NOT_NULL(AIR_RABBIT + 9, "ID不能为空"),
        AIR_RABBIT_AUTO_ORDER_TYPE_NOT_NULL(AIR_RABBIT + 10, "开关类型不能为空"),
        AIR_RABBIT_AUTO_ORDER_NOT_NULL(AIR_RABBIT + 11, "未找到该信息"),
        AIR_RABBIT_AUTO_ORDER_DATE_TIME(AIR_RABBIT + 12, "自动化执行条件时间不能重叠");
        private int code;
        private String description;

        AirRabbit(int code, String description) {
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

    enum CityBindUser implements ExceptionType {

        CITY_NAME_NOT_NULL(CITY_USER + 1, "城市名称不能为空"),
        REMARK_NOT_NULL(CITY_USER + 2, "备注不能为空"),
        REMARK_ALREADY_EXISTS(CITY_USER + 3, "该备注已添加"),
        REMARK_MAX_SIZE(CITY_USER + 4, "城市最多只能添加三个"),
        CITY_ID_NOT_NULL(CITY_USER + 5, "id不能为空"),
        NOT_FOUND_CITY(CITY_USER + 6, "未找到此城市");
        private int code;
        private String description;

        CityBindUser(int code, String description) {
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

    enum AirCleaner implements ExceptionType {

        AIR_CLEANER_ID_NOT_NULL(USER_AIR_CLEANER + 1, "空气净化器设备ID不能为空"),
        USER_EXTEND_AIR_CLEANER(USER_AIR_CLEANER + 2, "用户已绑定空气净化器设备"),
        AIR_CLEANER_EXTEND_BIND(USER_AIR_CLEANER + 3, "该设备已经被绑定"),
        NOT_FOUND_AIR_CLEANER(USER_AIR_CLEANER + 4, "未找到该设备"),
        ID_NOT_NULL(USER_AIR_CLEANER + 5, "ID不能为空"),
        MAC_NOT_NULL(USER_AIR_CLEANER + 6, "空气净化器mac地址不能为空"),
        NAME_NOT_NULL(USER_AIR_CLEANER + 7, "空气净化器名称不能为空"),
        HOUSE_NOT_NULL(USER_AIR_CLEANER + 8, "空气净化器房屋ID不能为空"),
        CLEANER_ORDER_NOT_NULL(USER_AIR_CLEANER + 9, "空气净化器条件不能为空"),
        CLEANER_EXECTUE_DATE(USER_AIR_CLEANER + 10, "空气净化器执行日不能为空"),
        CLEANER_EXECTUE_TIME(USER_AIR_CLEANER + 11, "空气净化器执行时间不能为空"),
        CLEANER_ORDER_NOT_FIND(USER_AIR_CLEANER + 12, "该用户未设置空气净化器执行条件"),;

        private int code;
        private String description;

        AirCleaner(int code, String description) {
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

    enum EGovernmentCategory implements ExceptionType {
        E_GOVERNMENT_CATEGORY_TYPE_NOT_NULL(E_GOVERNMENT_CATEGORY + 1, "政务类型不能为空"),
        E_GOVERNMENT_CATEGORY_NOT_EXIST(E_GOVERNMENT_CATEGORY + 2, "政务类型不存在"),;

        private int code;
        private String description;

        EGovernmentCategory(int code, String description) {
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
        E_GOVERNMENT_SERVICE_CLICK_USE_FUL(E_GOVERNMENT_SERVICE + 3, "已点击过觉得有用，不能重复");

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


    enum ExchangeTreasure implements ExceptionType {
        TREASURE_ID_NULL(EXCHANGE_TREASURE + 1, "宝物ID为空"),
        APPLY_FAIL(EXCHANGE_TREASURE + 2, "交换申请创建失败"),
        APPLY_NOT_EXIST(EXCHANGE_TREASURE + 3, "交换申请不存在"),
        HAS_EXCHANGED(EXCHANGE_TREASURE + 4, "该宝物已被交换"),
        HAS_HIDE(EXCHANGE_TREASURE + 5, "宝物不存在"),
        APPLY_ID_NULL(EXCHANGE_TREASURE + 6, "宝物交换ID为空"),
        EXCHANGE_FAIL(EXCHANGE_TREASURE + 7, "宝物交换失败"),
        USER_ID_NULL(EXCHANGE_TREASURE + 8, "用户ID为空"),
        FROM_ID_NULL(EXCHANGE_TREASURE + 9, "请求交换的宝物ID为空"),
        TO_ID_NULL(EXCHANGE_TREASURE + 10, "待交换的宝物ID为空"),
        EXCHANGE_REQUEST_HAS_CREATED(EXCHANGE_TREASURE + 11, "已与该宝物存在交换请求"),
        EXCHANGE_TREASURE_VIDEO_NAME_NOT_NULL(EXCHANGE_TREASURE + 12, "视频信息不允许为空"),
        EXCHANGE_TREASURE_DESCRIPTION_NOT_NULL(EXCHANGE_TREASURE + 13, "文字描述不允许为空"),
        EXCHANGE_TREASURE_DESCRIPTION_LEN_LE_20(EXCHANGE_TREASURE + 14, "文字描述最大不能超过20个字符"),
        EXCHANGE_TREASURE_COMMENT_NOT_NULL(EXCHANGE_TREASURE + 15, "留言内容不允许为空"),
        EXCHANGE_TREASURE_COMMENT_LEN_LG_150(EXCHANGE_TREASURE + 16, "留言内容最大不能超过150个字符"),
        EXCHANGE_TREASURE_COMMENT_SAVE_FAIL(EXCHANGE_TREASURE + 17, "留言失败"),
        EXCHANGE_TREASURE_NOT_EXITS(EXCHANGE_TREASURE + 18, "交换宝物不存在"),
        EXCHANGE_TREASURE_USER_NOT_MATCH(EXCHANGE_TREASURE + 19, "交换宝物发布人与当前登录用户不匹配"),
        EXCHANGE_TREASURE_STATUS_ERROR(EXCHANGE_TREASURE + 20, "交换宝物状态错误"),
        EXCHANGE_TREASURE_STATUS_UPDATE_FAIL(EXCHANGE_TREASURE + 21, "交换宝物状态失败"),
        EXCHANGE_TREASURE_LOG_SAVE_FAIL(EXCHANGE_TREASURE + 22, "交换宝物动态设置失败"),
        ROLE_ERROR(EXCHANGE_TREASURE + 23, "宝物角色错误");;

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

    enum FamilySmartRoom implements ExceptionType {
        FAMILY_ROOM_NAME(SMART_FAMILY_ROOM + 1, "房间名称不能为空"),
        FAMILY_ROOM_ID_NOT_NULL(SMART_FAMILY_ROOM + 2, "房间ID不能为空"),
        FAMILY_ROOM_NOT_EXIST(SMART_FAMILY_ROOM + 3, "房间不存在"),
        FAMILY_CONFIG_NOT_NULL(SMART_FAMILY_ROOM + 4, "配置文件不能为空"),
        FAMILY_ROOM_NAME_EXIST(SMART_FAMILY_ROOM + 5, "房间已存在"),
        CONFIG_TYPE_NOT_NULL(SMART_FAMILY_ROOM + 6, "配置文件类型不能为空"),
        CONFIG_TYPE_NOT_EXIST(SMART_FAMILY_ROOM + 7, "配置文件类型不存在");

        private int code;
        private String description;

        FamilySmartRoom(int code, String description) {
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

    enum PropertyUserServiceFrequency implements ExceptionType {
        Frequency_ID_NOT_NULL(PROPERTY_USER_SERVICE_FREQUENCY + 1, "物业使用频率id不能为空"),
        Frequency_NOT_EXSIT(PROPERTY_USER_SERVICE_FREQUENCY + 2, "物业使用频率表不存在"),;

        private int code;
        private String description;

        PropertyUserServiceFrequency(int code, String description) {
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

    enum UserOrderCardRef implements ExceptionType {
        CARD_NUMBER_NOT_NULL(USER_ORDER_CARD_REF + 1, "卡卷编号不能为空"),;

        private int code;
        private String description;

        UserOrderCardRef(int code, String description) {
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


    //物业后台使用
    enum PropertyApplyConfig implements ExceptionType {

        PROPERTY_ID_NOT_NULL(PROPERTY_APPLY_CONFIG, "物业公司ID不能为空"),
        PROPERTY_NOT_FOUND(PROPERTY_APPLY_CONFIG, "物业公司未找到"),
        PROPERTY_WXACCOUNT_NOT_NULL(PROPERTY_APPLY_CONFIG, "微信账户不能为空"),
        PROPERTY_WXAPPID_NOT_NULL(PROPERTY_APPLY_CONFIG, "微信APPID不能为空"),
        PROPERTY_WXAPRIVATEKEY_NOT_NULL(PROPERTY_APPLY_CONFIG, "微信私钥不能为空"),
        PROPERTY_ZFBACCOUNT_NOT_NULL(PROPERTY_APPLY_CONFIG, "支付宝ID不能为空"),
        PROPERTY_ZFBPRIVATEKEY_NOT_NULL(PROPERTY_APPLY_CONFIG, "支付宝私钥不能为空"),
        PROPERTY_ZFBPUBLICKEY_NOT_NULL(PROPERTY_APPLY_CONFIG, "支付宝公钥不能为空"),
        PROPERTY_ZFBAPPID_NOT_NULL(PROPERTY_APPLY_CONFIG, "支付宝APPID不能为空"),
        PROPERTY_COMPLAINT_RECOGNITION_ID_NOT_NULL(PROPERTY_APPLY_CONFIG, "投诉表扬ID不能为空"),
        PROPERTY_COMPLAINT_RECOGNITION_NOT_EXTIS(PROPERTY_APPLY_CONFIG, "该信息不存在"),
        PROPERTY_COMPLAINT_RECOGNITION_STATUS_NOT_NULL(PROPERTY_APPLY_CONFIG, "投诉表扬类型不能为空"),
        PROPERTY_COMPLAINT_RECOGNITION_IMAGE_NOT_NULL(PROPERTY_APPLY_CONFIG, "投诉表扬图片不能为空"),
        PROPERTY_COMPLAINT_RECOGNITION_CONTENT_NOT_NULL(PROPERTY_APPLY_CONFIG, "投诉表扬内容不能为空"),
        PROPERTY_PROPERTY_BIOTOPEID_NOT_NULL(PROPERTY_APPLY_CONFIG, "小区ID不能为空"),;

        private int code;
        private String description;

        PropertyApplyConfig(int code, String description) {
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

    enum ScreenMessage implements ExceptionType {
        SCREEN_MESSAGE_CONTENT_NOT_NULL(SCREEN_MESSAGE + 1, "消息内容不能为空"),
        SCREEN_MESSAGE_TYPE_NOT_NULL(SCREEN_MESSAGE + 2, "消息类型不能为空"),
        SCREEN_MESSAGE_ID_NOT_NULL(SCREEN_MESSAGE + 2, "消息ID不能为空"),
        SCREEN_MESSAGE_NOT_EXTES(SCREEN_MESSAGE + 2, "消息不存在");


        private int code;
        private String description;

        ScreenMessage(int code, String description) {
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

    enum LinkMan implements ExceptionType {
        LINK_MAN_USER_NAME_NOT_NULL(LINK_MAN + 1, "联系人姓名不能为空"),
        LINK_MAN_MOBILE_NOT_NULL(LINK_MAN + 2, "联系电话不能为空"),
        LINK_MAN_ID_NOT_NULL(LINK_MAN + 3, "ID不能为空"),
        LINK_MAN_NOT_EXTIS(LINK_MAN + 4, "联系人信息不存在");
        private int code;
        private String description;

        LinkMan(int code, String description) {
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

    enum SellerWx implements ExceptionType {
        SELLERWXPARAM_NULL(SELLERWXPARAM + 1, "商家未配置微信相关参数"),
        URL_NULL(SELLERWXPARAM + 2, "URL为空"),
        STOREID_NULL(SELLERWXPARAM + 3, "店铺ID为空"),
        WXAPPID_NULL(SELLERWXPARAM + 4, "微信AppId为空"),
        WXAPPSECRET_NULL(SELLERWXPARAM + 5, "微信Secret为空"),
        WXMCHID_NULL(SELLERWXPARAM + 6, "微信商户号为空"),
        WXPAYKEY_NULL(SELLERWXPARAM + 7, "微信公众号支付key为空"),;
        private int code;
        private String description;

        SellerWx(int code, String description) {
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

    enum AirWater implements ExceptionType {
        AIR_WATER_ID_NOT_NULL(AIRWATER + 1, "净水器id不能为空"),
        AIR_WATER_DID_NOT_NULL(AIRWATER + 2, "净水器did不能为空"),
        AIR_WATER_MAC_NOT_NULL(AIRWATER + 3, "净水器mac不能为空"),
        AIR_WATER_INFO_NOT_NULL(AIRWATER + 3, "未查询到净水器信息"),
        AIR_WATER_NAME_NOT_NULL(AIRWATER + 3, "净水器名称不能为空"),
        AIR_WATER_USER_BIND(AIRWATER + 6, "用户已绑定净水器"),;
        private int code;
        private String description;

        AirWater(int code, String description) {
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

    enum OffLine implements ExceptionType {
        TELEPHONE_IS_NULL(OFF_LINE + 1, "手机号不能为空"),
        TELEPHONE_NUMBER_ERROR(OFF_LINE + 2, "手机号码格式错误"),
        TELEPHONE_HAS_EXIST(OFF_LINE + 3, "当前手机号用户已存在"),
        TELEPHONE_HAS_GETED(OFF_LINE + 4, "当前手机号已经领取过奖品"),;
        private int code;
        private String description;

        OffLine(int code, String description) {
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

    enum Health implements ExceptionType {
        HEALTH_IDCODE_OR_MOBILE(HEALTH + 1, "手机号码不能为空"),
        HEALTH_NOT_FOUND(HEALTH + 2, "信息不存在"),;
        private int code;
        private String description;

        Health(int code, String description) {
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

    enum TianFuBindUser implements ExceptionType {
        USER_NUM_NOT_NULL(TIANFU_BIND_USER + 1, "用户编号不能为空"),
        USER_PHONE_NOT_NULL(TIANFU_BIND_USER + 2, "用户电话不能为空"),
        USER_CARED_NOT_NULL(TIANFU_BIND_USER + 3, "用户证件号不能为空"),
        USER_INFO_NOT_FIND(TIANFU_BIND_USER + 4, "该用户信息未找到"),
        USER_INFO_NOT_BIND(TIANFU_BIND_USER + 4, "该用户未绑定"),;
        private int code;
        private String description;

        TianFuBindUser(int code, String description) {
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

    enum Gift implements ExceptionType {
        FULL_RELIEF_ACTIVITY_IS_NULL(GIFT + 1, "满减送活动不存在"),
        FULL_RELIEF_ACTIVITY_NAME_IS_NULL(GIFT + 2, "满减送活动名称不能为空"),
        FULL_RELIEF_ACTIVITY_EFFECT_TIME_IS_NULL(GIFT + 3, "满减送活动生效时间不能为空"),
        FULL_RELIEF_ACTIVITY_EFFECT_TIME_IS_ERROR(GIFT + 4, "满减送活动生效时间格式错误"),
        FULL_RELIEF_ACTIVITY_MEET_COUNT_IS_NULL(GIFT + 5, "满减送活动满足金额/件数不能为空"),
        FULL_RELIEF_ACTIVITY_MEET_COUNT_IS_NOT_NUMBER(GIFT + 6, "满减送活动满足金额/件数只能输入大于0的最多两位小数的数字"),
        FULL_RELIEF_ACTIVITY_MEET_COUNT_MUST_AFTER_ZERO(GIFT + 6, "满减送活动满足金额必须大于0"),
        FULL_RELIEF_ACTIVITY_AMOUNT_COUNT_IS_NULL(GIFT + 7, "满减送活动减金额数不能为空"),
        FULL_RELIEF_ACTIVITY_AMOUNT_COUNT_IS_NOT_NUMBER(GIFT + 8, "满减送活动减金额数只能输入大于0的最多两位小数的数字"),
        FULL_RELIEF_ACTIVITY_CREDIT_COUNT_IS_NULL(GIFT + 9, "满减送活动减积分数不能为空"),
        FULL_RELIEF_ACTIVITY_CREDIT_COUNT_IS_NOT_NUMBER(GIFT + 10, "满减送活动减积分数只能输入大于0数字"),
        FULL_RELIEF_ACTIVITY_GIFT_ID_IS_NOT_NUMBER(GIFT + 11, "满减送活动赠品不能为空"),
        FULL_RELIEF_ACTIVITY_COUPON_ID_IS_NOT_NUMBER(GIFT + 12, "满减送活动优惠券不能为空"),
        FULL_RELIEF_ACTIVITY_COUPON_COUNT_IS_NOT_NUMBER(GIFT + 13, "满减送活动优惠券张数不能为空"),
        FULL_RELIEF_ACTIVITY_COUPON_COUNT_IS_TOO_BIGGER(GIFT + 13, "满减送活动优惠券张数太长"),
        FULL_RELIEF_ACTIVITY_COUPON_COUNT_IS_TOO_SMALL(GIFT + 13, "满减送活动优惠券张数仅能设置大于0的张数"),
        GIFT_IS_NULL(GIFT + 14, "礼品不存在"),
        GIFT_NAME_IS_NULL(GIFT + 15, "赠品名称不能为空"),
        GIFT_EFFECT_TIME_IS_NULL(GIFT + 16, "赠送生效时间不能为空"),
        GIFT_EFFECT_TIME_IS_ERROR(GIFT + 17, "赠送生效时间格式错误"),
        GIFT_GETLIMIT_IS_NOT_NUMBER(GIFT + 18, "赠品领取限制仅能输入大于0的整数"),
        GIFT_GETLIMIT_IS_TOO_BIGGER(GIFT + 18, "赠品领取限制过长"),
        GIFT_PRODUCTS_IS_NULL(GIFT + 19, "赠品至少需要选择一个商品"),
        FULL_RELIEF_ACTIVITY_STATUS_IS_NULL(GIFT + 20, "满减送状态为空"),
        FULL_RELIEF_ACTIVITY_STATUS_CANNOT_CHANGE(GIFT + 21, "当前满减送不能变更状态"),
        FULL_RELIEF_ACTIVITY_STATUS_CANNOT_CHANGE_COUPON_NOT_EXIST(GIFT + 22, "当前满减送不能变更到进行中，详细：优惠券不存在"),
        FULL_RELIEF_ACTIVITY_STATUS_CANNOT_CHANGE_COUPON_IS_NOT_VALID(GIFT + 23, "当前满减送不能变更到进行中，详细：优惠券不可用"),
        FULL_RELIEF_ACTIVITY_STATUS_CANNOT_CHANGE_COUPON_CAN_NOT_RECVICE(GIFT + 24, "当前满减送不能变更到进行中，详细：领取优惠劵时间还未开始"),
        FULL_RELIEF_ACTIVITY_STATUS_CANNOT_CHANGE_COUPON_RECEIVE_NUM_IS_MAX(GIFT + 25, "当前满减送不能变更到进行中，详细：优惠券数量不足"),
        FULL_RELIEF_ACTIVITY_STATUS_CANNOT_CHANGE_GIFT_NOT_EXIST(GIFT + 26, "当前满减送不能变更到进行中，详细：赠品不存在"),
        FULL_RELIEF_ACTIVITY_STATUS_CANNOT_CHANGE_GIFT_IS_NOT_VALID(GIFT + 27, "当前满减送不能变更到进行中，详细：赠品不可用"),
        FULL_RELIEF_ACTIVITY_STATUS_CANNOT_CHANGE_GIFT_NOT_FOR_IN(GIFT + 28, "当前满减送不能变更到进行中，详细：赠品未在进行中"),
        FULL_RELIEF_ACTIVITY_STATUS_CANNOT_CHANGE_GIFT_CAN_NOT_RECVICE(GIFT + 29, "当前满减送不能变更到进行中，详细：赠品未在生效期内"),
        FULL_RELIEF_ACTIVITY_STATUS_CANNOT_CHANGE_PRODUCT_NOT_EXIST(GIFT + 30, "当前满减送不能变更到进行中，详细：商品不存在"),
        FULL_RELIEF_ACTIVITY_STATUS_CANNOT_CHANGE_PRODUCT_IS_NOT_VALID(GIFT + 31, "当前满减送不能变更到进行中，详细：商品不可用"),
        FULL_RELIEF_ACTIVITY_STATUS_CANNOT_CHANGE_PRODUCT_STOCT_NOT_ENOUGH(GIFT + 32, "当前满减送不能变更到进行中，详细：商品库存不足"),
        FULL_RELIEF_ACTIVITY_CANNOT_CHOOSE_ALL_PRODUCT(GIFT + 33, "已经有商品绑定满减送活动，不能选择所有商品"),
        FULL_RELIEF_ACTIVITY_DISCOUNT_COUNT_IS_NULL(GIFT + 34, "满减送活动折扣数不能为空"),
        FULL_RELIEF_ACTIVITY_DISCOUNT_COUNT_IS_NOT_NUMBER(GIFT + 35, "满减送活动折扣数仅能输入0-10"),
        FULL_RELIEF_ACTIVITY_DISCOUNT_COUNT_MUST_BETWEEN_ZERO_TEN(GIFT + 35, "满减送活动折扣数仅能输入0-10"),
        GIFT_STATUS_IS_NULL(GIFT + 36, "赠品状态为空"),
        GIFT_STATUS_CANNOT_CHANGE(GIFT + 37, "当前赠品不能变更状态"),
        GIFT_STATUS_CANNOT_CHANGE_PRODUCT_NOT_EXIST(GIFT + 38, "当前赠品不能变更到进行中，详细：商品不存在"),
        GIFT_STATUS_CANNOT_CHANGE_PRODUCT_IS_NOT_VALID(GIFT + 39, "当前赠品不能变更到进行中，详细：商品不可用"),
        GIFT_STATUS_CANNOT_CHANGE_PRODUCT_STOCT_NOT_ENOUGH(GIFT + 40, "当前赠品不能变更到进行中，详细：商品库存不足"),
        GIFT_QUANTITY_IS_NULL(GIFT + 41, "赠品商品数量不能为空"),
        GIFT_QUANTITY_TOO_BIGGER(GIFT + 41, "赠品商品数量过长"),
        GIFT_QUANTITY_ERROR(GIFT + 42, "赠品商品数量不能小于1个"),
        FULL_RELIEF_ACTIVITY_AMOUNT_DISCOUNT_CANNOT_REPEAT(GIFT + 43, "满减送活动减金额和折扣不能重复选择"),
        FULL_RELIEF_ACTIVITY_CANNOT_EDIT(GIFT + 44, "满减送活动不允许编辑"),
        FULL_RELIEF_ACTIVITY_NEED_RULE(GIFT + 45, "满减送活动至少要一条规则"),
        GIFT_CANNOT_EDIT(GIFT + 46, "赠品不允许编辑"),
        MUST_CHOOSE_ONE_PRODUCT(GIFT + 47, "至少选择一件商品"),
        GIFT_RECVICE_USER_NOT_EXITS(GIFT + 48, "礼品兑换人不存在"),
        VERIFICATION_USER_NOT_EXITS(GIFT + 49, "核销人不存在"),
        VERIFICATION_USER_INSUFFICIENT_AUTHORITY(GIFT + 50, "您暂无核销权限"),
        GIFT_USER_CAN_USE_AUTHORITY(GIFT + 51, "用户可使用的礼品劵不足"),
        MUST_HAS_ONE_GIFT(GIFT + 52, "至少选择一条规则"),

       ;
        private int code;
        private String description;

        Gift(int code, String description) {
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

    enum Topics implements ExceptionType {
        TOPICS_NAME_IS_NULL(TOPIC + 1, "首页专题名不能为空"),
        TOPICS_BANNER_IS_NULL(TOPIC + 2, "首页专题banner不能为空"),
        TOPICS_ON_TIME_IS_NULL(TOPIC + 3, "首页专题上架时间不能为空"),
        TOPICS_ON_TIME_ERROR(TOPIC + 4, "首页专题上架时间格式错误"),
        TOPICS_OFF_TIME_IS_NULL(TOPIC + 5, "首页专题下架时间不能为空"),
        TOPICS_OFF_TIME_ERROR(TOPIC + 6, "首页专题下架时间格式错误"),
        TOPICS_LINK_IS_NULL(TOPIC + 7, "首页专题链接不能为空"),
        TOPICS_TIME_IS_OVERLAPPING(TOPIC + 8, "首页专题上下架时间不能与已存在的交叉"),
        NOT_HAVE_TOPICS_PAGE(TOPIC + 9, "首页专题不存在"),;
        private int code;
        private String description;

        Topics(int code, String description) {
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

    enum UserLoveCard implements ExceptionType {
        USERLOVECARD_SAVE_FAIL(USERLOVECARD + 1, "更新用户爱卡失败"),
        USERLOVECARDLOG_SAVE_FAIL(USERLOVECARD + 2, "添加用户爱卡记录失败"),
        READY_NEXT_CARD(USERLOVECARD + 3, "本轮博爱卡已抢完，正在补充下一轮库存"),
        GRAB_UNIVERSAL_LOVE_CARD_NOT_BEGIN(USERLOVECARD + 4, "抢卡活动还未开始"),
        GRAB_UNIVERSAL_LOVE_CARD_NOT_ENOUGH(USERLOVECARD + 5, "本轮博爱卡已抢完"),
        GRAB_UNIVERSAL_LOVE_CARD_USER_EXIST(USERLOVECARD + 6, "您已经抢过博爱卡了"),
        NOT_GRAB_UNIVERSAL_LOVE_CARD(USERLOVECARD + 7, "您没有抢到博爱卡"),
        UNIVERSAL_LOVE_CARD_NOT_EXIST(USERLOVECARD + 8, "博爱卡不存在"),
        REPLACELOVECARD_FAIL(USERLOVECARD + 9, "换卡失败"),
        FIVE_LOVES_IS_EXIST(USERLOVECARD + 10, "每个用户只能合成一张五爱卡"),
        COMPOSELOVECARD_FAIL(USERLOVECARD + 11, "合成爱卡失败"),
        LOVECARD_NOT_ENOUGH(USERLOVECARD + 12, "爱卡数量不足"),
        LOVE_CARD_NOT_EXIST(USERLOVECARD + 13, "爱卡不存在"),
        GIVE_LOVECARD_FAIL(USERLOVECARD + 14, "赠送爱卡失败"),
        RECEIVE_LOVECARD_FAIL(USERLOVECARD + 15, "领取爱卡失败"),
        BEFORE_WINNING_TIME(USERLOVECARD + 16, "还没到开奖时间"),
        AFTER_WINNING_TIME(USERLOVECARD + 17, "开奖时间已经结束"),
        BE_OVERDUE_GET_CARD_TIME(USERLOVECARD + 18, "集卡时间已过"),
        UNIVERSAL_LOVE_CARD_CANNOT_GIVE(USERLOVECARD + 19, "博爱卡不能赠送"),
        FIVE_LOVES_CANNOT_GIVE(USERLOVECARD + 20, "五爱卡不能赠送"),
        SHARE_LOVECARD_NOT_EXIST(USERLOVECARD + 21, "分享的爱卡不存在"),
        CANNOT_LOTTERY(USERLOVECARD + 22, "现在还不能开奖"),
        THIS_DISTRICT_CANNOT_JOIN_ACTIVITY(USERLOVECARD + 23, "当前地区暂不支持该活动"),
        LOVECARD_NOT_GIVE(USERLOVECARD + 24, "爱卡还未赠送"),
        CANT_WINNING(USERLOVECARD + 25, "当前用户没有获奖"),;
        private int code;
        private String description;

        UserLoveCard(int code, String description) {
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

    enum Common implements ExceptionType {

        ID_NULL(COMMON + 1, "ID为空"),
        SAVE_FAIL(COMMON + 2, "保存失败"),
        DELETE_FAIL(COMMON + 3, "删除失败"),
        USER_ID_NULL(COMMON + 4, "用户ID为空"),
        CUSTOM_EXCEPTION(COMMON + 5, "");
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

    enum OtoRefundOrder implements ExceptionType {
        APPLYREFUND_FAIL(OTOREFUNDORDER + 1, "申请退款失败"),
        FILLINREFUNDDELIVERY_FAIL(OTOREFUNDORDER + 2, "保存物流信息失败"),
        OTOREFUNDORDER_NOT_EXIST(OTOREFUNDORDER + 3, "退款单不存在"),
        REVOCATIONAPPLY_FAIL(OTOREFUNDORDER + 4, "撤销申请失败"),
        AUTO_RETURN(OTOREFUNDORDER + 5, "当前正在自动退款处理中，暂不能操作"),
        AUTO_CANCEL_ORDER(OTOREFUNDORDER + 6, "当前正在自动取消预约处理中，暂不能操作"),
        REFUNDDELIVERY_EXPRESS_ISNULL(OTOREFUNDORDER + 7, "物流公司不存在"),
        OTOREFUNDORDER_EXIST(OTOREFUNDORDER + 8, "订单申请退款中"),
        SYSTEM_AUTO_DEAL_APPLY_FAIL(OTOREFUNDORDER + 9, "系统自动审核退款申请失败"),
        APPLYREFUND_OBSOLETE(OTOREFUNDORDER + 10, "申请售后时间已过"),
        AMOUT_INCORRECT(OTOREFUNDORDER + 11, "退款金额不能大于实际支付金额"),
        ORDER_STAY_PAY_NOT_APPLY(OTOREFUNDORDER + 12, "订单待付款不能申请退款"),
        ORDER_NOT_PAY_NOT_APPLY(OTOREFUNDORDER + 13, "订单未支付不能申请退款"),
        OTOREFUNDORDER_IS_END(OTOREFUNDORDER + 14, "退款单已完成"),
        OTOREFUNDORDER_IS_CLOSE(OTOREFUNDORDER + 15, "退款单已关闭"),
        OTOREFUNDORDER_IS_PASS(OTOREFUNDORDER + 16, "退款单已审核通过,不能修改"),
        ORDER_HAS_CONSUME(OTOREFUNDORDER + 17, "订单已核销，不能退款"),;
        private int code;
        private String description;

        OtoRefundOrder(int code, String description) {
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


    enum NEIGHBOURHOOD implements ExceptionType {
        TIPOFF_CONTENT_NOT_NULL(NEIGHBOURHOOD + 1, "举报内容不能为空"),
        USER_ID_NOT_NULL(NEIGHBOURHOOD + 2, "用户信息不存在"),
        SORT_INDEX_NOT_NULL(NEIGHBOURHOOD + 4, "排序不能为空"),
        SAVE_FAIL(NEIGHBOURHOOD + 5, "保存失败"),
        CHANNEL_TYPE_NAME_NOT_NULL(NEIGHBOURHOOD + 3, "频道类型名称不能为空"),
        CHANNEL_ID_NOT_NULL(NEIGHBOURHOOD + 6, "频道信息不存在"),
        USER_CHANNEL_CONCERN_NON_EXISTENT(NEIGHBOURHOOD + 7, "未查询到该频道信息"),
        DYNAMICS_CONTENT_NOT_NULL(NEIGHBOURHOOD + 8, "动态内容不能为空"),
        DYNAMICS_CONTENT_LENGTH(NEIGHBOURHOOD + 9, "动态内容长度不能大于150个字符"),
        DYNAMICS_IMAGE_NOT_NULL(NEIGHBOURHOOD + 10, "动态图片不能为空"),
        DYNAMICS_IMAGE_LENGTH(NEIGHBOURHOOD + 11, "动态图片最多只能上传9张"),
        DYNAMICS_ID_NOT_NULL(NEIGHBOURHOOD + 12, "动态id不能为空"),
        DYNAMICS_INFO_NON_EXISTENT(NEIGHBOURHOOD + 13, "动态信息不存在"),
        BUSINESS_ID_NON_EXISTENT(NEIGHBOURHOOD + 14, "业务信息不存在"),
        BUSINESS_TYPE_NOT_NULL(NEIGHBOURHOOD + 15, "业务类型不能为空"),
        COMMENT_USER_ID_NON_NULL(NEIGHBOURHOOD + 16, "评论用户ID不能为空"),
        ARGUED_COMMENT_USER_ID_NON_NULL(NEIGHBOURHOOD + 17, "被评论评论用户ID不能为空"),
        COMMET_CONTENT_NOT_NULL(NEIGHBOURHOOD + 18, "评论内容不能为空"),
        COMMET_CONTENT_LENGTH(NEIGHBOURHOOD + 9, "评论内容长度不能大于150个字符"),
        COMMET_ID_NOT_NULL(NEIGHBOURHOOD + 19, "评论id不能为空"),
        COMMET_NOT_SELFT(NEIGHBOURHOOD + 20, "自己不能评论或者回复自己发布的动态"),
        COMMENT_INFO_NON_EXISTENT(NEIGHBOURHOOD + 20, "未查询到该评论信息"),
        DELETE_FAIL(NEIGHBOURHOOD + 21, "删除失败"),
        TIPOFF_USER_ID_NOT_NULL(NEIGHBOURHOOD + 22, "举报用户id不能为空"),
        TIPOFF_TYPE_NOT_SUPPORT(NEIGHBOURHOOD + 23, "举报类型不支持"),
        TIPOFF_CONTENT_ID_NOT_NULL(NEIGHBOURHOOD + 24, "举报内容不能为空"),
        TIPOFF_USER_NOT_SAME(NEIGHBOURHOOD + 24, "自己不能举报自己发布的动态"),
        TIPOFF_REPLY_REPORT_USER_NOT_SAME(NEIGHBOURHOOD + 24, "自己不能举报自己发布的评论"),
        TIPOFF_CONTENT_LENGTH(NEIGHBOURHOOD + 9, "举报内容长度不能大于150个字符"),
        CHANNEL_BUSINESS_NOT_EXITS(NEIGHBOURHOOD + 25, "分享信息不存在"),
        USER_LIKE_ID_NON_NULL(NEIGHBOURHOOD + 26, "点赞人ID不能为空"),
        USER_LIKE_IS_EXITS(NEIGHBOURHOOD + 26, "不能重复点赞"),
        USER_LIKE_QX_IS_EXITS(NEIGHBOURHOOD + 26, "不能重复取消点赞"),
        USER_LIKE_HANDLER_ERROR(NEIGHBOURHOOD + 26, "您尚未点赞，不能取消点赞"),
        CHANNEL_BUSINESS_NON_EXISTENT(NEIGHBOURHOOD + 26, "未查询到该信息"),
        REPLY_NOT_EXITS(NEIGHBOURHOOD + 26, "评论信息不存在"),
        TIPOFF_NOT_SUPPORT(NEIGHBOURHOOD + 26, "当前动态不能举报"),
        NO_CONTENT_FIND(NEIGHBOURHOOD + 26, "详情不存在"),
        DYNAMICS_NOT_FB_PMC_NOTICE(NEIGHBOURHOOD + 26, "通知公共频道不能发布个人动态"),
        BIOTOPE_ID_NOT_NULL(NEIGHBOURHOOD + 26, "小区信息不存在"),;
        private int code;
        private String description;

        NEIGHBOURHOOD(int code, String description) {
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


    enum APPService implements ExceptionType {
        SERVICE_TYPE_NAME_NOT_NULL(APP_SERVICE + 1, "服务栏目名称不能为空"),
        SERVICE_TYPE_NAME_LENGTH_LONG_FIVE(APP_SERVICE + 2, "服务栏目名称长度不能超过5个字符"),
        SERVICE_TYPE_NAME_SERVICE_NOT_ZONE(APP_SERVICE + 3, "该栏目下面还有服务，服务数量为0时可以删除"),
        SERVICE_TYPE_NAME_SERVICE_NAME_EXIST(APP_SERVICE + 4, "该栏目名称已经存在"),
        SERVICE_TYPE_NAME_SERVICE_TYPE_DES_LENGTH_LONG(APP_SERVICE + 5, "栏目说明长度不能大于200"),
        SERVICE_TYPE_NAME_SERVICE_ID_NOT_NULL(APP_SERVICE + 6, "id不能为空"),
        SERVICE_TYPE_NAME_SERVICE_INFO_NOT_NULL(APP_SERVICE + 6, "未查询到该信息"),
        SERVICE_DEFAULT_ID_NOT_NULL(APP_SERVICE + 7, "服务id不能为空"),
        SERVICE_DEFAULT_START_TIME_NOT_NULL(APP_SERVICE + 7, "开始时间不能为空"),
        SERVICE_DEFAULT_END_TIME_NOT_NULL(APP_SERVICE + 7, "结束时间不能为空"),
        SERVICE_ID_NOT_NULL(APP_SERVICE + 8, "服务id不能为空"),
        SERVICE_STATUS_NOT_NULL(APP_SERVICE + 8, "服务状态不能为空"),
        SERVICE_INFO_NOT_NULL(APP_SERVICE + 9, "未查询到该服务"),
        SERVICE_TYPE_NOT_NULL(APP_SERVICE + 9, "服务栏目不能为空"),
        SERVICE_CATEGORY_NOT_NULL(APP_SERVICE + 9, "服务类型不能为空"),
        SERVICE_NAME_NOT_NULL(APP_SERVICE + 9, "服务名称不能为空"),
        SERVICE_NEED_LOGIN_NOT_NULL(APP_SERVICE + 9, "是否需要登录不能为空"),
        SERVICE_NAME_LENGTH_LONG(APP_SERVICE + 9, "服务名称长度不能大于五个字符"),
        SERVICE_NAME_IMAGE_NOT_NULL(APP_SERVICE + 9, "服务图片不能为空"),
        SERVICE_NAME_ADD_EXITS(APP_SERVICE + 10, "该服务已添加，不能再次添加"),
        SERVICE_NAME_SIZE_EVEN(APP_SERVICE + 11, "首页服务最多可设置7个哦"),
        SAVE_FAIL(APP_SERVICE + 6, "操作失败"),
        DELETE_FAIL(APP_SERVICE + 7, "删除失败"),
        SERVICE_STATUS_FAIL_TO_DELETE(APP_SERVICE + 7, "正常状态下删除失败"),
        ;
        private int code;
        private String description;

        APPService(int code, String description) {
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

    enum RecommendConfig implements ExceptionType {
        SU_SYSTEM_NULL(RECOMMEND_CONFIG + 1, "版块识别码为空"),
        SU_APP_MODULE_CODE(RECOMMEND_CONFIG + 2, "版块内部识别码为空"),;

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

        public void setCode(int code) {
            this.code = code;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    enum Face implements ExceptionType {
        FACE_GROUP_ID_NULL(FACE + 1, "分组ID不能为空"),
        FACE_USER_ID_NULL(FACE + 2, "用户ID不能为空"),
        FACE_USER_AVATAR_NULL(FACE + 3, "用户头像不能为空"),
        FACE_USER_URL_NULL(FACE + 4, "头像地址不能为空"),
        FACE_USER_AVATAR_ERROR(FACE + 5, "头像下载失败"),
        FACE_USER_FEATURE_ID_ERROR(FACE + 6, "特征ID不能为空"),
        FACE_USER_AVATAR_ADD_ERROR(FACE + 7, "用户头像录入失败"),
        FACE_USER_AVATAR_FEATURE_UPDATE_ERROR(FACE + 8, "用户头像特征更新失败"),
        FACE_USER_FEATURE_NULL(FACE + 9, "没有该特征数据"),
        FACE_USER_RECOGNITION_ERROR(FACE + 10, "头像识别失败"),
        FACE_USER_DELETE_ERROR(FACE + 11, "用户头像删除失败"),
        FACE_USER_IMAGE_NOT_NULL(FACE + 12, "用户头像为空");

        Face(int code, String description) {
            this.code = code;
            this.description = description;
        }

        private int code;
        private String description;

        @Override
        public int getCode() {
            return code;
        }

        @Override
        public String getDescription() {
            return description;
        }
    }


    enum FaceError implements ExceptionType {
        FACE_USER_FEATURE_NULL(FACE_ERROR + 1, "没有该特征数据"),
        FACE_USER_RECOGNITION_ERROR(FACE_ERROR + 2, "头像识别失败"),
        FACE_USER_RECOGNITION_FAIL(FACE_ERROR + 3, "检测人脸失败"),
        FACE_USER_RECOGNITION_NOT(FACE_ERROR + 4, "未检测到人脸"),;

        FaceError(int code, String description) {
            this.code = code;
            this.description = description;
        }

        private int code;
        private String description;

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
