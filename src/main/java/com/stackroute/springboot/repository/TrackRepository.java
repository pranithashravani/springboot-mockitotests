package com.stackroute.springboot.repository;

import com.stackroute.springboot.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepository extends JpaRepository<Track,Integer> {
   /* @Query("from Track where name =?1")
   List<Track> getTrackByName(String name);*/

}

