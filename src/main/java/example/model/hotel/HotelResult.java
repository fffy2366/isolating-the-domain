package example.model.hotel;

import java.util.List;

/**
 * Created by feng on 15/12/28.
 */
public class HotelResult {
    private String msg;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    private List<Data> data;
    private String success;

    public static class Data {

        private int hotelid;//酒店ID

        private String hotelcd;//酒店编码
        private String namechn;//中文名称
        private String nameeng;//英文名称
        private int Hoteltype;//酒店类型1、2表示酒店，其他表示门票等。
        private int star;//酒店星级
        private int country;//国家
        private int zone;//城市区
        private int bd;//商业区
        private int city;//城市
        private int state;//省份
        private int floor;//层高
        private String website;//酒店网站
        private String addresschn;//中文地址
        private String adresseng;//英文地址
        private String centraltel;//电话总机
        private String interiornotes;//特别提示
        private String fax;//传真
        private String postcode;//邮编
        private String email;//email
        private String language;//语言类型"cn	中文/en	英语/ar	阿拉伯文/de	德文/fr	法文/it	意大利文/ja	日文/ko	朝鲜文/"
        private String themetype;//酒店主题"biz	商务酒店/spa	温泉酒店/theme	主题酒店/economy	经济型酒店vacation	度假酒店/mansion	酒店式公寓huiyi	会议酒店"

        private String acceptcustom;//不接受的客人类型、市场 "中外宾定义11 所有市场12 中国大陆市场13 日本市场14 香港市场15 俄罗斯市场16 澳门市场"

        private String pinyin;//接受的客人类型、市场
        private String introducechn;//中文介绍
        private String summarychn;//中文摘要
        private String allowcreditcard;//能处理的信用卡类型
        private String facilities;//酒店设施
        private String facilitiesdisabled;//残疾人 设施
        private String remark;//备注
        private String keynames;//关键字
        private String jingdu;//精度
        private String weidu;//纬度
        private String updatetime;//最后更新时间
        private String active;//是否生效 "1：生效 8：禁用"
        private String outeriornotes;//外部备注
        private String createtime;//创建时间
        private String pricechange;//此酒店是否正在变价中"1：正在变价中8：默认为8 "
        private String begintime;//变价开始日期表示此日期范围内正在变价，联合pricechang用

        private String endtime;//变价结束日期
        private String supplierminor;//是否捷旅优势酒店 1：捷旅优势酒店

        private List<Rooms> rooms;//

        public static class Rooms {
            private int roomtypeid;//房型编号
            private String namechn;//客房中文名称
            private int basetype;//是否基础房型"1    是 8    否"
            private String acreages;//客房面积
            private int roomqty;//房间数量
            private int bedqty;//房间床数量
            private String bedtype;//床型
            private String bedsize;//房间床尺寸
            private int allowaddbed;//是否允许加床
            private int allowaddbedqty;//加床数量
            private String allowaddbedsize;//允许加床尺寸
            private int nosm;//该房型有无无烟房
            private String floordistribution;//房型分布在多少层如3-5层。均有等
            private String nettype;//宽带还是拨号"1：宽带2：拔号3: wi-fi8: 无网络"
            private String roomfacilities;//房间设施
            private String remark2;//信息备注
            private String remark;//房型设施"11 配电脑 12宽带 13  带阳台 14浴缸 15无窗16  电视机17  DVD机 18保险箱 19  电水壶 20冰箱  21小酒吧 22电吹风23  麻将桌"
            private String updatetime;//最后修改时间
            private int active;//是否生效"1 生效   8  禁用"
        }

    }

}
