package example.model.hotel;

/**
 * Created by feng on 15/12/28.
 */
public class HotelPrice {
    private String room_price_id;//
    private int admin_id;//供应商id
    private int room_id;//	房型id
    private String settlement_price;//	结算价格
    private String price;//销售价格
    private String per_day;//		价格日期
    private String count;//	每天房间数
    private String exclusive_count;//	增加的专属房间数
    private String created_at;//	创建日期

    private int jltour_roomtypeid;//房型
    private int jltour_ratetype;//价格类型
    private int jltour_includebreakfastqty2;//含早份数:中1份,西1份,自1份 10-45
    private String jltour_response;//json


    public String getJltour_response() {
        return jltour_response;
    }

    public void setJltour_response(String jltour_response) {
        this.jltour_response = jltour_response;
    }

    public String getRoom_price_id() {
        return room_price_id;
    }

    public void setRoom_price_id(String room_price_id) {
        this.room_price_id = room_price_id;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getSettlement_price() {
        return settlement_price;
    }

    public void setSettlement_price(String settlement_price) {
        this.settlement_price = settlement_price;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPer_day() {
        return per_day;
    }

    public void setPer_day(String per_day) {
        this.per_day = per_day;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getExclusive_count() {
        return exclusive_count;
    }

    public void setExclusive_count(String exclusive_count) {
        this.exclusive_count = exclusive_count;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public int getJltour_roomtypeid() {
        return jltour_roomtypeid;
    }

    public void setJltour_roomtypeid(int jltour_roomtypeid) {
        this.jltour_roomtypeid = jltour_roomtypeid;
    }

    public int getJltour_ratetype() {
        return jltour_ratetype;
    }

    public void setJltour_ratetype(int jltour_ratetype) {
        this.jltour_ratetype = jltour_ratetype;
    }

    public int getJltour_includebreakfastqty2() {
        return jltour_includebreakfastqty2;
    }

    public void setJltour_includebreakfastqty2(int jltour_includebreakfastqty2) {
        this.jltour_includebreakfastqty2 = jltour_includebreakfastqty2;
    }



}
