package com.example.evs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.evs.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long> {
}