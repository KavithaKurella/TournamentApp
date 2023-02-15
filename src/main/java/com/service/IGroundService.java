package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Ground;
import com.model.Match;


@Service
public interface IGroundService {
	public List<Match> getAllmatchesGround(int groungId) throws Exception;

	public Match getmatche(int groungId, int matchId) throws Exception;

	public Ground insertGround(Ground ground) throws Exception;

	public Ground updateGround(Ground ground) throws Exception;

	public Ground deleteGround(int groungId) throws Exception;

	public List<Match> getAllMatches() throws Exception;

	public Match getMatch(int matchId) throws Exception;

}
