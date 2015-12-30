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
        private int star;//酒店星级"55: 5星        50：准5星45: 4星        40：准4星35: 3星        30：准3星20：3星以下"
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

        public int getHotelid() {
            return hotelid;
        }

        public void setHotelid(int hotelid) {
            this.hotelid = hotelid;
        }

        public String getHotelcd() {
            return hotelcd;
        }

        public void setHotelcd(String hotelcd) {
            this.hotelcd = hotelcd;
        }

        public String getNamechn() {
            return namechn;
        }

        public void setNamechn(String namechn) {
            this.namechn = namechn;
        }

        public String getNameeng() {
            return nameeng;
        }

        public void setNameeng(String nameeng) {
            this.nameeng = nameeng;
        }

        public int getHoteltype() {
            return Hoteltype;
        }

        public void setHoteltype(int hoteltype) {
            Hoteltype = hoteltype;
        }

        public int getStar() {
            return star;
        }

        public void setStar(int star) {
            this.star = star;
        }

        public int getCountry() {
            return country;
        }

        public void setCountry(int country) {
            this.country = country;
        }

        public int getZone() {
            return zone;
        }

        public void setZone(int zone) {
            this.zone = zone;
        }

        public int getBd() {
            return bd;
        }

        public void setBd(int bd) {
            this.bd = bd;
        }

        public int getCity() {
            return city;
        }

        public void setCity(int city) {
            this.city = city;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        public int getFloor() {
            return floor;
        }

        public void setFloor(int floor) {
            this.floor = floor;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public String getAddresschn() {
            return addresschn;
        }

        public void setAddresschn(String addresschn) {
            this.addresschn = addresschn;
        }

        public String getAdresseng() {
            return adresseng;
        }

        public void setAdresseng(String adresseng) {
            this.adresseng = adresseng;
        }

        public String getCentraltel() {
            return centraltel;
        }

        public void setCentraltel(String centraltel) {
            this.centraltel = centraltel;
        }

        public String getInteriornotes() {
            return interiornotes;
        }

        public void setInteriornotes(String interiornotes) {
            this.interiornotes = interiornotes;
        }

        public String getFax() {
            return fax;
        }

        public void setFax(String fax) {
            this.fax = fax;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public String getThemetype() {
            return themetype;
        }

        public void setThemetype(String themetype) {
            this.themetype = themetype;
        }

        public String getAcceptcustom() {
            return acceptcustom;
        }

        public void setAcceptcustom(String acceptcustom) {
            this.acceptcustom = acceptcustom;
        }

        public String getPinyin() {
            return pinyin;
        }

        public void setPinyin(String pinyin) {
            this.pinyin = pinyin;
        }

        public String getIntroducechn() {
            return introducechn;
        }

        public void setIntroducechn(String introducechn) {
            this.introducechn = introducechn;
        }

        public String getSummarychn() {
            return summarychn;
        }

        public void setSummarychn(String summarychn) {
            this.summarychn = summarychn;
        }

        public String getAllowcreditcard() {
            return allowcreditcard;
        }

        public void setAllowcreditcard(String allowcreditcard) {
            this.allowcreditcard = allowcreditcard;
        }

        public String getFacilities() {
            return facilities;
        }

        public void setFacilities(String facilities) {
            this.facilities = facilities;
        }

        public String getFacilitiesdisabled() {
            return facilitiesdisabled;
        }

        public void setFacilitiesdisabled(String facilitiesdisabled) {
            this.facilitiesdisabled = facilitiesdisabled;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getKeynames() {
            return keynames;
        }

        public void setKeynames(String keynames) {
            this.keynames = keynames;
        }

        public String getJingdu() {
            return jingdu;
        }

        public void setJingdu(String jingdu) {
            this.jingdu = jingdu;
        }

        public String getWeidu() {
            return weidu;
        }

        public void setWeidu(String weidu) {
            this.weidu = weidu;
        }

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
        }

        public String getActive() {
            return active;
        }

        public void setActive(String active) {
            this.active = active;
        }

        public String getOuteriornotes() {
            return outeriornotes;
        }

        public void setOuteriornotes(String outeriornotes) {
            this.outeriornotes = outeriornotes;
        }

        public String getCreatetime() {
            return createtime;
        }

        public void setCreatetime(String createtime) {
            this.createtime = createtime;
        }

        public String getPricechange() {
            return pricechange;
        }

        public void setPricechange(String pricechange) {
            this.pricechange = pricechange;
        }

        public String getBegintime() {
            return begintime;
        }

        public void setBegintime(String begintime) {
            this.begintime = begintime;
        }

        public String getEndtime() {
            return endtime;
        }

        public void setEndtime(String endtime) {
            this.endtime = endtime;
        }

        public String getSupplierminor() {
            return supplierminor;
        }

        public void setSupplierminor(String supplierminor) {
            this.supplierminor = supplierminor;
        }

        public List<Rooms> getRooms() {
            return rooms;
        }

        public void setRooms(List<Rooms> rooms) {
            this.rooms = rooms;
        }

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

            public int getActive() {
                return active;
            }

            public void setActive(int active) {
                this.active = active;
            }

            public int getRoomtypeid() {
                return roomtypeid;
            }

            public void setRoomtypeid(int roomtypeid) {
                this.roomtypeid = roomtypeid;
            }

            public String getNamechn() {
                return namechn;
            }

            public void setNamechn(String namechn) {
                this.namechn = namechn;
            }

            public int getBasetype() {
                return basetype;
            }

            public void setBasetype(int basetype) {
                this.basetype = basetype;
            }

            public String getAcreages() {
                return acreages;
            }

            public void setAcreages(String acreages) {
                this.acreages = acreages;
            }

            public int getRoomqty() {
                return roomqty;
            }

            public void setRoomqty(int roomqty) {
                this.roomqty = roomqty;
            }

            public int getBedqty() {
                return bedqty;
            }

            public void setBedqty(int bedqty) {
                this.bedqty = bedqty;
            }

            public String getBedtype() {
                return bedtype;
            }

            public void setBedtype(String bedtype) {
                this.bedtype = bedtype;
            }

            public String getBedsize() {
                return bedsize;
            }

            public void setBedsize(String bedsize) {
                this.bedsize = bedsize;
            }

            public int getAllowaddbed() {
                return allowaddbed;
            }

            public void setAllowaddbed(int allowaddbed) {
                this.allowaddbed = allowaddbed;
            }

            public int getAllowaddbedqty() {
                return allowaddbedqty;
            }

            public void setAllowaddbedqty(int allowaddbedqty) {
                this.allowaddbedqty = allowaddbedqty;
            }

            public String getAllowaddbedsize() {
                return allowaddbedsize;
            }

            public void setAllowaddbedsize(String allowaddbedsize) {
                this.allowaddbedsize = allowaddbedsize;
            }

            public int getNosm() {
                return nosm;
            }

            public void setNosm(int nosm) {
                this.nosm = nosm;
            }

            public String getFloordistribution() {
                return floordistribution;
            }

            public void setFloordistribution(String floordistribution) {
                this.floordistribution = floordistribution;
            }

            public String getNettype() {
                return nettype;
            }

            public void setNettype(String nettype) {
                this.nettype = nettype;
            }

            public String getRoomfacilities() {
                return roomfacilities;
            }

            public void setRoomfacilities(String roomfacilities) {
                this.roomfacilities = roomfacilities;
            }

            public String getRemark2() {
                return remark2;
            }

            public void setRemark2(String remark2) {
                this.remark2 = remark2;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

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
