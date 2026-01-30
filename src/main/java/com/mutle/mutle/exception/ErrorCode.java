package com.mutle.mutle.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    DUPLICATE_EMAIL(400, "AUTH_001", "이미 가입된 이메일입니다."),
    DUPLICATE_USER_ID(400, "AUTH_002", "이미 사용 중인 아이디입니다."),
    INVALID_USER_ID(400, "AUTH_003", "아이디 형식이 올바르지 않습니다."),
    INVALID_NICKNAME(400, "AUTH_004", "닉네임 형식이 올바르지 않습니다."),
    INVALID_PASSWORD(400, "AUTH_005", "비밀번호 형식이 올바르지 않습니다."),
    INVALID_EMAIL(400, "AUTH_006", "이메일 형식이 올바르지 않습니다.");

    private final int status;
    private final String code;
    private final String message;

    ErrorCode(int status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
