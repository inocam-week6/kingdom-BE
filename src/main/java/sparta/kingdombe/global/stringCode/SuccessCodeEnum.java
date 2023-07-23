package sparta.kingdombe.global.stringCode;

import lombok.Getter;

@Getter
public enum SuccessCodeEnum {

    // 로그인 회원가입 메시지
    USER_SIGNUP_SUCCESS("회원가입 성공"),
    USER_LOGIN_SUCCESS("로그인 성공"),

    // 글 메시지
    POST_CREATE_SUCCESS("게시글 작성 성공"),
    POST_UPDATE_SUCCESS("게시글 수정 성공"),
    POST_DELETE_SUCCESS("게시글 삭제 성공");


    private final String message;

    SuccessCodeEnum(String message) {
        this.message = message;
    }
}