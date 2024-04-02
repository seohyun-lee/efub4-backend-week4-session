package efub.session.blog.account.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드의 생성자를 자동 생성
public enum AccountStatus {
    REGISTERED(0, "등록상태", "사용자 등록상태"),
    UNREGISTERED(1, "해지", "사용자 해지상태");
    private final Integer Id;
    private final String title;
    private final String description;
}