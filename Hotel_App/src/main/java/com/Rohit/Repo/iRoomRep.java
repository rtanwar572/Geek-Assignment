package com.Rohit.Repo;

import com.Rohit.Model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface iRoomRep extends CrudRepository<Room,Integer> {

//    List<Room> getRoomByPrice(double price);

    List<Room> findByRoomPrice(double price);

}
