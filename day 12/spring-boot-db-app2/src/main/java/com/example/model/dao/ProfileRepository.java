package com.example.model.dao;

import com.example.model.beans.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface ProfileRepository extends JpaRepository<Profile, Integer> {

}
