package com.WemersonWalcley.dsmovie.repositories;

import com.WemersonWalcley.dsmovie.entities.Score;
import com.WemersonWalcley.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
