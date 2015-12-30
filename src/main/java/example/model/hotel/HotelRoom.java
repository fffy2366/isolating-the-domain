package example.model.hotel;

/**
 * Created by feng on 15/12/28.
 */
public class HotelRoom {
    private String room_id;//房型ID
    private String hotel_id;//酒店ID


    private String jltour_roomtypeid;//捷旅房型编号
    private String name;//房型名称			
    private String type;//房型1标准,2大床房,3套房			
    //private String is_exclusive;//是否遛湾专属，默认不是
    private String description;//房型描述			
    private String breakfast;//早餐			
    private String broadband;//宽带			
    private String wifi;//WIFI

    private String price;//		平时默认价格
    private String weekend_price;//	周末价格		
    private String bed_type;//		床型 jl:bedtype "single  单床  ,double  双床,  big  大床,cir  圆床,sindou  单床/双床,bigdou  大床/双床,bigsing  大床/单床"
    private String floor;//		楼层			jl:floordistribution 如3-5层。均有等
    private String building_area;//		建筑面积			jl:acreages
    private String non_smoking_rooms;//		无烟房	jl:nosm "1   是 ,8   否"
    private String bed_type_desc;//		床型描述	jl:bedtype "single  单床  ,double  双床,  big  大床,cir  圆床,sindou  单床/双床,bigdou  大床/双床,bigsing  大床/单床"
    private String galleryful;//		容纳人数			
    private String exclusive_count;//	专属房间数0
    private String count;//	默认每天房间数	jl: roomqty 房间数量


    private String bed_width;//		窗宽
    private int customer_groups;//		客户群体：1.全部 2.大陆游客、3.港澳台
    private int cancel;// 1：可取消，2：不可取消
    private String check_in_rule;//		入住规定
    private String created_at;//		创建日期
    private int jltour_active;//"1  生效 ,8  禁用"

    public int getJltour_active() {
        return jltour_active;
    }

    public void setJltour_active(int jltour_active) {
        this.jltour_active = jltour_active;
    }


    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getJltour_roomtypeid() {
        return jltour_roomtypeid;
    }

    public void setJltour_roomtypeid(String jltour_roomtypeid) {
        this.jltour_roomtypeid = jltour_roomtypeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast;
    }

    public String getBroadband() {
        return broadband;
    }

    public void setBroadband(String broadband) {
        this.broadband = broadband;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWeekend_price() {
        return weekend_price;
    }

    public void setWeekend_price(String weekend_price) {
        this.weekend_price = weekend_price;
    }

    public String getBed_type() {
        return bed_type;
    }

    public void setBed_type(String bed_type) {
        this.bed_type = bed_type;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getBuilding_area() {
        return building_area;
    }

    public void setBuilding_area(String building_area) {
        this.building_area = building_area;
    }

    public String getNon_smoking_rooms() {
        return non_smoking_rooms;
    }

    public void setNon_smoking_rooms(String non_smoking_rooms) {
        this.non_smoking_rooms = non_smoking_rooms;
    }

    public String getBed_type_desc() {
        return bed_type_desc;
    }

    public void setBed_type_desc(String bed_type_desc) {
        this.bed_type_desc = bed_type_desc;
    }

    public String getGalleryful() {
        return galleryful;
    }

    public void setGalleryful(String galleryful) {
        this.galleryful = galleryful;
    }

    public String getExclusive_count() {
        return exclusive_count;
    }

    public void setExclusive_count(String exclusive_count) {
        this.exclusive_count = exclusive_count;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getBed_width() {
        return bed_width;
    }

    public void setBed_width(String bed_width) {
        this.bed_width = bed_width;
    }

    public int getCustomer_groups() {
        return customer_groups;
    }

    public void setCustomer_groups(int customer_groups) {
        this.customer_groups = customer_groups;
    }

    public int getCancel() {
        return cancel;
    }

    public void setCancel(int cancel) {
        this.cancel = cancel;
    }

    public String getCheck_in_rule() {
        return check_in_rule;
    }

    public void setCheck_in_rule(String check_in_rule) {
        this.check_in_rule = check_in_rule;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

}
