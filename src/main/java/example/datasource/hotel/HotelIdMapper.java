package example.datasource.hotel;

import example.model.hotel.Hotel;
import example.model.hotel.HotelId;

import java.util.List;

public interface HotelIdMapper {
	public void insertHotelId(HotelId hotel);

	public void update(HotelId hotel) ;

	public HotelId getHotelId(String hotelId);

	public List<HotelId> findHotelIds() ;
}
