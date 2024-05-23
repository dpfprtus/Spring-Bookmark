package jaram.bookmark.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class KeywordResponse {

    private final String keyword;
    public static KeywordResponse of(String keyword) {
        return new KeywordResponse(keyword);
    }
}
