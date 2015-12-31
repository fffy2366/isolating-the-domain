package example.model.hotel;

import java.util.List;

/**
 * Created by feng on 15/12/31.
 */
public class HotelPriceResponse {
    private String msg;
    private List<Data> data;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
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

    private int success;


    public static class Data {
        private String acceptcustomer;//接受客户类型、市场"11 所有市场12 中国大陆市场13 日本市场14 香港市场15 俄罗斯市场16 澳门市场先看不适用市场，为空再看适用市场"

        private String hotelCd;//酒店编号
        private int hotelId;//酒店ID

        public String getAcceptcustomer() {
            return acceptcustomer;
        }

        public void setAcceptcustomer(String acceptcustomer) {
            this.acceptcustomer = acceptcustomer;
        }

        public String getHotelCd() {
            return hotelCd;
        }

        public void setHotelCd(String hotelCd) {
            this.hotelCd = hotelCd;
        }

        public int getHotelId() {
            return hotelId;
        }

        public void setHotelId(int hotelId) {
            this.hotelId = hotelId;
        }

        public String getHotelName() {
            return hotelName;
        }

        public void setHotelName(String hotelName) {
            this.hotelName = hotelName;
        }

        public String getNoacceptcustomer() {
            return noacceptcustomer;
        }

        public void setNoacceptcustomer(String noacceptcustomer) {
            this.noacceptcustomer = noacceptcustomer;
        }

        public String getOuteriornotes() {
            return outeriornotes;
        }

        public void setOuteriornotes(String outeriornotes) {
            this.outeriornotes = outeriornotes;
        }

        public int getRoomtypeId() {
            return roomtypeId;
        }

        public void setRoomtypeId(int roomtypeId) {
            this.roomtypeId = roomtypeId;
        }

        public String getRoomtypeName() {
            return roomtypeName;
        }

        public void setRoomtypeName(String roomtypeName) {
            this.roomtypeName = roomtypeName;
        }

        public List<RoomPriceDetail> getRoomPriceDetail() {
            return roomPriceDetail;
        }

        public void setRoomPriceDetail(List<RoomPriceDetail> roomPriceDetail) {
            this.roomPriceDetail = roomPriceDetail;
        }

        private String hotelName;//酒店名称
        private String noacceptcustomer;//不接受客户类型、市场
        private String outeriornotes;//外部备注
        private int roomtypeId;//房型ID
        private String roomtypeName;//房型名称
        private List<RoomPriceDetail> roomPriceDetail;

        public static class RoomPriceDetail {
            private int advancedays;//提前天数
            private int advancedays2;//提前天数参数
            private String advancetime;//小时数
            private String advancetime2;//时间
            private int allotmenttype;//配额类型
            private String appointeddate;//指定日期

            public int getAdvancedays() {
                return advancedays;
            }

            public void setAdvancedays(int advancedays) {
                this.advancedays = advancedays;
            }

            public int getAdvancedays2() {
                return advancedays2;
            }

            public void setAdvancedays2(int advancedays2) {
                this.advancedays2 = advancedays2;
            }

            public String getAdvancetime() {
                return advancetime;
            }

            public void setAdvancetime(String advancetime) {
                this.advancetime = advancetime;
            }

            public String getAdvancetime2() {
                return advancetime2;
            }

            public void setAdvancetime2(String advancetime2) {
                this.advancetime2 = advancetime2;
            }

            public int getAllotmenttype() {
                return allotmenttype;
            }

            public void setAllotmenttype(int allotmenttype) {
                this.allotmenttype = allotmenttype;
            }

            public String getAppointeddate() {
                return appointeddate;
            }

            public void setAppointeddate(String appointeddate) {
                this.appointeddate = appointeddate;
            }

            public String getBeginday() {
                return beginday;
            }

            public void setBeginday(String beginday) {
                this.beginday = beginday;
            }

            public String getBeginday2() {
                return beginday2;
            }

            public void setBeginday2(String beginday2) {
                this.beginday2 = beginday2;
            }

