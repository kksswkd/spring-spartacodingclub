package com.sparta.week08_hw.repository;

import com.sparta.week08_hw.model.Folder;
import com.sparta.week08_hw.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUser(User user);
    List<Folder> findAllByUserAndNameIn(User user, List<String> nameList);
    Folder findByName(String name);
}