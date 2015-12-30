package example.datasource.hotel;

import example.model.hotel.Hotel;

public interface HotelMapper {
	public void insertHotel(Hotel hotel);

	public Hotel getHotel(String hotel_id);

	public Hotel getHotelByJltourHid(String jltour_hotel_id);

	public void update(Hotel hotel) ;

}
