package example.datasource.hotel;

import example.model.hotel.Hotel;
import example.model.hotel.HotelPrice;
import org.apache.ibatis.annotations.Param;

public interface HotelPriceMapper {
	public void insertHotelPrice(HotelPrice hotelPrice);

	public HotelPrice getHotelPrice(@Param("price") HotelPrice hotelPrice);

	public void update(HotelPrice hotel) ;

}
