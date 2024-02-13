package com.lucy.springboot.web.dto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RequestDto {
  private String amount;
  private String category;
  private String difficulty;

  @Builder
  public RequestDto(String amount, String category, String difficulty) {
    this.amount = amount;
    this.category = category;
    this.difficulty = difficulty;
  }

}