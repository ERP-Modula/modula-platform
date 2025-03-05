package com.example.googledocs.domain.query;

public interface Query<T, V> {
    T execute(V param);
}
