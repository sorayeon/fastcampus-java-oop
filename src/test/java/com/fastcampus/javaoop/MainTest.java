package com.fastcampus.javaoop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        // given
        String[] args = {"4", "3", "2", "1"};

        // when & then
        Main.main(args);
    }
}