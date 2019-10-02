package com.dartsip.test.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Embeddable
public class Reviews {
		private String reviewerName;
	    private String content;
	    private String rating;
	    @Column(name="review_publish_date")
	    private String publishedDate;


	    public Reviews() {}

}
