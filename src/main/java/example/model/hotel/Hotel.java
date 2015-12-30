package example.model.hotel;

/**
 * Created by feng on 15/12/28.
 */
public class Hotel {
    //name,numbering,is_exclusive,address,tel,check_in_rules,feature,service,stars,city_id,longitude,latitude

    private int hotel_id ;
    private int jltour_hotel_id ;
    private String name;
    private String numbering;
    private int is_exclusive;//是否遛弯专属
    private String address;
    private String tel;
    private String check_in_rules;//入住规定
    private String feature;
    private String service;//服务
    private int stars;//星级	0
    private int city_id;//城市ID	0
    private String longitude ; //经度
    private String latitude ;//纬度


    public int getHotel_id() {
        return hotel_id;
    }
    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public int getJltour_hotel_id() {
        return jltour_hotel_id;
    }

    public void setJltour_hotel_id(int jltour_hotel_id) {
        this.jltour_hotel_id = jltour_hotel_id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumbering() {
        return numbering;
    }

    public void setNumbering(String numbering) {
        this.numbering = numbering;
    }

    public int getIs_exclusive() {
        return is_exclusive;
    }

    public void setIs_exclusive(int is_exclusive) {
        this.is_exclusive = is_exclusive;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCheck_in_rules() {
        return check_in_rules;
    }

    public void setCheck_in_rules(String check_in_rules) {
        this.check_in_rules = check_in_rules;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }


}
