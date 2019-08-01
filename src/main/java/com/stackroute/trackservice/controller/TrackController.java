package com.stackroute.trackservice.controller;

import com.stackroute.trackservice.domain.Track;
import com.stackroute.trackservice.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class TrackController
{
    private TrackService trackService;

    public TrackController() {
    }

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @PostMapping("track")
    public ResponseEntity<?> setTrack(@RequestBody Track track){
        Track savedTrack=trackService.saveTrack(track);
        return new ResponseEntity<>(savedTrack, HttpStatus.OK);
    }

    @GetMapping("track/{id}")
    public  ResponseEntity<?>  getTrackById(@PathVariable int id){
        Track obtainedTrack=trackService.getById(id);
        return new ResponseEntity<>(obtainedTrack, HttpStatus.OK);
    }
//
//    @GetMapping("track")
//    public ResponseEntity<?> getAllTracks(@RequestBody Track track){
//       Track retrieveTrack=trackService.getAllTracks(track);
//    }
//
//    @DeleteMapping("track/{id}")
//    public ResponseEntity<?> deleteTrack(@PathVariable int id){
//        Track deletedTrack=trackService.deleteTrackById(id);
//        return new ResponseEntity<>(deletedTrack,HttpStatus.OK);
//    }




}
