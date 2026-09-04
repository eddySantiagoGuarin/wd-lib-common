package com.world_dance.wd_lib_common.entity;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "music_tracks")
public class MusicTrack {

    @Id
    private String id;

    @Field("enrollmentId")
    private Long enrollmentId;

    @Field("gridFsId")
    private String gridFsId;

    @Field("fileMetadata")
    private FileMetadata fileMetadata;

    @Field("playbackConfig")
    private PlaybackConfig playbackConfig;

    @Field("status")
    private Status status;

    @Builder.Default
    @Field("history")
    private List<HistoryLog> history = new ArrayList<>();

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class FileMetadata {
        private String filename;
        
        @Field("storageUrl")
        private String storageUrl;
        
        private String format;
        
        @Field("sizeKb")
        private Double sizeKb;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PlaybackConfig {
        @Field("durationSeconds")
        private Double durationSeconds;
        
        @Field("volumeNormalization")
        private Double volumeNormalization;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Status {
        @Field("isActive")
        private Boolean isActive;
        
        @Field("uploadedAt")
        private Instant uploadedAt;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class HistoryLog {
        @Field("previousGridFsId")
        private String previousGridFsId;
        
        @Field("previousFilename")
        private String previousFilename;
        
        @Field("replacedAt")
        private Instant replacedAt;
    }
}