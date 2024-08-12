package org.example.mapper;

import org.example.dto.member.MemberDto;

import java.util.List;

public interface MemberMapper {
    List<MemberDto> findAll();
}