            public String getBusinessprice() {
                return businessprice;
            }

            public void setBusinessprice(String businessprice) {
                this.businessprice = businessprice;
            }

            public int getCashscaletype() {
                return cashscaletype;
            }

            public void setCashscaletype(int cashscaletype) {
                this.cashscaletype = cashscaletype;
            }

            public int getContinuousdays() {
                return continuousdays;
            }

            public void setContinuousdays(int continuousdays) {
                this.continuousdays = continuousdays;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public int getDayselect() {
                return dayselect;
            }

            public void setDayselect(int dayselect) {
                this.dayselect = dayselect;
            }

            public String getEndday() {
                return endday;
            }

            public void setEndday(String endday) {
                this.endday = endday;
            }

            public String getEndday2() {
                return endday2;
            }

            public void setEndday2(String endday2) {
                this.endday2 = endday2;
            }

            public int getFacepaytype() {
                return facepaytype;
            }

            public void setFacepaytype(int facepaytype) {
                this.facepaytype = facepaytype;
            }

            public int getFaceprice() {
                return faceprice;
            }

            public void setFaceprice(int faceprice) {
                this.faceprice = faceprice;
            }

            public int getHotelid() {
                return hotelid;
            }

            public void setHotelid(int hotelid) {
                this.hotelid = hotelid;
            }

            public int getIncludebreakfastqty2() {
                return includebreakfastqty2;
            }

            public void setIncludebreakfastqty2(int includebreakfastqty2) {
                this.includebreakfastqty2 = includebreakfastqty2;
            }

            public int getInternetprice() {
                return internetprice;
            }

            public void setInternetprice(int internetprice) {
                this.internetprice = internetprice;
            }

            public int getIshousing() {
                return ishousing;
            }

            public void setIshousing(int ishousing) {
                this.ishousing = ishousing;
            }

            public String getKeyid() {
                return keyid;
            }

            public void setKeyid(String keyid) {
                this.keyid = keyid;
            }

            public String getLastupdatepricetime() {
                return lastupdatepricetime;
            }

            public void setLastupdatepricetime(String lastupdatepricetime) {
                this.lastupdatepricetime = lastupdatepricetime;
            }

            public String getNamechn() {
                return namechn;
            }

            public void setNamechn(String namechn) {
                this.namechn = namechn;
            }

            public int getNetcharge() {
                return netcharge;
            }

            public void setNetcharge(int netcharge) {
                this.netcharge = netcharge;
            }

            public String getNight() {
                return night;
            }

            public void setNight(String night) {
                this.night = night;
            }

            public String getNoedit() {
                return noedit;
            }

            public void setNoedit(String noedit) {
                this.noedit = noedit;
            }

            public int getNoeditorcancel() {
                return noeditorcancel;
            }

            public void setNoeditorcancel(int noeditorcancel) {
                this.noeditorcancel = noeditorcancel;
            }

            public String getPreeprice() {
                return preeprice;
            }

            public void setPreeprice(String preeprice) {
                this.preeprice = preeprice;
            }

            public int getPricingtype() {
                return pricingtype;
            }

            public void setPricingtype(int pricingtype) {
                this.pricingtype = pricingtype;
            }

            public int getQtyable() {
                return qtyable;
            }

            public void setQtyable(int qtyable) {
                this.qtyable = qtyable;
            }

            public int getRatetype() {
                return ratetype;
            }

            public void setRatetype(int ratetype) {
                this.ratetype = ratetype;
            }

            public String getRatetypename() {
                return ratetypename;
            }

            public void setRatetypename(String ratetypename) {
                this.ratetypename = ratetypename;
            }

            public int getRestype() {
                return restype;
            }

            public void setRestype(int restype) {
                this.restype = restype;
            }

            public int getRoomtypeid() {
                return roomtypeid;
            }

            public void setRoomtypeid(int roomtypeid) {
                this.roomtypeid = roomtypeid;
            }

            public String getRoomtypename() {
                return roomtypename;
            }

            public void setRoomtypename(String roomtypename) {
                this.roomtypename = roomtypename;
            }

            public int getSupplierid() {
                return supplierid;
            }

            public void setSupplierid(int supplierid) {
                this.supplierid = supplierid;
            }

            public int getTermtype() {
                return termtype;
            }

            public void setTermtype(int termtype) {
                this.termtype = termtype;
            }

            public String getTimeselect() {
                return timeselect;
            }

            public void setTimeselect(String timeselect) {
                this.timeselect = timeselect;
            }

            public int getVoidabletype() {
                return voidabletype;
            }

            public void setVoidabletype(int voidabletype) {
                this.voidabletype = voidabletype;
            }

            private String beginday;//指定开始日期
            private String beginday2;//指定时段开始日期
            private String businessprice;//商务价
            private int cashscaletype;//超出了取消修改条款,扣费/罚金的类型。"12   扣全额 11   扣首晚房费  默认11"
            private int continuousdays;//连住晚数
            private String currency;//币种
            private int dayselect;//入住前/确认后 多少天
            private String endday;//指定结束日期
            private String endday2;//指定时段结束日期
            private int facepaytype;//现付类型
            private int faceprice;//现付价格
            private int hotelid;//酒店ID
            /**
             * 含早份数:中1份,西1份,自1份
             * "10   不含
             * 11	1份中早
             * 12	1份西早
             * 13	1份自助
             * 21	2份中早
             * 22	2份西早
             * 23	2份自助
             * 31	3份中早
             * 32	3份西早
             * 33   3份自助
             * 34   床位早
             * 35	4份自助
             * 36	5份自助
             * 37	6份自助
             * 38	7份自助
             * 39   1份早晚自助
             * 40   2份早晚自助
             * 41   半食宿
             * 42   全食宿
             * 43   全包
             * 44   4份中早
             * 45   4份西早"
             */
            private int includebreakfastqty2;
            private int internetprice;//上网类型 "1：宽带 2：拔号 3: wi-fi 8: 无网络"
            private int ishousing;//是否甩房 1为是，8为否。
            private String keyid;//keyid标识
            private String lastupdatepricetime;//最后修改时间 每次更新都以最后修改时间参考
            private String namechn;//"酒店中文名称"
            /**
             * "<0: 收费，金额未定
             * =0:免费
             * =1: 收费，金额未定
             * >1:上网费用"
             */
            private int netcharge;//是否免费带宽，如收费则上为网价格
            private String night;//日期datetime2011-09-09
            private String noedit;//不可修改包括内容  "late	推迟入住 advance	提前入住 , minusday	减少天数  , minusqty	减少间数,name	入住人名字,roomtype	修改房型,allorder	所有内容"
            private int noeditorcancel;//不可修改/不可取消 "11 不可修改 12 不可取消"
            private String preeprice;//同行标准价
            private int pricingtype;//定价类型 11:现付反佣，12:预付
            private int qtyable;//当前可售房间数量  cutofdayqty-orderqty "大于0表示可即时确认。剩多少间 等于0表示需要等待确认 小于0表示满房"
            private int ratetype;//价格类型id,含单早价，含早价，含双早价，提前天价，连住价 捷旅产品人员定义的价格类型，如含早价、含双早价、提前3天价等。
            private String ratetypename;//价格类型名称
            private int restype;//"11 入住前  12 确认后"
            private int roomtypeid;//房型ID
            private String roomtypename;//房型名称
            private int supplierid;//供应商ID
            /**
             * "11	提前预订
             * 12	指定日期前订
             * 13	连住晚数
             * 14	指定时间段能订"
             */
            private int termtype;//预订条款类型:提前订房,指定日期前,连住晚数,指定时间段
            private String timeselect;//入住前/确认后 多少天 几点前 "例如：18:00"
            /**
             * "11	提前天数
             * 12	指定时段
             * 13	即订即保
             * 14	无限制"
             */
            private int voidabletype;//取消修改条款类型
        }

    }


}
