package com.Rohit.Controller;

import com.Rohit.Model.Room;
import com.Rohit.Service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RoomController  {

    @Autowired
    RoomService roomService;

    @PostMapping("room/create")
    public String addRoom(@RequestBody Room newRoom){
        return roomService.addRoom(newRoom);
    }
    @GetMapping("rooms")
    public List<Room> getAll(){
        return roomService.getAll();
    }
    @PostMapping("rooms")
    public String addRooms(@RequestBody List<Room> roomList){
        return roomService.addRooms(roomList);

    }
    @GetMapping("room/id/{Id}")
    public Room findById(@PathVariable Integer Id){
        return roomService.findById(Id);
    }
    @DeleteMapping("room/id/{Id}")
    List<Room> getRoomByIdPrice(Integer Id){
        return roomService.delRoomById(Id);
    }

    @GetMapping("room/price/{price}")
    List<Room> getByPrice(@PathVariable double price){
        return roomService.findByPrice(price);
    }
    @GetMapping("room/price/{price}/aval/{available}")
    List<Room> getAvailableRoomBelowPrice(@PathVariable double price,@PathVariable Boolean available){
        return roomService.getAvailableRoomBelowPrice(price);
    }
}
