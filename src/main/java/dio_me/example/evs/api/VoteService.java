package com.example.evs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.evs.model.Vote;
import com.example.evs.repository.VoteRepository;

@Service
public class VoteService {
    @Autowired
    private VoteRepository voteRepository;

    public void castVote(Vote vote) {
        voteRepository.save(vote);
    }
}