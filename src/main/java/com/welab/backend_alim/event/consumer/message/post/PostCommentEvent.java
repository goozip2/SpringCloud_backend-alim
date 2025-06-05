package com.welab.backend_alim.event.consumer.message.post;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostCommentEvent {
    public static final String Topic = "postcomment";
    private String action;
    private String userId;
    private String title;
    private String message;
    private LocalDateTime eventTime;
}
