package com.mutle.mutle.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    DUPLICATE_EMAIL(400, "AUTH_001", "이미 가입된 이메일입니다."),
    DUPLICATE_USER_ID(400, "AUTH_002", "이미 사용 중인 아이디입니다."),
    INVALID_USER_ID(400, "AUTH_003", "아이디 형식이 올바르지 않습니다."),
    INVALID_NICKNAME(400, "AUTH_004", "닉네임 형식이 올바르지 않습니다."),
    INVALID_PASSWORD(400, "AUTH_005", "비밀번호 형식이 올바르지 않습니다."),
    INVALID_EMAIL(400, "AUTH_006", "이메일 형식이 올바르지 않습니다."),

    BLANK_LOGIN(400, "AUTH_101", "아이디 혹은 비밀번호를 입력하지 않았습니다"),
    USER_NOT_FOUND(404, "AUTH_103", "존재하지 않는 사용자입니다."),
    PASSWORD_MISMATCH(401, "AUTH_102", "비밀번호가 틀렸습니다."),
    TOKEN_ERROR(401, "AUTH_000", "인증 정보가 유효하지 않습니다.");

    private final int status;
    private final String code;
    private final String message;

    ErrorCode(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
