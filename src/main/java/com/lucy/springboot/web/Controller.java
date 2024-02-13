package com.lucy.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import com.lucy.springboot.web.dto.RequestDto;

@RequiredArgsConstructor
@RestController
public class Controller {

  @GetMapping("/api/trivia")
  public String triviaGet(@RequestBody RequestDto requestDto) {
    return "hello";
  }

}