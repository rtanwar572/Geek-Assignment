package com.Rohit.Service;

import com.Rohit.Model.Room;
import com.Rohit.Repo.iRoomRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    iRoomRep roomRep;
    public String addRoom(Room newRoom) {
        roomRep.save(newRoom);
        return "Room Added!!! ";
    }

    public List<Room> getAll() {
        return (List<Room>)roomRep.findAll();
    }

    public String addRooms(List<Room> roomList) {
        roomRep.saveAll(roomList);
        return roomList.size()+" Were Added! ";
    }

    public Room findById(Integer id) {
       return  roomRep.findById(id).get();
    }

    public List<Room> delRoomById(Integer id) {
        roomRep.deleteById(id);
        return getAll();
    }

    public List<Room> findByPrice(double price) {
        return roomRep.findByRoomPrice(price);
    }

    public List<Room> getAvailableRoomBelowPrice(double price) {
        return roomRep.findByRoomPrice(2000);
    }
}
