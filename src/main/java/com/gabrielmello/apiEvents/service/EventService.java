package com.gabrielmello.apiEvents.service;

import com.gabrielmello.apiEvents.domain.event.Event;
import com.gabrielmello.apiEvents.domain.event.EventRequestDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Service
public class EventService {

    public Event createEvent(EventRequestDTO data){

        String imgUrl = null;

        if(data.image() != null){
           imgUrl =  this.uploadImg(data.image());
        }

        Event newEvent = new Event();
        newEvent.setTitle(data.title());
        newEvent.setDescription(data.description());
        newEvent.setEventUrl(data.eventUrl());
        newEvent.setDate(new Date(data.date()));
        newEvent.setImgUrl(imgUrl);
        return  newEvent;
    }

    private String uploadImg(MultipartFile image) {
        return "";
    }

}
