package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {

    private Long id; // DB저장값
    @NotEmpty
    private String loginId; //로그인 id
    @NotEmpty
    private String name;
    @NotEmpty
    private String password;
}
