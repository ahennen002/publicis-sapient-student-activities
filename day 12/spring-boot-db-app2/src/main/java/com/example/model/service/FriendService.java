package com.example.model.service;

import com.example.model.beans.Friend;
import org.springframework.stereotype.Service;


public interface FriendService {
    public Friend addFriend(int profileIdRef, Friend friend);

}
