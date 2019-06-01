package br.com.apex.bates_hotel.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.apex.bates_hotel.model.Booking;

@Repository
public interface BookingDAO extends CrudRepository<Booking, Integer> {

}
