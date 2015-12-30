package example.datasource.hotel;

import example.model.hotel.HotelRoom;

public interface HotelRoomMapper {
	public void insertHotelRoom(HotelRoom hotelRoom);

	public HotelRoom getHotelRoom(String room_id);

	public HotelRoom getHotelRoomByJltourRid(String jltour_room_id);

	public void update(HotelRoom hotelRoom) ;

}
