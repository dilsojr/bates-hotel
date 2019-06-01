package br.com.apex.bates_hotel.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.apex.bates_hotel.model.Room;

@Repository
public interface RoomDAO extends CrudRepository<Room, Integer> {
	
	
	

}
