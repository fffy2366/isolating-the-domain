package example.model.hotel;

/**
 * Created by feng on 15/12/28.
 */
public class HotelRequest {
    //message = "{'Usercd':'sz2747','Authno':'123456' ,'hotelIds':'45748','QueryType':'hotelinfo'}" ;
    private String Usercd ;
    private String Authno ;
    private String hotelIds ;


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

    private String QueryType ;
}
