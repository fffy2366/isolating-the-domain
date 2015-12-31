package example.model.city;

/**
 * Created by feng on 15/12/30.
 */
public class JltourCity {
    private int cityid;
    private int stateid;
    private String statecd;
    private String citycd;


    private int tw_city_id ;
    private String name;
    private String citypin;
    private String citypinyinsimp;
    private String description;
    private int active;

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public int getStateid() {
        return stateid;
    }

    public void setStateid(int stateid) {
        this.stateid = stateid;
    }

    public String getStatecd() {
        return statecd;
    }

    public void setStatecd(String statecd) {
        this.statecd = statecd;
    }

    public String getCitycd() {
        return citycd;
    }

    public void setCitycd(String citycd) {
        this.citycd = citycd;
    }
    public int getTw_city_id() {
        return tw_city_id;
    }

    public void setTw_city_id(int tw_city_id) {
        this.tw_city_id = tw_city_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitypin() {
        return citypin;
    }

    public void setCitypin(String citypin) {
        this.citypin = citypin;
    }

    public String getCitypinyinsimp() {
        return citypinyinsimp;
    }

    public void setCitypinyinsimp(String citypinyinsimp) {
        this.citypinyinsimp = citypinyinsimp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
