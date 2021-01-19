package org.review;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.store.Store;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    private String reviewCode;
    private String contents;
    private Store store;
    private double score;
    private LocalDateTime date;


}
