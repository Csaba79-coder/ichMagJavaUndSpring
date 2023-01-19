package com.csaba79coder.ichmagjavaundspring.service;

import com.csaba79coder.ichmagjavaundspring.domain.Love;
import org.springframework.stereotype.Service;

@Service
public class LoveService {

    public String checkResult() {
        Love love = new Love();
        if (love.getDreamJobOffer().equalsIgnoreCase(love.getDreamJobOpportunity())) {
            return "Ich brenne für Softwareentwicklung und Java ist meine Lieblingssprache! " +
                    "Ich möchte bei der Porsche Informatik GmbH arbeiten!";
        } else {
            return "Sie suchen mich nicht!";
        }
    }
}
