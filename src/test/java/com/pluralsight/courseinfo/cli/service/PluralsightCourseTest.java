package com.pluralsight.courseinfo.cli.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PluralsightCourseTest {

    @ParameterizedTest
    @CsvSource(textBlock = """
            00:05:37, 5
            01:08:37.9613330, 68
            00:00:00, 0
            """)
    void durationInMinutes(String input, long expected) {
        final PluralsightCourse course = new PluralsightCourse("id", "Test course", input, "url", false);
        assertEquals(expected, course.durationInMinutes());
    }
}