package example.model.hotel;

/**
 * Created by feng on 15/12/28.
 */
public class HotelPriceRequest {
    //message = "{\"Usercd\":\"sz2747\",\"Authno\":\"123456\",\"checkInDate\":\"2016-01-08\",
    // \"checkOutDate\":\"2016-01-10\",\"roomNum\":1,\"hotelIds\":\"1/2/3\",\"QueryType\":\"hotelpricecomfirm\"}";

    private String Usercd;
    private String Authno;
    private String checkInDate;
    private String checkOutDate;

    private String hotelIds;//"捷旅酒店ID，多个ID用斜杠分开，例如：1/2/3/4/5如果按酒店查询，则查询的是整个酒店的指定时段的价格数据"
    private String roomtypeids ;//"捷旅房型ID，多个ID用斜杠分开，例如：1/2/3/4 如果按房型查询，则查询的是指定房型的价格数据。 如果hotelids和roomtypeids均有值，则捷旅优先取roomtypeids 数据，忽略hotelids中的数据。"
    private String lastdate ;//最后修改时间 "如传值，只会获取到这个日期之后有改动的价格数据。在不传酒店房型ID的时候，只能查15分钟内变动的价格。格式yyyy-MM-dd HH:mm:ss"

    public String getRoomtypeids() {
        return roomtypeids;
    }

    public void setRoomtypeids(String roomtypeids) {
        this.roomtypeids = roomtypeids;
    }

    public String getLastdate() {
        return lastdate;
    }

    public void setLastdate(String lastdate) {
        this.lastdate = lastdate;
    }


    public String getUsercd() {
        return Usercd;
    }

    public void setUsercd(String usercd) {
        Usercd = usercd;
    }

    public String getAuthno() {
        return Authno;
    }

    public void setAuthno(String authno) {
        Authno = authno;
    }


    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public String getHotelIds() {
        return hotelIds;
    }

    public void setHotelIds(String hotelIds) {
        this.hotelIds = hotelIds;
    }

    public String getQueryType() {
        return QueryType;
    }

    public void setQueryType(String queryType) {
        QueryType = queryType;
    }

    private String QueryType;
}
