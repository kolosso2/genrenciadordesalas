package com.digital.crud.saladereuniao.demo.Repository;


import com.digital.crud.saladereuniao.demo.Model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
}
