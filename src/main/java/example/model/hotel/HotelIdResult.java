package example.model.hotel;

import java.util.List;

/**
 * Created by feng on 15/12/28.
 */
public class HotelIdResult {
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
        public int getHotelid() {
            return hotelid;
        }

        public void setHotelid(int hotelid) {
            this.hotelid = hotelid;
        }

        private int hotelid;

        public int getCity() {
            return city;
        }

        public void setCity(int city) {
            this.city = city;
        }

        public int getCountry() {
            return country;
        }

        public void setCountry(int country) {
            this.country = country;
        }

        public String getHotelname() {
            return hotelname;
        }

        public void setHotelname(String hotelname) {
            this.hotelname = hotelname;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }

        private int city;
        private int country;
        private String hotelname;
        private int state;
    }


}
