package example.datasource.hotel;

import example.model.hotel.HotelId;

import java.util.List;

public interface HotelIdMapper {
	public void insertHotelId(HotelId hotel);

	public HotelId getHotelId(String name);

	public List<HotelId> findHotelIds() ;
}
