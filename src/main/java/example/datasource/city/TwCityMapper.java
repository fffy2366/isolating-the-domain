package example.datasource.city;

import example.model.hotel.Hotel;

public interface TwCityMapper {
	public Hotel getHotel(String hotel_id);

	public Hotel getHotelByJltourHid(String jltour_hotel_id);

}
