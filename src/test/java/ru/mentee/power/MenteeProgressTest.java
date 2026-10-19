package ru.mentee.power;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MenteeProgressTest {

    @Test
    void shouldFormatSummary_whenProgressCreated() {
        MenteeProgress progress = new MenteeProgress("Имя студента", 1, 6);

        assertThat(progress.summary())
                .isEqualTo("Sprint 1 → Имя студента: planned 6 h");
    }

    @Test
    void shouldDetectReadiness_whenHoursAboveThreshold() {
        assertThat(new MenteeProgress("Имя студента", 1, 4).readyForSprint())
                .isTrue();
    }

    @Test
    void shouldDetectLackOfReadiness_whenHoursBelowThreshold() {
        assertThat(new MenteeProgress("Имя студента", 1, 2).readyForSprint())
                .isFalse();
    }
}
