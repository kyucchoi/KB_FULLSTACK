package org.example.dto.member;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemberDtoListV2 {
    private static MemberDtoListV2 instance;
    private List<MemberDto> memberDtoList;

    private MemberDtoListV2() {
        this.memberDtoList = new ArrayList<MemberDto>();

        // 테스트 데이터 추가
        this.addList("tetz", "이효석");
        this.addList("siwan", "김시완");
    }

    // 싱글톤 인스턴스 반환 메소드
    public static synchronized MemberDtoListV2 getInstance() {
        if (instance == null) {
            instance = new MemberDtoListV2();
        }

        return instance;
    }

    public void addList(String id, String name) {
        memberDtoList.add(new MemberDto(id, name));
    }

    public List<MemberDto> getList() {
        return memberDtoList;
    }
}
