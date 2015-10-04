package dao;

import model.Interval;

import java.util.Optional;

public interface IntervalDao {
    void insert(Interval interval);

    void delete(Interval interval);
    
    Optional<Interval> findOverlapped(Interval interval);

    Optional<Interval> select(int offset);

    boolean markAsUsed(Interval interval);

    void unmarkAsUsed(Interval interval);

    boolean findOverlappedAndReplace(Interval interval);

    Optional<Interval> selectAndMarkAsUsed(int offset);
}