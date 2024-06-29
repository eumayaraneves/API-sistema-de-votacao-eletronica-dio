package com.example.evs.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.evs.model.Vote;
import com.example.evs.service.VoteService;

@RestController
public class VoteController {
    @Autowired
    private VoteService voteService;

    @PostMapping("/vote")
    public ResponseEntity<String> castVote(@RequestBody Vote vote) {
        try {
            voteService.castVote(vote);
            return new ResponseEntity<>("Vote cast successfully!", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error casting vote: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}