package jaram.bookmark.service;

import jaram.bookmark.dto.KeywordResponse;
import jaram.bookmark.entity.Keyword;
import jaram.bookmark.repository.KeywordRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class KeywordService {

    private final KeywordRepository keywordRepository;

    public List<KeywordResponse> getKeyword() {
        List<Keyword> allKeyword = keywordRepository.findAll();
        return allKeyword.stream().map(Keyword::getKeyword).map(KeywordResponse::of).toList();

    }
}
