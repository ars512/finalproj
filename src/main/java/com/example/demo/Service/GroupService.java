package com.example.demo.Service;

import com.example.demo.Dto.GroupDto;

import java.util.List;

public interface GroupService {
    List<GroupDto> getAll();
    GroupDto getById(Long id);
    GroupDto addGroup(GroupDto groupDto);
    GroupDto updateGroup(Long id, GroupDto groupDto);
    boolean deleteGroup(Long id);
}
