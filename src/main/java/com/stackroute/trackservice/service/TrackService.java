package com.stackroute.trackservice.service;

import com.stackroute.trackservice.domain.Track;

import java.util.List;

public interface TrackService  {

    public Track saveTrack(Track track);
    public Track getById(int id);
    public List<Track> getAllTracks(Track track);
    public Track deleteTrackById(int id);
    public Track UpdateTrack(int id);
}
