package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    //회원도메인 설계의 문제점
    //다른저장소(memberRepository 변경 시 OCP원칙을 잘 준수할까?
    //실제 할당하는 부분이 구현체를 의존함 -> 추상화에도 의존하고, 구현체에도 의존하고 있어 DIP를 위반함
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = "+member.getName());
        System.out.println("find Member = "+ findMember.getName());
    }
}
